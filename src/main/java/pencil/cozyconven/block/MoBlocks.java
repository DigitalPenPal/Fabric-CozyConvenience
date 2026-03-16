package pencil.cozyconven.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import pencil.cozyconven.CozyConvenience;

public class MoBlocks {

    public static final Block CHOCOLATE_BLOCK = registerBlock("chocolate_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5F).sounds(BlockSoundGroup.TUFF)));


    // REGISTRIES //

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CozyConvenience.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CozyConvenience.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerMoBlocks() {
        CozyConvenience.LOGGER.info("Registering Blocks for " + CozyConvenience.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}
