package pencil.cozyconvenience.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;

public class ModBlocks {
    // Pillar Blocks
    public static final Block STONE_COLUMN = registerBlock("stone_column",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_COLUMN = registerBlock("cracked_stone_column",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_COLUMN = registerBlock("mossy_stone_column",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));

    // Regular Blocks
    public static final Block WHITE_CONCRETE_TILES = registerBlock("white_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_TILES = registerBlock("light_gray_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_TILES = registerBlock("gray_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_TILES = registerBlock("black_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_TILES = registerBlock("brown_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block RED_CONCRETE_TILES = registerBlock("red_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_TILES = registerBlock("orange_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_TILES = registerBlock("yellow_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_TILES = registerBlock("lime_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_TILES = registerBlock("green_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block CYAN_CONCRETE_TILES = registerBlock("cyan_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_TILES = registerBlock("light_blue_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_TILES = registerBlock("blue_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_TILES = registerBlock("purple_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_TILES = registerBlock("magenta_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_TILES = registerBlock("pink_concrete_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    // Slab Blocks
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));

    // Registries
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CozyConvenience.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CozyConvenience.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CozyConvenience.LOGGER.info("Registering Mod Blocks for " + CozyConvenience.MOD_ID);
    }
}
