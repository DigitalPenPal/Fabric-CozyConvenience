package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import pencil.cozyconvenience.block.BuildingBlocks;
import pencil.cozyconvenience.block.ColoredBlocks;
import pencil.cozyconvenience.block.NaturalBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool DirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIRT);
        DirtPool.stairs(NaturalBlocks.DIRT_STAIRS);
        DirtPool.slab(NaturalBlocks.DIRT_SLAB);

        BlockStateModelGenerator.BlockTexturePool CoarseDirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COARSE_DIRT);
        CoarseDirtPool.stairs(NaturalBlocks.COARSE_DIRT_STAIRS);
        CoarseDirtPool.slab(NaturalBlocks.COARSE_DIRT_SLAB);

        BlockStateModelGenerator.BlockTexturePool RootedDirtPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ROOTED_DIRT);
        RootedDirtPool.stairs(NaturalBlocks.ROOTED_DIRT_STAIRS);
        RootedDirtPool.slab(NaturalBlocks.ROOTED_DIRT_SLAB);

        BlockStateModelGenerator.BlockTexturePool NetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        NetherrackPool.stairs(NaturalBlocks.NETHERRACK_STAIRS);
        NetherrackPool.slab(NaturalBlocks.NETHERRACK_SLAB);
        NetherrackPool.wall(NaturalBlocks.NETHERRACK_WALL);

        BlockStateModelGenerator.BlockTexturePool OakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OAK_PLANKS);
        OakPool.wall(BuildingBlocks.OAK_WALL);

        BlockStateModelGenerator.BlockTexturePool SprucePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SPRUCE_PLANKS);
        SprucePool.wall(BuildingBlocks.SPRUCE_WALL);

        BlockStateModelGenerator.BlockTexturePool BirchPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BIRCH_PLANKS);
        BirchPool.wall(BuildingBlocks.BIRCH_WALL);

        BlockStateModelGenerator.BlockTexturePool JunglePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.JUNGLE_PLANKS);
        JunglePool.wall(BuildingBlocks.JUNGLE_WALL);

        BlockStateModelGenerator.BlockTexturePool AcaciaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ACACIA_PLANKS);
        AcaciaPool.wall(BuildingBlocks.ACACIA_WALL);

        BlockStateModelGenerator.BlockTexturePool DarkOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_OAK_PLANKS);
        DarkOakPool.wall(BuildingBlocks.DARK_OAK_WALL);

        BlockStateModelGenerator.BlockTexturePool MangrovePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MANGROVE_PLANKS);
        MangrovePool.wall(BuildingBlocks.MANGROVE_WALL);

        BlockStateModelGenerator.BlockTexturePool CherryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHERRY_PLANKS);
        CherryPool.wall(BuildingBlocks.CHERRY_WALL);

        BlockStateModelGenerator.BlockTexturePool BambooPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_PLANKS);
        BambooPool.wall(BuildingBlocks.BAMBOO_WALL);

        BlockStateModelGenerator.BlockTexturePool BambooMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_MOSAIC);
        BambooMosaicPool.wall(BuildingBlocks.BAMBOO_MOSAIC_WALL);

        BlockStateModelGenerator.BlockTexturePool CrimsonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRIMSON_PLANKS);
        CrimsonPool.wall(BuildingBlocks.CRIMSON_WALL);

        BlockStateModelGenerator.BlockTexturePool WarpedPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WARPED_PLANKS);
        WarpedPool.wall(BuildingBlocks.WARPED_WALL);


        BlockStateModelGenerator.BlockTexturePool StonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        StonePool.wall(BuildingBlocks.STONE_WALL);

        blockStateModelGenerator.registerLog(BuildingBlocks.STONE_COLUMN).log(BuildingBlocks.STONE_COLUMN);
        blockStateModelGenerator.registerLog(BuildingBlocks.MOSSY_STONE_COLUMN).log(BuildingBlocks.MOSSY_STONE_COLUMN);
        blockStateModelGenerator.registerLog(BuildingBlocks.CRACKED_STONE_COLUMN).log(BuildingBlocks.CRACKED_STONE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool SmoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        SmoothStonePool.stairs(BuildingBlocks.SMOOTH_STONE_STAIRS);
        SmoothStonePool.wall(BuildingBlocks.SMOOTH_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool CrackedStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        CrackedStoneBrickPool.stairs(BuildingBlocks.CRACKED_STONE_BRICK_STAIRS);
        CrackedStoneBrickPool.slab(BuildingBlocks.CRACKED_STONE_BRICK_SLAB);
        CrackedStoneBrickPool.wall(BuildingBlocks.CRACKED_STONE_BRICK_WALL);


        BlockStateModelGenerator.BlockTexturePool PolishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        PolishedGranitePool.wall(BuildingBlocks.POLISHED_GRANITE_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        PolishedDioritePool.wall(BuildingBlocks.POLISHED_DIORITE_WALL);

        BlockStateModelGenerator.BlockTexturePool PolishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        PolishedAndesitePool.wall(BuildingBlocks.POLISHED_ANDESITE_WALL);


        BlockStateModelGenerator.BlockTexturePool DeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE);
        DeepslatePool.stairs(BuildingBlocks.DEEPSLATE_STAIRS);
        DeepslatePool.slab(BuildingBlocks.DEEPSLATE_SLAB);
        DeepslatePool.wall(BuildingBlocks.DEEPSLATE_WALL);

        BlockStateModelGenerator.BlockTexturePool CrackedDeepslateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_BRICKS);
        CrackedDeepslateBrickPool.stairs(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        CrackedDeepslateBrickPool.slab(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
        CrackedDeepslateBrickPool.wall(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool CrackedDeepslateTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_TILES);
        CrackedDeepslateTilePool.stairs(BuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        CrackedDeepslateTilePool.slab(BuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
        CrackedDeepslateTilePool.wall(BuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL);


        BlockStateModelGenerator.BlockTexturePool PackedMudPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_MUD);
        PackedMudPool.stairs(BuildingBlocks.PACKED_MUD_STAIRS);
        PackedMudPool.slab(BuildingBlocks.PACKED_MUD_SLAB);
        PackedMudPool.wall(BuildingBlocks.PACKED_MUD_WALL);


        BlockStateModelGenerator.BlockTexturePool PrismarineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        PrismarineBrickPool.wall(BuildingBlocks.PRISMARINE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool DarkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        DarkPrismarinePool.wall(BuildingBlocks.DARK_PRISMARINE_WALL);


        BlockStateModelGenerator.BlockTexturePool CrackedNetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_NETHER_BRICKS);
        CrackedNetherBrickPool.stairs(BuildingBlocks.CRACKED_NETHER_BRICK_STAIRS);
        CrackedNetherBrickPool.slab(BuildingBlocks.CRACKED_NETHER_BRICK_SLAB);
        CrackedNetherBrickPool.wall(BuildingBlocks.CRACKED_NETHER_BRICK_WALL);

        // Basalt Blocks -- [ Here be Broken Blocks ]
        BlockStateModelGenerator.BlockTexturePool BasaltTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.BASALT_TILES);
        BasaltTilePool.stairs(BuildingBlocks.BASALT_TILE_STAIRS);
        BasaltTilePool.slab(BuildingBlocks.BASALT_TILE_SLAB);
        BasaltTilePool.wall(BuildingBlocks.BASALT_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool ChiseledBasaltTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.CHISELED_BASALT_TILES);
        ChiseledBasaltTilePool.stairs(BuildingBlocks.CHISELED_BASALT_TILE_STAIRS);
        ChiseledBasaltTilePool.slab(BuildingBlocks.CHISELED_BASALT_TILE_SLAB);
        ChiseledBasaltTilePool.wall(BuildingBlocks.CHISELED_BASALT_TILE_WALL);


        BlockStateModelGenerator.BlockTexturePool GildedBlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        GildedBlackstonePool.stairs(BuildingBlocks.GILDED_BLACKSTONE_STAIRS);
        GildedBlackstonePool.slab(BuildingBlocks.GILDED_BLACKSTONE_SLAB);
        GildedBlackstonePool.wall(BuildingBlocks.GILDED_BLACKSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool CrackedPolishedBlackstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        CrackedPolishedBlackstoneBrickPool.stairs(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        CrackedPolishedBlackstoneBrickPool.slab(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        CrackedPolishedBlackstoneBrickPool.wall(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);


        BlockStateModelGenerator.BlockTexturePool EndStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        EndStonePool.stairs(BuildingBlocks.END_STONE_STAIRS);
        EndStonePool.slab(BuildingBlocks.END_STONE_SLAB);
        EndStonePool.wall(BuildingBlocks.END_STONE_WALL);


        BlockStateModelGenerator.BlockTexturePool PurpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        PurpurPool.wall(BuildingBlocks.PURPUR_WALL);


        BlockStateModelGenerator.BlockTexturePool IronPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.IRON_BLOCK);
        IronPool.stairs(BuildingBlocks.IRON_STAIRS);
        IronPool.slab(BuildingBlocks.IRON_SLAB);
        IronPool.wall(BuildingBlocks.IRON_WALL);

        BlockStateModelGenerator.BlockTexturePool CutIronPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.CUT_IRON_BLOCK);
        CutIronPool.stairs(BuildingBlocks.CUT_IRON_STAIRS);
        CutIronPool.slab(BuildingBlocks.CUT_IRON_SLAB);
        CutIronPool.wall(BuildingBlocks.CUT_IRON_WALL);


        BlockStateModelGenerator.BlockTexturePool GoldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        GoldPool.stairs(BuildingBlocks.GOLD_STAIRS);
        GoldPool.slab(BuildingBlocks.GOLD_SLAB);
        GoldPool.wall(BuildingBlocks.GOLD_WALL);

        BlockStateModelGenerator.BlockTexturePool GoldBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.GOLD_BRICKS);
        GoldBricksPool.stairs(BuildingBlocks.GOLD_BRICK_STAIRS);
        GoldBricksPool.slab(BuildingBlocks.GOLD_BRICK_SLAB);
        GoldBricksPool.wall(BuildingBlocks.GOLD_BRICK_WALL);


        BlockStateModelGenerator.BlockTexturePool EmeraldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EMERALD_BLOCK);
        EmeraldPool.stairs(BuildingBlocks.EMERALD_STAIRS);
        EmeraldPool.slab(BuildingBlocks.EMERALD_SLAB);
        EmeraldPool.wall(BuildingBlocks.EMERALD_WALL);

        BlockStateModelGenerator.BlockTexturePool EmeraldBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.EMERALD_BRICKS);
        EmeraldBricksPool.stairs(BuildingBlocks.EMERALD_BRICK_STAIRS);
        EmeraldBricksPool.slab(BuildingBlocks.EMERALD_BRICK_SLAB);
        EmeraldBricksPool.wall(BuildingBlocks.EMERALD_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool CutEmeraldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.CUT_EMERALD);
        CutEmeraldPool.stairs(BuildingBlocks.CUT_EMERALD_STAIRS);
        CutEmeraldPool.slab(BuildingBlocks.CUT_EMERALD_SLAB);
        CutEmeraldPool.wall(BuildingBlocks.CUT_EMERALD_WALL);


        BlockStateModelGenerator.BlockTexturePool LapisPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LAPIS_BLOCK);
        LapisPool.stairs(BuildingBlocks.LAPIS_STAIRS);
        LapisPool.slab(BuildingBlocks.LAPIS_SLAB);
        LapisPool.wall(BuildingBlocks.LAPIS_WALL);


        BlockStateModelGenerator.BlockTexturePool NetheritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);
        NetheritePool.stairs(BuildingBlocks.NETHERITE_STAIRS);
        NetheritePool.slab(BuildingBlocks.NETHERITE_SLAB);
        NetheritePool.wall(BuildingBlocks.NETHERITE_WALL);

        BlockStateModelGenerator.BlockTexturePool NetheriteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.NETHERITE_BRICKS);
        NetheriteBricksPool.stairs(BuildingBlocks.NETHERITE_BRICK_STAIRS);
        NetheriteBricksPool.slab(BuildingBlocks.NETHERITE_BRICK_SLAB);
        NetheriteBricksPool.wall(BuildingBlocks.NETHERITE_BRICK_WALL);

        // Gems
        BlockStateModelGenerator.BlockTexturePool DiamondPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIAMOND_BLOCK);
        DiamondPool.stairs(BuildingBlocks.DIAMOND_STAIRS);
        DiamondPool.slab(BuildingBlocks.DIAMOND_SLAB);
        DiamondPool.wall(BuildingBlocks.DIAMOND_WALL);

        BlockStateModelGenerator.BlockTexturePool CutDiamondBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.DIAMOND_BRICKS);
        CutDiamondBricksPool.stairs(BuildingBlocks.DIAMOND_BRICK_STAIRS);
        CutDiamondBricksPool.slab(BuildingBlocks.DIAMOND_BRICK_SLAB);
        CutDiamondBricksPool.wall(BuildingBlocks.DIAMOND_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool AmethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        AmethystPool.stairs(BuildingBlocks.AMETHYST_STAIRS);
        AmethystPool.slab(BuildingBlocks.AMETHYST_SLAB);
        AmethystPool.wall(BuildingBlocks.AMETHYST_WALL);

        BlockStateModelGenerator.BlockTexturePool AmethystBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(BuildingBlocks.AMETHYST_BRICKS);
        AmethystBrickPool.stairs(BuildingBlocks.AMETHYST_BRICK_STAIRS);
        AmethystBrickPool.slab(BuildingBlocks.AMETHYST_BRICK_SLAB);
        AmethystBrickPool.wall(BuildingBlocks.AMETHYST_BRICK_WALL);

        // Quartz
        BlockStateModelGenerator.BlockTexturePool QuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BLOCK);
        //QuartzPool.wall(BuildingBlocks.QUARTZ_WALL);

        BlockStateModelGenerator.BlockTexturePool QuartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        QuartzBrickPool.stairs(BuildingBlocks.QUARTZ_BRICK_STAIRS);
        QuartzBrickPool.slab(BuildingBlocks.QUARTZ_BRICK_SLAB);
        QuartzBrickPool.wall(BuildingBlocks.QUARTZ_BRICK_WALL);

        BlockStateModelGenerator.LogTexturePool QuartzPillarPool = blockStateModelGenerator.registerLog(Blocks.QUARTZ_PILLAR);
        //QuartzPool.wall(BuildingBlocks.QUARTZ_WALL);

        // Wool
        BlockStateModelGenerator.BlockTexturePool WhiteWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_WOOL);
        WhiteWoolPool.stairs(ColoredBlocks.WHITE_WOOL_STAIRS);
        WhiteWoolPool.slab(ColoredBlocks.WHITE_WOOL_SLAB);
        WhiteWoolPool.wall(ColoredBlocks.WHITE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool LightGrayWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_WOOL);
        LightGrayWoolPool.stairs(ColoredBlocks.LIGHT_GRAY_WOOL_STAIRS);
        LightGrayWoolPool.slab(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB);
        LightGrayWoolPool.wall(ColoredBlocks.LIGHT_GRAY_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool GrayWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_WOOL);
        GrayWoolPool.stairs(ColoredBlocks.GRAY_WOOL_STAIRS);
        GrayWoolPool.slab(ColoredBlocks.GRAY_WOOL_SLAB);
        GrayWoolPool.wall(ColoredBlocks.GRAY_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool BlackWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_WOOL);
        BlackWoolPool.stairs(ColoredBlocks.BLACK_WOOL_STAIRS);
        BlackWoolPool.slab(ColoredBlocks.BLACK_WOOL_SLAB);
        BlackWoolPool.wall(ColoredBlocks.BLACK_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool BrownWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_WOOL);
        BrownWoolPool.stairs(ColoredBlocks.BROWN_WOOL_STAIRS);
        BrownWoolPool.slab(ColoredBlocks.BROWN_WOOL_SLAB);
        BrownWoolPool.wall(ColoredBlocks.BROWN_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool RedWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_WOOL);
        RedWoolPool.stairs(ColoredBlocks.RED_WOOL_STAIRS);
        RedWoolPool.slab(ColoredBlocks.RED_WOOL_SLAB);
        RedWoolPool.wall(ColoredBlocks.RED_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool OrangeWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_WOOL);
        OrangeWoolPool.stairs(ColoredBlocks.ORANGE_WOOL_STAIRS);
        OrangeWoolPool.slab(ColoredBlocks.ORANGE_WOOL_SLAB);
        OrangeWoolPool.wall(ColoredBlocks.ORANGE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool YellowWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_WOOL);
        YellowWoolPool.stairs(ColoredBlocks.YELLOW_WOOL_STAIRS);
        YellowWoolPool.slab(ColoredBlocks.YELLOW_WOOL_SLAB);
        YellowWoolPool.wall(ColoredBlocks.YELLOW_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool LimeWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_WOOL);
        LimeWoolPool.stairs(ColoredBlocks.LIME_WOOL_STAIRS);
        LimeWoolPool.slab(ColoredBlocks.LIME_WOOL_SLAB);
        LimeWoolPool.wall(ColoredBlocks.LIME_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool GreenWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_WOOL);
        GreenWoolPool.stairs(ColoredBlocks.GREEN_WOOL_STAIRS);
        GreenWoolPool.slab(ColoredBlocks.GREEN_WOOL_SLAB);
        GreenWoolPool.wall(ColoredBlocks.GREEN_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool CyanWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_WOOL);
        CyanWoolPool.stairs(ColoredBlocks.CYAN_WOOL_STAIRS);
        CyanWoolPool.slab(ColoredBlocks.CYAN_WOOL_SLAB);
        CyanWoolPool.wall(ColoredBlocks.CYAN_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool LightBlueWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_WOOL);
        LightBlueWoolPool.stairs(ColoredBlocks.LIGHT_BLUE_WOOL_STAIRS);
        LightBlueWoolPool.slab(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB);
        LightBlueWoolPool.wall(ColoredBlocks.LIGHT_BLUE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool BlueWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_WOOL);
        BlueWoolPool.stairs(ColoredBlocks.BLUE_WOOL_STAIRS);
        BlueWoolPool.slab(ColoredBlocks.BLUE_WOOL_SLAB);
        BlueWoolPool.wall(ColoredBlocks.BLUE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool PurpleWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_WOOL);
        PurpleWoolPool.stairs(ColoredBlocks.PURPLE_WOOL_STAIRS);
        PurpleWoolPool.slab(ColoredBlocks.PURPLE_WOOL_SLAB);
        PurpleWoolPool.wall(ColoredBlocks.PURPLE_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool MagentaWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_WOOL);
        MagentaWoolPool.stairs(ColoredBlocks.MAGENTA_WOOL_STAIRS);
        MagentaWoolPool.slab(ColoredBlocks.MAGENTA_WOOL_SLAB);
        MagentaWoolPool.wall(ColoredBlocks.MAGENTA_WOOL_WALL);

        BlockStateModelGenerator.BlockTexturePool PinkWoolPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_WOOL);
        PinkWoolPool.stairs(ColoredBlocks.PINK_WOOL_STAIRS);
        PinkWoolPool.slab(ColoredBlocks.PINK_WOOL_SLAB);
        PinkWoolPool.wall(ColoredBlocks.PINK_WOOL_WALL);

        // Terracotta
        BlockStateModelGenerator.BlockTexturePool TerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        TerracottaPool.stairs(ColoredBlocks.TERRACOTTA_STAIRS);
        TerracottaPool.slab(ColoredBlocks.TERRACOTTA_SLAB);
        TerracottaPool.wall(ColoredBlocks.TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool WhiteTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        WhiteTerracottaPool.stairs(ColoredBlocks.WHITE_TERRACOTTA_STAIRS);
        WhiteTerracottaPool.slab(ColoredBlocks.WHITE_TERRACOTTA_SLAB);
        WhiteTerracottaPool.wall(ColoredBlocks.WHITE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool LightGrayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        LightGrayTerracottaPool.stairs(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        LightGrayTerracottaPool.slab(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        LightGrayTerracottaPool.wall(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool GrayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        GrayTerracottaPool.stairs(ColoredBlocks.GRAY_TERRACOTTA_STAIRS);
        GrayTerracottaPool.slab(ColoredBlocks.GRAY_TERRACOTTA_SLAB);
        GrayTerracottaPool.wall(ColoredBlocks.GRAY_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool BlackTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        BlackTerracottaPool.stairs(ColoredBlocks.BLACK_TERRACOTTA_STAIRS);
        BlackTerracottaPool.slab(ColoredBlocks.BLACK_TERRACOTTA_SLAB);
        BlackTerracottaPool.wall(ColoredBlocks.BLACK_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool BrownTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        BrownTerracottaPool.stairs(ColoredBlocks.BROWN_TERRACOTTA_STAIRS);
        BrownTerracottaPool.slab(ColoredBlocks.BROWN_TERRACOTTA_SLAB);
        BrownTerracottaPool.wall(ColoredBlocks.BROWN_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool RedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        RedTerracottaPool.stairs(ColoredBlocks.RED_TERRACOTTA_STAIRS);
        RedTerracottaPool.slab(ColoredBlocks.RED_TERRACOTTA_SLAB);
        RedTerracottaPool.wall(ColoredBlocks.RED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool OrangeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        OrangeTerracottaPool.stairs(ColoredBlocks.ORANGE_TERRACOTTA_STAIRS);
        OrangeTerracottaPool.slab(ColoredBlocks.ORANGE_TERRACOTTA_SLAB);
        OrangeTerracottaPool.wall(ColoredBlocks.ORANGE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool YellowTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        YellowTerracottaPool.stairs(ColoredBlocks.YELLOW_TERRACOTTA_STAIRS);
        YellowTerracottaPool.slab(ColoredBlocks.YELLOW_TERRACOTTA_SLAB);
        YellowTerracottaPool.wall(ColoredBlocks.YELLOW_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool LimeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        LimeTerracottaPool.stairs(ColoredBlocks.LIME_TERRACOTTA_STAIRS);
        LimeTerracottaPool.slab(ColoredBlocks.LIME_TERRACOTTA_SLAB);
        LimeTerracottaPool.wall(ColoredBlocks.LIME_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool GreenTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        GreenTerracottaPool.stairs(ColoredBlocks.GREEN_TERRACOTTA_STAIRS);
        GreenTerracottaPool.slab(ColoredBlocks.GREEN_TERRACOTTA_SLAB);
        GreenTerracottaPool.wall(ColoredBlocks.GREEN_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool CyanTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        CyanTerracottaPool.stairs(ColoredBlocks.CYAN_TERRACOTTA_STAIRS);
        CyanTerracottaPool.slab(ColoredBlocks.CYAN_TERRACOTTA_SLAB);
        CyanTerracottaPool.wall(ColoredBlocks.CYAN_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool LightBlueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        LightBlueTerracottaPool.stairs(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        LightBlueTerracottaPool.slab(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        LightBlueTerracottaPool.wall(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool BlueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        BlueTerracottaPool.stairs(ColoredBlocks.BLUE_TERRACOTTA_STAIRS);
        BlueTerracottaPool.slab(ColoredBlocks.BLUE_TERRACOTTA_SLAB);
        BlueTerracottaPool.wall(ColoredBlocks.BLUE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool PurpleTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        PurpleTerracottaPool.stairs(ColoredBlocks.PURPLE_TERRACOTTA_STAIRS);
        PurpleTerracottaPool.slab(ColoredBlocks.PURPLE_TERRACOTTA_SLAB);
        PurpleTerracottaPool.wall(ColoredBlocks.PURPLE_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool MagentaTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        MagentaTerracottaPool.stairs(ColoredBlocks.MAGENTA_TERRACOTTA_STAIRS);
        MagentaTerracottaPool.slab(ColoredBlocks.MAGENTA_TERRACOTTA_SLAB);
        MagentaTerracottaPool.wall(ColoredBlocks.MAGENTA_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool PinkTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);
        PinkTerracottaPool.stairs(ColoredBlocks.PINK_TERRACOTTA_STAIRS);
        PinkTerracottaPool.slab(ColoredBlocks.PINK_TERRACOTTA_SLAB);
        PinkTerracottaPool.wall(ColoredBlocks.PINK_TERRACOTTA_WALL);

        // Glazed Terracotta
        BlockStateModelGenerator.BlockTexturePool WhiteGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_GLAZED_TERRACOTTA);
        WhiteGlazedTerracottaPool.stairs(ColoredBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
        WhiteGlazedTerracottaPool.slab(ColoredBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
        WhiteGlazedTerracottaPool.wall(ColoredBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool LightGrayGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        LightGrayGlazedTerracottaPool.stairs(ColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
        LightGrayGlazedTerracottaPool.slab(ColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
        LightGrayGlazedTerracottaPool.wall(ColoredBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool GrayGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_GLAZED_TERRACOTTA);
        GrayGlazedTerracottaPool.stairs(ColoredBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
        GrayGlazedTerracottaPool.slab(ColoredBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
        GrayGlazedTerracottaPool.wall(ColoredBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool BlackGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_GLAZED_TERRACOTTA);
        BlackGlazedTerracottaPool.stairs(ColoredBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
        BlackGlazedTerracottaPool.slab(ColoredBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
        BlackGlazedTerracottaPool.wall(ColoredBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool BrownGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_GLAZED_TERRACOTTA);
        BrownGlazedTerracottaPool.stairs(ColoredBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
        BrownGlazedTerracottaPool.slab(ColoredBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
        BrownGlazedTerracottaPool.wall(ColoredBlocks.BROWN_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool RedGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_GLAZED_TERRACOTTA);
        RedGlazedTerracottaPool.stairs(ColoredBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
        RedGlazedTerracottaPool.slab(ColoredBlocks.RED_GLAZED_TERRACOTTA_SLAB);
        RedGlazedTerracottaPool.wall(ColoredBlocks.RED_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool OrangeGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_GLAZED_TERRACOTTA);
        OrangeGlazedTerracottaPool.stairs(ColoredBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
        OrangeGlazedTerracottaPool.slab(ColoredBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
        OrangeGlazedTerracottaPool.wall(ColoredBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool YellowGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_GLAZED_TERRACOTTA);
        YellowGlazedTerracottaPool.stairs(ColoredBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
        YellowGlazedTerracottaPool.slab(ColoredBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
        YellowGlazedTerracottaPool.wall(ColoredBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool LimeGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_GLAZED_TERRACOTTA);
        LimeGlazedTerracottaPool.stairs(ColoredBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
        LimeGlazedTerracottaPool.slab(ColoredBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
        LimeGlazedTerracottaPool.wall(ColoredBlocks.LIME_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool GreenGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_GLAZED_TERRACOTTA);
        GreenGlazedTerracottaPool.stairs(ColoredBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
        GreenGlazedTerracottaPool.slab(ColoredBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
        GreenGlazedTerracottaPool.wall(ColoredBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool CyanGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_GLAZED_TERRACOTTA);
        CyanGlazedTerracottaPool.stairs(ColoredBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
        CyanGlazedTerracottaPool.slab(ColoredBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
        CyanGlazedTerracottaPool.wall(ColoredBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool LightBlueGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        LightBlueGlazedTerracottaPool.stairs(ColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
        LightBlueGlazedTerracottaPool.slab(ColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
        LightBlueGlazedTerracottaPool.wall(ColoredBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool BlueGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_GLAZED_TERRACOTTA);
        BlueGlazedTerracottaPool.stairs(ColoredBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
        BlueGlazedTerracottaPool.slab(ColoredBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
        BlueGlazedTerracottaPool.wall(ColoredBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool PurpleGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_GLAZED_TERRACOTTA);
        PurpleGlazedTerracottaPool.stairs(ColoredBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
        PurpleGlazedTerracottaPool.slab(ColoredBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
        PurpleGlazedTerracottaPool.wall(ColoredBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool MagentaGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_GLAZED_TERRACOTTA);
        MagentaGlazedTerracottaPool.stairs(ColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
        MagentaGlazedTerracottaPool.slab(ColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
        MagentaGlazedTerracottaPool.wall(ColoredBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

        BlockStateModelGenerator.BlockTexturePool PinkGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_GLAZED_TERRACOTTA);
        PinkGlazedTerracottaPool.stairs(ColoredBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
        PinkGlazedTerracottaPool.slab(ColoredBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
        PinkGlazedTerracottaPool.wall(ColoredBlocks.PINK_GLAZED_TERRACOTTA_WALL);

        // Concrete
        BlockStateModelGenerator.BlockTexturePool WhiteConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        WhiteConcretePool.stairs(ColoredBlocks.WHITE_CONCRETE_STAIRS);
        WhiteConcretePool.slab(ColoredBlocks.WHITE_CONCRETE_SLAB);
        WhiteConcretePool.wall(ColoredBlocks.WHITE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool LightGrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        LightGrayConcretePool.stairs(ColoredBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        LightGrayConcretePool.slab(ColoredBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        LightGrayConcretePool.wall(ColoredBlocks.LIGHT_GRAY_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool GrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        GrayConcretePool.stairs(ColoredBlocks.GRAY_CONCRETE_STAIRS);
        GrayConcretePool.slab(ColoredBlocks.GRAY_CONCRETE_SLAB);
        GrayConcretePool.wall(ColoredBlocks.GRAY_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool BlackConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        BlackConcretePool.stairs(ColoredBlocks.BLACK_CONCRETE_STAIRS);
        BlackConcretePool.slab(ColoredBlocks.BLACK_CONCRETE_SLAB);
        BlackConcretePool.wall(ColoredBlocks.BLACK_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool BrownConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        BrownConcretePool.stairs(ColoredBlocks.BROWN_CONCRETE_STAIRS);
        BrownConcretePool.slab(ColoredBlocks.BROWN_CONCRETE_SLAB);
        BrownConcretePool.wall(ColoredBlocks.BROWN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool RedConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        RedConcretePool.stairs(ColoredBlocks.RED_CONCRETE_STAIRS);
        RedConcretePool.slab(ColoredBlocks.RED_CONCRETE_SLAB);
        RedConcretePool.wall(ColoredBlocks.RED_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool OrangeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        OrangeConcretePool.stairs(ColoredBlocks.ORANGE_CONCRETE_STAIRS);
        OrangeConcretePool.slab(ColoredBlocks.ORANGE_CONCRETE_SLAB);
        OrangeConcretePool.wall(ColoredBlocks.ORANGE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool YellowConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        YellowConcretePool.stairs(ColoredBlocks.YELLOW_CONCRETE_STAIRS);
        YellowConcretePool.slab(ColoredBlocks.YELLOW_CONCRETE_SLAB);
        YellowConcretePool.wall(ColoredBlocks.YELLOW_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool LimeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        LimeConcretePool.stairs(ColoredBlocks.LIME_CONCRETE_STAIRS);
        LimeConcretePool.slab(ColoredBlocks.LIME_CONCRETE_SLAB);
        LimeConcretePool.wall(ColoredBlocks.LIME_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool GreenConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        GreenConcretePool.stairs(ColoredBlocks.GREEN_CONCRETE_STAIRS);
        GreenConcretePool.slab(ColoredBlocks.GREEN_CONCRETE_SLAB);
        GreenConcretePool.wall(ColoredBlocks.GREEN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool CyanConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        CyanConcretePool.stairs(ColoredBlocks.CYAN_CONCRETE_STAIRS);
        CyanConcretePool.slab(ColoredBlocks.CYAN_CONCRETE_SLAB);
        CyanConcretePool.wall(ColoredBlocks.CYAN_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool LightBlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        LightBlueConcretePool.stairs(ColoredBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        LightBlueConcretePool.slab(ColoredBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        LightBlueConcretePool.wall(ColoredBlocks.LIGHT_BLUE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool BlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        BlueConcretePool.stairs(ColoredBlocks.BLUE_CONCRETE_STAIRS);
        BlueConcretePool.slab(ColoredBlocks.BLUE_CONCRETE_SLAB);
        BlueConcretePool.wall(ColoredBlocks.BLUE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool PurpleConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        PurpleConcretePool.stairs(ColoredBlocks.PURPLE_CONCRETE_STAIRS);
        PurpleConcretePool.slab(ColoredBlocks.PURPLE_CONCRETE_SLAB);
        PurpleConcretePool.wall(ColoredBlocks.PURPLE_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool MagentaConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        MagentaConcretePool.stairs(ColoredBlocks.MAGENTA_CONCRETE_STAIRS);
        MagentaConcretePool.slab(ColoredBlocks.MAGENTA_CONCRETE_SLAB);
        MagentaConcretePool.wall(ColoredBlocks.MAGENTA_CONCRETE_WALL);

        BlockStateModelGenerator.BlockTexturePool PinkConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        PinkConcretePool.stairs(ColoredBlocks.PINK_CONCRETE_STAIRS);
        PinkConcretePool.slab(ColoredBlocks.PINK_CONCRETE_SLAB);
        PinkConcretePool.wall(ColoredBlocks.PINK_CONCRETE_WALL);

        // Concrete Tiles
        BlockStateModelGenerator.BlockTexturePool WhiteConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.WHITE_CONCRETE_TILES);
        WhiteConcreteTilePool.stairs(ColoredBlocks.WHITE_CONCRETE_TILE_STAIRS);
        WhiteConcreteTilePool.slab(ColoredBlocks.WHITE_CONCRETE_TILE_SLAB);
        WhiteConcreteTilePool.wall(ColoredBlocks.WHITE_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool LightGrayConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILES);
        LightGrayConcreteTilePool.stairs(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS);
        LightGrayConcreteTilePool.slab(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB);
        LightGrayConcreteTilePool.wall(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool GrayConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.GRAY_CONCRETE_TILES);
        GrayConcreteTilePool.stairs(ColoredBlocks.GRAY_CONCRETE_TILE_STAIRS);
        GrayConcreteTilePool.slab(ColoredBlocks.GRAY_CONCRETE_TILE_SLAB);
        GrayConcreteTilePool.wall(ColoredBlocks.GRAY_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool BlackConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.BLACK_CONCRETE_TILES);
        BlackConcreteTilePool.stairs(ColoredBlocks.BLACK_CONCRETE_TILE_STAIRS);
        BlackConcreteTilePool.slab(ColoredBlocks.BLACK_CONCRETE_TILE_SLAB);
        BlackConcreteTilePool.wall(ColoredBlocks.BLACK_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool BrownConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.BROWN_CONCRETE_TILES);
        BrownConcreteTilePool.stairs(ColoredBlocks.BROWN_CONCRETE_TILE_STAIRS);
        BrownConcreteTilePool.slab(ColoredBlocks.BROWN_CONCRETE_TILE_SLAB);
        BrownConcreteTilePool.wall(ColoredBlocks.BROWN_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool RedConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.RED_CONCRETE_TILES);
        RedConcreteTilePool.stairs(ColoredBlocks.RED_CONCRETE_TILE_STAIRS);
        RedConcreteTilePool.slab(ColoredBlocks.RED_CONCRETE_TILE_SLAB);
        RedConcreteTilePool.wall(ColoredBlocks.RED_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool OrangeConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.ORANGE_CONCRETE_TILES);
        OrangeConcreteTilePool.stairs(ColoredBlocks.ORANGE_CONCRETE_TILE_STAIRS);
        OrangeConcreteTilePool.slab(ColoredBlocks.ORANGE_CONCRETE_TILE_SLAB);
        OrangeConcreteTilePool.wall(ColoredBlocks.ORANGE_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool YellowConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.YELLOW_CONCRETE_TILES);
        YellowConcreteTilePool.stairs(ColoredBlocks.YELLOW_CONCRETE_TILE_STAIRS);
        YellowConcreteTilePool.slab(ColoredBlocks.YELLOW_CONCRETE_TILE_SLAB);
        YellowConcreteTilePool.wall(ColoredBlocks.YELLOW_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool LimeConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.LIME_CONCRETE_TILES);
        LimeConcreteTilePool.stairs(ColoredBlocks.LIME_CONCRETE_TILE_STAIRS);
        LimeConcreteTilePool.slab(ColoredBlocks.LIME_CONCRETE_TILE_SLAB);
        LimeConcreteTilePool.wall(ColoredBlocks.LIME_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool GreenConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.GREEN_CONCRETE_TILES);
        GreenConcreteTilePool.stairs(ColoredBlocks.GREEN_CONCRETE_TILE_STAIRS);
        GreenConcreteTilePool.slab(ColoredBlocks.GREEN_CONCRETE_TILE_SLAB);
        GreenConcreteTilePool.wall(ColoredBlocks.GREEN_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool CyanConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.CYAN_CONCRETE_TILES);
        CyanConcreteTilePool.stairs(ColoredBlocks.CYAN_CONCRETE_TILE_STAIRS);
        CyanConcreteTilePool.slab(ColoredBlocks.CYAN_CONCRETE_TILE_SLAB);
        CyanConcreteTilePool.wall(ColoredBlocks.CYAN_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool LightBlueConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILES);
        LightBlueConcreteTilePool.stairs(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS);
        LightBlueConcreteTilePool.slab(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB);
        LightBlueConcreteTilePool.wall(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool BlueConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.BLUE_CONCRETE_TILES);
        BlueConcreteTilePool.stairs(ColoredBlocks.BLUE_CONCRETE_TILE_STAIRS);
        BlueConcreteTilePool.slab(ColoredBlocks.BLUE_CONCRETE_TILE_SLAB);
        BlueConcreteTilePool.wall(ColoredBlocks.BLUE_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool PurpleConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.PURPLE_CONCRETE_TILES);
        PurpleConcreteTilePool.stairs(ColoredBlocks.PURPLE_CONCRETE_TILE_STAIRS);
        PurpleConcreteTilePool.slab(ColoredBlocks.PURPLE_CONCRETE_TILE_SLAB);
        PurpleConcreteTilePool.wall(ColoredBlocks.PURPLE_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool MagentaConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.MAGENTA_CONCRETE_TILES);
        MagentaConcreteTilePool.stairs(ColoredBlocks.MAGENTA_CONCRETE_TILE_STAIRS);
        MagentaConcreteTilePool.slab(ColoredBlocks.MAGENTA_CONCRETE_TILE_SLAB);
        MagentaConcreteTilePool.wall(ColoredBlocks.MAGENTA_CONCRETE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool PinkConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ColoredBlocks.PINK_CONCRETE_TILES);
        PinkConcreteTilePool.stairs(ColoredBlocks.PINK_CONCRETE_TILE_STAIRS);
        PinkConcreteTilePool.slab(ColoredBlocks.PINK_CONCRETE_TILE_SLAB);
        PinkConcreteTilePool.wall(ColoredBlocks.PINK_CONCRETE_TILE_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ColoredBlocks.MESH_GLASS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
