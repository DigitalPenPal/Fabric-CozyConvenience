package pencil.cozyconvene.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pencil.cozyconvene.CozyConvenience;

public class MoItems {



    // REGISTRIES //

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CozyConvenience.MOD_ID, name), item);
    }

    public static void registerMoItems() {
        CozyConvenience.LOGGER.info("Registering Items for " + CozyConvenience.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}
