package pencil.cozyconvenience.mixin;

import net.minecraft.block.AzaleaBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pencil.cozyconvenience.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;

import static net.minecraft.block.SlabBlock.TYPE;

@Mixin(AzaleaBlock.class)
public class AzaleaBlockMixin {

    private final Map<BlockPos, SlabType> slabPositions = new HashMap<>();

    @Inject(method = "grow", at = @At("HEAD"))
    private void storeSlabPositions(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo ci) {
        slabPositions.clear();

        for (BlockPos checkPos : BlockPos.iterate(pos.add(-4, -1, -4), pos.add(4, -1, 4))) {
            BlockState checkState = world.getBlockState(checkPos);
            if (checkState.isOf(ModBlocks.DIRT_SLAB) || checkState.isOf(ModBlocks.GRASS_SLAB)) {
                slabPositions.put(checkPos.toImmutable(), checkState.get(TYPE));
            }
        }
    }

    @Inject(method = "grow", at = @At("RETURN"))
    private void convertSlabsAfterGrowth(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo ci) {
        for (Map.Entry<BlockPos, SlabType> entry : slabPositions.entrySet()) {
            BlockState current = world.getBlockState(entry.getKey());

            if (current.isOf(Blocks.ROOTED_DIRT)) {
                world.setBlockState(entry.getKey(), ModBlocks.ROOTED_DIRT_SLAB.getDefaultState()
                        .with(TYPE, entry.getValue()), 3);
            }
        }
        slabPositions.clear();
    }
}