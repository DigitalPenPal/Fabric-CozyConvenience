package pencil.cozyconvene.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import pencil.cozyconvene.block.MoBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool WhiteWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        BlockStateModelGenerator.BlockTexturePool LightGrayWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool GrayWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        BlockStateModelGenerator.BlockTexturePool BlackWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        BlockStateModelGenerator.BlockTexturePool BrownWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        BlockStateModelGenerator.BlockTexturePool RedWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        BlockStateModelGenerator.BlockTexturePool OrangeWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        BlockStateModelGenerator.BlockTexturePool YellowWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        BlockStateModelGenerator.BlockTexturePool LimeWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        BlockStateModelGenerator.BlockTexturePool GreenWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        BlockStateModelGenerator.BlockTexturePool CyanWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        BlockStateModelGenerator.BlockTexturePool LightBlueWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool BlueWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        BlockStateModelGenerator.BlockTexturePool PurpleWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        BlockStateModelGenerator.BlockTexturePool MagentaWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        BlockStateModelGenerator.BlockTexturePool PinkWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);

        WhiteWoolPool.slab(MoBlocks.WHITE_WOOL_SLAB);

        LightGrayWoolPool.slab(MoBlocks.LIGHT_GRAY_WOOL_SLAB);

        GrayWoolPool.slab(MoBlocks.GRAY_WOOL_SLAB);

        BlackWoolPool.slab(MoBlocks.BLACK_WOOL_SLAB);

        BrownWoolPool.slab(MoBlocks.BROWN_WOOL_SLAB);

        RedWoolPool.slab(MoBlocks.RED_WOOL_SLAB);

        OrangeWoolPool.slab(MoBlocks.ORANGE_WOOL_SLAB);

        YellowWoolPool.slab(MoBlocks.YELLOW_WOOL_SLAB);

        LimeWoolPool.slab(MoBlocks.LIME_WOOL_SLAB);

        GreenWoolPool.slab(MoBlocks.GREEN_WOOL_SLAB);

        CyanWoolPool.slab(MoBlocks.CYAN_WOOL_SLAB);

        LightBlueWoolPool.slab(MoBlocks.LIGHT_BLUE_WOOL_SLAB);

        BlueWoolPool.slab(MoBlocks.BLUE_WOOL_SLAB);

        PurpleWoolPool.slab(MoBlocks.PURPLE_WOOL_SLAB);

        MagentaWoolPool.slab(MoBlocks.MAGENTA_WOOL_SLAB);

        PinkWoolPool.slab(MoBlocks.PINK_WOOL_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
