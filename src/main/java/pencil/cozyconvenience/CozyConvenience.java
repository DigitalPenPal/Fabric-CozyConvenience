package pencil.cozyconvenience;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pencil.cozyconvenience.block.ModBlocks;
import pencil.cozyconvenience.item.ModItems;
import pencil.cozyconvenience.item.ModItemGroups;

public class CozyConvenience implements ModInitializer {

	public static final String MOD_ID = "cozy-convenience";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		// Register Flammability
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_MOSAIC_WALL, 20, 5);


		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_WOOL_BUTTON, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WOOL_WALL, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WOOL_PRESSURE_PLATE, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WOOL_BUTTON, 60, 30);

		// Register Fuels
		FuelRegistry.INSTANCE.add(ModBlocks.OAK_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.SPRUCE_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BIRCH_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.JUNGLE_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.ACACIA_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.DARK_OAK_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.MANGROVE_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CHERRY_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_MOSAIC_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CRIMSON_WALL, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.WARPED_WALL, 300);


		FuelRegistry.INSTANCE.add(ModBlocks.WHITE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.WHITE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.WHITE_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.WHITE_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.WHITE_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.GRAY_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GRAY_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GRAY_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GRAY_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.BLACK_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLACK_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLACK_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLACK_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLACK_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.BROWN_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BROWN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BROWN_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BROWN_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BROWN_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.RED_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.RED_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.RED_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.RED_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.RED_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.ORANGE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.ORANGE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.ORANGE_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.ORANGE_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.YELLOW_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.YELLOW_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.YELLOW_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.YELLOW_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.LIME_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIME_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIME_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIME_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIME_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.GREEN_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GREEN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GREEN_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GREEN_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GREEN_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.CYAN_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.CYAN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.CYAN_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.CYAN_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.CYAN_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.BLUE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLUE_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLUE_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLUE_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.PURPLE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PURPLE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PURPLE_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PURPLE_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.MAGENTA_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.MAGENTA_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.MAGENTA_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.MAGENTA_WOOL_BUTTON, 50);

		FuelRegistry.INSTANCE.add(ModBlocks.PINK_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PINK_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PINK_WOOL_WALL, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PINK_WOOL_PRESSURE_PLATE, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PINK_WOOL_BUTTON, 50);
	}
}