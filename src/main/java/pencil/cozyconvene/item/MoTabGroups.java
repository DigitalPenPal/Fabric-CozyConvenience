package pencil.cozyconvene.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pencil.cozyconvene.CozyConvenience;
import pencil.cozyconvene.block.MoBlocks;

public class MoTabGroups {

    public static final ItemGroup COZY_CONVENE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CozyConvenience.MOD_ID, "cozy_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.ARMOR_STAND))
                    .displayName(Text.translatable("itemgroup.cozy-convenience.cozy_items"))
                    .entries((displayContext, entries) -> {


                    }).build());

    public static final ItemGroup COZY_CONVENE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CozyConvenience.MOD_ID, "cozy_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(MoBlocks.STONE_COLUMN))
                    .displayName(Text.translatable("itemgroup.cozy-convenience.cozy_blocks"))
                    .entries((displayContext, entries) -> {

                        entries.add(MoBlocks.STONE_COLUMN);
                        entries.add(MoBlocks.STONE_COLUMN_CRACKED);
                        entries.add(MoBlocks.STONE_COLUMN_MOSSY);
                    }).build());


    // REGISTRY //

    public static void registerTabGroups() { CozyConvenience.LOGGER.info("Registering Tab Groups for " + CozyConvenience.MOD_ID);
    }
}
