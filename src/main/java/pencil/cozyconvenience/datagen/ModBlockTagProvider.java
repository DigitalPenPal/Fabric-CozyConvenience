package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import pencil.cozyconvenience.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                // Pillar Blocks
                .add(ModBlocks.STONE_COLUMN)
                .add(ModBlocks.MOSSY_STONE_COLUMN)
                .add(ModBlocks.CRACKED_STONE_COLUMN)

                // Concrete Blocks
                .add(ModBlocks.WHITE_CONCRETE_TILES)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_SLAB)
                .add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.WHITE_CONCRETE_WALL)

                .add(ModBlocks.LIGHT_GRAY_CONCRETE_TILES)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL)

                .add(ModBlocks.GRAY_CONCRETE_TILES)
                .add(ModBlocks.GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.GRAY_CONCRETE_SLAB)
                .add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.GRAY_CONCRETE_WALL)

                .add(ModBlocks.BLACK_CONCRETE_TILES)
                .add(ModBlocks.BLACK_CONCRETE_STAIRS)
                .add(ModBlocks.BLACK_CONCRETE_SLAB)
                .add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.BLACK_CONCRETE_WALL)

                .add(ModBlocks.BROWN_CONCRETE_TILES)
                .add(ModBlocks.BROWN_CONCRETE_STAIRS)
                .add(ModBlocks.BROWN_CONCRETE_SLAB)
                .add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.BROWN_CONCRETE_WALL)

                .add(ModBlocks.RED_CONCRETE_TILES)
                .add(ModBlocks.RED_CONCRETE_STAIRS)
                .add(ModBlocks.RED_CONCRETE_SLAB)
                .add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.RED_CONCRETE_WALL)

                .add(ModBlocks.ORANGE_CONCRETE_TILES)
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS)
                .add(ModBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.ORANGE_CONCRETE_WALL)

                .add(ModBlocks.YELLOW_CONCRETE_TILES)
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS)
                .add(ModBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.YELLOW_CONCRETE_WALL)

                .add(ModBlocks.LIME_CONCRETE_TILES)
                .add(ModBlocks.LIME_CONCRETE_STAIRS)
                .add(ModBlocks.LIME_CONCRETE_SLAB)
                .add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.LIME_CONCRETE_WALL)

                .add(ModBlocks.GREEN_CONCRETE_TILES)
                .add(ModBlocks.GREEN_CONCRETE_STAIRS)
                .add(ModBlocks.GREEN_CONCRETE_SLAB)
                .add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_CONCRETE_WALL)

                .add(ModBlocks.CYAN_CONCRETE_TILES)
                .add(ModBlocks.CYAN_CONCRETE_STAIRS)
                .add(ModBlocks.CYAN_CONCRETE_SLAB)
                .add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.CYAN_CONCRETE_WALL)

                .add(ModBlocks.LIGHT_BLUE_CONCRETE_TILES)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL)

                .add(ModBlocks.BLUE_CONCRETE_TILES)
                .add(ModBlocks.BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.BLUE_CONCRETE_SLAB)
                .add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_CONCRETE_WALL)

                .add(ModBlocks.PURPLE_CONCRETE_TILES)
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS)
                .add(ModBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_CONCRETE_WALL)

                .add(ModBlocks.MAGENTA_CONCRETE_TILES)
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.MAGENTA_CONCRETE_WALL)

                .add(ModBlocks.PINK_CONCRETE_TILES)
                .add(ModBlocks.PINK_CONCRETE_STAIRS)
                .add(ModBlocks.PINK_CONCRETE_SLAB)
                .add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.PINK_CONCRETE_WALL)

                // Terracotta Blocks
                .add(ModBlocks.TERRACOTTA_STAIRS)
                .add(ModBlocks.TERRACOTTA_SLAB)
                .add(ModBlocks.TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.TERRACOTTA_WALL)

                .add(ModBlocks.WHITE_TERRACOTTA_STAIRS)
                .add(ModBlocks.WHITE_TERRACOTTA_SLAB)
                .add(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.WHITE_TERRACOTTA_WALL)

                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL)

                .add(ModBlocks.GRAY_TERRACOTTA_STAIRS)
                .add(ModBlocks.GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.GRAY_TERRACOTTA_WALL)

                .add(ModBlocks.BLACK_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLACK_TERRACOTTA_SLAB)
                .add(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.BLACK_TERRACOTTA_WALL)

                .add(ModBlocks.BROWN_TERRACOTTA_STAIRS)
                .add(ModBlocks.BROWN_TERRACOTTA_SLAB)
                .add(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.BROWN_TERRACOTTA_WALL)

                .add(ModBlocks.RED_TERRACOTTA_STAIRS)
                .add(ModBlocks.RED_TERRACOTTA_SLAB)
                .add(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.RED_TERRACOTTA_WALL)

                .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS)
                .add(ModBlocks.ORANGE_TERRACOTTA_SLAB)
                .add(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.ORANGE_TERRACOTTA_WALL)

                .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS)
                .add(ModBlocks.YELLOW_TERRACOTTA_SLAB)
                .add(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.YELLOW_TERRACOTTA_WALL)

                .add(ModBlocks.LIME_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIME_TERRACOTTA_SLAB)
                .add(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.LIME_TERRACOTTA_WALL)

                .add(ModBlocks.GREEN_TERRACOTTA_STAIRS)
                .add(ModBlocks.GREEN_TERRACOTTA_SLAB)
                .add(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_TERRACOTTA_WALL)

                .add(ModBlocks.CYAN_TERRACOTTA_STAIRS)
                .add(ModBlocks.CYAN_TERRACOTTA_SLAB)
                .add(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.CYAN_TERRACOTTA_WALL)

                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL)

                .add(ModBlocks.BLUE_TERRACOTTA_STAIRS)
                .add(ModBlocks.BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_TERRACOTTA_WALL)

                .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS)
                .add(ModBlocks.PURPLE_TERRACOTTA_SLAB)
                .add(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_TERRACOTTA_WALL)

                .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS)
                .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB)
                .add(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.MAGENTA_TERRACOTTA_WALL)

                .add(ModBlocks.PINK_TERRACOTTA_STAIRS)
                .add(ModBlocks.PINK_TERRACOTTA_SLAB)
                .add(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE)
                .add(ModBlocks.PINK_TERRACOTTA_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                // Concrete Blocks
                .add(ModBlocks.WHITE_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL)
                .add(ModBlocks.GRAY_CONCRETE_WALL)
                .add(ModBlocks.BLACK_CONCRETE_WALL)
                .add(ModBlocks.BROWN_CONCRETE_WALL)
                .add(ModBlocks.RED_CONCRETE_WALL)
                .add(ModBlocks.ORANGE_CONCRETE_WALL)
                .add(ModBlocks.YELLOW_CONCRETE_WALL)
                .add(ModBlocks.LIME_CONCRETE_WALL)
                .add(ModBlocks.GREEN_CONCRETE_WALL)
                .add(ModBlocks.CYAN_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL)
                .add(ModBlocks.BLUE_CONCRETE_WALL)
                .add(ModBlocks.PURPLE_CONCRETE_WALL)
                .add(ModBlocks.MAGENTA_CONCRETE_WALL)
                .add(ModBlocks.PINK_CONCRETE_WALL)

                // Terracotta Blocks
                .add(ModBlocks.TERRACOTTA_WALL)
                .add(ModBlocks.WHITE_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.BLACK_TERRACOTTA_WALL)
                .add(ModBlocks.BROWN_TERRACOTTA_WALL)
                .add(ModBlocks.RED_TERRACOTTA_WALL)
                .add(ModBlocks.ORANGE_TERRACOTTA_WALL)
                .add(ModBlocks.YELLOW_TERRACOTTA_WALL)
                .add(ModBlocks.LIME_TERRACOTTA_WALL)
                .add(ModBlocks.GREEN_TERRACOTTA_WALL)
                .add(ModBlocks.CYAN_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.PURPLE_TERRACOTTA_WALL)
                .add(ModBlocks.MAGENTA_TERRACOTTA_WALL)
                .add(ModBlocks.PINK_TERRACOTTA_WALL);

        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.WHITE_WOOL_STAIRS)
                .add(ModBlocks.WHITE_WOOL_SLAB)

                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)

                .add(ModBlocks.GRAY_WOOL_STAIRS)
                .add(ModBlocks.GRAY_WOOL_SLAB)

                .add(ModBlocks.BLACK_WOOL_STAIRS)
                .add(ModBlocks.BLACK_WOOL_SLAB)

                .add(ModBlocks.BROWN_WOOL_STAIRS)
                .add(ModBlocks.BROWN_WOOL_SLAB)

                .add(ModBlocks.RED_WOOL_STAIRS)
                .add(ModBlocks.RED_WOOL_SLAB)

                .add(ModBlocks.ORANGE_WOOL_STAIRS)
                .add(ModBlocks.ORANGE_WOOL_SLAB)

                .add(ModBlocks.YELLOW_WOOL_STAIRS)
                .add(ModBlocks.YELLOW_WOOL_SLAB)

                .add(ModBlocks.LIME_WOOL_STAIRS)
                .add(ModBlocks.LIME_WOOL_SLAB)

                .add(ModBlocks.GREEN_WOOL_STAIRS)
                .add(ModBlocks.GREEN_WOOL_SLAB)

                .add(ModBlocks.CYAN_WOOL_STAIRS)
                .add(ModBlocks.CYAN_WOOL_SLAB)

                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)

                .add(ModBlocks.BLUE_WOOL_STAIRS)
                .add(ModBlocks.BLUE_WOOL_SLAB)

                .add(ModBlocks.PURPLE_WOOL_STAIRS)
                .add(ModBlocks.PURPLE_WOOL_SLAB)

                .add(ModBlocks.MAGENTA_WOOL_STAIRS)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)

                .add(ModBlocks.PINK_WOOL_STAIRS)
                .add(ModBlocks.PINK_WOOL_SLAB);

        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
                .add(ModBlocks.WHITE_WOOL_STAIRS)
                .add(ModBlocks.WHITE_WOOL_SLAB)

                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)

                .add(ModBlocks.GRAY_WOOL_STAIRS)
                .add(ModBlocks.GRAY_WOOL_SLAB)

                .add(ModBlocks.BLACK_WOOL_STAIRS)
                .add(ModBlocks.BLACK_WOOL_SLAB)

                .add(ModBlocks.BROWN_WOOL_STAIRS)
                .add(ModBlocks.BROWN_WOOL_SLAB)

                .add(ModBlocks.RED_WOOL_STAIRS)
                .add(ModBlocks.RED_WOOL_SLAB)

                .add(ModBlocks.ORANGE_WOOL_STAIRS)
                .add(ModBlocks.ORANGE_WOOL_SLAB)

                .add(ModBlocks.YELLOW_WOOL_STAIRS)
                .add(ModBlocks.YELLOW_WOOL_SLAB)

                .add(ModBlocks.LIME_WOOL_STAIRS)
                .add(ModBlocks.LIME_WOOL_SLAB)

                .add(ModBlocks.GREEN_WOOL_STAIRS)
                .add(ModBlocks.GREEN_WOOL_SLAB)

                .add(ModBlocks.CYAN_WOOL_STAIRS)
                .add(ModBlocks.CYAN_WOOL_SLAB)

                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)

                .add(ModBlocks.BLUE_WOOL_STAIRS)
                .add(ModBlocks.BLUE_WOOL_SLAB)

                .add(ModBlocks.PURPLE_WOOL_STAIRS)
                .add(ModBlocks.PURPLE_WOOL_SLAB)

                .add(ModBlocks.MAGENTA_WOOL_STAIRS)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)

                .add(ModBlocks.PINK_WOOL_STAIRS)
                .add(ModBlocks.PINK_WOOL_SLAB);

        getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
                .add(ModBlocks.WHITE_WOOL_STAIRS)
                .add(ModBlocks.WHITE_WOOL_SLAB)

                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB)

                .add(ModBlocks.GRAY_WOOL_STAIRS)
                .add(ModBlocks.GRAY_WOOL_SLAB)

                .add(ModBlocks.BLACK_WOOL_STAIRS)
                .add(ModBlocks.BLACK_WOOL_SLAB)

                .add(ModBlocks.BROWN_WOOL_STAIRS)
                .add(ModBlocks.BROWN_WOOL_SLAB)

                .add(ModBlocks.RED_WOOL_STAIRS)
                .add(ModBlocks.RED_WOOL_SLAB)

                .add(ModBlocks.ORANGE_WOOL_STAIRS)
                .add(ModBlocks.ORANGE_WOOL_SLAB)

                .add(ModBlocks.YELLOW_WOOL_STAIRS)
                .add(ModBlocks.YELLOW_WOOL_SLAB)

                .add(ModBlocks.LIME_WOOL_STAIRS)
                .add(ModBlocks.LIME_WOOL_SLAB)

                .add(ModBlocks.GREEN_WOOL_STAIRS)
                .add(ModBlocks.GREEN_WOOL_SLAB)

                .add(ModBlocks.CYAN_WOOL_STAIRS)
                .add(ModBlocks.CYAN_WOOL_SLAB)

                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB)

                .add(ModBlocks.BLUE_WOOL_STAIRS)
                .add(ModBlocks.BLUE_WOOL_SLAB)

                .add(ModBlocks.PURPLE_WOOL_STAIRS)
                .add(ModBlocks.PURPLE_WOOL_SLAB)

                .add(ModBlocks.MAGENTA_WOOL_STAIRS)
                .add(ModBlocks.MAGENTA_WOOL_SLAB)

                .add(ModBlocks.PINK_WOOL_STAIRS)
                .add(ModBlocks.PINK_WOOL_SLAB);
    }
}
