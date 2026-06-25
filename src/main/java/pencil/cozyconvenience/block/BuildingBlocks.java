package pencil.cozyconvenience.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;

public class BuildingBlocks {
    // Wood
    public static final Block OAK_WALL = registerWallCopy("oak", Blocks.OAK_PLANKS);
    public static final Block SPRUCE_WALL = registerWallCopy("spruce", Blocks.SPRUCE_PLANKS);
    public static final Block BIRCH_WALL = registerWallCopy("birch", Blocks.BIRCH_PLANKS);
    public static final Block JUNGLE_WALL = registerWallCopy("jungle", Blocks.JUNGLE_PLANKS);
    public static final Block ACACIA_WALL = registerWallCopy("acacia", Blocks.ACACIA_PLANKS);
    public static final Block DARK_OAK_WALL = registerWallCopy("dark_oak", Blocks.DARK_OAK_PLANKS);
    public static final Block MANGROVE_WALL = registerWallCopy("mangrove", Blocks.MANGROVE_PLANKS);
    public static final Block CHERRY_WALL = registerWallCopy("cherry", Blocks.CHERRY_PLANKS);
    public static final Block BAMBOO_WALL = registerWallCopy("bamboo", Blocks.BAMBOO_PLANKS);
    public static final Block BAMBOO_MOSAIC_WALL = registerWallCopy("bamboo_mosaic", Blocks.BAMBOO_MOSAIC);
    public static final Block CRIMSON_WALL = registerWallCopy("crimson", Blocks.CRIMSON_PLANKS);
    public static final Block WARPED_WALL = registerWallCopy("warped", Blocks.WARPED_PLANKS);

