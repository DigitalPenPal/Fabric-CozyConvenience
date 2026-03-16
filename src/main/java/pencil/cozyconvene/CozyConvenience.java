package pencil.cozyconvene;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pencil.cozyconvene.block.MoBlocks;
import pencil.cozyconvene.item.MoItems;
import pencil.cozyconvene.item.MoTabGroups;

public class CozyConvenience implements ModInitializer {

	public static final String MOD_ID = "cozy-convenience";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		MoItems.registerMoItems();
		MoTabGroups.registerTabGroups();
		MoBlocks.registerMoBlocks();

		FuelRegistry.INSTANCE.add(MoBlocks.WHITE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.LIGHT_GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.GRAY_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.BLACK_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.BROWN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.RED_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.ORANGE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.YELLOW_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.LIME_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.GREEN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.CYAN_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.LIGHT_BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.BLUE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.PURPLE_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.MAGENTA_WOOL_SLAB, 50);
		FuelRegistry.INSTANCE.add(MoBlocks.PINK_WOOL_SLAB, 50);
	}
}