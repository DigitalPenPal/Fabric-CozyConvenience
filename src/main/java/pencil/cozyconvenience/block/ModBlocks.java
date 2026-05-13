package pencil.cozyconvenience.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;
import pencil.cozyconvenience.block.custom.*;

public class ModBlocks {
    // ++ Building Blocks Category ++


    // "Dirt + Grass" Blocks
    public static final Block GRASS_SLAB = registerBlock ( "grass_slab", new GrassSlabBlock ( AbstractBlock.Settings.copy ( Blocks.GRASS_BLOCK ) ) );
    public static final Block DIRT_SLAB = registerBlock ( "dirt_slab", new SlabBlock ( AbstractBlock.Settings.copy ( Blocks.DIRT ) ) );
    public static final Block DIRT_PATH_SLAB = registerBlock ( "dirt_path_slab", new DirtPathSlabBlock ( AbstractBlock.Settings.copy ( Blocks.DIRT_PATH ) ) );
    public static final Block COARSE_DIRT_SLAB = registerBlock ( "coarse_dirt_slab", new SlabBlock ( AbstractBlock.Settings.copy ( Blocks.COARSE_DIRT ) ) );
    public static final Block ROOTED_DIRT_SLAB = registerBlock ( "rooted_dirt_slab", new RootedDirtSlabBlock ( AbstractBlock.Settings.copy ( Blocks.ROOTED_DIRT ) ) );
    public static final Block PODZOL_SLAB = registerBlock ( "podzol_slab", new PodzolSlabBlock ( AbstractBlock.Settings.copy ( Blocks.PODZOL ) ) );
    public static final Block MYCELIUM_SLAB = registerBlock ( "mycelium_slab", new MyceliumSlabBlock ( AbstractBlock.Settings.copy ( Blocks.MYCELIUM ) ) );
    public static final Block CRIMSON_NYLIUM_SLAB = registerBlock ( "crimson_nylium_slab", new NyliumSlabBlock ( AbstractBlock.Settings.copy ( Blocks.CRIMSON_NYLIUM ) ) );
    public static final Block WARPED_NYLIUM_SLAB = registerBlock ( "warped_nylium_slab", new NyliumSlabBlock ( AbstractBlock.Settings.copy ( Blocks.WARPED_NYLIUM ) ) );



