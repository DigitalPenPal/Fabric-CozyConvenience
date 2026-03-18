package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import pencil.cozyconvenience.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Pillar Blocks
        addDrop(ModBlocks.STONE_COLUMN);
        addDrop(ModBlocks.MOSSY_STONE_COLUMN);
        addDrop(ModBlocks.CRACKED_STONE_COLUMN);

        // Concrete Blocks
        addDrop(ModBlocks.WHITE_CONCRETE_TILES);
        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_CONCRETE_BUTTON);
        addDrop(ModBlocks.WHITE_CONCRETE_WALL);

        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TILES);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        addDrop(ModBlocks.GRAY_CONCRETE_TILES);
        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_CONCRETE_BUTTON);
        addDrop(ModBlocks.GRAY_CONCRETE_WALL);

        addDrop(ModBlocks.BLACK_CONCRETE_TILES);
        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_CONCRETE_BUTTON);
        addDrop(ModBlocks.BLACK_CONCRETE_WALL);

        addDrop(ModBlocks.BROWN_CONCRETE_TILES);
        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_CONCRETE_BUTTON);
        addDrop(ModBlocks.BROWN_CONCRETE_WALL);

        addDrop(ModBlocks.RED_CONCRETE_TILES);
        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_SLAB, slabDrops(ModBlocks.RED_CONCRETE_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_CONCRETE_BUTTON);
        addDrop(ModBlocks.RED_CONCRETE_WALL);

        addDrop(ModBlocks.ORANGE_CONCRETE_TILES);
        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_BUTTON);
        addDrop(ModBlocks.ORANGE_CONCRETE_WALL);

        addDrop(ModBlocks.YELLOW_CONCRETE_TILES);
        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_BUTTON);
        addDrop(ModBlocks.YELLOW_CONCRETE_WALL);

        addDrop(ModBlocks.LIME_CONCRETE_TILES);
        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIME_CONCRETE_WALL);

        addDrop(ModBlocks.GREEN_CONCRETE_TILES);
        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_CONCRETE_BUTTON);
        addDrop(ModBlocks.GREEN_CONCRETE_WALL);

        addDrop(ModBlocks.CYAN_CONCRETE_TILES);
        addDrop(ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB, slabDrops(ModBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_CONCRETE_BUTTON);
        addDrop(ModBlocks.CYAN_CONCRETE_WALL);

        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TILES);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        addDrop(ModBlocks.BLUE_CONCRETE_TILES);
        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_CONCRETE_BUTTON);
        addDrop(ModBlocks.BLUE_CONCRETE_WALL);

        addDrop(ModBlocks.PURPLE_CONCRETE_TILES);
        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_BUTTON);
        addDrop(ModBlocks.PURPLE_CONCRETE_WALL);

        addDrop(ModBlocks.MAGENTA_CONCRETE_TILES);
        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_BUTTON);
        addDrop(ModBlocks.MAGENTA_CONCRETE_WALL);

        addDrop(ModBlocks.PINK_CONCRETE_TILES);
        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_CONCRETE_BUTTON);
        addDrop(ModBlocks.PINK_CONCRETE_WALL);

        // Terracotta Blocks
        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SLAB, slabDrops(ModBlocks.TERRACOTTA_SLAB));
        addDrop(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.TERRACOTTA_BUTTON);
        addDrop(ModBlocks.TERRACOTTA_WALL);

        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_SLAB, slabDrops(ModBlocks.WHITE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.WHITE_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.GRAY_TERRACOTTA_WALL);

        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLACK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BLACK_TERRACOTTA_WALL);

        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_SLAB, slabDrops(ModBlocks.BROWN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BROWN_TERRACOTTA_WALL);

        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_SLAB, slabDrops(ModBlocks.RED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.RED_TERRACOTTA_WALL);

        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_SLAB, slabDrops(ModBlocks.ORANGE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_WALL);

        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_SLAB, slabDrops(ModBlocks.YELLOW_TERRACOTTA_SLAB));
        addDrop(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIME_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIME_TERRACOTTA_WALL);

        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_SLAB, slabDrops(ModBlocks.GREEN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.GREEN_TERRACOTTA_WALL);

        addDrop(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_SLAB, slabDrops(ModBlocks.CYAN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.CYAN_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.BLUE_TERRACOTTA_WALL);

        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_SLAB, slabDrops(ModBlocks.PURPLE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_WALL);

        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_SLAB, slabDrops(ModBlocks.MAGENTA_TERRACOTTA_SLAB));
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_WALL);

        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_SLAB, slabDrops(ModBlocks.PINK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_TERRACOTTA_BUTTON);
        addDrop(ModBlocks.PINK_TERRACOTTA_WALL);

        // Wool Blocks
        addDrop(ModBlocks.WHITE_WOOL_STAIRS);
        addDrop(ModBlocks.WHITE_WOOL_SLAB, slabDrops(ModBlocks.WHITE_WOOL_SLAB));

        addDrop(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_SLAB));

        addDrop(ModBlocks.GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.GRAY_WOOL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_SLAB));

        addDrop(ModBlocks.BLACK_WOOL_STAIRS);
        addDrop(ModBlocks.BLACK_WOOL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_SLAB));

        addDrop(ModBlocks.BROWN_WOOL_STAIRS);
        addDrop(ModBlocks.BROWN_WOOL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_SLAB));

        addDrop(ModBlocks.RED_WOOL_STAIRS);
        addDrop(ModBlocks.RED_WOOL_SLAB, slabDrops(ModBlocks.RED_WOOL_SLAB));

        addDrop(ModBlocks.ORANGE_WOOL_STAIRS);
        addDrop(ModBlocks.ORANGE_WOOL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_SLAB));

        addDrop(ModBlocks.YELLOW_WOOL_STAIRS);
        addDrop(ModBlocks.YELLOW_WOOL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_SLAB));

        addDrop(ModBlocks.LIME_WOOL_STAIRS);
        addDrop(ModBlocks.LIME_WOOL_SLAB, slabDrops(ModBlocks.LIME_WOOL_SLAB));

        addDrop(ModBlocks.GREEN_WOOL_STAIRS);
        addDrop(ModBlocks.GREEN_WOOL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_SLAB));

        addDrop(ModBlocks.CYAN_WOOL_STAIRS);
        addDrop(ModBlocks.CYAN_WOOL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_SLAB));

        addDrop(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_SLAB));

        addDrop(ModBlocks.BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.BLUE_WOOL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_SLAB));

        addDrop(ModBlocks.PURPLE_WOOL_STAIRS);
        addDrop(ModBlocks.PURPLE_WOOL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_SLAB));

        addDrop(ModBlocks.MAGENTA_WOOL_STAIRS);
        addDrop(ModBlocks.MAGENTA_WOOL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_SLAB));

        addDrop(ModBlocks.PINK_WOOL_STAIRS);
        addDrop(ModBlocks.PINK_WOOL_SLAB, slabDrops(ModBlocks.PINK_WOOL_SLAB));
    }
}
