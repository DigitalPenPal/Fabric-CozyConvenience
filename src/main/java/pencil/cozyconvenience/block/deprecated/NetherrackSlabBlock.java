package pencil.cozyconvenience.block.deprecated;

import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import pencil.cozyconvenience.block.NaturalBlocks;

public class NetherrackSlabBlock extends SlabBlock implements Fertilizable {

    public NetherrackSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        if (!world.getBlockState(pos.up()).isTransparent(world, pos)) {

            return false;
        } else {

            for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {

                BlockState blockState = world.getBlockState(blockPos);
                // check for both vanilla nylium and your custom nylium slabs
                if (blockState.isIn(BlockTags.NYLIUM)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean isCrimsonNearby = false;
        boolean isWarpedNearby = false;

        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(Blocks.WARPED_NYLIUM) || blockState.isOf(NaturalBlocks.WARPED_NYLIUM_SLAB)) {
                isWarpedNearby = true;
            }
            if (blockState.isOf(Blocks.CRIMSON_NYLIUM) || blockState.isOf(NaturalBlocks.CRIMSON_NYLIUM_SLAB)) {
                isCrimsonNearby = true;
            }
            if (isWarpedNearby && isCrimsonNearby) {
                break;
            }
        }

        // preserve the slab type when converting
        SlabType slabType = state.get(TYPE);

        if (isWarpedNearby && isCrimsonNearby) {
            world.setBlockState(pos, (random.nextBoolean()
                    ? NaturalBlocks.WARPED_NYLIUM_SLAB.getDefaultState()
                    : NaturalBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState())
                    .with(TYPE, slabType), Block.NOTIFY_ALL);
        } else if (isWarpedNearby) {
            world.setBlockState(pos, NaturalBlocks.WARPED_NYLIUM_SLAB.getDefaultState()
                    .with(TYPE, slabType), Block.NOTIFY_ALL);
        } else if (isCrimsonNearby) {
            world.setBlockState(pos, NaturalBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState()
                    .with(TYPE, slabType), Block.NOTIFY_ALL);
        }
    }

    @Override
    public Fertilizable.FertilizableType getFertilizableType() {
        return Fertilizable.FertilizableType.NEIGHBOR_SPREADER;
    }
}