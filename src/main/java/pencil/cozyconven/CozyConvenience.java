package pencil.cozyconven;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pencil.cozyconven.item.MoItems;
import pencil.cozyconven.item.MoTabGroups;

public class CozyConvenience implements ModInitializer {

	public static final String MOD_ID = "cozy-convenience";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		MoItems.registerMoItems();
		MoTabGroups.registerTabGroups();
		LOGGER.info("Hello Fabric world!");
	}
}