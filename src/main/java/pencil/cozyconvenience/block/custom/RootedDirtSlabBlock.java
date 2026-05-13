package pencil.cozyconvenience.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.block.Fertilizable;

public class RootedDirtSlabBlock extends SlabBlock implements Fertilizable {

    public RootedDirtSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return (state.get(TYPE) == SlabType.DOUBLE || state.get(TYPE) == SlabType.BOTTOM)
                && world.getBlockState(pos.down()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if (state.get ( TYPE ) == SlabType.DOUBLE || state.get ( TYPE ) == SlabType.BOTTOM) {
            world.setBlockState ( pos.down (), Blocks.HANGING_ROOTS.getDefaultState () );
        }
    }
}