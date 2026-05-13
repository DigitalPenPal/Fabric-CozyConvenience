package pencil.cozyconvenience.mixin;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pencil.cozyconvenience.block.ModBlocks;

@Mixin(NetherrackBlock.class)
public class NetherrackBlockMixin {

    @Inject(method = "isFertilizable", at = @At("RETURN"), cancellable = true)
    private void checkNyliumSlabs(WorldView world, BlockPos pos, BlockState state, CallbackInfoReturnable<Boolean> cir) {

        if (cir.getReturnValue()) return;

        if (!world.getBlockState(pos.up()).isTransparent(world, pos)) return;

        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ModBlocks.CRIMSON_NYLIUM_SLAB) || blockState.isOf(ModBlocks.WARPED_NYLIUM_SLAB)) {
                cir.setReturnValue(true);
                return;
            }
        }
    }

    @Inject(method = "grow", at = @At("HEAD"), cancellable = true)
    private void growFromNyliumSlabs(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo ci) {
        boolean isCrimsonNearby = false;
        boolean isWarpedNearby = false;

        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(Blocks.WARPED_NYLIUM) || blockState.isOf(ModBlocks.WARPED_NYLIUM_SLAB)) {
                isWarpedNearby = true;
            }
            if (blockState.isOf(Blocks.CRIMSON_NYLIUM) || blockState.isOf(ModBlocks.CRIMSON_NYLIUM_SLAB)) {
                isCrimsonNearby = true;
            }
            if (isWarpedNearby && isCrimsonNearby) break;
        }

        if (isWarpedNearby && isCrimsonNearby) {
            world.setBlockState(pos, random.nextBoolean()
                    ? Blocks.WARPED_NYLIUM.getDefaultState()
                    : Blocks.CRIMSON_NYLIUM.getDefaultState(), Block.NOTIFY_ALL);
            ci.cancel();
        } else if (isWarpedNearby) {
            world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), Block.NOTIFY_ALL);
            ci.cancel();
        } else if (isCrimsonNearby) {
            world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), Block.NOTIFY_ALL);
            ci.cancel();
        }
    }
}