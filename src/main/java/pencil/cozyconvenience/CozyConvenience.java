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
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_WOOL_SLAB,60, 30);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WOOL_SLAB,60, 30);

		// Register Fuels
		FuelRegistry.INSTANCE.add(ModBlocks.WHITE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLACK_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BROWN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.RED_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.ORANGE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.YELLOW_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIME_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.GREEN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.CYAN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PURPLE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.MAGENTA_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(ModBlocks.PINK_WOOL_SLAB, 50);
	}
}