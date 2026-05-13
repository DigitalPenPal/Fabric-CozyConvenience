package pencil.cozyconvenience.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import pencil.cozyconvenience.block.ModBlocks;

public class MyceliumSlabBlock extends SlabBlock {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public MyceliumSlabBlock(Settings settings) {
        super ( settings );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties ( builder );
    }

    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);

        if (state.contains(TYPE) && state.get(TYPE) == SlabType.BOTTOM && state.get(WATERLOGGED)) {
            return false;
        }

        if (state.contains(TYPE) && state.get(TYPE) == SlabType.TOP) {
            return blockState.getFluidState().getLevel() != 8;
        }  // top slabs have their surface exposed at y+1, treat them as always surviving

        if (blockState.getFluidState().getLevel() == 8) {
            return false;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
            return i < world.getMaxLightLevel();
        }
    }

    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        return canSurvive(state, world, pos) && !world.getFluidState(blockPos).isIn( FluidTags.WATER);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {

            world.setBlockState(pos, ModBlocks.DIRT_SLAB.getStateWithProperties ( state ));
        } else {

            if (world.getLightLevel(pos.up()) >= 9) {

                BlockState blockState = this.getDefaultState();

                for (int i = 0; i < 4; i++) {

                    BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (world.getBlockState(blockPos).isOf(Blocks.DIRT) && canSpread(blockState, world, blockPos)) {

                        world.setBlockState(blockPos, Blocks.MYCELIUM.getDefaultState ());
                    } else if (world.getBlockState(blockPos).isOf(ModBlocks.DIRT_SLAB) && canSpread(blockState, world, blockPos)) {

                        world.setBlockState(blockPos, ModBlocks.MYCELIUM_SLAB.getDefaultState().with(TYPE, world.getBlockState(blockPos).get(TYPE)));
                    }
                }
            }
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            double yOffset = state.get(TYPE) == SlabType.BOTTOM ? 0.6 : 1.1;
            world.addParticle(ParticleTypes.MYCELIUM, pos.getX() + random.nextDouble(), pos.getY() + yOffset, pos.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
        }
    }
}