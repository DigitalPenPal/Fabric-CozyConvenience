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

        blockStateModelGenerator.registerTrapdoor(ModBlocks.IRON_BAR_GATE);

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

        // Terracotta Blocks
        BlockStateModelGenerator.BlockTexturePool TerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool WhiteTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool LightGrayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool GrayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool BlackTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool BrownTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool RedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool OrangeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool YellowTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool LimeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool GreenTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool CyanTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool LightBlueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool BlueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool PurpleTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool MagentaTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool PinkTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);

        TerracottaPool.stairs(ModBlocks.TERRACOTTA_STAIRS);
        TerracottaPool.slab(ModBlocks.TERRACOTTA_SLAB);
        TerracottaPool.pressurePlate(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
        TerracottaPool.button(ModBlocks.TERRACOTTA_BUTTON);
        TerracottaPool.wall(ModBlocks.TERRACOTTA_WALL);

        WhiteTerracottaPool.stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        WhiteTerracottaPool.slab(ModBlocks.WHITE_TERRACOTTA_SLAB);
        WhiteTerracottaPool.pressurePlate(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
        WhiteTerracottaPool.button(ModBlocks.WHITE_TERRACOTTA_BUTTON);
        WhiteTerracottaPool.wall(ModBlocks.WHITE_TERRACOTTA_WALL);

        LightGrayTerracottaPool.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        LightGrayTerracottaPool.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        LightGrayTerracottaPool.pressurePlate(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
        LightGrayTerracottaPool.button(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);
        LightGrayTerracottaPool.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        GrayTerracottaPool.stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        GrayTerracottaPool.slab(ModBlocks.GRAY_TERRACOTTA_SLAB);
        GrayTerracottaPool.pressurePlate(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
        GrayTerracottaPool.button(ModBlocks.GRAY_TERRACOTTA_BUTTON);
        GrayTerracottaPool.wall(ModBlocks.GRAY_TERRACOTTA_WALL);

        BlackTerracottaPool.stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        BlackTerracottaPool.slab(ModBlocks.BLACK_TERRACOTTA_SLAB);
        BlackTerracottaPool.pressurePlate(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
        BlackTerracottaPool.button(ModBlocks.BLACK_TERRACOTTA_BUTTON);
        BlackTerracottaPool.wall(ModBlocks.BLACK_TERRACOTTA_WALL);

        BrownTerracottaPool.stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        BrownTerracottaPool.slab(ModBlocks.BROWN_TERRACOTTA_SLAB);
        BrownTerracottaPool.pressurePlate(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
        BrownTerracottaPool.button(ModBlocks.BROWN_TERRACOTTA_BUTTON);
        BrownTerracottaPool.wall(ModBlocks.BROWN_TERRACOTTA_WALL);

        RedTerracottaPool.stairs(ModBlocks.RED_TERRACOTTA_STAIRS);
        RedTerracottaPool.slab(ModBlocks.RED_TERRACOTTA_SLAB);
        RedTerracottaPool.pressurePlate(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
        RedTerracottaPool.button(ModBlocks.RED_TERRACOTTA_BUTTON);
        RedTerracottaPool.wall(ModBlocks.RED_TERRACOTTA_WALL);

        OrangeTerracottaPool.stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        OrangeTerracottaPool.slab(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        OrangeTerracottaPool.pressurePlate(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
        OrangeTerracottaPool.button(ModBlocks.ORANGE_TERRACOTTA_BUTTON);
        OrangeTerracottaPool.wall(ModBlocks.ORANGE_TERRACOTTA_WALL);

        YellowTerracottaPool.stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        YellowTerracottaPool.slab(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        YellowTerracottaPool.pressurePlate(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
        YellowTerracottaPool.button(ModBlocks.YELLOW_TERRACOTTA_BUTTON);
        YellowTerracottaPool.wall(ModBlocks.YELLOW_TERRACOTTA_WALL);

        LimeTerracottaPool.stairs(ModBlocks.LIME_TERRACOTTA_STAIRS);
        LimeTerracottaPool.slab(ModBlocks.LIME_TERRACOTTA_SLAB);
        LimeTerracottaPool.pressurePlate(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
        LimeTerracottaPool.button(ModBlocks.LIME_TERRACOTTA_BUTTON);
        LimeTerracottaPool.wall(ModBlocks.LIME_TERRACOTTA_WALL);

        GreenTerracottaPool.stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        GreenTerracottaPool.slab(ModBlocks.GREEN_TERRACOTTA_SLAB);
        GreenTerracottaPool.pressurePlate(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
        GreenTerracottaPool.button(ModBlocks.GREEN_TERRACOTTA_BUTTON);
        GreenTerracottaPool.wall(ModBlocks.GREEN_TERRACOTTA_WALL);

        CyanTerracottaPool.stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        CyanTerracottaPool.slab(ModBlocks.CYAN_TERRACOTTA_SLAB);
        CyanTerracottaPool.pressurePlate(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
        CyanTerracottaPool.button(ModBlocks.CYAN_TERRACOTTA_BUTTON);
        CyanTerracottaPool.wall(ModBlocks.CYAN_TERRACOTTA_WALL);

        LightBlueTerracottaPool.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        LightBlueTerracottaPool.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        LightBlueTerracottaPool.pressurePlate(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
        LightBlueTerracottaPool.button(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);
        LightBlueTerracottaPool.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        BlueTerracottaPool.stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        BlueTerracottaPool.slab(ModBlocks.BLUE_TERRACOTTA_SLAB);
        BlueTerracottaPool.pressurePlate(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
        BlueTerracottaPool.button(ModBlocks.BLUE_TERRACOTTA_BUTTON);
        BlueTerracottaPool.wall(ModBlocks.BLUE_TERRACOTTA_WALL);

        PurpleTerracottaPool.stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        PurpleTerracottaPool.slab(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        PurpleTerracottaPool.pressurePlate(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
        PurpleTerracottaPool.button(ModBlocks.PURPLE_TERRACOTTA_BUTTON);
        PurpleTerracottaPool.wall(ModBlocks.PURPLE_TERRACOTTA_WALL);

        MagentaTerracottaPool.stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        MagentaTerracottaPool.slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        MagentaTerracottaPool.pressurePlate(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
        MagentaTerracottaPool.button(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);
        MagentaTerracottaPool.wall(ModBlocks.MAGENTA_TERRACOTTA_WALL);

        PinkTerracottaPool.stairs(ModBlocks.PINK_TERRACOTTA_STAIRS);
        PinkTerracottaPool.slab(ModBlocks.PINK_TERRACOTTA_SLAB);
        PinkTerracottaPool.pressurePlate(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
        PinkTerracottaPool.button(ModBlocks.PINK_TERRACOTTA_BUTTON);
        PinkTerracottaPool.wall(ModBlocks.PINK_TERRACOTTA_WALL);

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

        WhiteWoolPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);
        WhiteWoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);

        LightGrayWoolPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        LightGrayWoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);

        GrayWoolPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);
        GrayWoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);

        BlackWoolPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);
        BlackWoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);

        BrownWoolPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);
        BrownWoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);

        RedWoolPool.stairs(ModBlocks.RED_WOOL_STAIRS);
        RedWoolPool.slab(ModBlocks.RED_WOOL_SLAB);

        OrangeWoolPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);
        OrangeWoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);

        YellowWoolPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);
        YellowWoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);

        LimeWoolPool.stairs(ModBlocks.LIME_WOOL_STAIRS);
        LimeWoolPool.slab(ModBlocks.LIME_WOOL_SLAB);

        GreenWoolPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);
        GreenWoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);

        CyanWoolPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);
        CyanWoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);

        LightBlueWoolPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        LightBlueWoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);

        BlueWoolPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);
        BlueWoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);

        PurpleWoolPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);
        PurpleWoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);

        MagentaWoolPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);
        MagentaWoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);

        PinkWoolPool.stairs(ModBlocks.PINK_WOOL_STAIRS);
        PinkWoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
