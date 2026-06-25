package pencil.cozyconvenience;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pencil.cozyconvenience.block.BuildingBlocks;
import pencil.cozyconvenience.block.ColoredBlocks;
import pencil.cozyconvenience.block.NaturalBlocks;
import pencil.cozyconvenience.item.ModItems;

public class CozyConvenience implements ModInitializer {

	public static final String MOD_ID = "cozy-convenience";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		BuildingBlocks.registerModBlocks();
		ColoredBlocks.registerModBlocks();
		NaturalBlocks.registerModBlocks();

		// Register Flammability
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.OAK_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.SPRUCE_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.BIRCH_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.JUNGLE_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.ACACIA_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.DARK_OAK_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.MANGROVE_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.CHERRY_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.BAMBOO_WALL, 20, 5);
		FlammableBlockRegistry.getDefaultInstance().add(BuildingBlocks.BAMBOO_MOSAIC_WALL, 20, 5);


		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.WHITE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.WHITE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.WHITE_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIGHT_GRAY_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIGHT_GRAY_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.GRAY_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.GRAY_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.GRAY_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BLACK_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BLACK_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BLACK_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BROWN_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BROWN_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BROWN_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.RED_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.RED_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.RED_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.ORANGE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.ORANGE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.ORANGE_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.YELLOW_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.YELLOW_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.YELLOW_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIME_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIME_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIME_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.GREEN_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.GREEN_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.GREEN_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.CYAN_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.CYAN_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.CYAN_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIGHT_BLUE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.LIGHT_BLUE_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BLUE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BLUE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.BLUE_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.PURPLE_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.PURPLE_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.PURPLE_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.MAGENTA_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.MAGENTA_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.MAGENTA_WOOL_WALL, 60, 30);

		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.PINK_WOOL_STAIRS, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.PINK_WOOL_SLAB, 60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ColoredBlocks.PINK_WOOL_WALL, 60, 30);

		// Register Fuels
		FuelRegistry.INSTANCE.add(BuildingBlocks.OAK_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.SPRUCE_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.BIRCH_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.JUNGLE_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.ACACIA_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.DARK_OAK_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.MANGROVE_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.CHERRY_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.BAMBOO_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.BAMBOO_MOSAIC_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.CRIMSON_WALL, 300);
		FuelRegistry.INSTANCE.add(BuildingBlocks.WARPED_WALL, 300);


		FuelRegistry.INSTANCE.add(ColoredBlocks.WHITE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.WHITE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.WHITE_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.LIGHT_GRAY_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.LIGHT_GRAY_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.GRAY_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.GRAY_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.BLACK_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.BLACK_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.BLACK_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.BROWN_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.BROWN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.BROWN_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.RED_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.RED_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.RED_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.ORANGE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.ORANGE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.ORANGE_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.YELLOW_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.YELLOW_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.YELLOW_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.LIME_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.LIME_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.LIME_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.GREEN_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.GREEN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.GREEN_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.CYAN_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.CYAN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.CYAN_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.LIGHT_BLUE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.LIGHT_BLUE_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.BLUE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.BLUE_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.PURPLE_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.PURPLE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.PURPLE_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.MAGENTA_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.MAGENTA_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.MAGENTA_WOOL_WALL, 50);

		FuelRegistry.INSTANCE.add(ColoredBlocks.PINK_WOOL_STAIRS, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.PINK_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ColoredBlocks.PINK_WOOL_WALL, 50);
	}
}