    // Wood Blocks
    public static final Block OAK_WALL = registerBlock("oak_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_WALL = registerBlock("spruce_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Block BIRCH_WALL = registerBlock("birch_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    public static final Block JUNGLE_WALL = registerBlock("jungle_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));
    public static final Block ACACIA_WALL = registerBlock("acacia_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));
    public static final Block DARK_OAK_WALL = registerBlock("dark_oak_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));
    public static final Block MANGROVE_WALL = registerBlock("mangrove_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));
    public static final Block CHERRY_WALL = registerBlock("cherry_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));
    public static final Block BAMBOO_WALL = registerBlock("bamboo_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
    public static final Block BAMBOO_MOSAIC_WALL = registerBlock("bamboo_mosaic_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_MOSAIC)));
    public static final Block CRIMSON_WALL = registerBlock("crimson_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block WARPED_WALL = registerBlock("warped_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));


    // Stone Blocks
    public static final Block STONE_WALL = registerBlock("stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlock("cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COBBLESTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block COBBLESTONE_BUTTON = registerBlock("cobblestone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MOSSY_COBBLESTONE_PRESSURE_PLATE = registerBlock("mossy_cobblestone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MOSSY_COBBLESTONE_BUTTON = registerBlock("mossy_cobblestone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_PRESSURE_PLATE = registerBlock("smooth_stone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_STONE_BUTTON = registerBlock("smooth_stone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STONE_BRICK_PRESSURE_PLATE = registerBlock("stone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STONE_BRICK_BUTTON = registerBlock("stone_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs", new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_PRESSURE_PLATE = registerBlock("cracked_stone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_STONE_BRICK_BUTTON = registerBlock("cracked_stone_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MOSSY_STONE_BRICK_PRESSURE_PLATE = registerBlock("mossy_stone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MOSSY_STONE_BRICK_BUTTON = registerBlock("mossy_stone_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STONE_COLUMN = registerBlock("stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_COLUMN = registerBlock("cracked_stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_COLUMN = registerBlock("mossy_stone_column", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));


    // Granite Blocks
    public static final Block GRANITE_PRESSURE_PLATE = registerBlock("granite_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRANITE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRANITE_BUTTON = registerBlock("granite_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerBlock("polished_granite_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_GRANITE_BUTTON = registerBlock("polished_granite_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Diorite Blocks
    public static final Block DIORITE_PRESSURE_PLATE = registerBlock("diorite_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIORITE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DIORITE_BUTTON = registerBlock("diorite_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerBlock("polished_diorite_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DIORITE_BUTTON = registerBlock("polished_diorite_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Andesite Blocks
    public static final Block ANDESITE_PRESSURE_PLATE = registerBlock("andesite_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ANDESITE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ANDESITE_BUTTON = registerBlock("andesite_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerBlock("polished_andesite_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_ANDESITE_BUTTON = registerBlock("polished_andesite_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Deepslate Blocks
    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs", new StairsBlock(Blocks.DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlock("deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DEEPSLATE_BUTTON = registerBlock("deepslate_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlock("cobbled_deepslate_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlock("polished_deepslate_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DEEPSLATE_BRICK_PRESSURE_PLATE = registerBlock("deepslate_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DEEPSLATE_BRICK_BUTTON = registerBlock("deepslate_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock("cracked_deepslate_brick_stairs", new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock("cracked_deepslate_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerBlock("cracked_deepslate_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE = registerBlock("cracked_deepslate_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_DEEPSLATE_BRICK_BUTTON = registerBlock("cracked_deepslate_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DEEPSLATE_TILE_PRESSURE_PLATE = registerBlock("deepslate_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DEEPSLATE_TILE_BUTTON = registerBlock("deepslate_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock("cracked_deepslate_tile_stairs", new StairsBlock(Blocks.CRACKED_DEEPSLATE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerBlock("cracked_deepslate_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerBlock("cracked_deepslate_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
    public static final Block CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE = registerBlock("cracked_deepslate_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_DEEPSLATE_TILE_BUTTON = registerBlock("cracked_deepslate_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Tuff Blocks
    public static final Block TUFF_PRESSURE_PLATE = registerBlock("tuff_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUFF).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TUFF_BUTTON = registerBlock("tuff_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerBlock("polished_tuff_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_TUFF_BUTTON = registerBlock("polished_tuff_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TUFF_BRICK_PRESSURE_PLATE = registerBlock("tuff_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TUFF_BRICK_BUTTON = registerBlock("tuff_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Brick Blocks
    public static final Block BRICK_PRESSURE_PLATE = registerBlock("brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BRICK_BUTTON = registerBlock("brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Mud Blocks
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs", new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_PRESSURE_PLATE = registerBlock("packed_mud_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PACKED_MUD).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PACKED_MUD_BUTTON = registerBlock("packed_mud_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MUD_BRICK_PRESSURE_PLATE = registerBlock("mud_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MUD_BRICK_BUTTON = registerBlock("mud_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Sandstone Blocks -- [ Here be Broken Blocks ]
    public static final Block SANDSTONE_PRESSURE_PLATE = registerBlock("sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SANDSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SANDSTONE_BUTTON = registerBlock("sandstone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_SANDSTONE_BUTTON = registerBlock("smooth_sandstone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs", new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CUT_SANDSTONE_BUTTON = registerBlock("cut_sandstone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_SANDSTONE_PRESSURE_PLATE = registerBlock("red_sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_SANDSTONE_BUTTON = registerBlock("red_sandstone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("smooth_red_sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_RED_SANDSTONE_BUTTON = registerBlock("smooth_red_sandstone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs", new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_PRESSURE_PLATE = registerBlock("cut_red_sandstone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CUT_RED_SANDSTONE_BUTTON = registerBlock("cut_red_sandstone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Prismarine Blocks
    public static final Block PRISMARINE_PRESSURE_PLATE = registerBlock("prismarine_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PRISMARINE_BUTTON = registerBlock("prismarine_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_PRESSURE_PLATE = registerBlock("prismarine_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PRISMARINE_BRICK_BUTTON = registerBlock("prismarine_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_PRESSURE_PLATE = registerBlock("dark_prismarine_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DARK_PRISMARINE_BUTTON = registerBlock("dark_prismarine_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Netherrack Blocks
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs", new StairsBlock(Blocks.NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab", new NetherrackSlabBlock (AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_PRESSURE_PLATE = registerBlock("netherrack_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.NETHERRACK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block NETHERRACK_BUTTON = registerBlock("netherrack_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block NETHER_BRICK_PRESSURE_PLATE = registerBlock("nether_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block NETHER_BRICK_BUTTON = registerBlock("nether_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerBlock("cracked_nether_brick_stairs", new StairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerBlock("cracked_nether_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_WALL = registerBlock("cracked_nether_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("cracked_nether_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_NETHER_BRICK_BUTTON = registerBlock("cracked_nether_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_NETHER_BRICK_PRESSURE_PLATE = registerBlock("red_nether_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_NETHER_BRICK_BUTTON = registerBlock("red_nether_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    // Basalt Blocks -- [ Here be Broken Blocks ]
    public static final Block BASALT_STAIRS = registerBlock("basalt_stairs", new StairsBlock(Blocks.BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_SLAB = registerBlock("basalt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_WALL = registerBlock("basalt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block BASALT_PRESSURE_PLATE = registerBlock("basalt_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BASALT).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BASALT_BUTTON = registerBlock("basalt_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs", new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_PRESSURE_PLATE = registerBlock("smooth_basalt_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_BASALT_BUTTON = registerBlock("smooth_basalt_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_BASALT_STAIRS = registerBlock("polished_basalt_stairs", new StairsBlock(Blocks.POLISHED_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
    public static final Block POLISHED_BASALT_PRESSURE_PLATE = registerBlock("polished_basalt_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_BASALT_BUTTON = registerBlock("polished_basalt_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Blackstone Blocks
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlock("blackstone_pressure_plate", new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.BLACKSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACKSTONE_BUTTON = registerBlock("blackstone_button", new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs", new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_PRESSURE_PLATE = registerBlock("gilded_blackstone_pressure_plate", new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GILDED_BLACKSTONE_BUTTON = registerBlock("gilded_blackstone_button", new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("polished_blackstone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("polished_blackstone_brick_button", new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("cracked_polished_blackstone_brick_stairs", new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE = registerBlock("cracked_polished_blackstone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.POLISHED_BLACKSTONE, AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON = registerBlock("cracked_polished_blackstone_brick_button", new ButtonBlock(BlockSetType.POLISHED_BLACKSTONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Endstone Blocks
    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs", new StairsBlock(Blocks.END_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_PRESSURE_PLATE = registerBlock("end_stone_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block END_STONE_BUTTON = registerBlock("end_stone_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block END_STONE_BRICK_PRESSURE_PLATE = registerBlock("end_stone_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block END_STONE_BRICK_BUTTON = registerBlock("end_stone_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Purpur Blocks
    public static final Block PURPUR_WALL = registerBlock("purpur_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_PRESSURE_PLATE = registerBlock("purpur_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPUR_BUTTON = registerBlock("purpur_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Iron Blocks
    public static final Block IRON_STAIRS = registerBlock("iron_stairs", new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_SLAB = registerBlock("iron_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_WALL = registerBlock("iron_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_BUTTON = registerBlock("iron_button", new ButtonBlock(BlockSetType.IRON, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block IRON_BAR_GATE = registerBlock("iron_bar_gate", new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.create().requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL).nonOpaque()));


    // Gold Blocks
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs", new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_SLAB = registerBlock("gold_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_WALL = registerBlock("gold_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_BUTTON = registerBlock("gold_button", new ButtonBlock(BlockSetType.GOLD, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Emerald Blocks
    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs", new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_SLAB = registerBlock("emerald_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_WALL = registerBlock("emerald_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block EMERALD_PRESSURE_PLATE = registerBlock("emerald_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block EMERALD_BUTTON = registerBlock("emerald_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Lapis Lazuli Blocks
    public static final Block LAPIS_STAIRS = registerBlock("lapis_stairs", new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_SLAB = registerBlock("lapis_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_WALL = registerBlock("lapis_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
    public static final Block LAPIS_PRESSURE_PLATE = registerBlock("lapis_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LAPIS_BUTTON = registerBlock("lapis_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Diamond Blocks
    public static final Block DIAMOND_STAIRS = registerBlock("diamond_stairs", new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_SLAB = registerBlock("diamond_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_WALL = registerBlock("diamond_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_PRESSURE_PLATE = registerBlock("diamond_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DIAMOND_BUTTON = registerBlock("diamond_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Netherite Blocks
    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs", new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_WALL = registerBlock("netherite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block NETHERITE_PRESSURE_PLATE = registerBlock("netherite_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block NETHERITE_BUTTON = registerBlock("netherite_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Quartz Blocks -- [ Here be Broken Blocks ]
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block QUARTZ_PRESSURE_PLATE = registerBlock("quartz_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block QUARTZ_BUTTON = registerBlock("quartz_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs", new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_PRESSURE_PLATE = registerBlock("quartz_brick_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block QUARTZ_BRICK_BUTTON = registerBlock("quartz_brick_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block SMOOTH_QUARTZ_PRESSURE_PLATE = registerBlock("smooth_quartz_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SMOOTH_QUARTZ_BUTTON = registerBlock("smooth_quartz_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Amethyst Blocks
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs", new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_PRESSURE_PLATE = registerBlock("amethyst_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block AMETHYST_BUTTON = registerBlock("amethyst_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // ++ Colored Blocks Category ++


    // Concrete Blocks
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("white_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs", new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHITE_CONCRETE_TILES = registerBlock("white_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_TILE_STAIRS = registerBlock("white_concrete_tile_stairs", new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_TILE_SLAB = registerBlock("white_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_TILE_WALL = registerBlock("white_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("white_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_CONCRETE_TILE_BUTTON = registerBlock("white_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_GRAY_CONCRETE_TILES = registerBlock("light_gray_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_STAIRS = registerBlock("light_gray_concrete_tile_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_SLAB = registerBlock("light_gray_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_WALL = registerBlock("light_gray_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("light_gray_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_BUTTON = registerBlock("light_gray_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAY_CONCRETE_TILES = registerBlock("gray_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_TILE_STAIRS = registerBlock("gray_concrete_tile_stairs", new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_TILE_SLAB = registerBlock("gray_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_TILE_WALL = registerBlock("gray_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("gray_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_CONCRETE_TILE_BUTTON = registerBlock("gray_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLACK_CONCRETE_TILES = registerBlock("black_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_TILE_STAIRS = registerBlock("black_concrete_tile_stairs", new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_TILE_SLAB = registerBlock("black_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_TILE_WALL = registerBlock("black_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("black_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_CONCRETE_TILE_BUTTON = registerBlock("black_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROWN_CONCRETE_TILES = registerBlock("brown_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_TILE_STAIRS = registerBlock("brown_concrete_tile_stairs", new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_TILE_SLAB = registerBlock("brown_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_TILE_WALL = registerBlock("brown_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("brown_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_CONCRETE_TILE_BUTTON = registerBlock("brown_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_CONCRETE_TILES = registerBlock("red_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_TILE_STAIRS = registerBlock("red_concrete_tile_stairs", new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_TILE_SLAB = registerBlock("red_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_TILE_WALL = registerBlock("red_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("red_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_CONCRETE_TILE_BUTTON = registerBlock("red_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_CONCRETE_TILES = registerBlock("orange_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_TILE_STAIRS = registerBlock("orange_concrete_tile_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_TILE_SLAB = registerBlock("orange_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_TILE_WALL = registerBlock("orange_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("orange_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_CONCRETE_TILE_BUTTON = registerBlock("orange_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_CONCRETE_TILES = registerBlock("yellow_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_TILE_STAIRS = registerBlock("yellow_concrete_tile_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_TILE_SLAB = registerBlock("yellow_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_TILE_WALL = registerBlock("yellow_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("yellow_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_CONCRETE_TILE_BUTTON = registerBlock("yellow_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIME_CONCRETE_TILES = registerBlock("lime_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_TILE_STAIRS = registerBlock("lime_concrete_tile_stairs", new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_TILE_SLAB = registerBlock("lime_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_TILE_WALL = registerBlock("lime_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("lime_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_CONCRETE_TILE_BUTTON = registerBlock("lime_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_CONCRETE_TILES = registerBlock("green_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_TILE_STAIRS = registerBlock("green_concrete_tile_stairs", new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_TILE_SLAB = registerBlock("green_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_TILE_WALL = registerBlock("green_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("green_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_CONCRETE_TILE_BUTTON = registerBlock("green_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_CONCRETE_TILES = registerBlock("cyan_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_TILE_STAIRS = registerBlock("cyan_concrete_tile_stairs", new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_TILE_SLAB = registerBlock("cyan_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_TILE_WALL = registerBlock("cyan_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("cyan_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_CONCRETE_TILE_BUTTON = registerBlock("cyan_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_CONCRETE_TILES = registerBlock("light_blue_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_STAIRS = registerBlock("light_blue_concrete_tile_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_SLAB = registerBlock("light_blue_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_WALL = registerBlock("light_blue_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("light_blue_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_BUTTON = registerBlock("light_blue_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_CONCRETE_TILES = registerBlock("blue_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_TILE_STAIRS = registerBlock("blue_concrete_tile_stairs", new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_TILE_SLAB = registerBlock("blue_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_TILE_WALL = registerBlock("blue_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("blue_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_CONCRETE_TILE_BUTTON = registerBlock("blue_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_CONCRETE_TILES = registerBlock("purple_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_TILE_STAIRS = registerBlock("purple_concrete_tile_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_TILE_SLAB = registerBlock("purple_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_TILE_WALL = registerBlock("purple_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("purple_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_CONCRETE_TILE_BUTTON = registerBlock("purple_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_CONCRETE_TILES = registerBlock("magenta_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_TILE_STAIRS = registerBlock("magenta_concrete_tile_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_TILE_SLAB = registerBlock("magenta_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_TILE_WALL = registerBlock("magenta_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("magenta_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_CONCRETE_TILE_BUTTON = registerBlock("magenta_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_CONCRETE_TILES = registerBlock("pink_concrete_tiles", new Block(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_TILE_STAIRS = registerBlock("pink_concrete_tile_stairs", new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_TILE_SLAB = registerBlock("pink_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_TILE_WALL = registerBlock("pink_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_TILE_PRESSURE_PLATE = registerBlock("pink_concrete_tile_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_CONCRETE_TILE_BUTTON = registerBlock("pink_concrete_tile_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Terracotta Blocks
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs", new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_PRESSURE_PLATE = registerBlock("terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TERRACOTTA_BUTTON = registerBlock("terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_PRESSURE_PLATE = registerBlock("white_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_TERRACOTTA_BUTTON = registerBlock("white_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_gray_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BUTTON = registerBlock("light_gray_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_PRESSURE_PLATE = registerBlock("gray_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_TERRACOTTA_BUTTON = registerBlock("gray_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_PRESSURE_PLATE = registerBlock("black_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_TERRACOTTA_BUTTON = registerBlock("black_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_PRESSURE_PLATE = registerBlock("brown_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_TERRACOTTA_BUTTON = registerBlock("brown_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_PRESSURE_PLATE = registerBlock("red_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_TERRACOTTA_BUTTON = registerBlock("red_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_PRESSURE_PLATE = registerBlock("orange_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_TERRACOTTA_BUTTON = registerBlock("orange_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_PRESSURE_PLATE = registerBlock("yellow_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_TERRACOTTA_BUTTON = registerBlock("yellow_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_PRESSURE_PLATE = registerBlock("lime_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_TERRACOTTA_BUTTON = registerBlock("lime_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_PRESSURE_PLATE = registerBlock("green_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_TERRACOTTA_BUTTON = registerBlock("green_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_PRESSURE_PLATE = registerBlock("cyan_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_TERRACOTTA_BUTTON = registerBlock("cyan_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("light_blue_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BUTTON = registerBlock("light_blue_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs", new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_PRESSURE_PLATE = registerBlock("blue_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_TERRACOTTA_BUTTON = registerBlock("blue_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_PRESSURE_PLATE = registerBlock("purple_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_TERRACOTTA_BUTTON = registerBlock("purple_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_PRESSURE_PLATE = registerBlock("magenta_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_TERRACOTTA_BUTTON = registerBlock("magenta_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_PRESSURE_PLATE = registerBlock("pink_terracotta_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_TERRACOTTA_BUTTON = registerBlock("pink_terracotta_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));


    // Wool Blocks -- Add custom block set type
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_PRESSURE_PLATE = registerBlock("white_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_WOOL_BUTTON = registerBlock("white_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs", new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
    public static final Block LIGHT_GRAY_WOOL_PRESSURE_PLATE = registerBlock("light_gray_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_GRAY_WOOL_BUTTON = registerBlock("light_gray_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
    public static final Block GRAY_WOOL_PRESSURE_PLATE = registerBlock("gray_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GRAY_WOOL_BUTTON = registerBlock("gray_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
    public static final Block BLACK_WOOL_PRESSURE_PLATE = registerBlock("black_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLACK_WOOL_BUTTON = registerBlock("black_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
    public static final Block BROWN_WOOL_PRESSURE_PLATE = registerBlock("brown_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BROWN_WOOL_BUTTON = registerBlock("brown_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs", new StairsBlock(Blocks.RED_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
    public static final Block RED_WOOL_PRESSURE_PLATE = registerBlock("red_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.RED_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_WOOL_BUTTON = registerBlock("red_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
    public static final Block ORANGE_WOOL_PRESSURE_PLATE = registerBlock("orange_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ORANGE_WOOL_BUTTON = registerBlock("orange_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs", new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
    public static final Block YELLOW_WOOL_PRESSURE_PLATE = registerBlock("yellow_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block YELLOW_WOOL_BUTTON = registerBlock("yellow_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
    public static final Block LIME_WOOL_PRESSURE_PLATE = registerBlock("lime_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIME_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIME_WOOL_BUTTON = registerBlock("lime_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
    public static final Block GREEN_WOOL_PRESSURE_PLATE = registerBlock("green_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GREEN_WOOL_BUTTON = registerBlock("green_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
    public static final Block CYAN_WOOL_PRESSURE_PLATE = registerBlock("cyan_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CYAN_WOOL_BUTTON = registerBlock("cyan_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_PRESSURE_PLATE = registerBlock("light_blue_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LIGHT_BLUE_WOOL_BUTTON = registerBlock("light_blue_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_WALL = registerBlock("blue_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
    public static final Block BLUE_WOOL_PRESSURE_PLATE = registerBlock("blue_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLUE_WOOL_BUTTON = registerBlock("blue_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
    public static final Block PURPLE_WOOL_PRESSURE_PLATE = registerBlock("purple_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PURPLE_WOOL_BUTTON = registerBlock("purple_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs", new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
    public static final Block MAGENTA_WOOL_PRESSURE_PLATE = registerBlock("magenta_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MAGENTA_WOOL_BUTTON = registerBlock("magenta_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
    public static final Block PINK_WOOL_PRESSURE_PLATE = registerBlock("pink_wool_pressure_plate", new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.PINK_WOOL).solid().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block PINK_WOOL_BUTTON = registerBlock("pink_wool_button", new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.create().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));

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
