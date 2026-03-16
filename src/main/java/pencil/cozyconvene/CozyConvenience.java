package pencil.cozyconvene;

import net.fabricmc.api.ModInitializer;

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

		LOGGER.info("Hello Fabric world!");
	}
}