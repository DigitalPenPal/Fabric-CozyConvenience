package pencil.cozyconvenience.block.custom;

import net.minecraft.block.*;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import pencil.cozyconvenience.block.NaturalBlocks;

public class SpreadableStairs extends StairsBlock {
    public SpreadableStairs(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);

        if (state.get(WATERLOGGED)) {
            return false;
        } else if (blockState.getFluidState().getLevel() == 8) {
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
            world.setBlockState(pos, NaturalBlocks.DIRT_STAIRS.getDefaultState()
                    .with(StairsBlock.FACING, state.get(StairsBlock.FACING))
                    .with(StairsBlock.HALF, state.get(StairsBlock.HALF))
                    .with(StairsBlock.SHAPE, state.get(StairsBlock.SHAPE)));
        } else {
            if (world.getLightLevel(pos.up()) >= 9) {
                BlockState blockState = this.getDefaultState();

                for (int i = 0; i < 4; i++) {
                    BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    BlockState targetState = world.getBlockState(blockPos);

                    if (canSpread(state, world, blockPos)) {
                        if (targetState.isOf(Blocks.DIRT)) {
                            world.setBlockState(blockPos, Blocks.GRASS_BLOCK.getDefaultState());
                        } else if (targetState.isOf(NaturalBlocks.DIRT_SLAB)) {
                            world.setBlockState(blockPos, NaturalBlocks.GRASS_SLAB.getDefaultState()
                                    .with(SlabBlock.TYPE, targetState.get(SlabBlock.TYPE)));
                        } else if (targetState.isOf(NaturalBlocks.DIRT_STAIRS)) {
                            world.setBlockState(blockPos, NaturalBlocks.GRASS_STAIRS.getDefaultState()
                                    .with(StairsBlock.FACING, targetState.get(StairsBlock.FACING))
                                    .with(StairsBlock.HALF, targetState.get(StairsBlock.HALF))
                                    .with(StairsBlock.SHAPE, targetState.get(StairsBlock.SHAPE)));
                        }
                    }
                }
            }
        }
    }
}