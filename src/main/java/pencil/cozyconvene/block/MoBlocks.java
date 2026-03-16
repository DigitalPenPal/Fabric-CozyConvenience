package pencil.cozyconvene.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
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
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_COLUMN_CRACKED = registerBlock("stone_column_cracked",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_COLUMN_MOSSY = registerBlock("stone_column_mossy",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    // THINK FAST CHUCKLENUTS 2.0

    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIME).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

        public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PINK).instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

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
    }
}
