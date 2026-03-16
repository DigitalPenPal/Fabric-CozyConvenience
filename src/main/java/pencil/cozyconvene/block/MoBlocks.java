package pencil.cozyconvene.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import pencil.cozyconvene.CozyConvenience;

public class MoBlocks {

    public static final Block STONE_COLUMN = registerBlock("stone_column",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_COLUMN_CRACKED = registerBlock("stone_column_cracked",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_COLUMN_MOSSY = registerBlock("stone_column_mossy",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));


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