    // Stone
    public static final Block STONE_WALL = registerWallCopy("stone", Blocks.STONE);
    public static final Block STONE_COLUMN = registerBlock("stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_COLUMN = registerBlock("cracked_stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_COLUMN = registerBlock("mossy_stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block SMOOTH_STONE_STAIRS = registerStairsCopy("smooth_stone", Blocks.SMOOTH_STONE);
    public static final Block SMOOTH_STONE_WALL = registerWallCopy("smooth_stone", Blocks.SMOOTH_STONE);
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerStairsCopy("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_SLAB = registerSlabCopy("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS);
    public static final Block CRACKED_STONE_BRICK_WALL = registerWallCopy("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS);
    public static final Block POLISHED_GRANITE_WALL = registerWallCopy("polished_granite", Blocks.POLISHED_GRANITE);
    public static final Block POLISHED_DIORITE_WALL = registerWallCopy("polished_diorite", Blocks.POLISHED_DIORITE);
    public static final Block POLISHED_ANDESITE_WALL = registerWallCopy("polished_andesite", Blocks.POLISHED_ANDESITE);

    // Deepslate
    public static final Block DEEPSLATE_STAIRS = registerStairsCopy("deepslate", Blocks.DEEPSLATE);
    public static final Block DEEPSLATE_SLAB = registerSlabCopy("deepslate", Blocks.DEEPSLATE);
    public static final Block DEEPSLATE_WALL = registerWallCopy("deepslate", Blocks.DEEPSLATE);
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerStairsCopy("cracked_deepslate_brick", Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerSlabCopy("cracked_deepslate_brick", Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerWallCopy("cracked_deepslate_brick", Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerStairsCopy("cracked_deepslate_tile", Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerSlabCopy("cracked_deepslate_tile", Blocks.CRACKED_DEEPSLATE_TILES);
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerWallCopy("cracked_deepslate_tile", Blocks.CRACKED_DEEPSLATE_TILES);

    // Mud & Sandstone
    public static final Block PACKED_MUD_STAIRS = registerStairsCopy("packed_mud", Blocks.PACKED_MUD);
    public static final Block PACKED_MUD_SLAB = registerSlabCopy("packed_mud", Blocks.PACKED_MUD);
    public static final Block PACKED_MUD_WALL = registerWallCopy("packed_mud", Blocks.PACKED_MUD);
    public static final Block SMOOTH_SANDSTONE_WALL = registerWallCopy("smooth_sandstone", Blocks.SMOOTH_SANDSTONE);
    public static final Block CUT_SANDSTONE_STAIRS = registerStairsCopy("cut_sandstone", Blocks.CUT_SANDSTONE);
    public static final Block CUT_SANDSTONE_WALL = registerWallCopy("cut_sandstone", Blocks.CUT_SANDSTONE);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerWallCopy("smooth_red_sandstone", Blocks.SMOOTH_RED_SANDSTONE);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairsCopy("cut_red_sandstone", Blocks.CUT_RED_SANDSTONE);
    public static final Block CUT_RED_SANDSTONE_WALL = registerWallCopy("cut_red_sandstone", Blocks.CUT_RED_SANDSTONE);

    // Prismarine
    public static final Block PRISMARINE_BRICK_WALL = registerWallCopy("prismarine_brick", Blocks.PRISMARINE_BRICKS);
    public static final Block DARK_PRISMARINE_WALL = registerWallCopy("dark_prismarine", Blocks.DARK_PRISMARINE);

    // Nether
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerStairsCopy("cracked_nether_brick", Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerSlabCopy("cracked_nether_brick", Blocks.CRACKED_NETHER_BRICKS);
    public static final Block CRACKED_NETHER_BRICK_WALL = registerWallCopy("cracked_nether_brick", Blocks.CRACKED_NETHER_BRICKS);
    public static final Block BASALT_STAIRS = registerStairsCopy("basalt", Blocks.BASALT);
    public static final Block BASALT_SLAB = registerSlabCopy("basalt", Blocks.BASALT);
    public static final Block BASALT_WALL = registerWallCopy("basalt", Blocks.BASALT);
    public static final Block SMOOTH_BASALT_STAIRS = registerStairsCopy("smooth_basalt", Blocks.SMOOTH_BASALT);
    public static final Block SMOOTH_BASALT_SLAB = registerSlabCopy("smooth_basalt", Blocks.SMOOTH_BASALT);
    public static final Block SMOOTH_BASALT_WALL = registerWallCopy("smooth_basalt", Blocks.SMOOTH_BASALT);
    public static final Block POLISHED_BASALT_STAIRS = registerStairsCopy("polished_basalt", Blocks.POLISHED_BASALT);
    public static final Block POLISHED_BASALT_SLAB = registerSlabCopy("polished_basalt", Blocks.POLISHED_BASALT);
    public static final Block POLISHED_BASALT_WALL = registerWallCopy("polished_basalt", Blocks.POLISHED_BASALT);

    public static final Block BASALT_TILES = registerBlockCopy("basalt_tiles", Blocks.POLISHED_BASALT);
    public static final Block BASALT_TILE_STAIRS = registerStairsCopy("basalt_tile", Blocks.POLISHED_BASALT);
    public static final Block BASALT_TILE_SLAB = registerSlabCopy("basalt_tile", Blocks.POLISHED_BASALT);
    public static final Block BASALT_TILE_WALL = registerWallCopy("basalt_tile", Blocks.POLISHED_BASALT);

    public static final Block CHISELED_BASALT_TILES = registerBlockCopy("chiseled_basalt_tiles", Blocks.POLISHED_BASALT);
    public static final Block CHISELED_BASALT_TILE_STAIRS = registerStairsCopy("chiseled_basalt_tile", Blocks.POLISHED_BASALT);
    public static final Block CHISELED_BASALT_TILE_SLAB = registerSlabCopy("chiseled_basalt_tile", Blocks.POLISHED_BASALT);
    public static final Block CHISELED_BASALT_TILE_WALL = registerWallCopy("chiseled_basalt_tile", Blocks.POLISHED_BASALT);

    public static final Block GILDED_BLACKSTONE_STAIRS = registerStairsCopy("gilded_blackstone", Blocks.GILDED_BLACKSTONE);
    public static final Block GILDED_BLACKSTONE_SLAB = registerSlabCopy("gilded_blackstone", Blocks.GILDED_BLACKSTONE);
    public static final Block GILDED_BLACKSTONE_WALL = registerWallCopy("gilded_blackstone", Blocks.GILDED_BLACKSTONE);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerStairsCopy("cracked_polished_blackstone_brick", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerSlabCopy("cracked_polished_blackstone_brick", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerWallCopy("cracked_polished_blackstone_brick", Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);

    // End
    public static final Block END_STONE_STAIRS = registerStairsCopy("end_stone", Blocks.END_STONE);
    public static final Block END_STONE_SLAB = registerSlabCopy("end_stone", Blocks.END_STONE);
    public static final Block END_STONE_WALL = registerWallCopy("end_stone", Blocks.END_STONE);
    public static final Block PURPUR_WALL = registerWallCopy("purpur", Blocks.PURPUR_BLOCK);

    // Metals
    public static final Block IRON_STAIRS = registerStairsCopy("iron", Blocks.IRON_BLOCK);
    public static final Block IRON_SLAB = registerSlabCopy("iron", Blocks.IRON_BLOCK);
    public static final Block IRON_WALL = registerWallCopy("iron", Blocks.IRON_BLOCK);
    public static final Block IRON_BAR_GATE = registerBlock("iron_bar_gate", new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block CUT_IRON_BLOCK = registerBlockCopy("cut_iron_block", Blocks.IRON_BLOCK);
    public static final Block CUT_IRON_STAIRS = registerStairsCopy("cut_iron", Blocks.IRON_BLOCK);
    public static final Block CUT_IRON_SLAB = registerSlabCopy("cut_iron", Blocks.IRON_BLOCK);
    public static final Block CUT_IRON_WALL = registerWallCopy("cut_iron", Blocks.IRON_BLOCK);

    public static final Block GOLD_STAIRS = registerStairsCopy("gold", Blocks.GOLD_BLOCK);
    public static final Block GOLD_SLAB = registerSlabCopy("gold", Blocks.GOLD_BLOCK);
    public static final Block GOLD_WALL = registerWallCopy("gold", Blocks.GOLD_BLOCK);

    public static final Block GOLD_BRICKS = registerBlockCopy("gold_bricks", Blocks.GOLD_BLOCK);
    public static final Block GOLD_BRICK_STAIRS = registerStairsCopy("gold_brick", Blocks.GOLD_BLOCK);
    public static final Block GOLD_BRICK_SLAB = registerSlabCopy("gold_brick", Blocks.GOLD_BLOCK);
    public static final Block GOLD_BRICK_WALL = registerWallCopy("gold_brick", Blocks.GOLD_BLOCK);

    public static final Block NETHERITE_STAIRS = registerStairsCopy("netherite", Blocks.NETHERITE_BLOCK);
    public static final Block NETHERITE_SLAB = registerSlabCopy("netherite", Blocks.NETHERITE_BLOCK);
    public static final Block NETHERITE_WALL = registerWallCopy("netherite", Blocks.NETHERITE_BLOCK);

    public static final Block NETHERITE_BRICKS = registerBlockCopy("netherite_bricks", Blocks.NETHERITE_BLOCK);
    public static final Block NETHERITE_BRICK_STAIRS = registerStairsCopy("netherite_brick", Blocks.NETHERITE_BLOCK);
    public static final Block NETHERITE_BRICK_SLAB = registerSlabCopy("netherite_brick", Blocks.NETHERITE_BLOCK);
    public static final Block NETHERITE_BRICK_WALL = registerWallCopy("netherite_brick", Blocks.NETHERITE_BLOCK);


    // Gems
    public static final Block EMERALD_STAIRS = registerStairsCopy("emerald", Blocks.EMERALD_BLOCK);
    public static final Block EMERALD_SLAB = registerSlabCopy("emerald", Blocks.EMERALD_BLOCK);
    public static final Block EMERALD_WALL = registerWallCopy("emerald", Blocks.EMERALD_BLOCK);

    public static final Block EMERALD_BRICKS = registerBlockCopy("emerald_bricks", Blocks.EMERALD_BLOCK);
    public static final Block EMERALD_BRICK_STAIRS = registerStairsCopy("emerald_brick", Blocks.EMERALD_BLOCK);
    public static final Block EMERALD_BRICK_SLAB = registerSlabCopy("emerald_brick", Blocks.EMERALD_BLOCK);
    public static final Block EMERALD_BRICK_WALL = registerWallCopy("emerald_brick", Blocks.EMERALD_BLOCK);

    public static final Block CUT_EMERALD = registerBlockCopy("cut_emerald", Blocks.EMERALD_BLOCK);
    public static final Block CUT_EMERALD_STAIRS = registerStairsCopy("cut_emerald", Blocks.EMERALD_BLOCK);
    public static final Block CUT_EMERALD_SLAB = registerSlabCopy("cut_emerald", Blocks.EMERALD_BLOCK);
    public static final Block CUT_EMERALD_WALL = registerWallCopy("cut_emerald", Blocks.EMERALD_BLOCK);

    public static final Block LAPIS_STAIRS = registerStairsCopy("lapis", Blocks.LAPIS_BLOCK);
    public static final Block LAPIS_SLAB = registerSlabCopy("lapis", Blocks.LAPIS_BLOCK);
    public static final Block LAPIS_WALL = registerWallCopy("lapis", Blocks.LAPIS_BLOCK);

    public static final Block DIAMOND_STAIRS = registerStairsCopy("diamond", Blocks.DIAMOND_BLOCK);
    public static final Block DIAMOND_SLAB = registerSlabCopy("diamond", Blocks.DIAMOND_BLOCK);
    public static final Block DIAMOND_WALL = registerWallCopy("diamond", Blocks.DIAMOND_BLOCK);

    public static final Block DIAMOND_BRICKS = registerBlockCopy("diamond_bricks", Blocks.DIAMOND_BLOCK);
    public static final Block DIAMOND_BRICK_STAIRS = registerStairsCopy("diamond_brick", Blocks.DIAMOND_BLOCK);
    public static final Block DIAMOND_BRICK_SLAB = registerSlabCopy("diamond_brick", Blocks.DIAMOND_BLOCK);
    public static final Block DIAMOND_BRICK_WALL = registerWallCopy("diamond_brick", Blocks.DIAMOND_BLOCK);

    public static final Block AMETHYST_STAIRS = registerStairsCopy("amethyst", Blocks.AMETHYST_BLOCK);
    public static final Block AMETHYST_SLAB = registerSlabCopy("amethyst", Blocks.AMETHYST_BLOCK);
    public static final Block AMETHYST_WALL = registerWallCopy("amethyst", Blocks.AMETHYST_BLOCK);

    public static final Block AMETHYST_BRICKS = registerBlockCopy("amethyst_bricks", Blocks.AMETHYST_BLOCK);
    public static final Block AMETHYST_BRICK_STAIRS = registerStairsCopy("amethyst_brick", Blocks.AMETHYST_BLOCK);
    public static final Block AMETHYST_BRICK_SLAB = registerSlabCopy("amethyst_brick", Blocks.AMETHYST_BLOCK);
    public static final Block AMETHYST_BRICK_WALL = registerWallCopy("amethyst_brick", Blocks.AMETHYST_BLOCK);


    // Quartz
    public static final Block QUARTZ_WALL = registerWallCopy("quartz_wall", Blocks.QUARTZ_BLOCK);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairsCopy("quartz_brick", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_SLAB = registerSlabCopy("quartz_brick", Blocks.QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_WALL = registerWallCopy("quartz_brick", Blocks.QUARTZ_BRICKS);
    public static final Block SMOOTH_QUARTZ_WALL = registerWallCopy("smooth_quartz", Blocks.SMOOTH_QUARTZ);


    private static Block registerBlockCopy(String name, Block base) {
        return registerBlock(name, new Block(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerStairsCopy(String name, Block base) {
        return registerBlock(name + "_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
    }

    private static Block registerSlabCopy(String name, Block base) {
        return registerBlock(name + "_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerWallCopy(String name, Block base) {
        return registerBlock(name + "_wall", new WallBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CozyConvenience.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CozyConvenience.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CozyConvenience.LOGGER.info("Registering Building Blocks for " + CozyConvenience.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            // Wood
            entries.addAfter(Blocks.OAK_FENCE_GATE, OAK_WALL);
            entries.addAfter(Blocks.SPRUCE_FENCE_GATE, SPRUCE_WALL);
            entries.addAfter(Blocks.BIRCH_FENCE_GATE, BIRCH_WALL);
            entries.addAfter(Blocks.JUNGLE_FENCE_GATE, JUNGLE_WALL);
            entries.addAfter(Blocks.ACACIA_FENCE_GATE, ACACIA_WALL);
            entries.addAfter(Blocks.DARK_OAK_FENCE_GATE, DARK_OAK_WALL);
            entries.addAfter(Blocks.MANGROVE_FENCE_GATE, MANGROVE_WALL);
            entries.addAfter(Blocks.CHERRY_FENCE_GATE, CHERRY_WALL);
            entries.addAfter(Blocks.BAMBOO_FENCE_GATE, BAMBOO_WALL);
            entries.addAfter(BAMBOO_WALL, BAMBOO_MOSAIC_WALL);
            entries.addAfter(Blocks.CRIMSON_FENCE_GATE, CRIMSON_WALL);
            entries.addAfter(Blocks.WARPED_FENCE_GATE, WARPED_WALL);

            // Stone
            entries.addAfter(Blocks.STONE_SLAB, STONE_WALL);
            entries.addAfter(Blocks.STONE_BRICKS, STONE_COLUMN, CRACKED_STONE_COLUMN, MOSSY_STONE_COLUMN);
            entries.addAfter(Blocks.SMOOTH_STONE_SLAB, SMOOTH_STONE_STAIRS, SMOOTH_STONE_WALL);
            entries.addAfter(Blocks.CRACKED_STONE_BRICKS, CRACKED_STONE_BRICK_STAIRS, CRACKED_STONE_BRICK_SLAB, CRACKED_STONE_BRICK_WALL);
            entries.addAfter(Blocks.POLISHED_GRANITE_SLAB, POLISHED_GRANITE_WALL);
            entries.addAfter(Blocks.POLISHED_DIORITE_SLAB, POLISHED_DIORITE_WALL);
            entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB, POLISHED_ANDESITE_WALL);

            // Deepslate
            entries.addAfter(Blocks.COBBLED_DEEPSLATE_WALL, DEEPSLATE_STAIRS, DEEPSLATE_SLAB, DEEPSLATE_WALL);
            entries.addAfter(Blocks.CRACKED_DEEPSLATE_BRICKS, CRACKED_DEEPSLATE_BRICK_STAIRS, CRACKED_DEEPSLATE_BRICK_SLAB, CRACKED_DEEPSLATE_BRICK_WALL);
            entries.addAfter(Blocks.CRACKED_DEEPSLATE_TILES, CRACKED_DEEPSLATE_TILE_STAIRS, CRACKED_DEEPSLATE_TILE_SLAB, CRACKED_DEEPSLATE_TILE_WALL);

            // Mud & Sandstone
            entries.addAfter(Blocks.PACKED_MUD, PACKED_MUD_STAIRS, PACKED_MUD_SLAB, PACKED_MUD_WALL);
            entries.addAfter(Blocks.SMOOTH_SANDSTONE_SLAB, SMOOTH_SANDSTONE_WALL);
            entries.addAfter(Blocks.CUT_SANDSTONE_SLAB, CUT_SANDSTONE_STAIRS, CUT_SANDSTONE_WALL);
            entries.addAfter(Blocks.SMOOTH_RED_SANDSTONE_SLAB, SMOOTH_RED_SANDSTONE_WALL);
            entries.addAfter(Blocks.CUT_RED_SANDSTONE_SLAB, CUT_RED_SANDSTONE_STAIRS, CUT_RED_SANDSTONE_WALL);

            // Prismarine
            entries.addAfter(Blocks.PRISMARINE_BRICK_SLAB, PRISMARINE_BRICK_WALL);
            entries.addAfter(Blocks.DARK_PRISMARINE_SLAB, DARK_PRISMARINE_WALL);

            // Nether
            entries.addAfter(Blocks.CRACKED_NETHER_BRICKS, CRACKED_NETHER_BRICK_STAIRS, CRACKED_NETHER_BRICK_SLAB, CRACKED_NETHER_BRICK_WALL);
            entries.addAfter(Blocks.BASALT, BASALT_STAIRS, BASALT_SLAB, BASALT_WALL);
            entries.addAfter(Blocks.SMOOTH_BASALT, SMOOTH_BASALT_STAIRS, SMOOTH_BASALT_SLAB, SMOOTH_BASALT_WALL);
            entries.addAfter(Blocks.POLISHED_BASALT, POLISHED_BASALT_STAIRS, POLISHED_BASALT_SLAB, POLISHED_BASALT_WALL, BASALT_TILES, BASALT_TILE_STAIRS, BASALT_TILE_SLAB, BASALT_TILE_WALL, CHISELED_BASALT_TILES, CHISELED_BASALT_TILE_STAIRS, CHISELED_BASALT_TILE_SLAB, CHISELED_BASALT_TILE_WALL);
            entries.addAfter(Blocks.GILDED_BLACKSTONE, GILDED_BLACKSTONE_STAIRS, GILDED_BLACKSTONE_SLAB, GILDED_BLACKSTONE_WALL);
            entries.addAfter(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);

            // End
            entries.addAfter(Blocks.END_STONE, END_STONE_STAIRS, END_STONE_SLAB, END_STONE_WALL);
            entries.addAfter(Blocks.PURPUR_SLAB, PURPUR_WALL);

            // Metals
            entries.addAfter(Blocks.IRON_BLOCK, IRON_STAIRS, IRON_SLAB, IRON_WALL, IRON_BAR_GATE);
            entries.addAfter(IRON_BAR_GATE, CUT_IRON_BLOCK, CUT_IRON_STAIRS, CUT_IRON_SLAB, CUT_IRON_WALL);
            entries.addAfter(Blocks.GOLD_BLOCK, GOLD_STAIRS, GOLD_SLAB, GOLD_WALL);
            entries.addAfter(GOLD_WALL, GOLD_BRICKS, GOLD_BRICK_STAIRS, GOLD_BRICK_SLAB, GOLD_BRICK_WALL);
            entries.addAfter(Blocks.NETHERITE_BLOCK, NETHERITE_STAIRS, NETHERITE_SLAB, NETHERITE_WALL, NETHERITE_BRICKS, NETHERITE_BRICK_STAIRS, NETHERITE_BRICK_SLAB, NETHERITE_BRICK_WALL);

            // Gems
            entries.addAfter(Blocks.EMERALD_BLOCK, EMERALD_STAIRS, EMERALD_SLAB, EMERALD_WALL, EMERALD_BRICKS, EMERALD_BRICK_STAIRS, EMERALD_BRICK_SLAB, EMERALD_BRICK_WALL, CUT_EMERALD, CUT_EMERALD_STAIRS, CUT_EMERALD_SLAB, CUT_EMERALD_WALL);
            entries.addAfter(Blocks.LAPIS_BLOCK, LAPIS_STAIRS, LAPIS_SLAB, LAPIS_WALL);
            entries.addAfter(Blocks.DIAMOND_BLOCK, DIAMOND_STAIRS, DIAMOND_SLAB, DIAMOND_WALL);
            entries.addAfter(DIAMOND_WALL, DIAMOND_BRICKS, DIAMOND_BRICK_STAIRS, DIAMOND_BRICK_SLAB, DIAMOND_BRICK_WALL);
            entries.addAfter(Blocks.AMETHYST_BLOCK, AMETHYST_STAIRS, AMETHYST_SLAB, AMETHYST_WALL, AMETHYST_BRICKS, AMETHYST_BRICK_STAIRS, AMETHYST_BRICK_SLAB, AMETHYST_BRICK_WALL);

            // Quartz
            entries.addAfter(Blocks.QUARTZ_SLAB, QUARTZ_WALL);
            entries.addAfter(Blocks.QUARTZ_BRICKS, QUARTZ_BRICK_STAIRS, QUARTZ_BRICK_SLAB, QUARTZ_BRICK_WALL);
            entries.addAfter(Blocks.SMOOTH_QUARTZ_SLAB, SMOOTH_QUARTZ_WALL);
        });
    }
}
