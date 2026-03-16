package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import pencil.cozyconvenience.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Pillar Blocks
        blockStateModelGenerator.registerLog(ModBlocks.STONE_COLUMN).log(ModBlocks.STONE_COLUMN);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STONE_COLUMN).log(ModBlocks.MOSSY_STONE_COLUMN);
        blockStateModelGenerator.registerLog(ModBlocks.CRACKED_STONE_COLUMN).log(ModBlocks.CRACKED_STONE_COLUMN);

        // Regular Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CONCRETE_TILES);

        // Slab Blocks
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

        WhiteWoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        LightGrayWoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        GrayWoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        BlackWoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        BrownWoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        RedWoolPool.slab(ModBlocks.RED_WOOL_SLAB);
        OrangeWoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        YellowWoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        LimeWoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
        GreenWoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        CyanWoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        LightBlueWoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        BlueWoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        PurpleWoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        MagentaWoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        PinkWoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
