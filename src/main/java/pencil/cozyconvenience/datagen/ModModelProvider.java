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
        // ++ Building Blocks Category ++


        // Wood Blocks
        BlockStateModelGenerator.BlockTexturePool OakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool SprucePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SPRUCE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool BirchPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BIRCH_PLANKS);
        BlockStateModelGenerator.BlockTexturePool JunglePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool AcaciaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ACACIA_PLANKS);
        BlockStateModelGenerator.BlockTexturePool DarkOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_OAK_PLANKS);
        BlockStateModelGenerator.BlockTexturePool MangrovePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MANGROVE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool CherryPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CHERRY_PLANKS);
        BlockStateModelGenerator.BlockTexturePool BambooPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool BambooMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BAMBOO_MOSAIC);
        BlockStateModelGenerator.BlockTexturePool CrimsonPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRIMSON_PLANKS);
        BlockStateModelGenerator.BlockTexturePool WarpedPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WARPED_PLANKS);

        OakPool.wall(ModBlocks.OAK_WALL);
        SprucePool.wall(ModBlocks.SPRUCE_WALL);
        BirchPool.wall(ModBlocks.BIRCH_WALL);
        JunglePool.wall(ModBlocks.JUNGLE_WALL);
        AcaciaPool.wall(ModBlocks.ACACIA_WALL);
        DarkOakPool.wall(ModBlocks.DARK_OAK_WALL);
        MangrovePool.wall(ModBlocks.MANGROVE_WALL);
        CherryPool.wall(ModBlocks.CHERRY_WALL);
        BambooPool.wall(ModBlocks.BAMBOO_WALL);
        BambooMosaicPool.wall(ModBlocks.BAMBOO_MOSAIC_WALL);
        CrimsonPool.wall(ModBlocks.CRIMSON_WALL);
        WarpedPool.wall(ModBlocks.WARPED_WALL);


        // Stone Blocks
        BlockStateModelGenerator.BlockTexturePool StonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool CobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool MossyCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSSY_COBBLESTONE);
        BlockStateModelGenerator.BlockTexturePool SmoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool StoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool CrackedStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool MossyStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MOSSY_STONE_BRICKS);

        StonePool.wall(ModBlocks.STONE_WALL);
        CobblestonePool.pressurePlate(ModBlocks.COBBLESTONE_PRESSURE_PLATE);
        CobblestonePool.button(ModBlocks.COBBLESTONE_BUTTON);
        MossyCobblestonePool.pressurePlate(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
        MossyCobblestonePool.button(ModBlocks.MOSSY_COBBLESTONE_BUTTON);
        SmoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        SmoothStonePool.wall(ModBlocks.SMOOTH_STONE_WALL);
        SmoothStonePool.pressurePlate(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
        SmoothStonePool.button(ModBlocks.SMOOTH_STONE_BUTTON);
        StoneBrickPool.pressurePlate(ModBlocks.STONE_BRICK_PRESSURE_PLATE);
        StoneBrickPool.button(ModBlocks.STONE_BRICK_BUTTON);
        CrackedStoneBrickPool.stairs(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        CrackedStoneBrickPool.slab(ModBlocks.CRACKED_STONE_BRICK_SLAB);
        CrackedStoneBrickPool.wall(ModBlocks.CRACKED_STONE_BRICK_WALL);
        CrackedStoneBrickPool.pressurePlate(ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE);
        CrackedStoneBrickPool.button(ModBlocks.CRACKED_STONE_BRICK_BUTTON);
        MossyStoneBrickPool.pressurePlate(ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE);
        MossyStoneBrickPool.button(ModBlocks.MOSSY_STONE_BRICK_BUTTON);

        blockStateModelGenerator.registerLog(ModBlocks.STONE_COLUMN).log(ModBlocks.STONE_COLUMN);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STONE_COLUMN).log(ModBlocks.MOSSY_STONE_COLUMN);
        blockStateModelGenerator.registerLog(ModBlocks.CRACKED_STONE_COLUMN).log(ModBlocks.CRACKED_STONE_COLUMN);


        // Granite Blocks
        BlockStateModelGenerator.BlockTexturePool GranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRANITE);
        BlockStateModelGenerator.BlockTexturePool PolishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);

        GranitePool.pressurePlate(ModBlocks.GRANITE_PRESSURE_PLATE);
        GranitePool.button(ModBlocks.GRANITE_BUTTON);
        PolishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        PolishedGranitePool.pressurePlate(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        PolishedGranitePool.button(ModBlocks.POLISHED_GRANITE_BUTTON);


        // Diorite Blocks
        BlockStateModelGenerator.BlockTexturePool DioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIORITE);
        BlockStateModelGenerator.BlockTexturePool PolishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);

        DioritePool.pressurePlate(ModBlocks.DIORITE_PRESSURE_PLATE);
        DioritePool.button(ModBlocks.DIORITE_BUTTON);
        PolishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        PolishedDioritePool.pressurePlate(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        PolishedDioritePool.button(ModBlocks.POLISHED_DIORITE_BUTTON);


        // Andesite Blocks
        BlockStateModelGenerator.BlockTexturePool AndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ANDESITE);
        BlockStateModelGenerator.BlockTexturePool PolishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);

        AndesitePool.pressurePlate(ModBlocks.ANDESITE_PRESSURE_PLATE);
        AndesitePool.button(ModBlocks.ANDESITE_BUTTON);
        PolishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);
        PolishedAndesitePool.pressurePlate(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        PolishedAndesitePool.button(ModBlocks.POLISHED_ANDESITE_BUTTON);


        // Deepslate Blocks
        BlockStateModelGenerator.BlockTexturePool DeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool CobbledDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool PolishedDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool DeepslateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool CrackedDeepslateBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool DeepslateTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DEEPSLATE_TILES);
        BlockStateModelGenerator.BlockTexturePool CrackedDeepslateTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_DEEPSLATE_TILES);

        DeepslatePool.stairs(ModBlocks.DEEPSLATE_STAIRS);
        DeepslatePool.slab(ModBlocks.DEEPSLATE_SLAB);
        DeepslatePool.wall(ModBlocks.DEEPSLATE_WALL);
        DeepslatePool.pressurePlate(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
        DeepslatePool.button(ModBlocks.DEEPSLATE_BUTTON);
        CobbledDeepslatePool.pressurePlate(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        CobbledDeepslatePool.button(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
        PolishedDeepslatePool.pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        PolishedDeepslatePool.button(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        DeepslateBrickPool.pressurePlate(ModBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE);
        DeepslateBrickPool.button(ModBlocks.DEEPSLATE_BRICK_BUTTON);
        CrackedDeepslateBrickPool.stairs(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        CrackedDeepslateBrickPool.slab(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
        CrackedDeepslateBrickPool.wall(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
        CrackedDeepslateBrickPool.pressurePlate(ModBlocks.CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE);
        CrackedDeepslateBrickPool.button(ModBlocks.CRACKED_DEEPSLATE_BRICK_BUTTON);
        DeepslateTilePool.pressurePlate(ModBlocks.DEEPSLATE_TILE_PRESSURE_PLATE);
        DeepslateTilePool.button(ModBlocks.DEEPSLATE_TILE_BUTTON);
        CrackedDeepslateTilePool.stairs(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        CrackedDeepslateTilePool.slab(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
        CrackedDeepslateTilePool.wall(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL);
        CrackedDeepslateTilePool.pressurePlate(ModBlocks.CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE);
        CrackedDeepslateTilePool.button(ModBlocks.CRACKED_DEEPSLATE_TILE_BUTTON);


        // Tuff Blocks
        BlockStateModelGenerator.BlockTexturePool TuffPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TUFF);
        BlockStateModelGenerator.BlockTexturePool PolishedTuffPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_TUFF);
        BlockStateModelGenerator.BlockTexturePool TuffBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TUFF_BRICKS);

        TuffPool.pressurePlate(ModBlocks.TUFF_PRESSURE_PLATE);
        TuffPool.button(ModBlocks.TUFF_BUTTON);
        PolishedTuffPool.pressurePlate(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE);
        PolishedTuffPool.button(ModBlocks.POLISHED_TUFF_BUTTON);
        TuffBrickPool.pressurePlate(ModBlocks.TUFF_BRICK_PRESSURE_PLATE);
        TuffBrickPool.button(ModBlocks.TUFF_BRICK_BUTTON);


        // Brick Blocks
        BlockStateModelGenerator.BlockTexturePool BrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BRICKS);
        BrickPool.pressurePlate(ModBlocks.BRICK_PRESSURE_PLATE);
        BrickPool.button(ModBlocks.BRICK_BUTTON);


        // Mud Blocks
        BlockStateModelGenerator.BlockTexturePool PackedMudPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_MUD);
        BlockStateModelGenerator.BlockTexturePool MudBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MUD_BRICKS);

        PackedMudPool.stairs(ModBlocks.PACKED_MUD_STAIRS);
        PackedMudPool.slab(ModBlocks.PACKED_MUD_SLAB);
        PackedMudPool.wall(ModBlocks.PACKED_MUD_WALL);
        PackedMudPool.pressurePlate(ModBlocks.PACKED_MUD_PRESSURE_PLATE);
        PackedMudPool.button(ModBlocks.PACKED_MUD_BUTTON);
        MudBrickPool.pressurePlate(ModBlocks.MUD_BRICK_PRESSURE_PLATE);
        MudBrickPool.button(ModBlocks.MUD_BRICK_BUTTON);


        // Sandstone Blocks -- [ Here be Broken Blocks ]


        // Prismarine Blocks
        BlockStateModelGenerator.BlockTexturePool PrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool PrismarineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool DarkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);

        PrismarinePool.pressurePlate(ModBlocks.PRISMARINE_PRESSURE_PLATE);
        PrismarinePool.button(ModBlocks.PRISMARINE_BUTTON);
        PrismarineBrickPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);
        PrismarineBrickPool.pressurePlate(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE);
        PrismarineBrickPool.button(ModBlocks.PRISMARINE_BRICK_BUTTON);
        DarkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        DarkPrismarinePool.pressurePlate(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE);
        DarkPrismarinePool.button(ModBlocks.DARK_PRISMARINE_BUTTON);


        // Netherrack Blocks
        BlockStateModelGenerator.BlockTexturePool NetherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        BlockStateModelGenerator.BlockTexturePool NetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool CrackedNetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool RedNetherBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);

        NetherrackPool.stairs(ModBlocks.NETHERRACK_STAIRS);
        NetherrackPool.slab(ModBlocks.NETHERRACK_SLAB);
        NetherrackPool.wall(ModBlocks.NETHERRACK_WALL);
        NetherrackPool.pressurePlate(ModBlocks.NETHERRACK_PRESSURE_PLATE);
        NetherrackPool.button(ModBlocks.NETHERRACK_BUTTON);
        NetherBrickPool.pressurePlate(ModBlocks.NETHER_BRICK_PRESSURE_PLATE);
        NetherBrickPool.button(ModBlocks.NETHER_BRICK_BUTTON);
        CrackedNetherBrickPool.stairs(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        CrackedNetherBrickPool.slab(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
        CrackedNetherBrickPool.wall(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        CrackedNetherBrickPool.pressurePlate(ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE);
        CrackedNetherBrickPool.button(ModBlocks.CRACKED_NETHER_BRICK_BUTTON);
        RedNetherBrickPool.pressurePlate(ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE);
        RedNetherBrickPool.button(ModBlocks.RED_NETHER_BRICK_BUTTON);


        // Basalt Blocks -- [ Here be Broken Blocks ]


        // Blackstone Blocks
        BlockStateModelGenerator.BlockTexturePool BlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool GildedBlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        BlockStateModelGenerator.BlockTexturePool PolishedBlackstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_BLACKSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool CrackedPolishedBlackstoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        BlackstonePool.pressurePlate(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
        BlackstonePool.button(ModBlocks.BLACKSTONE_BUTTON);
        GildedBlackstonePool.stairs(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        GildedBlackstonePool.slab(ModBlocks.GILDED_BLACKSTONE_SLAB);
        GildedBlackstonePool.wall(ModBlocks.GILDED_BLACKSTONE_WALL);
        GildedBlackstonePool.pressurePlate(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE);
        GildedBlackstonePool.button(ModBlocks.GILDED_BLACKSTONE_BUTTON);
        PolishedBlackstoneBrickPool.pressurePlate(ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        PolishedBlackstoneBrickPool.button(ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON);
        CrackedPolishedBlackstoneBrickPool.stairs(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        CrackedPolishedBlackstoneBrickPool.slab(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
        CrackedPolishedBlackstoneBrickPool.wall(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        CrackedPolishedBlackstoneBrickPool.pressurePlate(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        CrackedPolishedBlackstoneBrickPool.button(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON);


        // Endstone Blocks
        BlockStateModelGenerator.BlockTexturePool EndStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        BlockStateModelGenerator.BlockTexturePool EndStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE_BRICKS);

        EndStonePool.stairs(ModBlocks.END_STONE_STAIRS);
        EndStonePool.slab(ModBlocks.END_STONE_SLAB);
        EndStonePool.wall(ModBlocks.END_STONE_WALL);
        EndStonePool.pressurePlate(ModBlocks.END_STONE_PRESSURE_PLATE);
        EndStonePool.button(ModBlocks.END_STONE_BUTTON);
        EndStoneBrickPool.pressurePlate(ModBlocks.END_STONE_BRICK_PRESSURE_PLATE);
        EndStoneBrickPool.button(ModBlocks.END_STONE_BRICK_BUTTON);


        // Purpur Blocks
        BlockStateModelGenerator.BlockTexturePool PurpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        PurpurPool.wall(ModBlocks.PURPUR_WALL);
        PurpurPool.pressurePlate(ModBlocks.PURPUR_PRESSURE_PLATE);
        PurpurPool.button(ModBlocks.PURPUR_BUTTON);


        // Iron Blocks
        BlockStateModelGenerator.BlockTexturePool IronPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.IRON_BLOCK);
        IronPool.stairs(ModBlocks.IRON_STAIRS);
        IronPool.slab(ModBlocks.IRON_SLAB);
        IronPool.wall(ModBlocks.IRON_WALL);
        IronPool.button(ModBlocks.IRON_BUTTON);


        // Gold Blocks
        BlockStateModelGenerator.BlockTexturePool GoldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GOLD_BLOCK);
        GoldPool.stairs(ModBlocks.GOLD_STAIRS);
        GoldPool.slab(ModBlocks.GOLD_SLAB);
        GoldPool.wall(ModBlocks.GOLD_WALL);
        GoldPool.button(ModBlocks.GOLD_BUTTON);


        // Emerald Blocks
        BlockStateModelGenerator.BlockTexturePool EmeraldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.EMERALD_BLOCK);
        EmeraldPool.stairs(ModBlocks.EMERALD_STAIRS);
        EmeraldPool.slab(ModBlocks.EMERALD_SLAB);
        EmeraldPool.wall(ModBlocks.EMERALD_WALL);
        EmeraldPool.pressurePlate(ModBlocks.EMERALD_PRESSURE_PLATE);
        EmeraldPool.button(ModBlocks.EMERALD_BUTTON);


        // Lapis Lazuli Blocks
        BlockStateModelGenerator.BlockTexturePool LapisPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LAPIS_BLOCK);
        LapisPool.stairs(ModBlocks.LAPIS_STAIRS);
        LapisPool.slab(ModBlocks.LAPIS_SLAB);
        LapisPool.wall(ModBlocks.LAPIS_WALL);
        LapisPool.pressurePlate(ModBlocks.LAPIS_PRESSURE_PLATE);
        LapisPool.button(ModBlocks.LAPIS_BUTTON);


        // Diamond Blocks
        BlockStateModelGenerator.BlockTexturePool DiamondPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DIAMOND_BLOCK);
        DiamondPool.stairs(ModBlocks.DIAMOND_STAIRS);
        DiamondPool.slab(ModBlocks.DIAMOND_SLAB);
        DiamondPool.wall(ModBlocks.DIAMOND_WALL);
        DiamondPool.pressurePlate(ModBlocks.DIAMOND_PRESSURE_PLATE);
        DiamondPool.button(ModBlocks.DIAMOND_BUTTON);


        // Netherite Blocks
        BlockStateModelGenerator.BlockTexturePool NetheritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);
        NetheritePool.stairs(ModBlocks.NETHERITE_STAIRS);
        NetheritePool.slab(ModBlocks.NETHERITE_SLAB);
        NetheritePool.wall(ModBlocks.NETHERITE_WALL);
        NetheritePool.pressurePlate(ModBlocks.NETHERITE_PRESSURE_PLATE);
        NetheritePool.button(ModBlocks.NETHERITE_BUTTON);


        // Quartz Blocks -- [ Here be Broken Blocks ]


        // Amethyst Blocks
        BlockStateModelGenerator.BlockTexturePool AmethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        AmethystPool.stairs(ModBlocks.AMETHYST_STAIRS);
        AmethystPool.slab(ModBlocks.AMETHYST_SLAB);
        AmethystPool.wall(ModBlocks.AMETHYST_WALL);
        AmethystPool.pressurePlate(ModBlocks.AMETHYST_PRESSURE_PLATE);
        AmethystPool.button(ModBlocks.AMETHYST_BUTTON);

        // ++ Colored Blocks Category ++


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

        BlockStateModelGenerator.BlockTexturePool WhiteConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool LightGrayConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool GrayConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool BlackConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool BrownConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool RedConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool OrangeConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool YellowConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool LimeConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool GreenConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool CyanConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool LightBlueConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool BlueConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool PurpleConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool MagentaConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_CONCRETE_TILES);
        BlockStateModelGenerator.BlockTexturePool PinkConcreteTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_CONCRETE_TILES);

        WhiteConcretePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        WhiteConcretePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);
        WhiteConcretePool.wall(ModBlocks.WHITE_CONCRETE_WALL);
        WhiteConcretePool.pressurePlate(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
        WhiteConcretePool.button(ModBlocks.WHITE_CONCRETE_BUTTON);

        LightGrayConcretePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        LightGrayConcretePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        LightGrayConcretePool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        LightGrayConcretePool.pressurePlate(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        LightGrayConcretePool.button(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);

        GrayConcretePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        GrayConcretePool.slab(ModBlocks.GRAY_CONCRETE_SLAB);
        GrayConcretePool.wall(ModBlocks.GRAY_CONCRETE_WALL);
        GrayConcretePool.pressurePlate(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        GrayConcretePool.button(ModBlocks.GRAY_CONCRETE_BUTTON);

        BlackConcretePool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        BlackConcretePool.slab(ModBlocks.BLACK_CONCRETE_SLAB);
        BlackConcretePool.wall(ModBlocks.BLACK_CONCRETE_WALL);
        BlackConcretePool.pressurePlate(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        BlackConcretePool.button(ModBlocks.BLACK_CONCRETE_BUTTON);

        BrownConcretePool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        BrownConcretePool.slab(ModBlocks.BROWN_CONCRETE_SLAB);
        BrownConcretePool.wall(ModBlocks.BROWN_CONCRETE_WALL);
        BrownConcretePool.pressurePlate(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        BrownConcretePool.button(ModBlocks.BROWN_CONCRETE_BUTTON);

        RedConcretePool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        RedConcretePool.slab(ModBlocks.RED_CONCRETE_SLAB);
        RedConcretePool.wall(ModBlocks.RED_CONCRETE_WALL);
        RedConcretePool.pressurePlate(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
        RedConcretePool.button(ModBlocks.RED_CONCRETE_BUTTON);

        OrangeConcretePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        OrangeConcretePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);
        OrangeConcretePool.wall(ModBlocks.ORANGE_CONCRETE_WALL);
        OrangeConcretePool.pressurePlate(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        OrangeConcretePool.button(ModBlocks.ORANGE_CONCRETE_BUTTON);

        YellowConcretePool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        YellowConcretePool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);
        YellowConcretePool.wall(ModBlocks.YELLOW_CONCRETE_WALL);
        YellowConcretePool.pressurePlate(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        YellowConcretePool.button(ModBlocks.YELLOW_CONCRETE_BUTTON);

        LimeConcretePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        LimeConcretePool.slab(ModBlocks.LIME_CONCRETE_SLAB);
        LimeConcretePool.wall(ModBlocks.LIME_CONCRETE_WALL);
        LimeConcretePool.pressurePlate(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        LimeConcretePool.button(ModBlocks.LIME_CONCRETE_BUTTON);

        GreenConcretePool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        GreenConcretePool.slab(ModBlocks.GREEN_CONCRETE_SLAB);
        GreenConcretePool.wall(ModBlocks.GREEN_CONCRETE_WALL);
        GreenConcretePool.pressurePlate(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        GreenConcretePool.button(ModBlocks.GREEN_CONCRETE_BUTTON);

        CyanConcretePool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        CyanConcretePool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
        CyanConcretePool.wall(ModBlocks.CYAN_CONCRETE_WALL);
        CyanConcretePool.pressurePlate(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        CyanConcretePool.button(ModBlocks.CYAN_CONCRETE_BUTTON);

        LightBlueConcretePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        LightBlueConcretePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        LightBlueConcretePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        LightBlueConcretePool.pressurePlate(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        LightBlueConcretePool.button(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);

        BlueConcretePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        BlueConcretePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);
        BlueConcretePool.wall(ModBlocks.BLUE_CONCRETE_WALL);
        BlueConcretePool.pressurePlate(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        BlueConcretePool.button(ModBlocks.BLUE_CONCRETE_BUTTON);

        PurpleConcretePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        PurpleConcretePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);
        PurpleConcretePool.wall(ModBlocks.PURPLE_CONCRETE_WALL);
        PurpleConcretePool.pressurePlate(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        PurpleConcretePool.button(ModBlocks.PURPLE_CONCRETE_BUTTON);

        MagentaConcretePool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        MagentaConcretePool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);
        MagentaConcretePool.wall(ModBlocks.MAGENTA_CONCRETE_WALL);
        MagentaConcretePool.pressurePlate(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        MagentaConcretePool.button(ModBlocks.MAGENTA_CONCRETE_BUTTON);

        PinkConcretePool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        PinkConcretePool.slab(ModBlocks.PINK_CONCRETE_SLAB);
        PinkConcretePool.wall(ModBlocks.PINK_CONCRETE_WALL);
        PinkConcretePool.pressurePlate(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        PinkConcretePool.button(ModBlocks.PINK_CONCRETE_BUTTON);

        WhiteConcreteTilePool.stairs(ModBlocks.WHITE_CONCRETE_TILE_STAIRS);
        WhiteConcreteTilePool.slab(ModBlocks.WHITE_CONCRETE_TILE_SLAB);
        WhiteConcreteTilePool.wall(ModBlocks.WHITE_CONCRETE_TILE_WALL);
        WhiteConcreteTilePool.pressurePlate(ModBlocks.WHITE_CONCRETE_TILE_PRESSURE_PLATE);
        WhiteConcreteTilePool.button(ModBlocks.WHITE_CONCRETE_TILE_BUTTON);

        LightGrayConcreteTilePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS);
        LightGrayConcreteTilePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB);
        LightGrayConcreteTilePool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL);
        LightGrayConcreteTilePool.pressurePlate(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_PRESSURE_PLATE);
        LightGrayConcreteTilePool.button(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_BUTTON);

        GrayConcreteTilePool.stairs(ModBlocks.GRAY_CONCRETE_TILE_STAIRS);
        GrayConcreteTilePool.slab(ModBlocks.GRAY_CONCRETE_TILE_SLAB);
        GrayConcreteTilePool.wall(ModBlocks.GRAY_CONCRETE_TILE_WALL);
        GrayConcreteTilePool.pressurePlate(ModBlocks.GRAY_CONCRETE_TILE_PRESSURE_PLATE);
        GrayConcreteTilePool.button(ModBlocks.GRAY_CONCRETE_TILE_BUTTON);

        BlackConcreteTilePool.stairs(ModBlocks.BLACK_CONCRETE_TILE_STAIRS);
        BlackConcreteTilePool.slab(ModBlocks.BLACK_CONCRETE_TILE_SLAB);
        BlackConcreteTilePool.wall(ModBlocks.BLACK_CONCRETE_TILE_WALL);
        BlackConcreteTilePool.pressurePlate(ModBlocks.BLACK_CONCRETE_TILE_PRESSURE_PLATE);
        BlackConcreteTilePool.button(ModBlocks.BLACK_CONCRETE_TILE_BUTTON);

        BrownConcreteTilePool.stairs(ModBlocks.BROWN_CONCRETE_TILE_STAIRS);
        BrownConcreteTilePool.slab(ModBlocks.BROWN_CONCRETE_TILE_SLAB);
        BrownConcreteTilePool.wall(ModBlocks.BROWN_CONCRETE_TILE_WALL);
        BrownConcreteTilePool.pressurePlate(ModBlocks.BROWN_CONCRETE_TILE_PRESSURE_PLATE);
        BrownConcreteTilePool.button(ModBlocks.BROWN_CONCRETE_TILE_BUTTON);

        RedConcreteTilePool.stairs(ModBlocks.RED_CONCRETE_TILE_STAIRS);
        RedConcreteTilePool.slab(ModBlocks.RED_CONCRETE_TILE_SLAB);
        RedConcreteTilePool.wall(ModBlocks.RED_CONCRETE_TILE_WALL);
        RedConcreteTilePool.pressurePlate(ModBlocks.RED_CONCRETE_TILE_PRESSURE_PLATE);
        RedConcreteTilePool.button(ModBlocks.RED_CONCRETE_TILE_BUTTON);

        OrangeConcreteTilePool.stairs(ModBlocks.ORANGE_CONCRETE_TILE_STAIRS);
        OrangeConcreteTilePool.slab(ModBlocks.ORANGE_CONCRETE_TILE_SLAB);
        OrangeConcreteTilePool.wall(ModBlocks.ORANGE_CONCRETE_TILE_WALL);
        OrangeConcreteTilePool.pressurePlate(ModBlocks.ORANGE_CONCRETE_TILE_PRESSURE_PLATE);
        OrangeConcreteTilePool.button(ModBlocks.ORANGE_CONCRETE_TILE_BUTTON);

        YellowConcreteTilePool.stairs(ModBlocks.YELLOW_CONCRETE_TILE_STAIRS);
        YellowConcreteTilePool.slab(ModBlocks.YELLOW_CONCRETE_TILE_SLAB);
        YellowConcreteTilePool.wall(ModBlocks.YELLOW_CONCRETE_TILE_WALL);
        YellowConcreteTilePool.pressurePlate(ModBlocks.YELLOW_CONCRETE_TILE_PRESSURE_PLATE);
        YellowConcreteTilePool.button(ModBlocks.YELLOW_CONCRETE_TILE_BUTTON);

        LimeConcreteTilePool.stairs(ModBlocks.LIME_CONCRETE_TILE_STAIRS);
        LimeConcreteTilePool.slab(ModBlocks.LIME_CONCRETE_TILE_SLAB);
        LimeConcreteTilePool.wall(ModBlocks.LIME_CONCRETE_TILE_WALL);
        LimeConcreteTilePool.pressurePlate(ModBlocks.LIME_CONCRETE_TILE_PRESSURE_PLATE);
        LimeConcreteTilePool.button(ModBlocks.LIME_CONCRETE_TILE_BUTTON);

        GreenConcreteTilePool.stairs(ModBlocks.GREEN_CONCRETE_TILE_STAIRS);
        GreenConcreteTilePool.slab(ModBlocks.GREEN_CONCRETE_TILE_SLAB);
        GreenConcreteTilePool.wall(ModBlocks.GREEN_CONCRETE_TILE_WALL);
        GreenConcreteTilePool.pressurePlate(ModBlocks.GREEN_CONCRETE_TILE_PRESSURE_PLATE);
        GreenConcreteTilePool.button(ModBlocks.GREEN_CONCRETE_TILE_BUTTON);

        CyanConcreteTilePool.stairs(ModBlocks.CYAN_CONCRETE_TILE_STAIRS);
        CyanConcreteTilePool.slab(ModBlocks.CYAN_CONCRETE_TILE_SLAB);
        CyanConcreteTilePool.wall(ModBlocks.CYAN_CONCRETE_TILE_WALL);
        CyanConcreteTilePool.pressurePlate(ModBlocks.CYAN_CONCRETE_TILE_PRESSURE_PLATE);
        CyanConcreteTilePool.button(ModBlocks.CYAN_CONCRETE_TILE_BUTTON);

        LightBlueConcreteTilePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS);
        LightBlueConcreteTilePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB);
        LightBlueConcreteTilePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL);
        LightBlueConcreteTilePool.pressurePlate(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_PRESSURE_PLATE);
        LightBlueConcreteTilePool.button(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_BUTTON);

        BlueConcreteTilePool.stairs(ModBlocks.BLUE_CONCRETE_TILE_STAIRS);
        BlueConcreteTilePool.slab(ModBlocks.BLUE_CONCRETE_TILE_SLAB);
        BlueConcreteTilePool.wall(ModBlocks.BLUE_CONCRETE_TILE_WALL);
        BlueConcreteTilePool.pressurePlate(ModBlocks.BLUE_CONCRETE_TILE_PRESSURE_PLATE);
        BlueConcreteTilePool.button(ModBlocks.BLUE_CONCRETE_TILE_BUTTON);

        PurpleConcreteTilePool.stairs(ModBlocks.PURPLE_CONCRETE_TILE_STAIRS);
        PurpleConcreteTilePool.slab(ModBlocks.PURPLE_CONCRETE_TILE_SLAB);
        PurpleConcreteTilePool.wall(ModBlocks.PURPLE_CONCRETE_TILE_WALL);
        PurpleConcreteTilePool.pressurePlate(ModBlocks.PURPLE_CONCRETE_TILE_PRESSURE_PLATE);
        PurpleConcreteTilePool.button(ModBlocks.PURPLE_CONCRETE_TILE_BUTTON);

        MagentaConcreteTilePool.stairs(ModBlocks.MAGENTA_CONCRETE_TILE_STAIRS);
        MagentaConcreteTilePool.slab(ModBlocks.MAGENTA_CONCRETE_TILE_SLAB);
        MagentaConcreteTilePool.wall(ModBlocks.MAGENTA_CONCRETE_TILE_WALL);
        MagentaConcreteTilePool.pressurePlate(ModBlocks.MAGENTA_CONCRETE_TILE_PRESSURE_PLATE);
        MagentaConcreteTilePool.button(ModBlocks.MAGENTA_CONCRETE_TILE_BUTTON);

        PinkConcreteTilePool.stairs(ModBlocks.PINK_CONCRETE_TILE_STAIRS);
        PinkConcreteTilePool.slab(ModBlocks.PINK_CONCRETE_TILE_SLAB);
        PinkConcreteTilePool.wall(ModBlocks.PINK_CONCRETE_TILE_WALL);
        PinkConcreteTilePool.pressurePlate(ModBlocks.PINK_CONCRETE_TILE_PRESSURE_PLATE);
        PinkConcreteTilePool.button(ModBlocks.PINK_CONCRETE_TILE_BUTTON);


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
        TerracottaPool.wall(ModBlocks.TERRACOTTA_WALL);
        TerracottaPool.pressurePlate(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
        TerracottaPool.button(ModBlocks.TERRACOTTA_BUTTON);

        WhiteTerracottaPool.stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        WhiteTerracottaPool.slab(ModBlocks.WHITE_TERRACOTTA_SLAB);
        WhiteTerracottaPool.wall(ModBlocks.WHITE_TERRACOTTA_WALL);
        WhiteTerracottaPool.pressurePlate(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
        WhiteTerracottaPool.button(ModBlocks.WHITE_TERRACOTTA_BUTTON);

        LightGrayTerracottaPool.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        LightGrayTerracottaPool.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        LightGrayTerracottaPool.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        LightGrayTerracottaPool.pressurePlate(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
        LightGrayTerracottaPool.button(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);

        GrayTerracottaPool.stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        GrayTerracottaPool.slab(ModBlocks.GRAY_TERRACOTTA_SLAB);
        GrayTerracottaPool.wall(ModBlocks.GRAY_TERRACOTTA_WALL);
        GrayTerracottaPool.pressurePlate(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
        GrayTerracottaPool.button(ModBlocks.GRAY_TERRACOTTA_BUTTON);

        BlackTerracottaPool.stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        BlackTerracottaPool.slab(ModBlocks.BLACK_TERRACOTTA_SLAB);
        BlackTerracottaPool.wall(ModBlocks.BLACK_TERRACOTTA_WALL);
        BlackTerracottaPool.pressurePlate(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
        BlackTerracottaPool.button(ModBlocks.BLACK_TERRACOTTA_BUTTON);

        BrownTerracottaPool.stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        BrownTerracottaPool.slab(ModBlocks.BROWN_TERRACOTTA_SLAB);
        BrownTerracottaPool.wall(ModBlocks.BROWN_TERRACOTTA_WALL);
        BrownTerracottaPool.pressurePlate(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
        BrownTerracottaPool.button(ModBlocks.BROWN_TERRACOTTA_BUTTON);

        RedTerracottaPool.stairs(ModBlocks.RED_TERRACOTTA_STAIRS);
        RedTerracottaPool.slab(ModBlocks.RED_TERRACOTTA_SLAB);
        RedTerracottaPool.wall(ModBlocks.RED_TERRACOTTA_WALL);
        RedTerracottaPool.pressurePlate(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
        RedTerracottaPool.button(ModBlocks.RED_TERRACOTTA_BUTTON);

        OrangeTerracottaPool.stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        OrangeTerracottaPool.slab(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        OrangeTerracottaPool.wall(ModBlocks.ORANGE_TERRACOTTA_WALL);
        OrangeTerracottaPool.pressurePlate(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
        OrangeTerracottaPool.button(ModBlocks.ORANGE_TERRACOTTA_BUTTON);

        YellowTerracottaPool.stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        YellowTerracottaPool.slab(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        YellowTerracottaPool.wall(ModBlocks.YELLOW_TERRACOTTA_WALL);
        YellowTerracottaPool.pressurePlate(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
        YellowTerracottaPool.button(ModBlocks.YELLOW_TERRACOTTA_BUTTON);

        LimeTerracottaPool.stairs(ModBlocks.LIME_TERRACOTTA_STAIRS);
        LimeTerracottaPool.slab(ModBlocks.LIME_TERRACOTTA_SLAB);
        LimeTerracottaPool.wall(ModBlocks.LIME_TERRACOTTA_WALL);
        LimeTerracottaPool.pressurePlate(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
        LimeTerracottaPool.button(ModBlocks.LIME_TERRACOTTA_BUTTON);

        GreenTerracottaPool.stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        GreenTerracottaPool.slab(ModBlocks.GREEN_TERRACOTTA_SLAB);
        GreenTerracottaPool.wall(ModBlocks.GREEN_TERRACOTTA_WALL);
        GreenTerracottaPool.pressurePlate(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
        GreenTerracottaPool.button(ModBlocks.GREEN_TERRACOTTA_BUTTON);

        CyanTerracottaPool.stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        CyanTerracottaPool.slab(ModBlocks.CYAN_TERRACOTTA_SLAB);
        CyanTerracottaPool.wall(ModBlocks.CYAN_TERRACOTTA_WALL);
        CyanTerracottaPool.pressurePlate(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
        CyanTerracottaPool.button(ModBlocks.CYAN_TERRACOTTA_BUTTON);

        LightBlueTerracottaPool.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        LightBlueTerracottaPool.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        LightBlueTerracottaPool.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        LightBlueTerracottaPool.pressurePlate(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
        LightBlueTerracottaPool.button(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);

        BlueTerracottaPool.stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        BlueTerracottaPool.slab(ModBlocks.BLUE_TERRACOTTA_SLAB);
        BlueTerracottaPool.wall(ModBlocks.BLUE_TERRACOTTA_WALL);
        BlueTerracottaPool.pressurePlate(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
        BlueTerracottaPool.button(ModBlocks.BLUE_TERRACOTTA_BUTTON);

        PurpleTerracottaPool.stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        PurpleTerracottaPool.slab(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        PurpleTerracottaPool.wall(ModBlocks.PURPLE_TERRACOTTA_WALL);
        PurpleTerracottaPool.pressurePlate(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
        PurpleTerracottaPool.button(ModBlocks.PURPLE_TERRACOTTA_BUTTON);

        MagentaTerracottaPool.stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        MagentaTerracottaPool.slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        MagentaTerracottaPool.wall(ModBlocks.MAGENTA_TERRACOTTA_WALL);
        MagentaTerracottaPool.pressurePlate(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
        MagentaTerracottaPool.button(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);

        PinkTerracottaPool.stairs(ModBlocks.PINK_TERRACOTTA_STAIRS);
        PinkTerracottaPool.slab(ModBlocks.PINK_TERRACOTTA_SLAB);
        PinkTerracottaPool.wall(ModBlocks.PINK_TERRACOTTA_WALL);
        PinkTerracottaPool.pressurePlate(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
        PinkTerracottaPool.button(ModBlocks.PINK_TERRACOTTA_BUTTON);


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
        WhiteWoolPool.wall(ModBlocks.WHITE_WOOL_WALL);
        WhiteWoolPool.pressurePlate(ModBlocks.WHITE_WOOL_PRESSURE_PLATE);
        WhiteWoolPool.button(ModBlocks.WHITE_WOOL_BUTTON);

        LightGrayWoolPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        LightGrayWoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        LightGrayWoolPool.wall(ModBlocks.LIGHT_GRAY_WOOL_WALL);
        LightGrayWoolPool.pressurePlate(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE);
        LightGrayWoolPool.button(ModBlocks.LIGHT_GRAY_WOOL_BUTTON);

        GrayWoolPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);
        GrayWoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        GrayWoolPool.wall(ModBlocks.GRAY_WOOL_WALL);
        GrayWoolPool.pressurePlate(ModBlocks.GRAY_WOOL_PRESSURE_PLATE);
        GrayWoolPool.button(ModBlocks.GRAY_WOOL_BUTTON);

        BlackWoolPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);
        BlackWoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        BlackWoolPool.wall(ModBlocks.BLACK_WOOL_WALL);
        BlackWoolPool.pressurePlate(ModBlocks.BLACK_WOOL_PRESSURE_PLATE);
        BlackWoolPool.button(ModBlocks.BLACK_WOOL_BUTTON);

        BrownWoolPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);
        BrownWoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        BrownWoolPool.wall(ModBlocks.BROWN_WOOL_WALL);
        BrownWoolPool.pressurePlate(ModBlocks.BROWN_WOOL_PRESSURE_PLATE);
        BrownWoolPool.button(ModBlocks.BROWN_WOOL_BUTTON);

        RedWoolPool.stairs(ModBlocks.RED_WOOL_STAIRS);
        RedWoolPool.slab(ModBlocks.RED_WOOL_SLAB);
        RedWoolPool.wall(ModBlocks.RED_WOOL_WALL);
        RedWoolPool.pressurePlate(ModBlocks.RED_WOOL_PRESSURE_PLATE);
        RedWoolPool.button(ModBlocks.RED_WOOL_BUTTON);

        OrangeWoolPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);
        OrangeWoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        OrangeWoolPool.wall(ModBlocks.ORANGE_WOOL_WALL);
        OrangeWoolPool.pressurePlate(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE);
        OrangeWoolPool.button(ModBlocks.ORANGE_WOOL_BUTTON);

        YellowWoolPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);
        YellowWoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        YellowWoolPool.wall(ModBlocks.YELLOW_WOOL_WALL);
        YellowWoolPool.pressurePlate(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE);
        YellowWoolPool.button(ModBlocks.YELLOW_WOOL_BUTTON);

        LimeWoolPool.stairs(ModBlocks.LIME_WOOL_STAIRS);
        LimeWoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
        LimeWoolPool.wall(ModBlocks.LIME_WOOL_WALL);
        LimeWoolPool.pressurePlate(ModBlocks.LIME_WOOL_PRESSURE_PLATE);
        LimeWoolPool.button(ModBlocks.LIME_WOOL_BUTTON);

        GreenWoolPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);
        GreenWoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        GreenWoolPool.wall(ModBlocks.GREEN_WOOL_WALL);
        GreenWoolPool.pressurePlate(ModBlocks.GREEN_WOOL_PRESSURE_PLATE);
        GreenWoolPool.button(ModBlocks.GREEN_WOOL_BUTTON);

        CyanWoolPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);
        CyanWoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        CyanWoolPool.wall(ModBlocks.CYAN_WOOL_WALL);
        CyanWoolPool.pressurePlate(ModBlocks.CYAN_WOOL_PRESSURE_PLATE);
        CyanWoolPool.button(ModBlocks.CYAN_WOOL_BUTTON);

        LightBlueWoolPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        LightBlueWoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        LightBlueWoolPool.wall(ModBlocks.LIGHT_BLUE_WOOL_WALL);
        LightBlueWoolPool.pressurePlate(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE);
        LightBlueWoolPool.button(ModBlocks.LIGHT_BLUE_WOOL_BUTTON);

        BlueWoolPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);
        BlueWoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        BlueWoolPool.wall(ModBlocks.BLUE_WOOL_WALL);
        BlueWoolPool.pressurePlate(ModBlocks.BLUE_WOOL_PRESSURE_PLATE);
        BlueWoolPool.button(ModBlocks.BLUE_WOOL_BUTTON);

        PurpleWoolPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);
        PurpleWoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        PurpleWoolPool.wall(ModBlocks.PURPLE_WOOL_WALL);
        PurpleWoolPool.pressurePlate(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE);
        PurpleWoolPool.button(ModBlocks.PURPLE_WOOL_BUTTON);

        MagentaWoolPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);
        MagentaWoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        MagentaWoolPool.wall(ModBlocks.MAGENTA_WOOL_WALL);
        MagentaWoolPool.pressurePlate(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE);
        MagentaWoolPool.button(ModBlocks.MAGENTA_WOOL_BUTTON);

        PinkWoolPool.stairs(ModBlocks.PINK_WOOL_STAIRS);
        PinkWoolPool.slab(ModBlocks.PINK_WOOL_SLAB);
        PinkWoolPool.wall(ModBlocks.PINK_WOOL_WALL);
        PinkWoolPool.pressurePlate(ModBlocks.PINK_WOOL_PRESSURE_PLATE);
        PinkWoolPool.button(ModBlocks.PINK_WOOL_BUTTON);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
