package pencil.cozyconvenience.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;
import pencil.cozyconvenience.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup COZY_CONVENIENCE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CozyConvenience.MOD_ID, "cozy_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.ARMOR_STAND))
                    .displayName(Text.translatable("itemgroup.cozy-convenience.cozy_items"))
                    .entries((displayContext, entries) -> {
                    }).build());

    public static final ItemGroup COZY_CONVENIENCE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CozyConvenience.MOD_ID, "cozy_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.STONE_COLUMN))
                    .displayName(Text.translatable("itemgroup.cozy-convenience.cozy_blocks"))
                    .entries((displayContext, entries) -> {
                        // ++ Building Blocks Category ++


                        // Wood Blocks
                        entries.add(ModBlocks.OAK_WALL);
                        entries.add(ModBlocks.SPRUCE_WALL);
                        entries.add(ModBlocks.BIRCH_WALL);
                        entries.add(ModBlocks.JUNGLE_WALL);
                        entries.add(ModBlocks.ACACIA_WALL);
                        entries.add(ModBlocks.DARK_OAK_WALL);
                        entries.add(ModBlocks.MANGROVE_WALL);
                        entries.add(ModBlocks.CHERRY_WALL);
                        entries.add(ModBlocks.BAMBOO_WALL);
                        entries.add(ModBlocks.BAMBOO_MOSAIC_WALL);
                        entries.add(ModBlocks.CRIMSON_WALL);
                        entries.add(ModBlocks.WARPED_WALL);


                        // Stone Blocks
                        entries.add(ModBlocks.STONE_WALL);
                        entries.add(ModBlocks.COBBLESTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.COBBLESTONE_BUTTON);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_BUTTON);
                        entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_STONE_WALL);
                        entries.add(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_STONE_BUTTON);
                        entries.add(ModBlocks.STONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.STONE_BRICK_BUTTON);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_STONE_BRICK_BUTTON);
                        entries.add(ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.MOSSY_STONE_BRICK_BUTTON);

                        entries.add(ModBlocks.STONE_COLUMN);
                        entries.add(ModBlocks.CRACKED_STONE_COLUMN);
                        entries.add(ModBlocks.MOSSY_STONE_COLUMN);


                        // Granite Blocks
                        entries.add(ModBlocks.GRANITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRANITE_BUTTON);
                        entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                        entries.add(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);


                        // Diorite Blocks
                        entries.add(ModBlocks.POLISHED_GRANITE_BUTTON);
                        entries.add(ModBlocks.DIORITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DIORITE_BUTTON);
                        entries.add(ModBlocks.POLISHED_DIORITE_WALL);
                        entries.add(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_DIORITE_BUTTON);


                        // Andesite Block
                        entries.add(ModBlocks.ANDESITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ANDESITE_BUTTON);
                        entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_ANDESITE_BUTTON);


                        // Deepslate Blocks
                        entries.add(ModBlocks.DEEPSLATE_STAIRS);
                        entries.add(ModBlocks.DEEPSLATE_SLAB);
                        entries.add(ModBlocks.DEEPSLATE_WALL);
                        entries.add(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPSLATE_BUTTON);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
                        entries.add(ModBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPSLATE_BRICK_BUTTON);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_BRICK_BUTTON);
                        entries.add(ModBlocks.DEEPSLATE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPSLATE_TILE_BUTTON);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_DEEPSLATE_TILE_BUTTON);


                        // Tuff Blocks
                        entries.add(ModBlocks.TUFF_PRESSURE_PLATE);
                        entries.add(ModBlocks.TUFF_BUTTON);
                        entries.add(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_TUFF_BUTTON);
                        entries.add(ModBlocks.TUFF_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.TUFF_BRICK_BUTTON);


                        // Brick Blocks
                        entries.add(ModBlocks.BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.BRICK_BUTTON);


                        // Mud Blocks
                        entries.add(ModBlocks.PACKED_MUD_STAIRS);
                        entries.add(ModBlocks.PACKED_MUD_SLAB);
                        entries.add(ModBlocks.PACKED_MUD_WALL);
                        entries.add(ModBlocks.PACKED_MUD_PRESSURE_PLATE);
                        entries.add(ModBlocks.PACKED_MUD_BUTTON);
                        entries.add(ModBlocks.MUD_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.MUD_BRICK_BUTTON);


                        // Sandstone Blocks -- [ Here be Broken Blocks ]
                        entries.add(ModBlocks.SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SANDSTONE_BUTTON);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_WALL);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_BUTTON);
                        entries.add(ModBlocks.CUT_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_SANDSTONE_WALL);
                        entries.add(ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUT_SANDSTONE_BUTTON);
                        entries.add(ModBlocks.RED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_SANDSTONE_BUTTON);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_BUTTON);


                        // Prismarine Blocks
                        entries.add(ModBlocks.PRISMARINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PRISMARINE_BUTTON);
                        entries.add(ModBlocks.PRISMARINE_BRICK_WALL);
                        entries.add(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.PRISMARINE_BRICK_BUTTON);
                        entries.add(ModBlocks.DARK_PRISMARINE_WALL);
                        entries.add(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DARK_PRISMARINE_BUTTON);


                        // Netherrack Blocks
                        entries.add(ModBlocks.NETHERRACK_STAIRS);
                        entries.add(ModBlocks.NETHERRACK_SLAB);
                        entries.add(ModBlocks.NETHERRACK_WALL);
                        entries.add(ModBlocks.NETHERRACK_PRESSURE_PLATE);
                        entries.add(ModBlocks.NETHERRACK_BUTTON);
                        entries.add(ModBlocks.NETHER_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.NETHER_BRICK_BUTTON);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_NETHER_BRICK_BUTTON);
                        entries.add(ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_NETHER_BRICK_BUTTON);


                        // Basalt Blocks -- [ Here be Broken Blocks ]
                        entries.add(ModBlocks.BASALT_STAIRS);
                        entries.add(ModBlocks.BASALT_SLAB);
                        entries.add(ModBlocks.BASALT_WALL);
                        entries.add(ModBlocks.BASALT_PRESSURE_PLATE);
                        entries.add(ModBlocks.BASALT_BUTTON);
                        entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
                        entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
                        entries.add(ModBlocks.SMOOTH_BASALT_WALL);
                        entries.add(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_BASALT_BUTTON);
                        entries.add(ModBlocks.POLISHED_BASALT_STAIRS);
                        entries.add(ModBlocks.POLISHED_BASALT_SLAB);
                        entries.add(ModBlocks.POLISHED_BASALT_WALL);
                        entries.add(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_BASALT_BUTTON);


                        // Blackstone Blocks
                        entries.add(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACKSTONE_BUTTON);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_STAIRS);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_SLAB);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_WALL);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GILDED_BLACKSTONE_BUTTON);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON);


                        // Endstone Blocks
                        entries.add(ModBlocks.END_STONE_STAIRS);
                        entries.add(ModBlocks.END_STONE_SLAB);
                        entries.add(ModBlocks.END_STONE_WALL);
                        entries.add(ModBlocks.END_STONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.END_STONE_BUTTON);
                        entries.add(ModBlocks.END_STONE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.END_STONE_BRICK_BUTTON);


                        // Purpur Blocks
                        entries.add(ModBlocks.PURPUR_WALL);
                        entries.add(ModBlocks.PURPUR_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPUR_BUTTON);


                        // Iron Blocks
                        entries.add(ModBlocks.IRON_STAIRS);
                        entries.add(ModBlocks.IRON_SLAB);
                        entries.add(ModBlocks.IRON_WALL);
                        entries.add(ModBlocks.IRON_BUTTON);

                        entries.add(ModBlocks.IRON_BAR_GATE);


                        // Gold Blocks
                        entries.add(ModBlocks.GOLD_STAIRS);
                        entries.add(ModBlocks.GOLD_SLAB);
                        entries.add(ModBlocks.GOLD_WALL);
                        entries.add(ModBlocks.GOLD_BUTTON);


                        // Emerald Blocks
                        entries.add(ModBlocks.EMERALD_STAIRS);
                        entries.add(ModBlocks.EMERALD_SLAB);
                        entries.add(ModBlocks.EMERALD_WALL);
                        entries.add(ModBlocks.EMERALD_PRESSURE_PLATE);
                        entries.add(ModBlocks.EMERALD_BUTTON);


                        // Lapis Lazuli Blocks
                        entries.add(ModBlocks.LAPIS_STAIRS);
                        entries.add(ModBlocks.LAPIS_SLAB);
                        entries.add(ModBlocks.LAPIS_WALL);
                        entries.add(ModBlocks.LAPIS_PRESSURE_PLATE);
                        entries.add(ModBlocks.LAPIS_BUTTON);


                        // Diamond Blocks
                        entries.add(ModBlocks.DIAMOND_STAIRS);
                        entries.add(ModBlocks.DIAMOND_SLAB);
                        entries.add(ModBlocks.DIAMOND_WALL);
                        entries.add(ModBlocks.DIAMOND_PRESSURE_PLATE);
                        entries.add(ModBlocks.DIAMOND_BUTTON);


                        // Netherite Blocks
                        entries.add(ModBlocks.NETHERITE_STAIRS);
                        entries.add(ModBlocks.NETHERITE_SLAB);
                        entries.add(ModBlocks.NETHERITE_WALL);
                        entries.add(ModBlocks.NETHERITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.NETHERITE_BUTTON);


                        // Quartz Blocks -- [ Here be Broken Blocks ]
                        entries.add(ModBlocks.QUARTZ_WALL);
                        entries.add(ModBlocks.QUARTZ_PRESSURE_PLATE);
                        entries.add(ModBlocks.QUARTZ_BUTTON);
                        entries.add(ModBlocks.QUARTZ_BRICK_STAIRS);
                        entries.add(ModBlocks.QUARTZ_BRICK_SLAB);
                        entries.add(ModBlocks.QUARTZ_BRICK_WALL);
                        entries.add(ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.QUARTZ_BRICK_BUTTON);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_WALL);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_BUTTON);


                        // Amethyst Blocks
                        entries.add(ModBlocks.AMETHYST_STAIRS);
                        entries.add(ModBlocks.AMETHYST_SLAB);
                        entries.add(ModBlocks.AMETHYST_WALL);
                        entries.add(ModBlocks.AMETHYST_PRESSURE_PLATE);
                        entries.add(ModBlocks.AMETHYST_BUTTON);


                        // ++ Colored Blocks Category ++


                        // Concrete Blocks
                        entries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.WHITE_CONCRETE_SLAB);
                        entries.add(ModBlocks.WHITE_CONCRETE_WALL);
                        entries.add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_CONCRETE_BUTTON);

                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);

                        entries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.GRAY_CONCRETE_WALL);
                        entries.add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_CONCRETE_BUTTON);

                        entries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLACK_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLACK_CONCRETE_WALL);
                        entries.add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_CONCRETE_BUTTON);

                        entries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BROWN_CONCRETE_SLAB);
                        entries.add(ModBlocks.BROWN_CONCRETE_WALL);
                        entries.add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_CONCRETE_BUTTON);

                        entries.add(ModBlocks.RED_CONCRETE_STAIRS);
                        entries.add(ModBlocks.RED_CONCRETE_SLAB);
                        entries.add(ModBlocks.RED_CONCRETE_WALL);
                        entries.add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_CONCRETE_BUTTON);

                        entries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
                        entries.add(ModBlocks.ORANGE_CONCRETE_WALL);
                        entries.add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_BUTTON);

                        entries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        entries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
                        entries.add(ModBlocks.YELLOW_CONCRETE_WALL);
                        entries.add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_BUTTON);

                        entries.add(ModBlocks.LIME_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIME_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIME_CONCRETE_WALL);
                        entries.add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_CONCRETE_BUTTON);

                        entries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GREEN_CONCRETE_SLAB);
                        entries.add(ModBlocks.GREEN_CONCRETE_WALL);
                        entries.add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_CONCRETE_BUTTON);

                        entries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.CYAN_CONCRETE_SLAB);
                        entries.add(ModBlocks.CYAN_CONCRETE_WALL);
                        entries.add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_CONCRETE_BUTTON);

                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);

                        entries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLUE_CONCRETE_WALL);
                        entries.add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_CONCRETE_BUTTON);

                        entries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
                        entries.add(ModBlocks.PURPLE_CONCRETE_WALL);
                        entries.add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_BUTTON);

                        entries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_WALL);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_BUTTON);

                        entries.add(ModBlocks.PINK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PINK_CONCRETE_SLAB);
                        entries.add(ModBlocks.PINK_CONCRETE_WALL);
                        entries.add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_CONCRETE_BUTTON);

                        entries.add(ModBlocks.WHITE_CONCRETE_TILES);
                        entries.add(ModBlocks.WHITE_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.WHITE_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.WHITE_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.WHITE_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TILES);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.GRAY_CONCRETE_TILES);
                        entries.add(ModBlocks.GRAY_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.GRAY_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.GRAY_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.GRAY_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.BLACK_CONCRETE_TILES);
                        entries.add(ModBlocks.BLACK_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.BLACK_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.BLACK_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.BLACK_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.BROWN_CONCRETE_TILES);
                        entries.add(ModBlocks.BROWN_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.BROWN_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.BROWN_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.BROWN_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.RED_CONCRETE_TILES);
                        entries.add(ModBlocks.RED_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.RED_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.RED_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.RED_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.ORANGE_CONCRETE_TILES);
                        entries.add(ModBlocks.ORANGE_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.ORANGE_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.ORANGE_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.ORANGE_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.YELLOW_CONCRETE_TILES);
                        entries.add(ModBlocks.YELLOW_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.YELLOW_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.YELLOW_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.YELLOW_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.LIME_CONCRETE_TILES);
                        entries.add(ModBlocks.LIME_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.LIME_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.LIME_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.LIME_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.GREEN_CONCRETE_TILES);
                        entries.add(ModBlocks.GREEN_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.GREEN_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.GREEN_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.GREEN_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.CYAN_CONCRETE_TILES);
                        entries.add(ModBlocks.CYAN_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.CYAN_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.CYAN_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.CYAN_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TILES);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.BLUE_CONCRETE_TILES);
                        entries.add(ModBlocks.BLUE_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.BLUE_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.BLUE_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.BLUE_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.PURPLE_CONCRETE_TILES);
                        entries.add(ModBlocks.PURPLE_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.PURPLE_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.PURPLE_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.PURPLE_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.MAGENTA_CONCRETE_TILES);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_TILE_BUTTON);

                        entries.add(ModBlocks.PINK_CONCRETE_TILES);
                        entries.add(ModBlocks.PINK_CONCRETE_TILE_STAIRS);
                        entries.add(ModBlocks.PINK_CONCRETE_TILE_SLAB);
                        entries.add(ModBlocks.PINK_CONCRETE_TILE_WALL);
                        entries.add(ModBlocks.PINK_CONCRETE_TILE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_CONCRETE_TILE_BUTTON);


                        // Terracotta Blocks
                        entries.add(ModBlocks.TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.TERRACOTTA_SLAB);
                        entries.add(ModBlocks.TERRACOTTA_WALL);
                        entries.add(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_WALL);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.RED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_TERRACOTTA_WALL);
                        entries.add(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_WALL);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_WALL);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_WALL);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_WALL);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_WALL);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);

                        entries.add(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_TERRACOTTA_WALL);
                        entries.add(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_TERRACOTTA_BUTTON);


                        // Wool Blocks -- Add custom block set type
                        entries.add(ModBlocks.WHITE_WOOL_STAIRS);
                        entries.add(ModBlocks.WHITE_WOOL_SLAB);
                        entries.add(ModBlocks.WHITE_WOOL_WALL);
                        entries.add(ModBlocks.WHITE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_WOOL_BUTTON);

                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_WALL);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_BUTTON);

                        entries.add(ModBlocks.GRAY_WOOL_STAIRS);
                        entries.add(ModBlocks.GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.GRAY_WOOL_WALL);
                        entries.add(ModBlocks.GRAY_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_WOOL_BUTTON);

                        entries.add(ModBlocks.BLACK_WOOL_STAIRS);
                        entries.add(ModBlocks.BLACK_WOOL_SLAB);
                        entries.add(ModBlocks.BLACK_WOOL_WALL);
                        entries.add(ModBlocks.BLACK_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_WOOL_BUTTON);

                        entries.add(ModBlocks.BROWN_WOOL_STAIRS);
                        entries.add(ModBlocks.BROWN_WOOL_SLAB);
                        entries.add(ModBlocks.BROWN_WOOL_WALL);
                        entries.add(ModBlocks.BROWN_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_WOOL_BUTTON);

                        entries.add(ModBlocks.RED_WOOL_STAIRS);
                        entries.add(ModBlocks.RED_WOOL_SLAB);
                        entries.add(ModBlocks.RED_WOOL_WALL);
                        entries.add(ModBlocks.RED_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_WOOL_BUTTON);

                        entries.add(ModBlocks.ORANGE_WOOL_STAIRS);
                        entries.add(ModBlocks.ORANGE_WOOL_SLAB);
                        entries.add(ModBlocks.ORANGE_WOOL_WALL);
                        entries.add(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_WOOL_BUTTON);

                        entries.add(ModBlocks.YELLOW_WOOL_STAIRS);
                        entries.add(ModBlocks.YELLOW_WOOL_SLAB);
                        entries.add(ModBlocks.YELLOW_WOOL_WALL);
                        entries.add(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_WOOL_BUTTON);

                        entries.add(ModBlocks.LIME_WOOL_STAIRS);
                        entries.add(ModBlocks.LIME_WOOL_SLAB);
                        entries.add(ModBlocks.LIME_WOOL_WALL);
                        entries.add(ModBlocks.LIME_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_WOOL_BUTTON);

                        entries.add(ModBlocks.GREEN_WOOL_STAIRS);
                        entries.add(ModBlocks.GREEN_WOOL_SLAB);
                        entries.add(ModBlocks.GREEN_WOOL_WALL);
                        entries.add(ModBlocks.GREEN_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_WOOL_BUTTON);

                        entries.add(ModBlocks.CYAN_WOOL_STAIRS);
                        entries.add(ModBlocks.CYAN_WOOL_SLAB);
                        entries.add(ModBlocks.CYAN_WOOL_WALL);
                        entries.add(ModBlocks.CYAN_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_WOOL_BUTTON);

                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_WALL);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_BUTTON);

                        entries.add(ModBlocks.BLUE_WOOL_STAIRS);
                        entries.add(ModBlocks.BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.BLUE_WOOL_WALL);
                        entries.add(ModBlocks.BLUE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_WOOL_BUTTON);

                        entries.add(ModBlocks.PURPLE_WOOL_STAIRS);
                        entries.add(ModBlocks.PURPLE_WOOL_SLAB);
                        entries.add(ModBlocks.PURPLE_WOOL_WALL);
                        entries.add(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_WOOL_BUTTON);

                        entries.add(ModBlocks.MAGENTA_WOOL_STAIRS);
                        entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
                        entries.add(ModBlocks.MAGENTA_WOOL_WALL);
                        entries.add(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_WOOL_BUTTON);

                        entries.add(ModBlocks.PINK_WOOL_STAIRS);
                        entries.add(ModBlocks.PINK_WOOL_SLAB);
                        entries.add(ModBlocks.PINK_WOOL_WALL);
                        entries.add(ModBlocks.PINK_WOOL_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_WOOL_BUTTON);
                    }).build());

    // Registries
    public static void registerItemGroups() {
        CozyConvenience.LOGGER.info("Registering Item Groups for " + CozyConvenience.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            // Pillar Blocks
            entries.addAfter(Items.CHISELED_STONE_BRICKS,
                    ModBlocks.STONE_COLUMN,
                    ModBlocks.CRACKED_STONE_COLUMN,
                    ModBlocks.MOSSY_STONE_COLUMN
            );

            entries.addAfter(Items.IRON_BARS,
                    ModBlocks.IRON_BAR_GATE
            );

            entries.addAfter(Items.OAK_SLAB,
                    ModBlocks.OAK_WALL
            );
            entries.addAfter(Items.SPRUCE_SLAB,
                    ModBlocks.SPRUCE_WALL
            );
            entries.addAfter(Items.BIRCH_SLAB,
                    ModBlocks.BIRCH_WALL
            );
            entries.addAfter(Items.JUNGLE_SLAB,
                    ModBlocks.JUNGLE_WALL
            );
            entries.addAfter(Items.ACACIA_SLAB,
                    ModBlocks.ACACIA_WALL
            );
            entries.addAfter(Items.DARK_OAK_SLAB,
                    ModBlocks.DARK_OAK_WALL
            );
            entries.addAfter(Items.MANGROVE_SLAB,
                    ModBlocks.MANGROVE_WALL
            );
            entries.addAfter(Items.CHERRY_SLAB,
                    ModBlocks.CHERRY_WALL
            );
            entries.addAfter(Items.BAMBOO_SLAB,
                    ModBlocks.BAMBOO_WALL
            );
            entries.addAfter(Items.BAMBOO_MOSAIC_SLAB,
                    ModBlocks.BAMBOO_MOSAIC_WALL
            );
            entries.addAfter(Items.CRIMSON_SLAB,
                    ModBlocks.CRIMSON_WALL
            );
            entries.addAfter(Items.WARPED_SLAB,
                    ModBlocks.WARPED_WALL
            );
            entries.addAfter(Items.STONE_SLAB,
                    ModBlocks.STONE_WALL
            );
            entries.addAfter(Items.COBBLESTONE_WALL,
                    ModBlocks.COBBLESTONE_PRESSURE_PLATE,
                    ModBlocks.COBBLESTONE_BUTTON
            );
            entries.addAfter(Items.MOSSY_COBBLESTONE_WALL,
                    ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE,
                    ModBlocks.MOSSY_COBBLESTONE_BUTTON
            );
            entries.addAfter(Items.SMOOTH_STONE_SLAB,
                    ModBlocks.SMOOTH_STONE_STAIRS,
                    ModBlocks.SMOOTH_STONE_PRESSURE_PLATE,
                    ModBlocks.SMOOTH_STONE_BUTTON,
                    ModBlocks.SMOOTH_STONE_WALL
            );
            entries.addAfter(Items.STONE_BRICK_WALL,
                    ModBlocks.STONE_BRICK_PRESSURE_PLATE,
                    ModBlocks.STONE_BRICK_BUTTON
            );
            entries.addAfter(Items.CRACKED_STONE_BRICKS,
                    ModBlocks.CRACKED_STONE_BRICK_STAIRS,
                    ModBlocks.CRACKED_STONE_BRICK_SLAB,
                    ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE,
                    ModBlocks.CRACKED_STONE_BRICK_BUTTON,
                    ModBlocks.CRACKED_STONE_BRICK_WALL
            );
            entries.addAfter(Items.MOSSY_STONE_BRICK_WALL,
                    ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE,
                    ModBlocks.MOSSY_STONE_BRICK_BUTTON
            );
            entries.addAfter(Items.GRANITE_WALL,
                    ModBlocks.GRANITE_PRESSURE_PLATE,
                    ModBlocks.GRANITE_BUTTON
            );
            entries.addAfter(Items.POLISHED_GRANITE_SLAB,
                    ModBlocks.POLISHED_GRANITE_WALL,
                    ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE,
                    ModBlocks.POLISHED_GRANITE_BUTTON
            );
            entries.addAfter(Items.DIORITE_WALL,
                    ModBlocks.DIORITE_PRESSURE_PLATE,
                    ModBlocks.DIORITE_BUTTON
            );
            entries.addAfter(Items.POLISHED_DIORITE_SLAB,
                    ModBlocks.POLISHED_DIORITE_WALL,
                    ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE,
                    ModBlocks.POLISHED_DIORITE_BUTTON
            );
            entries.addAfter(Items.ANDESITE_WALL,
                    ModBlocks.ANDESITE_PRESSURE_PLATE,
                    ModBlocks.ANDESITE_BUTTON
            );
            entries.addAfter(Items.POLISHED_ANDESITE_SLAB,
                    ModBlocks.POLISHED_ANDESITE_WALL,
                    ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE,
                    ModBlocks.POLISHED_ANDESITE_BUTTON
            );
            entries.addAfter(Items.DEEPSLATE,
                    ModBlocks.DEEPSLATE_STAIRS,
                    ModBlocks.DEEPSLATE_SLAB,
                    ModBlocks.DEEPSLATE_WALL,
                    ModBlocks.DEEPSLATE_PRESSURE_PLATE,
                    ModBlocks.DEEPSLATE_BUTTON
            );
            entries.addAfter(Items.COBBLED_DEEPSLATE_WALL,
                    ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE,
                    ModBlocks.COBBLED_DEEPSLATE_BUTTON
            );
            entries.addAfter(Items.POLISHED_DEEPSLATE_WALL,
                    ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE,
                    ModBlocks.POLISHED_DEEPSLATE_BUTTON
            );
            entries.addAfter(Items.DEEPSLATE_BRICK_WALL,
                    ModBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE,
                    ModBlocks.DEEPSLATE_BRICK_BUTTON
            );
            entries.addAfter(Items.CRACKED_DEEPSLATE_BRICKS,
                    ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS,
                    ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB,
                    ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
                    ModBlocks.CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE,
                    ModBlocks.CRACKED_DEEPSLATE_BRICK_BUTTON
            );
            entries.addAfter(Items.DEEPSLATE_TILE_WALL,
                    ModBlocks.DEEPSLATE_TILE_PRESSURE_PLATE,
                    ModBlocks.DEEPSLATE_TILE_BUTTON
            );
            entries.addAfter(Items.CRACKED_DEEPSLATE_TILES,
                    ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS,
                    ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB,
                    ModBlocks.CRACKED_DEEPSLATE_TILE_WALL,
                    ModBlocks.CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE,
                    ModBlocks.CRACKED_DEEPSLATE_TILE_BUTTON
            );
            entries.addAfter(Items.TUFF_WALL,
                    ModBlocks.TUFF_PRESSURE_PLATE,
                    ModBlocks.TUFF_BUTTON
            );
            entries.addAfter(Items.POLISHED_TUFF_WALL,
                    ModBlocks.POLISHED_TUFF_PRESSURE_PLATE,
                    ModBlocks.POLISHED_TUFF_BUTTON
            );
            entries.addAfter(Items.TUFF_BRICK_WALL,
                    ModBlocks.TUFF_BRICK_PRESSURE_PLATE,
                    ModBlocks.TUFF_BRICK_BUTTON
            );
            entries.addAfter(Items.BRICK_WALL,
                    ModBlocks.BRICK_PRESSURE_PLATE,
                    ModBlocks.BRICK_BUTTON
            );
            entries.addAfter(Items.PACKED_MUD,
                    ModBlocks.PACKED_MUD_STAIRS,
                    ModBlocks.PACKED_MUD_SLAB,
                    ModBlocks.PACKED_MUD_WALL,
                    ModBlocks.PACKED_MUD_PRESSURE_PLATE,
                    ModBlocks.PACKED_MUD_BUTTON
            );
            entries.addAfter(Items.MUD_BRICK_WALL,
                    ModBlocks.MUD_BRICK_PRESSURE_PLATE,
                    ModBlocks.MUD_BRICK_BUTTON
            );
            entries.addAfter(Items.PRISMARINE_WALL,
                    ModBlocks.PRISMARINE_PRESSURE_PLATE,
                    ModBlocks.PRISMARINE_BUTTON
            );
            entries.addAfter(Items.PRISMARINE_BRICK_SLAB,
                    ModBlocks.PRISMARINE_BRICK_WALL,
                    ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE,
                    ModBlocks.PRISMARINE_BRICK_BUTTON
            );
            entries.addAfter(Items.DARK_PRISMARINE_SLAB,
                    ModBlocks.DARK_PRISMARINE_WALL,
                    ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE,
                    ModBlocks.DARK_PRISMARINE_BUTTON
            );
            entries.addAfter(Items.NETHERRACK,
                    ModBlocks.NETHERRACK_STAIRS,
                    ModBlocks.NETHERRACK_SLAB,
                    ModBlocks.NETHERRACK_WALL,
                    ModBlocks.NETHERRACK_PRESSURE_PLATE,
                    ModBlocks.NETHERRACK_BUTTON
            );
            entries.addAfter(Items.NETHER_BRICK_WALL,
                    ModBlocks.NETHER_BRICK_PRESSURE_PLATE,
                    ModBlocks.NETHER_BRICK_BUTTON
            );
            entries.addAfter(Items.CRACKED_NETHER_BRICKS,
                    ModBlocks.CRACKED_NETHER_BRICK_STAIRS,
                    ModBlocks.CRACKED_NETHER_BRICK_SLAB,
                    ModBlocks.CRACKED_NETHER_BRICK_WALL,
                    ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE,
                    ModBlocks.CRACKED_NETHER_BRICK_BUTTON
            );
            entries.addAfter(Items.RED_NETHER_BRICK_WALL,
                    ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE,
                    ModBlocks.RED_NETHER_BRICK_BUTTON
            );
            entries.addAfter(Items.BLACKSTONE_WALL,
                    ModBlocks.BLACKSTONE_PRESSURE_PLATE,
                    ModBlocks.BLACKSTONE_BUTTON
            );
            entries.addAfter(Items.GILDED_BLACKSTONE,
                    ModBlocks.GILDED_BLACKSTONE_STAIRS,
                    ModBlocks.GILDED_BLACKSTONE_SLAB,
                    ModBlocks.GILDED_BLACKSTONE_WALL,
                    ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE,
                    ModBlocks.GILDED_BLACKSTONE_BUTTON
            );
            entries.addAfter(Items.POLISHED_BLACKSTONE_BRICK_WALL,
                    ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE,
                    ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON
            );
            entries.addAfter(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                    ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS,
                    ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
                    ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
                    ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE,
                    ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON
            );
            entries.addAfter(Items.END_STONE,
                    ModBlocks.END_STONE_STAIRS,
                    ModBlocks.END_STONE_SLAB,
                    ModBlocks.END_STONE_WALL,
                    ModBlocks.END_STONE_PRESSURE_PLATE,
                    ModBlocks.END_STONE_BUTTON
            );
            entries.addAfter(Items.END_STONE_BRICK_WALL,
                    ModBlocks.END_STONE_BRICK_PRESSURE_PLATE,
                    ModBlocks.END_STONE_BRICK_BUTTON
            );
            entries.addAfter(Items.PURPUR_SLAB,
                    ModBlocks.PURPUR_WALL,
                    ModBlocks.PURPUR_PRESSURE_PLATE,
                    ModBlocks.PURPUR_BUTTON
            );
            entries.addAfter(Items.IRON_BLOCK,
                    ModBlocks.IRON_STAIRS,
                    ModBlocks.IRON_SLAB,
                    ModBlocks.IRON_WALL,
                    ModBlocks.IRON_BUTTON
            );
            entries.addAfter(Items.GOLD_BLOCK,
                    ModBlocks.GOLD_STAIRS,
                    ModBlocks.GOLD_SLAB,
                    ModBlocks.GOLD_WALL,
                    ModBlocks.GOLD_BUTTON
            );
            entries.addAfter(Items.EMERALD_BLOCK,
                    ModBlocks.EMERALD_STAIRS,
                    ModBlocks.EMERALD_SLAB,
                    ModBlocks.EMERALD_WALL,
                    ModBlocks.EMERALD_PRESSURE_PLATE,
                    ModBlocks.EMERALD_BUTTON
            );
            entries.addAfter(Items.LAPIS_BLOCK,
                    ModBlocks.LAPIS_STAIRS,
                    ModBlocks.LAPIS_SLAB,
                    ModBlocks.LAPIS_WALL,
                    ModBlocks.LAPIS_PRESSURE_PLATE,
                    ModBlocks.LAPIS_BUTTON
            );
            entries.addAfter(Items.DIAMOND_BLOCK,
                    ModBlocks.DIAMOND_STAIRS,
                    ModBlocks.DIAMOND_SLAB,
                    ModBlocks.DIAMOND_WALL,
                    ModBlocks.DIAMOND_PRESSURE_PLATE,
                    ModBlocks.DIAMOND_BUTTON
            );
            entries.addAfter(Items.NETHERITE_BLOCK,
                    ModBlocks.NETHERITE_STAIRS,
                    ModBlocks.NETHERITE_SLAB,
                    ModBlocks.NETHERITE_WALL,
                    ModBlocks.NETHERITE_PRESSURE_PLATE,
                    ModBlocks.NETHERITE_BUTTON
            );

            entries.addAfter(Items.AMETHYST_BLOCK,
                    ModBlocks.AMETHYST_STAIRS,
                    ModBlocks.AMETHYST_SLAB,
                    ModBlocks.AMETHYST_WALL,
                    ModBlocks.AMETHYST_PRESSURE_PLATE,
                    ModBlocks.AMETHYST_BUTTON
            );

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {

            // Concrete Blocks
            entries.addAfter(Blocks.PINK_CONCRETE,
                    ModBlocks.WHITE_CONCRETE_STAIRS,
                    ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS,
                    ModBlocks.GRAY_CONCRETE_STAIRS,
                    ModBlocks.BLACK_CONCRETE_STAIRS,
                    ModBlocks.BROWN_CONCRETE_STAIRS,
                    ModBlocks.RED_CONCRETE_STAIRS,
                    ModBlocks.ORANGE_CONCRETE_STAIRS,
                    ModBlocks.YELLOW_CONCRETE_STAIRS,
                    ModBlocks.LIME_CONCRETE_STAIRS,
                    ModBlocks.GREEN_CONCRETE_STAIRS,
                    ModBlocks.CYAN_CONCRETE_STAIRS,
                    ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS,
                    ModBlocks.BLUE_CONCRETE_STAIRS,
                    ModBlocks.PURPLE_CONCRETE_STAIRS,
                    ModBlocks.MAGENTA_CONCRETE_STAIRS,
                    ModBlocks.PINK_CONCRETE_STAIRS
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_STAIRS,
                    ModBlocks.WHITE_CONCRETE_SLAB,
                    ModBlocks.LIGHT_GRAY_CONCRETE_SLAB,
                    ModBlocks.GRAY_CONCRETE_SLAB,
                    ModBlocks.BLACK_CONCRETE_SLAB,
                    ModBlocks.BROWN_CONCRETE_SLAB,
                    ModBlocks.RED_CONCRETE_SLAB,
                    ModBlocks.ORANGE_CONCRETE_SLAB,
                    ModBlocks.YELLOW_CONCRETE_SLAB,
                    ModBlocks.LIME_CONCRETE_SLAB,
                    ModBlocks.GREEN_CONCRETE_SLAB,
                    ModBlocks.CYAN_CONCRETE_SLAB,
                    ModBlocks.LIGHT_BLUE_CONCRETE_SLAB,
                    ModBlocks.BLUE_CONCRETE_SLAB,
                    ModBlocks.PURPLE_CONCRETE_SLAB,
                    ModBlocks.MAGENTA_CONCRETE_SLAB,
                    ModBlocks.PINK_CONCRETE_SLAB
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_SLAB,
                    ModBlocks.WHITE_CONCRETE_WALL,
                    ModBlocks.LIGHT_GRAY_CONCRETE_WALL,
                    ModBlocks.GRAY_CONCRETE_WALL,
                    ModBlocks.BLACK_CONCRETE_WALL,
                    ModBlocks.BROWN_CONCRETE_WALL,
                    ModBlocks.RED_CONCRETE_WALL,
                    ModBlocks.ORANGE_CONCRETE_WALL,
                    ModBlocks.YELLOW_CONCRETE_WALL,
                    ModBlocks.LIME_CONCRETE_WALL,
                    ModBlocks.GREEN_CONCRETE_WALL,
                    ModBlocks.CYAN_CONCRETE_WALL,
                    ModBlocks.LIGHT_BLUE_CONCRETE_WALL,
                    ModBlocks.BLUE_CONCRETE_WALL,
                    ModBlocks.PURPLE_CONCRETE_WALL,
                    ModBlocks.MAGENTA_CONCRETE_WALL,
                    ModBlocks.PINK_CONCRETE_WALL
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_WALL,
                    ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.RED_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.LIME_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.PINK_CONCRETE_PRESSURE_PLATE
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE,
                    ModBlocks.WHITE_CONCRETE_BUTTON,
                    ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON,
                    ModBlocks.GRAY_CONCRETE_BUTTON,
                    ModBlocks.BLACK_CONCRETE_BUTTON,
                    ModBlocks.BROWN_CONCRETE_BUTTON,
                    ModBlocks.RED_CONCRETE_BUTTON,
                    ModBlocks.ORANGE_CONCRETE_BUTTON,
                    ModBlocks.YELLOW_CONCRETE_BUTTON,
                    ModBlocks.LIME_CONCRETE_BUTTON,
                    ModBlocks.GREEN_CONCRETE_BUTTON,
                    ModBlocks.CYAN_CONCRETE_BUTTON,
                    ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON,
                    ModBlocks.BLUE_CONCRETE_BUTTON,
                    ModBlocks.PURPLE_CONCRETE_BUTTON,
                    ModBlocks.MAGENTA_CONCRETE_BUTTON,
                    ModBlocks.PINK_CONCRETE_BUTTON
            );

            entries.addAfter(ModBlocks.PINK_CONCRETE_BUTTON,
                    ModBlocks.WHITE_CONCRETE_TILES,
                    ModBlocks.LIGHT_GRAY_CONCRETE_TILES,
                    ModBlocks.GRAY_CONCRETE_TILES,
                    ModBlocks.BLACK_CONCRETE_TILES,
                    ModBlocks.BROWN_CONCRETE_TILES,
                    ModBlocks.RED_CONCRETE_TILES,
                    ModBlocks.ORANGE_CONCRETE_TILES,
                    ModBlocks.YELLOW_CONCRETE_TILES,
                    ModBlocks.LIME_CONCRETE_TILES,
                    ModBlocks.GREEN_CONCRETE_TILES,
                    ModBlocks.CYAN_CONCRETE_TILES,
                    ModBlocks.LIGHT_BLUE_CONCRETE_TILES,
                    ModBlocks.BLUE_CONCRETE_TILES,
                    ModBlocks.PURPLE_CONCRETE_TILES,
                    ModBlocks.MAGENTA_CONCRETE_TILES,
                    ModBlocks.PINK_CONCRETE_TILES
            );

            entries.addAfter(ModBlocks.PINK_CONCRETE_TILES,
                    ModBlocks.WHITE_CONCRETE_TILE_STAIRS,
                    ModBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS,
                    ModBlocks.GRAY_CONCRETE_TILE_STAIRS,
                    ModBlocks.BLACK_CONCRETE_TILE_STAIRS,
                    ModBlocks.BROWN_CONCRETE_TILE_STAIRS,
                    ModBlocks.RED_CONCRETE_TILE_STAIRS,
                    ModBlocks.ORANGE_CONCRETE_TILE_STAIRS,
                    ModBlocks.YELLOW_CONCRETE_TILE_STAIRS,
                    ModBlocks.LIME_CONCRETE_TILE_STAIRS,
                    ModBlocks.GREEN_CONCRETE_TILE_STAIRS,
                    ModBlocks.CYAN_CONCRETE_TILE_STAIRS,
                    ModBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS,
                    ModBlocks.BLUE_CONCRETE_TILE_STAIRS,
                    ModBlocks.PURPLE_CONCRETE_TILE_STAIRS,
                    ModBlocks.MAGENTA_CONCRETE_TILE_STAIRS,
                    ModBlocks.PINK_CONCRETE_TILE_STAIRS
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_TILE_STAIRS,
                    ModBlocks.WHITE_CONCRETE_TILE_SLAB,
                    ModBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB,
                    ModBlocks.GRAY_CONCRETE_TILE_SLAB,
                    ModBlocks.BLACK_CONCRETE_TILE_SLAB,
                    ModBlocks.BROWN_CONCRETE_TILE_SLAB,
                    ModBlocks.RED_CONCRETE_TILE_SLAB,
                    ModBlocks.ORANGE_CONCRETE_TILE_SLAB,
                    ModBlocks.YELLOW_CONCRETE_TILE_SLAB,
                    ModBlocks.LIME_CONCRETE_TILE_SLAB,
                    ModBlocks.GREEN_CONCRETE_TILE_SLAB,
                    ModBlocks.CYAN_CONCRETE_TILE_SLAB,
                    ModBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB,
                    ModBlocks.BLUE_CONCRETE_TILE_SLAB,
                    ModBlocks.PURPLE_CONCRETE_TILE_SLAB,
                    ModBlocks.MAGENTA_CONCRETE_TILE_SLAB,
                    ModBlocks.PINK_CONCRETE_TILE_SLAB
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_TILE_SLAB,
                    ModBlocks.WHITE_CONCRETE_TILE_WALL,
                    ModBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL,
                    ModBlocks.GRAY_CONCRETE_TILE_WALL,
                    ModBlocks.BLACK_CONCRETE_TILE_WALL,
                    ModBlocks.BROWN_CONCRETE_TILE_WALL,
                    ModBlocks.RED_CONCRETE_TILE_WALL,
                    ModBlocks.ORANGE_CONCRETE_TILE_WALL,
                    ModBlocks.YELLOW_CONCRETE_TILE_WALL,
                    ModBlocks.LIME_CONCRETE_TILE_WALL,
                    ModBlocks.GREEN_CONCRETE_TILE_WALL,
                    ModBlocks.CYAN_CONCRETE_TILE_WALL,
                    ModBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL,
                    ModBlocks.BLUE_CONCRETE_TILE_WALL,
                    ModBlocks.PURPLE_CONCRETE_TILE_WALL,
                    ModBlocks.MAGENTA_CONCRETE_TILE_WALL,
                    ModBlocks.PINK_CONCRETE_TILE_WALL
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_TILE_WALL,
                    ModBlocks.WHITE_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.LIGHT_GRAY_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.GRAY_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.BLACK_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.BROWN_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.RED_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.ORANGE_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.YELLOW_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.LIME_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.GREEN_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.CYAN_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.LIGHT_BLUE_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.BLUE_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.PURPLE_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.MAGENTA_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.PINK_CONCRETE_TILE_PRESSURE_PLATE
            );
            entries.addAfter(ModBlocks.PINK_CONCRETE_TILE_PRESSURE_PLATE,
                    ModBlocks.WHITE_CONCRETE_TILE_BUTTON,
                    ModBlocks.LIGHT_GRAY_CONCRETE_TILE_BUTTON,
                    ModBlocks.GRAY_CONCRETE_TILE_BUTTON,
                    ModBlocks.BLACK_CONCRETE_TILE_BUTTON,
                    ModBlocks.BROWN_CONCRETE_TILE_BUTTON,
                    ModBlocks.RED_CONCRETE_TILE_BUTTON,
                    ModBlocks.ORANGE_CONCRETE_TILE_BUTTON,
                    ModBlocks.YELLOW_CONCRETE_TILE_BUTTON,
                    ModBlocks.LIME_CONCRETE_TILE_BUTTON,
                    ModBlocks.GREEN_CONCRETE_TILE_BUTTON,
                    ModBlocks.CYAN_CONCRETE_TILE_BUTTON,
                    ModBlocks.LIGHT_BLUE_CONCRETE_TILE_BUTTON,
                    ModBlocks.BLUE_CONCRETE_TILE_BUTTON,
                    ModBlocks.PURPLE_CONCRETE_TILE_BUTTON,
                    ModBlocks.MAGENTA_CONCRETE_TILE_BUTTON,
                    ModBlocks.PINK_CONCRETE_TILE_BUTTON
            );

            // Terracotta Blocks
            entries.addAfter(Items.PINK_TERRACOTTA,
                    ModBlocks.TERRACOTTA_STAIRS,
                    ModBlocks.WHITE_TERRACOTTA_STAIRS,
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS,
                    ModBlocks.GRAY_TERRACOTTA_STAIRS,
                    ModBlocks.BLACK_TERRACOTTA_STAIRS,
                    ModBlocks.BROWN_TERRACOTTA_STAIRS,
                    ModBlocks.RED_TERRACOTTA_STAIRS,
                    ModBlocks.ORANGE_TERRACOTTA_STAIRS,
                    ModBlocks.YELLOW_TERRACOTTA_STAIRS,
                    ModBlocks.LIME_TERRACOTTA_STAIRS,
                    ModBlocks.GREEN_TERRACOTTA_STAIRS,
                    ModBlocks.CYAN_TERRACOTTA_STAIRS,
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS,
                    ModBlocks.BLUE_TERRACOTTA_STAIRS,
                    ModBlocks.PURPLE_TERRACOTTA_STAIRS,
                    ModBlocks.MAGENTA_TERRACOTTA_STAIRS,
                    ModBlocks.PINK_TERRACOTTA_STAIRS
            );
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_STAIRS,
                    ModBlocks.TERRACOTTA_SLAB,
                    ModBlocks.WHITE_TERRACOTTA_SLAB,
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB,
                    ModBlocks.GRAY_TERRACOTTA_SLAB,
                    ModBlocks.BLACK_TERRACOTTA_SLAB,
                    ModBlocks.BROWN_TERRACOTTA_SLAB,
                    ModBlocks.RED_TERRACOTTA_SLAB,
                    ModBlocks.ORANGE_TERRACOTTA_SLAB,
                    ModBlocks.YELLOW_TERRACOTTA_SLAB,
                    ModBlocks.LIME_TERRACOTTA_SLAB,
                    ModBlocks.GREEN_TERRACOTTA_SLAB,
                    ModBlocks.CYAN_TERRACOTTA_SLAB,
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB,
                    ModBlocks.BLUE_TERRACOTTA_SLAB,
                    ModBlocks.PURPLE_TERRACOTTA_SLAB,
                    ModBlocks.MAGENTA_TERRACOTTA_SLAB,
                    ModBlocks.PINK_TERRACOTTA_SLAB
            );
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_SLAB,
                    ModBlocks.TERRACOTTA_WALL,
                    ModBlocks.WHITE_TERRACOTTA_WALL,
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL,
                    ModBlocks.GRAY_TERRACOTTA_WALL,
                    ModBlocks.BLACK_TERRACOTTA_WALL,
                    ModBlocks.BROWN_TERRACOTTA_WALL,
                    ModBlocks.RED_TERRACOTTA_WALL,
                    ModBlocks.ORANGE_TERRACOTTA_WALL,
                    ModBlocks.YELLOW_TERRACOTTA_WALL,
                    ModBlocks.LIME_TERRACOTTA_WALL,
                    ModBlocks.GREEN_TERRACOTTA_WALL,
                    ModBlocks.CYAN_TERRACOTTA_WALL,
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL,
                    ModBlocks.BLUE_TERRACOTTA_WALL,
                    ModBlocks.PURPLE_TERRACOTTA_WALL,
                    ModBlocks.MAGENTA_TERRACOTTA_WALL,
                    ModBlocks.PINK_TERRACOTTA_WALL
            );
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_WALL,
                    ModBlocks.TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE
            );
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE,
                    ModBlocks.TERRACOTTA_BUTTON,
                    ModBlocks.WHITE_TERRACOTTA_BUTTON,
                    ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON,
                    ModBlocks.GRAY_TERRACOTTA_BUTTON,
                    ModBlocks.BLACK_TERRACOTTA_BUTTON,
                    ModBlocks.BROWN_TERRACOTTA_BUTTON,
                    ModBlocks.RED_TERRACOTTA_BUTTON,
                    ModBlocks.ORANGE_TERRACOTTA_BUTTON,
                    ModBlocks.YELLOW_TERRACOTTA_BUTTON,
                    ModBlocks.LIME_TERRACOTTA_BUTTON,
                    ModBlocks.GREEN_TERRACOTTA_BUTTON,
                    ModBlocks.CYAN_TERRACOTTA_BUTTON,
                    ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON,
                    ModBlocks.BLUE_TERRACOTTA_BUTTON,
                    ModBlocks.PURPLE_TERRACOTTA_BUTTON,
                    ModBlocks.MAGENTA_TERRACOTTA_BUTTON,
                    ModBlocks.PINK_TERRACOTTA_BUTTON
            );

            // Wool Blocks
            entries.addAfter(Items.PINK_WOOL,
                    ModBlocks.WHITE_WOOL_STAIRS,
                    ModBlocks.LIGHT_GRAY_WOOL_STAIRS,
                    ModBlocks.GRAY_WOOL_STAIRS,
                    ModBlocks.BLACK_WOOL_STAIRS,
                    ModBlocks.BROWN_WOOL_STAIRS,
                    ModBlocks.RED_WOOL_STAIRS,
                    ModBlocks.ORANGE_WOOL_STAIRS,
                    ModBlocks.YELLOW_WOOL_STAIRS,
                    ModBlocks.LIME_WOOL_STAIRS,
                    ModBlocks.GREEN_WOOL_STAIRS,
                    ModBlocks.CYAN_WOOL_STAIRS,
                    ModBlocks.LIGHT_BLUE_WOOL_STAIRS,
                    ModBlocks.BLUE_WOOL_STAIRS,
                    ModBlocks.PURPLE_WOOL_STAIRS,
                    ModBlocks.MAGENTA_WOOL_STAIRS,
                    ModBlocks.PINK_WOOL_STAIRS
            );

            entries.addAfter(ModBlocks.PINK_WOOL_STAIRS,
                    ModBlocks.WHITE_WOOL_SLAB,
                    ModBlocks.LIGHT_GRAY_WOOL_SLAB,
                    ModBlocks.GRAY_WOOL_SLAB,
                    ModBlocks.BLACK_WOOL_SLAB,
                    ModBlocks.BROWN_WOOL_SLAB,
                    ModBlocks.RED_WOOL_SLAB,
                    ModBlocks.ORANGE_WOOL_SLAB,
                    ModBlocks.YELLOW_WOOL_SLAB,
                    ModBlocks.LIME_WOOL_SLAB,
                    ModBlocks.GREEN_WOOL_SLAB,
                    ModBlocks.CYAN_WOOL_SLAB,
                    ModBlocks.LIGHT_BLUE_WOOL_SLAB,
                    ModBlocks.BLUE_WOOL_SLAB,
                    ModBlocks.PURPLE_WOOL_SLAB,
                    ModBlocks.MAGENTA_WOOL_SLAB,
                    ModBlocks.PINK_WOOL_SLAB
            );
            entries.addAfter(ModBlocks.PINK_WOOL_SLAB,
                    ModBlocks.WHITE_WOOL_WALL,
                    ModBlocks.LIGHT_GRAY_WOOL_WALL,
                    ModBlocks.GRAY_WOOL_WALL,
                    ModBlocks.BLACK_WOOL_WALL,
                    ModBlocks.BROWN_WOOL_WALL,
                    ModBlocks.RED_WOOL_WALL,
                    ModBlocks.ORANGE_WOOL_WALL,
                    ModBlocks.YELLOW_WOOL_WALL,
                    ModBlocks.LIME_WOOL_WALL,
                    ModBlocks.GREEN_WOOL_WALL,
                    ModBlocks.CYAN_WOOL_WALL,
                    ModBlocks.LIGHT_BLUE_WOOL_WALL,
                    ModBlocks.BLUE_WOOL_WALL,
                    ModBlocks.PURPLE_WOOL_WALL,
                    ModBlocks.MAGENTA_WOOL_WALL,
                    ModBlocks.PINK_WOOL_WALL
            );
            entries.addAfter(ModBlocks.PINK_WOOL_WALL,
                    ModBlocks.WHITE_WOOL_PRESSURE_PLATE,
                    ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE,
                    ModBlocks.GRAY_WOOL_PRESSURE_PLATE,
                    ModBlocks.BLACK_WOOL_PRESSURE_PLATE,
                    ModBlocks.BROWN_WOOL_PRESSURE_PLATE,
                    ModBlocks.RED_WOOL_PRESSURE_PLATE,
                    ModBlocks.ORANGE_WOOL_PRESSURE_PLATE,
                    ModBlocks.YELLOW_WOOL_PRESSURE_PLATE,
                    ModBlocks.LIME_WOOL_PRESSURE_PLATE,
                    ModBlocks.GREEN_WOOL_PRESSURE_PLATE,
                    ModBlocks.CYAN_WOOL_PRESSURE_PLATE,
                    ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE,
                    ModBlocks.BLUE_WOOL_PRESSURE_PLATE,
                    ModBlocks.PURPLE_WOOL_PRESSURE_PLATE,
                    ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE,
                    ModBlocks.PINK_WOOL_PRESSURE_PLATE
            );
            entries.addAfter(ModBlocks.PINK_WOOL_PRESSURE_PLATE,
                    ModBlocks.WHITE_WOOL_BUTTON,
                    ModBlocks.LIGHT_GRAY_WOOL_BUTTON,
                    ModBlocks.GRAY_WOOL_BUTTON,
                    ModBlocks.BLACK_WOOL_BUTTON,
                    ModBlocks.BROWN_WOOL_BUTTON,
                    ModBlocks.RED_WOOL_BUTTON,
                    ModBlocks.ORANGE_WOOL_BUTTON,
                    ModBlocks.YELLOW_WOOL_BUTTON,
                    ModBlocks.LIME_WOOL_BUTTON,
                    ModBlocks.GREEN_WOOL_BUTTON,
                    ModBlocks.CYAN_WOOL_BUTTON,
                    ModBlocks.LIGHT_BLUE_WOOL_BUTTON,
                    ModBlocks.BLUE_WOOL_BUTTON,
                    ModBlocks.PURPLE_WOOL_BUTTON,
                    ModBlocks.MAGENTA_WOOL_BUTTON,
                    ModBlocks.PINK_WOOL_BUTTON
            );
        });
        }
}
