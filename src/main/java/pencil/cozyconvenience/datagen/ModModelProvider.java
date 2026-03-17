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
        // Concrete Blocks
        BlockStateModelGenerator.BlockTexturePool WhiteConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool LightGrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool GrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool BlackConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool BrownConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool RedConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool OrangeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool YellowConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool LimeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool GreenConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool CyanConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool LightBlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool BlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool PurpleConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool MagentaConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool PinkConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CONCRETE_TILES);
        WhiteConcretePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        WhiteConcretePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);
        WhiteConcretePool.pressurePlate(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
        WhiteConcretePool.button(ModBlocks.WHITE_CONCRETE_BUTTON);
        WhiteConcretePool.wall(ModBlocks.WHITE_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_CONCRETE_TILES);
        LightGrayConcretePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        LightGrayConcretePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        LightGrayConcretePool.pressurePlate(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        LightGrayConcretePool.button(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        LightGrayConcretePool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_CONCRETE_TILES);
        GrayConcretePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        GrayConcretePool.slab(ModBlocks.GRAY_CONCRETE_SLAB);
        GrayConcretePool.pressurePlate(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        GrayConcretePool.button(ModBlocks.GRAY_CONCRETE_BUTTON);
        GrayConcretePool.wall(ModBlocks.GRAY_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_CONCRETE_TILES);
        BlackConcretePool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        BlackConcretePool.slab(ModBlocks.BLACK_CONCRETE_SLAB);
        BlackConcretePool.pressurePlate(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        BlackConcretePool.button(ModBlocks.BLACK_CONCRETE_BUTTON);
        BlackConcretePool.wall(ModBlocks.BLACK_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_CONCRETE_TILES);
        BrownConcretePool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        BrownConcretePool.slab(ModBlocks.BROWN_CONCRETE_SLAB);
        BrownConcretePool.pressurePlate(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        BrownConcretePool.button(ModBlocks.BROWN_CONCRETE_BUTTON);
        BrownConcretePool.wall(ModBlocks.BROWN_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_CONCRETE_TILES);
        RedConcretePool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        RedConcretePool.slab(ModBlocks.RED_CONCRETE_SLAB);
        RedConcretePool.pressurePlate(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
        RedConcretePool.button(ModBlocks.RED_CONCRETE_BUTTON);
        RedConcretePool.wall(ModBlocks.RED_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_CONCRETE_TILES);
        OrangeConcretePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        OrangeConcretePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);
        OrangeConcretePool.pressurePlate(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        OrangeConcretePool.button(ModBlocks.ORANGE_CONCRETE_BUTTON);
        OrangeConcretePool.wall(ModBlocks.ORANGE_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_CONCRETE_TILES);
        YellowConcretePool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        YellowConcretePool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);
        YellowConcretePool.pressurePlate(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        YellowConcretePool.button(ModBlocks.YELLOW_CONCRETE_BUTTON);
        YellowConcretePool.wall(ModBlocks.YELLOW_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_CONCRETE_TILES);
        LimeConcretePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        LimeConcretePool.slab(ModBlocks.LIME_CONCRETE_SLAB);
        LimeConcretePool.pressurePlate(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        LimeConcretePool.button(ModBlocks.LIME_CONCRETE_BUTTON);
        LimeConcretePool.wall(ModBlocks.LIME_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_CONCRETE_TILES);
        GreenConcretePool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        GreenConcretePool.slab(ModBlocks.GREEN_CONCRETE_SLAB);
        GreenConcretePool.pressurePlate(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        GreenConcretePool.button(ModBlocks.GREEN_CONCRETE_BUTTON);
        GreenConcretePool.wall(ModBlocks.GREEN_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_CONCRETE_TILES);
        CyanConcretePool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        CyanConcretePool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
        CyanConcretePool.pressurePlate(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        CyanConcretePool.button(ModBlocks.CYAN_CONCRETE_BUTTON);
        CyanConcretePool.wall(ModBlocks.CYAN_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_CONCRETE_TILES);
        LightBlueConcretePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        LightBlueConcretePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        LightBlueConcretePool.pressurePlate(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        LightBlueConcretePool.button(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        LightBlueConcretePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CONCRETE_TILES);
        BlueConcretePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        BlueConcretePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);
        BlueConcretePool.pressurePlate(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        BlueConcretePool.button(ModBlocks.BLUE_CONCRETE_BUTTON);
        BlueConcretePool.wall(ModBlocks.BLUE_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CONCRETE_TILES);
        PurpleConcretePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        PurpleConcretePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);
        PurpleConcretePool.pressurePlate(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        PurpleConcretePool.button(ModBlocks.PURPLE_CONCRETE_BUTTON);
        PurpleConcretePool.wall(ModBlocks.PURPLE_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_CONCRETE_TILES);
        MagentaConcretePool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        MagentaConcretePool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);
        MagentaConcretePool.pressurePlate(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        MagentaConcretePool.button(ModBlocks.MAGENTA_CONCRETE_BUTTON);
        MagentaConcretePool.wall(ModBlocks.MAGENTA_CONCRETE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_CONCRETE_TILES);
        PinkConcretePool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        PinkConcretePool.slab(ModBlocks.PINK_CONCRETE_SLAB);
        PinkConcretePool.pressurePlate(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        PinkConcretePool.button(ModBlocks.PINK_CONCRETE_BUTTON);
        PinkConcretePool.wall(ModBlocks.PINK_CONCRETE_WALL);

        // Pillar Blocks
        blockStateModelGenerator.registerLog(ModBlocks.STONE_COLUMN).log(ModBlocks.STONE_COLUMN);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STONE_COLUMN).log(ModBlocks.MOSSY_STONE_COLUMN);
        blockStateModelGenerator.registerLog(ModBlocks.CRACKED_STONE_COLUMN).log(ModBlocks.CRACKED_STONE_COLUMN);

        // Wool Blocks
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
