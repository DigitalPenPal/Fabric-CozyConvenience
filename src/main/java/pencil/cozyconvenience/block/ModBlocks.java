package pencil.cozyconvenience.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;

public class ModBlocks {
    // Pillar Blocks
    public static final Block STONE_COLUMN = registerBlock("stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_COLUMN = registerBlock("cracked_stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_COLUMN = registerBlock("mossy_stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));

    // Concrete Blocks
    public static final Block WHITE_CONCRETE_TILES = registerBlock("white_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("white_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block LIGHT_GRAY_CONCRETE_TILES = registerBlock("light_gray_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final Block GRAY_CONCRETE_TILES = registerBlock("gray_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));

    public static final Block BLACK_CONCRETE_TILES = registerBlock("black_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));

    public static final Block BROWN_CONCRETE_TILES = registerBlock("brown_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));

    public static final Block RED_CONCRETE_TILES = registerBlock("red_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));

    public static final Block ORANGE_CONCRETE_TILES = registerBlock("orange_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));

    public static final Block YELLOW_CONCRETE_TILES = registerBlock("yellow_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));

    public static final Block LIME_CONCRETE_TILES = registerBlock("lime_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));

    public static final Block GREEN_CONCRETE_TILES = registerBlock("green_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));

    public static final Block CYAN_CONCRETE_TILES = registerBlock("cyan_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));

    public static final Block LIGHT_BLUE_CONCRETE_TILES = registerBlock("light_blue_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final Block BLUE_CONCRETE_TILES = registerBlock("blue_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs", new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));

    public static final Block PURPLE_CONCRETE_TILES = registerBlock("purple_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));

    public static final Block MAGENTA_CONCRETE_TILES = registerBlock("magenta_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));

    public static final Block PINK_CONCRETE_TILES = registerBlock("pink_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    // Terracotta Blocks
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_PRESSURE_PLATE = registerBlock("terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TERRACOTTA_BUTTON = registerBlock("terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_PRESSURE_PLATE = registerBlock("white_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_TERRACOTTA_BUTTON = registerBlock("white_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_gray_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BUTTON = registerBlock("light_gray_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("gray_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_TERRACOTTA_BUTTON = registerBlock("gray_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_PRESSURE_PLATE = registerBlock("black_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_TERRACOTTA_BUTTON = registerBlock("black_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_PRESSURE_PLATE = registerBlock("brown_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_TERRACOTTA_BUTTON = registerBlock("brown_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_PRESSURE_PLATE = registerBlock("red_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_TERRACOTTA_BUTTON = registerBlock("red_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_PRESSURE_PLATE = registerBlock("orange_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_TERRACOTTA_BUTTON = registerBlock("orange_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_PRESSURE_PLATE = registerBlock("yellow_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_TERRACOTTA_BUTTON = registerBlock("yellow_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_PRESSURE_PLATE = registerBlock("lime_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_TERRACOTTA_BUTTON = registerBlock("lime_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_PRESSURE_PLATE = registerBlock("green_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_TERRACOTTA_BUTTON = registerBlock("green_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_PRESSURE_PLATE = registerBlock("cyan_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_TERRACOTTA_BUTTON = registerBlock("cyan_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_blue_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BUTTON = registerBlock("light_blue_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs", new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("blue_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_TERRACOTTA_BUTTON = registerBlock("blue_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_PRESSURE_PLATE = registerBlock("purple_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_TERRACOTTA_BUTTON = registerBlock("purple_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_PRESSURE_PLATE = registerBlock("magenta_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_TERRACOTTA_BUTTON = registerBlock("magenta_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_PRESSURE_PLATE = registerBlock("pink_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_TERRACOTTA_BUTTON = registerBlock("pink_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));

    // Wool Blocks
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));

    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));

    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));

    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new StairsBlock(Blocks.RED_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));

    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));

    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));

    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));

    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));

    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));

    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));

    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));

    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));

    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
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
