package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import pencil.cozyconvenience.block.BuildingBlocks;
import pencil.cozyconvenience.block.ColoredBlocks;
import pencil.cozyconvenience.block.NaturalBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder (BlockTags.SHOVEL_MINEABLE)
                .add(NaturalBlocks.GRASS_SLAB)
                .add(NaturalBlocks.DIRT_SLAB)
                .add(NaturalBlocks.COARSE_DIRT_SLAB)
                .add(NaturalBlocks.ROOTED_DIRT_SLAB)
                .add(NaturalBlocks.PODZOL_SLAB)
                .add(NaturalBlocks.MYCELIUM_SLAB);

        getOrCreateTagBuilder(BlockTags.NYLIUM)
                .add(NaturalBlocks.CRIMSON_NYLIUM_SLAB)
                .add(NaturalBlocks.WARPED_NYLIUM_SLAB);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(BuildingBlocks.OAK_WALL)
            .add(BuildingBlocks.SPRUCE_WALL)
            .add(BuildingBlocks.BIRCH_WALL)
            .add(BuildingBlocks.JUNGLE_WALL)
            .add(BuildingBlocks.ACACIA_WALL)
            .add(BuildingBlocks.DARK_OAK_WALL)
            .add(BuildingBlocks.MANGROVE_WALL)
            .add(BuildingBlocks.CHERRY_WALL)
            .add(BuildingBlocks.BAMBOO_WALL)
            .add(BuildingBlocks.BAMBOO_MOSAIC_WALL)
            .add(BuildingBlocks.CRIMSON_WALL)
            .add(BuildingBlocks.WARPED_WALL);


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            // Stone Blocks
            .add(BuildingBlocks.STONE_WALL)

            .add(BuildingBlocks.SMOOTH_STONE_STAIRS)
            .add(BuildingBlocks.SMOOTH_STONE_WALL)

            .add(BuildingBlocks.CRACKED_STONE_BRICK_STAIRS)
            .add(BuildingBlocks.CRACKED_STONE_BRICK_SLAB)
            .add(BuildingBlocks.CRACKED_STONE_BRICK_WALL)


            .add(BuildingBlocks.STONE_COLUMN)
            .add(BuildingBlocks.MOSSY_STONE_COLUMN)
            .add(BuildingBlocks.CRACKED_STONE_COLUMN)


            .add(BuildingBlocks.POLISHED_GRANITE_WALL)


            .add(BuildingBlocks.POLISHED_DIORITE_WALL)


            .add(BuildingBlocks.POLISHED_ANDESITE_WALL)


            .add(BuildingBlocks.DEEPSLATE_STAIRS)
            .add(BuildingBlocks.DEEPSLATE_SLAB)
            .add(BuildingBlocks.DEEPSLATE_WALL)

            .add(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS)
            .add(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB)
            .add(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL)

            .add(BuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS)
            .add(BuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB)
            .add(BuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL)


            .add(BuildingBlocks.PACKED_MUD_STAIRS)
            .add(BuildingBlocks.PACKED_MUD_SLAB)
            .add(BuildingBlocks.PACKED_MUD_WALL)


            .add(BuildingBlocks.SMOOTH_SANDSTONE_WALL)
            .add(BuildingBlocks.CUT_SANDSTONE_STAIRS)
            .add(BuildingBlocks.CUT_SANDSTONE_WALL)
            .add(BuildingBlocks.SMOOTH_RED_SANDSTONE_WALL)
            .add(BuildingBlocks.CUT_RED_SANDSTONE_STAIRS)
            .add(BuildingBlocks.CUT_RED_SANDSTONE_WALL)


            .add(BuildingBlocks.PRISMARINE_BRICK_WALL)
            .add(BuildingBlocks.DARK_PRISMARINE_WALL)


            .add(NaturalBlocks.NETHERRACK_STAIRS)
            .add(NaturalBlocks.NETHERRACK_SLAB)
            .add(NaturalBlocks.NETHERRACK_WALL)

            .add(BuildingBlocks.CRACKED_NETHER_BRICK_STAIRS)
            .add(BuildingBlocks.CRACKED_NETHER_BRICK_SLAB)
            .add(BuildingBlocks.CRACKED_NETHER_BRICK_WALL)


            .add(NaturalBlocks.CRIMSON_NYLIUM_SLAB)
            .add(NaturalBlocks.WARPED_NYLIUM_SLAB)


            .add(BuildingBlocks.BASALT_STAIRS)
            .add(BuildingBlocks.BASALT_SLAB)
            .add(BuildingBlocks.BASALT_WALL)
            .add(BuildingBlocks.SMOOTH_BASALT_STAIRS)
            .add(BuildingBlocks.SMOOTH_BASALT_SLAB)
            .add(BuildingBlocks.SMOOTH_BASALT_WALL)
            .add(BuildingBlocks.POLISHED_BASALT_STAIRS)
            .add(BuildingBlocks.POLISHED_BASALT_SLAB)
            .add(BuildingBlocks.POLISHED_BASALT_WALL)


            .add(BuildingBlocks.GILDED_BLACKSTONE_STAIRS)
            .add(BuildingBlocks.GILDED_BLACKSTONE_SLAB)
            .add(BuildingBlocks.GILDED_BLACKSTONE_WALL)
            .add(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS)
            .add(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB)
            .add(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL)


            .add(BuildingBlocks.END_STONE_STAIRS)
            .add(BuildingBlocks.END_STONE_SLAB)
            .add(BuildingBlocks.END_STONE_WALL)


            .add(BuildingBlocks.PURPUR_WALL)


            .add(BuildingBlocks.IRON_STAIRS)
            .add(BuildingBlocks.IRON_SLAB)
            .add(BuildingBlocks.IRON_WALL)
            .add(BuildingBlocks.IRON_BAR_GATE)


            .add(BuildingBlocks.GOLD_STAIRS)
            .add(BuildingBlocks.GOLD_SLAB)
            .add(BuildingBlocks.GOLD_WALL)


            .add(BuildingBlocks.EMERALD_STAIRS)
            .add(BuildingBlocks.EMERALD_SLAB)
            .add(BuildingBlocks.EMERALD_WALL)


            .add(BuildingBlocks.LAPIS_STAIRS)
            .add(BuildingBlocks.LAPIS_SLAB)
            .add(BuildingBlocks.LAPIS_WALL)


            .add(BuildingBlocks.DIAMOND_STAIRS)
            .add(BuildingBlocks.DIAMOND_SLAB)
            .add(BuildingBlocks.DIAMOND_WALL)


            .add(BuildingBlocks.NETHERITE_STAIRS)
            .add(BuildingBlocks.NETHERITE_SLAB)
            .add(BuildingBlocks.NETHERITE_WALL)


            .add(BuildingBlocks.QUARTZ_WALL)
            .add(BuildingBlocks.QUARTZ_BRICK_STAIRS)
            .add(BuildingBlocks.QUARTZ_BRICK_SLAB)
            .add(BuildingBlocks.QUARTZ_BRICK_WALL)
            .add(BuildingBlocks.SMOOTH_QUARTZ_WALL)


            .add(BuildingBlocks.AMETHYST_STAIRS)
            .add(BuildingBlocks.AMETHYST_SLAB)
            .add(BuildingBlocks.AMETHYST_WALL)


            .add(ColoredBlocks.WHITE_CONCRETE_STAIRS)
            .add(ColoredBlocks.WHITE_CONCRETE_SLAB)


            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_SLAB)


            .add(ColoredBlocks.GRAY_CONCRETE_STAIRS)
            .add(ColoredBlocks.GRAY_CONCRETE_SLAB)


            .add(ColoredBlocks.BLACK_CONCRETE_STAIRS)
            .add(ColoredBlocks.BLACK_CONCRETE_SLAB)


            .add(ColoredBlocks.BROWN_CONCRETE_STAIRS)
            .add(ColoredBlocks.BROWN_CONCRETE_SLAB)


            .add(ColoredBlocks.RED_CONCRETE_STAIRS)
            .add(ColoredBlocks.RED_CONCRETE_SLAB)


            .add(ColoredBlocks.ORANGE_CONCRETE_STAIRS)
            .add(ColoredBlocks.ORANGE_CONCRETE_SLAB)
            .add(ColoredBlocks.ORANGE_CONCRETE_WALL)

            .add(ColoredBlocks.YELLOW_CONCRETE_STAIRS)
            .add(ColoredBlocks.YELLOW_CONCRETE_SLAB)
            .add(ColoredBlocks.YELLOW_CONCRETE_WALL)

            .add(ColoredBlocks.LIME_CONCRETE_STAIRS)
            .add(ColoredBlocks.LIME_CONCRETE_SLAB)
            .add(ColoredBlocks.LIME_CONCRETE_WALL)

            .add(ColoredBlocks.GREEN_CONCRETE_STAIRS)
            .add(ColoredBlocks.GREEN_CONCRETE_SLAB)
            .add(ColoredBlocks.GREEN_CONCRETE_WALL)

            .add(ColoredBlocks.CYAN_CONCRETE_STAIRS)
            .add(ColoredBlocks.CYAN_CONCRETE_SLAB)
            .add(ColoredBlocks.CYAN_CONCRETE_WALL)

            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_SLAB)
            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_WALL)

            .add(ColoredBlocks.BLUE_CONCRETE_STAIRS)
            .add(ColoredBlocks.BLUE_CONCRETE_SLAB)
            .add(ColoredBlocks.BLUE_CONCRETE_WALL)

            .add(ColoredBlocks.PURPLE_CONCRETE_STAIRS)
            .add(ColoredBlocks.PURPLE_CONCRETE_SLAB)
            .add(ColoredBlocks.PURPLE_CONCRETE_WALL)

            .add(ColoredBlocks.MAGENTA_CONCRETE_STAIRS)
            .add(ColoredBlocks.MAGENTA_CONCRETE_SLAB)
            .add(ColoredBlocks.MAGENTA_CONCRETE_WALL)

            .add(ColoredBlocks.PINK_CONCRETE_STAIRS)
            .add(ColoredBlocks.PINK_CONCRETE_SLAB)
            .add(ColoredBlocks.PINK_CONCRETE_WALL)

            .add(ColoredBlocks.WHITE_CONCRETE_TILES)
            .add(ColoredBlocks.WHITE_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.WHITE_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.WHITE_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILES)
            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.GRAY_CONCRETE_TILES)
            .add(ColoredBlocks.GRAY_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.GRAY_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.GRAY_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.BLACK_CONCRETE_TILES)
            .add(ColoredBlocks.BLACK_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.BLACK_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.BLACK_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.BROWN_CONCRETE_TILES)
            .add(ColoredBlocks.BROWN_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.BROWN_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.BROWN_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.RED_CONCRETE_TILES)
            .add(ColoredBlocks.RED_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.RED_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.RED_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.ORANGE_CONCRETE_TILES)
            .add(ColoredBlocks.ORANGE_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.ORANGE_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.ORANGE_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.YELLOW_CONCRETE_TILES)
            .add(ColoredBlocks.YELLOW_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.YELLOW_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.YELLOW_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.LIME_CONCRETE_TILES)
            .add(ColoredBlocks.LIME_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.LIME_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.LIME_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.GREEN_CONCRETE_TILES)
            .add(ColoredBlocks.GREEN_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.GREEN_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.GREEN_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.CYAN_CONCRETE_TILES)
            .add(ColoredBlocks.CYAN_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.CYAN_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.CYAN_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILES)
            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.BLUE_CONCRETE_TILES)
            .add(ColoredBlocks.BLUE_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.BLUE_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.BLUE_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.PURPLE_CONCRETE_TILES)
            .add(ColoredBlocks.PURPLE_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.PURPLE_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.PURPLE_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.MAGENTA_CONCRETE_TILES)
            .add(ColoredBlocks.MAGENTA_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.MAGENTA_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.MAGENTA_CONCRETE_TILE_WALL)

            .add(ColoredBlocks.PINK_CONCRETE_TILES)
            .add(ColoredBlocks.PINK_CONCRETE_TILE_STAIRS)
            .add(ColoredBlocks.PINK_CONCRETE_TILE_SLAB)
            .add(ColoredBlocks.PINK_CONCRETE_TILE_WALL)


            .add(ColoredBlocks.TERRACOTTA_STAIRS)
            .add(ColoredBlocks.TERRACOTTA_SLAB)
            .add(ColoredBlocks.TERRACOTTA_WALL)

            .add(ColoredBlocks.WHITE_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.WHITE_TERRACOTTA_SLAB)
            .add(ColoredBlocks.WHITE_TERRACOTTA_WALL)

            .add(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
            .add(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_WALL)

            .add(ColoredBlocks.GRAY_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.GRAY_TERRACOTTA_SLAB)
            .add(ColoredBlocks.GRAY_TERRACOTTA_WALL)

            .add(ColoredBlocks.BLACK_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.BLACK_TERRACOTTA_SLAB)
            .add(ColoredBlocks.BLACK_TERRACOTTA_WALL)

            .add(ColoredBlocks.BROWN_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.BROWN_TERRACOTTA_SLAB)
            .add(ColoredBlocks.BROWN_TERRACOTTA_WALL)

            .add(ColoredBlocks.RED_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.RED_TERRACOTTA_SLAB)
            .add(ColoredBlocks.RED_TERRACOTTA_WALL)

            .add(ColoredBlocks.ORANGE_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.ORANGE_TERRACOTTA_SLAB)
            .add(ColoredBlocks.ORANGE_TERRACOTTA_WALL)

            .add(ColoredBlocks.YELLOW_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.YELLOW_TERRACOTTA_SLAB)
            .add(ColoredBlocks.YELLOW_TERRACOTTA_WALL)

            .add(ColoredBlocks.LIME_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.LIME_TERRACOTTA_SLAB)
            .add(ColoredBlocks.LIME_TERRACOTTA_WALL)

            .add(ColoredBlocks.GREEN_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.GREEN_TERRACOTTA_SLAB)
            .add(ColoredBlocks.GREEN_TERRACOTTA_WALL)

            .add(ColoredBlocks.CYAN_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.CYAN_TERRACOTTA_SLAB)
            .add(ColoredBlocks.CYAN_TERRACOTTA_WALL)

            .add(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
            .add(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_WALL)

            .add(ColoredBlocks.BLUE_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.BLUE_TERRACOTTA_SLAB)
            .add(ColoredBlocks.BLUE_TERRACOTTA_WALL)

            .add(ColoredBlocks.PURPLE_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.PURPLE_TERRACOTTA_SLAB)
            .add(ColoredBlocks.PURPLE_TERRACOTTA_WALL)

            .add(ColoredBlocks.MAGENTA_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.MAGENTA_TERRACOTTA_SLAB)
            .add(ColoredBlocks.MAGENTA_TERRACOTTA_WALL)

            .add(ColoredBlocks.PINK_TERRACOTTA_STAIRS)
            .add(ColoredBlocks.PINK_TERRACOTTA_SLAB)
            .add(ColoredBlocks.PINK_TERRACOTTA_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(BuildingBlocks.OAK_WALL)
            .add(BuildingBlocks.SPRUCE_WALL)
            .add(BuildingBlocks.BIRCH_WALL)
            .add(BuildingBlocks.JUNGLE_WALL)
            .add(BuildingBlocks.ACACIA_WALL)
            .add(BuildingBlocks.DARK_OAK_WALL)
            .add(BuildingBlocks.MANGROVE_WALL)
            .add(BuildingBlocks.CHERRY_WALL)
            .add(BuildingBlocks.BAMBOO_WALL)
            .add(BuildingBlocks.BAMBOO_MOSAIC_WALL)
            .add(BuildingBlocks.CRIMSON_WALL)
            .add(BuildingBlocks.WARPED_WALL)
            .add(BuildingBlocks.STONE_WALL)
            .add(BuildingBlocks.SMOOTH_STONE_WALL)
            .add(BuildingBlocks.CRACKED_STONE_BRICK_WALL)
            .add(BuildingBlocks.POLISHED_GRANITE_WALL)
            .add(BuildingBlocks.POLISHED_DIORITE_WALL)
            .add(BuildingBlocks.POLISHED_ANDESITE_WALL)
            .add(BuildingBlocks.DEEPSLATE_WALL)
            .add(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL)
            .add(BuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL)
            .add(BuildingBlocks.PACKED_MUD_WALL)
            .add(BuildingBlocks.SMOOTH_SANDSTONE_WALL)
            .add(BuildingBlocks.CUT_SANDSTONE_WALL)
            .add(BuildingBlocks.SMOOTH_RED_SANDSTONE_WALL)
            .add(BuildingBlocks.CUT_RED_SANDSTONE_WALL)
            .add(BuildingBlocks.PRISMARINE_BRICK_WALL)
            .add(BuildingBlocks.DARK_PRISMARINE_WALL)
            .add(NaturalBlocks.NETHERRACK_WALL)
            .add(BuildingBlocks.CRACKED_NETHER_BRICK_WALL)
            .add(BuildingBlocks.BASALT_WALL)
            .add(BuildingBlocks.SMOOTH_BASALT_WALL)
            .add(BuildingBlocks.POLISHED_BASALT_WALL)
            .add(BuildingBlocks.GILDED_BLACKSTONE_WALL)
            .add(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL)
            .add(BuildingBlocks.END_STONE_WALL)
            .add(BuildingBlocks.PURPUR_WALL)
            .add(BuildingBlocks.IRON_WALL)
            .add(BuildingBlocks.GOLD_WALL)
            .add(BuildingBlocks.EMERALD_WALL)
            .add(BuildingBlocks.LAPIS_WALL)
            .add(BuildingBlocks.DIAMOND_WALL)
            .add(BuildingBlocks.NETHERITE_WALL)
            .add(BuildingBlocks.QUARTZ_WALL)
            .add(BuildingBlocks.QUARTZ_BRICK_WALL)
            .add(BuildingBlocks.SMOOTH_QUARTZ_WALL)
            .add(BuildingBlocks.AMETHYST_WALL)
            .add(ColoredBlocks.WHITE_CONCRETE_WALL)
            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_WALL)
            .add(ColoredBlocks.GRAY_CONCRETE_WALL)
            .add(ColoredBlocks.BLACK_CONCRETE_WALL)
            .add(ColoredBlocks.BROWN_CONCRETE_WALL)
            .add(ColoredBlocks.RED_CONCRETE_WALL)
            .add(ColoredBlocks.ORANGE_CONCRETE_WALL)
            .add(ColoredBlocks.YELLOW_CONCRETE_WALL)
            .add(ColoredBlocks.LIME_CONCRETE_WALL)
            .add(ColoredBlocks.GREEN_CONCRETE_WALL)
            .add(ColoredBlocks.CYAN_CONCRETE_WALL)
            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_WALL)
            .add(ColoredBlocks.BLUE_CONCRETE_WALL)
            .add(ColoredBlocks.PURPLE_CONCRETE_WALL)
            .add(ColoredBlocks.MAGENTA_CONCRETE_WALL)
            .add(ColoredBlocks.PINK_CONCRETE_WALL)
            .add(ColoredBlocks.WHITE_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.GRAY_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.BLACK_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.BROWN_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.RED_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.ORANGE_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.YELLOW_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.LIME_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.GREEN_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.CYAN_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.BLUE_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.PURPLE_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.MAGENTA_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.PINK_CONCRETE_TILE_WALL)
            .add(ColoredBlocks.TERRACOTTA_WALL)
            .add(ColoredBlocks.WHITE_TERRACOTTA_WALL)
            .add(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_WALL)
            .add(ColoredBlocks.GRAY_TERRACOTTA_WALL)
            .add(ColoredBlocks.BLACK_TERRACOTTA_WALL)
            .add(ColoredBlocks.BROWN_TERRACOTTA_WALL)
            .add(ColoredBlocks.RED_TERRACOTTA_WALL)
            .add(ColoredBlocks.ORANGE_TERRACOTTA_WALL)
            .add(ColoredBlocks.YELLOW_TERRACOTTA_WALL)
            .add(ColoredBlocks.LIME_TERRACOTTA_WALL)
            .add(ColoredBlocks.GREEN_TERRACOTTA_WALL)
            .add(ColoredBlocks.CYAN_TERRACOTTA_WALL)
            .add(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_WALL)
            .add(ColoredBlocks.BLUE_TERRACOTTA_WALL)
            .add(ColoredBlocks.PURPLE_TERRACOTTA_WALL)
            .add(ColoredBlocks.MAGENTA_TERRACOTTA_WALL)
            .add(ColoredBlocks.PINK_TERRACOTTA_WALL)
            .add(ColoredBlocks.WHITE_WOOL_WALL)
            .add(ColoredBlocks.LIGHT_GRAY_WOOL_WALL)
            .add(ColoredBlocks.GRAY_WOOL_WALL)
            .add(ColoredBlocks.BLACK_WOOL_WALL)
            .add(ColoredBlocks.BROWN_WOOL_WALL)
            .add(ColoredBlocks.RED_WOOL_WALL)
            .add(ColoredBlocks.ORANGE_WOOL_WALL)
            .add(ColoredBlocks.YELLOW_WOOL_WALL)
            .add(ColoredBlocks.LIME_WOOL_WALL)
            .add(ColoredBlocks.GREEN_WOOL_WALL)
            .add(ColoredBlocks.CYAN_WOOL_WALL)
            .add(ColoredBlocks.LIGHT_BLUE_WOOL_WALL)
            .add(ColoredBlocks.BLUE_WOOL_WALL)
            .add(ColoredBlocks.PURPLE_WOOL_WALL)
            .add(ColoredBlocks.MAGENTA_WOOL_WALL)
            .add(ColoredBlocks.PINK_WOOL_WALL);


        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ColoredBlocks.WHITE_WOOL_STAIRS)
                .add(ColoredBlocks.WHITE_WOOL_SLAB)
                .add(ColoredBlocks.WHITE_WOOL_WALL)

                .add(ColoredBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ColoredBlocks.LIGHT_GRAY_WOOL_WALL)

                .add(ColoredBlocks.GRAY_WOOL_STAIRS)
                .add(ColoredBlocks.GRAY_WOOL_SLAB)
                .add(ColoredBlocks.GRAY_WOOL_WALL)

                .add(ColoredBlocks.BLACK_WOOL_STAIRS)
                .add(ColoredBlocks.BLACK_WOOL_SLAB)
                .add(ColoredBlocks.BLACK_WOOL_WALL)

                .add(ColoredBlocks.BROWN_WOOL_STAIRS)
                .add(ColoredBlocks.BROWN_WOOL_SLAB)
                .add(ColoredBlocks.BROWN_WOOL_WALL)

                .add(ColoredBlocks.RED_WOOL_STAIRS)
                .add(ColoredBlocks.RED_WOOL_SLAB)
                .add(ColoredBlocks.RED_WOOL_WALL)

                .add(ColoredBlocks.ORANGE_WOOL_STAIRS)
                .add(ColoredBlocks.ORANGE_WOOL_SLAB)
                .add(ColoredBlocks.ORANGE_WOOL_WALL)

                .add(ColoredBlocks.YELLOW_WOOL_STAIRS)
                .add(ColoredBlocks.YELLOW_WOOL_SLAB)
                .add(ColoredBlocks.YELLOW_WOOL_WALL)

                .add(ColoredBlocks.LIME_WOOL_STAIRS)
                .add(ColoredBlocks.LIME_WOOL_SLAB)
                .add(ColoredBlocks.LIME_WOOL_WALL)

                .add(ColoredBlocks.GREEN_WOOL_STAIRS)
                .add(ColoredBlocks.GREEN_WOOL_SLAB)
                .add(ColoredBlocks.GREEN_WOOL_WALL)

                .add(ColoredBlocks.CYAN_WOOL_STAIRS)
                .add(ColoredBlocks.CYAN_WOOL_SLAB)
                .add(ColoredBlocks.CYAN_WOOL_WALL)

                .add(ColoredBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ColoredBlocks.LIGHT_BLUE_WOOL_WALL)

                .add(ColoredBlocks.BLUE_WOOL_STAIRS)
                .add(ColoredBlocks.BLUE_WOOL_SLAB)
                .add(ColoredBlocks.BLUE_WOOL_WALL)

                .add(ColoredBlocks.PURPLE_WOOL_STAIRS)
                .add(ColoredBlocks.PURPLE_WOOL_SLAB)
                .add(ColoredBlocks.PURPLE_WOOL_WALL)

                .add(ColoredBlocks.MAGENTA_WOOL_STAIRS)
                .add(ColoredBlocks.MAGENTA_WOOL_SLAB)
                .add(ColoredBlocks.MAGENTA_WOOL_WALL)

                .add(ColoredBlocks.PINK_WOOL_STAIRS)
                .add(ColoredBlocks.PINK_WOOL_SLAB)
                .add(ColoredBlocks.PINK_WOOL_WALL);


        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
                .add(ColoredBlocks.WHITE_WOOL_STAIRS)
                .add(ColoredBlocks.WHITE_WOOL_SLAB)
                .add(ColoredBlocks.WHITE_WOOL_WALL)

                .add(ColoredBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ColoredBlocks.LIGHT_GRAY_WOOL_WALL)

                .add(ColoredBlocks.GRAY_WOOL_STAIRS)
                .add(ColoredBlocks.GRAY_WOOL_SLAB)
                .add(ColoredBlocks.GRAY_WOOL_WALL)

                .add(ColoredBlocks.BLACK_WOOL_STAIRS)
                .add(ColoredBlocks.BLACK_WOOL_SLAB)
                .add(ColoredBlocks.BLACK_WOOL_WALL)

                .add(ColoredBlocks.BROWN_WOOL_STAIRS)
                .add(ColoredBlocks.BROWN_WOOL_SLAB)
                .add(ColoredBlocks.BROWN_WOOL_WALL)

                .add(ColoredBlocks.RED_WOOL_STAIRS)
                .add(ColoredBlocks.RED_WOOL_SLAB)
                .add(ColoredBlocks.RED_WOOL_WALL)

                .add(ColoredBlocks.ORANGE_WOOL_STAIRS)
                .add(ColoredBlocks.ORANGE_WOOL_SLAB)
                .add(ColoredBlocks.ORANGE_WOOL_WALL)

                .add(ColoredBlocks.YELLOW_WOOL_STAIRS)
                .add(ColoredBlocks.YELLOW_WOOL_SLAB)
                .add(ColoredBlocks.YELLOW_WOOL_WALL)

                .add(ColoredBlocks.LIME_WOOL_STAIRS)
                .add(ColoredBlocks.LIME_WOOL_SLAB)
                .add(ColoredBlocks.LIME_WOOL_WALL)

                .add(ColoredBlocks.GREEN_WOOL_STAIRS)
                .add(ColoredBlocks.GREEN_WOOL_SLAB)
                .add(ColoredBlocks.GREEN_WOOL_WALL)

                .add(ColoredBlocks.CYAN_WOOL_STAIRS)
                .add(ColoredBlocks.CYAN_WOOL_SLAB)
                .add(ColoredBlocks.CYAN_WOOL_WALL)

                .add(ColoredBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ColoredBlocks.LIGHT_BLUE_WOOL_WALL)

                .add(ColoredBlocks.BLUE_WOOL_STAIRS)
                .add(ColoredBlocks.BLUE_WOOL_SLAB)
                .add(ColoredBlocks.BLUE_WOOL_WALL)

                .add(ColoredBlocks.PURPLE_WOOL_STAIRS)
                .add(ColoredBlocks.PURPLE_WOOL_SLAB)
                .add(ColoredBlocks.PURPLE_WOOL_WALL)

                .add(ColoredBlocks.MAGENTA_WOOL_STAIRS)
                .add(ColoredBlocks.MAGENTA_WOOL_SLAB)
                .add(ColoredBlocks.MAGENTA_WOOL_WALL)

                .add(ColoredBlocks.PINK_WOOL_STAIRS)
                .add(ColoredBlocks.PINK_WOOL_SLAB)
                .add(ColoredBlocks.PINK_WOOL_WALL);

        getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
                .add(ColoredBlocks.WHITE_WOOL_STAIRS)
                .add(ColoredBlocks.WHITE_WOOL_SLAB)
                .add(ColoredBlocks.WHITE_WOOL_WALL)

                .add(ColoredBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(ColoredBlocks.LIGHT_GRAY_WOOL_WALL)

                .add(ColoredBlocks.GRAY_WOOL_STAIRS)
                .add(ColoredBlocks.GRAY_WOOL_SLAB)
                .add(ColoredBlocks.GRAY_WOOL_WALL)

                .add(ColoredBlocks.BLACK_WOOL_STAIRS)
                .add(ColoredBlocks.BLACK_WOOL_SLAB)
                .add(ColoredBlocks.BLACK_WOOL_WALL)

                .add(ColoredBlocks.BROWN_WOOL_STAIRS)
                .add(ColoredBlocks.BROWN_WOOL_SLAB)
                .add(ColoredBlocks.BROWN_WOOL_WALL)

                .add(ColoredBlocks.RED_WOOL_STAIRS)
                .add(ColoredBlocks.RED_WOOL_SLAB)
                .add(ColoredBlocks.RED_WOOL_WALL)

                .add(ColoredBlocks.ORANGE_WOOL_STAIRS)
                .add(ColoredBlocks.ORANGE_WOOL_SLAB)
                .add(ColoredBlocks.ORANGE_WOOL_WALL)

                .add(ColoredBlocks.YELLOW_WOOL_STAIRS)
                .add(ColoredBlocks.YELLOW_WOOL_SLAB)
                .add(ColoredBlocks.YELLOW_WOOL_WALL)

                .add(ColoredBlocks.LIME_WOOL_STAIRS)
                .add(ColoredBlocks.LIME_WOOL_SLAB)
                .add(ColoredBlocks.LIME_WOOL_WALL)

                .add(ColoredBlocks.GREEN_WOOL_STAIRS)
                .add(ColoredBlocks.GREEN_WOOL_SLAB)
                .add(ColoredBlocks.GREEN_WOOL_WALL)

                .add(ColoredBlocks.CYAN_WOOL_STAIRS)
                .add(ColoredBlocks.CYAN_WOOL_SLAB)
                .add(ColoredBlocks.CYAN_WOOL_WALL)

                .add(ColoredBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(ColoredBlocks.LIGHT_BLUE_WOOL_WALL)

                .add(ColoredBlocks.BLUE_WOOL_STAIRS)
                .add(ColoredBlocks.BLUE_WOOL_SLAB)
                .add(ColoredBlocks.BLUE_WOOL_WALL)

                .add(ColoredBlocks.PURPLE_WOOL_STAIRS)
                .add(ColoredBlocks.PURPLE_WOOL_SLAB)
                .add(ColoredBlocks.PURPLE_WOOL_WALL)

                .add(ColoredBlocks.MAGENTA_WOOL_STAIRS)
                .add(ColoredBlocks.MAGENTA_WOOL_SLAB)
                .add(ColoredBlocks.MAGENTA_WOOL_WALL)

                .add(ColoredBlocks.PINK_WOOL_STAIRS)
                .add(ColoredBlocks.PINK_WOOL_SLAB)
                .add(ColoredBlocks.PINK_WOOL_WALL);
    }
}
