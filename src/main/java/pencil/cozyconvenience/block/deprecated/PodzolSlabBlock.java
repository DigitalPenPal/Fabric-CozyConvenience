package pencil.cozyconvenience.block.deprecated;

import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import pencil.cozyconvenience.block.NaturalBlocks;

public class PodzolSlabBlock extends SlabBlock {

    public PodzolSlabBlock(Settings settings) {
        super(settings);
    }

    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        // top slabs are always exposed
        if (state.get(TYPE) == SlabType.TOP) return true;

        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.getFluidState().getLevel() == 8) {
            return false;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
            return i < world.getMaxLightLevel();
        }
    }

    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        return canSurvive(state, world, pos) && !world.getFluidState(blockPos).isIn(FluidTags.WATER);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            // revert to dirt slab preserving type
            world.setBlockState(pos, NaturalBlocks.DIRT_SLAB.getDefaultState()
                    .with(TYPE, state.get(TYPE)));
        } else {
            if (world.getLightLevel(pos.up()) >= 9) {
                for (int i = 0; i < 4; i++) {
                    BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    BlockState targetState = world.getBlockState(blockPos);

                    // spread to full dirt blocks
                    if (targetState.isOf(Blocks.DIRT) && canSpread(state, world, blockPos)) {
                        world.setBlockState(blockPos, Blocks.PODZOL.getDefaultState());
                    }
                    // spread to dirt slabs preserving type
                    else if (targetState.isOf(NaturalBlocks.DIRT_SLAB) && canSpread(state, world, blockPos)) {
                        world.setBlockState(blockPos, NaturalBlocks.PODZOL_SLAB.getDefaultState()
                                .with(TYPE, targetState.get(TYPE)));
                    }
                    // spread to grass slabs preserving type
                    else if (targetState.isOf(NaturalBlocks.GRASS_SLAB) && canSpread(state, world, blockPos)) {
                        world.setBlockState(blockPos, NaturalBlocks.PODZOL_SLAB.getDefaultState()
                                .with(TYPE, targetState.get(TYPE)));
                    }
                }
            }
        }
    }
}