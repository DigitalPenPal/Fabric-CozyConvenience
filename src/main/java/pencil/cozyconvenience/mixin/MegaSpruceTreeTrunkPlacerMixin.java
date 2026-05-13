package pencil.cozyconvenience.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pencil.cozyconvenience.block.ModBlocks;

import java.util.List;
import java.util.function.BiConsumer;

import static net.minecraft.block.SlabBlock.TYPE;

@Mixin(net.minecraft.world.gen.trunk.GiantTrunkPlacer.class)
public class MegaSpruceTreeTrunkPlacerMixin {

    private static final Logger LOGGER = LoggerFactory.getLogger("CozyConvenience");

    @Inject(method = "generate", at = @At("RETURN"))
    private void convertDirtSlabsToPodzolSlabs(
            TestableWorld world,
            BiConsumer<BlockPos, BlockState> replacer,
            net.minecraft.util.math.random.Random random,
            int height,
            BlockPos startPos,
            TreeFeatureConfig config,
            CallbackInfoReturnable<List<FoliagePlacer.TreeNode>> cir
    ) {
        LOGGER.info("GiantTrunkPlacer mixin fired at pos: {}", startPos);

        if (!(world instanceof net.minecraft.world.WorldAccess worldAccess)) return;

        for (int y = -2; y <= 1; y++) {
            for (BlockPos blockPos : BlockPos.iterate(startPos.add(-4, y, -4), startPos.add(4, y, 4))) {
                BlockState state = worldAccess.getBlockState(blockPos);
                if (state.isOf(ModBlocks.DIRT_SLAB) || state.isOf(ModBlocks.GRASS_SLAB)) {
                    worldAccess.setBlockState(blockPos,
                            ModBlocks.PODZOL_SLAB.getDefaultState()
                                    .with(TYPE, state.get(TYPE)),
                            3);
                }
            }
        }
    }
}