package pencil.cozyconvenience.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;
import pencil.cozyconvenience.block.custom.*;
import pencil.cozyconvenience.block.deprecated.*;

public class NaturalBlocks {
    public static final Block GRASS_STAIRS = registerBlock("grass_stairs", new GrassStairs(Blocks.GRASS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)));
    public static final Block GRASS_SLAB = registerBlock("grass_slab", new GrassSlab(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK)));

    public static final Block PODZOL_STAIRS = registerBlock("podzol_stairs", new StairsBlock(Blocks.PODZOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PODZOL)));
    public static final Block PODZOL_SLAB = registerBlock("podzol_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PODZOL)));

    public static final Block MYCELIUM_STAIRS = registerBlock("mycelium_stairs", new MyceliumStairs(Blocks.MYCELIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MYCELIUM)));
    public static final Block MYCELIUM_SLAB = registerBlock("mycelium_slab", new MyceliumSlab(AbstractBlock.Settings.copy(Blocks.MYCELIUM)));

    public static final Block DIRT_PATH_STAIRS = registerBlock("dirt_path_stairs", new DirtPathStairs(Blocks.DIRT_PATH.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Block DIRT_PATH_SLAB = registerBlock("dirt_path_slab", new DirtPathSlab(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));

    public static final Block DIRT_STAIRS = registerBlock("dirt_stairs", new StairsBlock(Blocks.DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIRT)));
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT)));

    public static final Block COARSE_DIRT_STAIRS = registerBlock("coarse_dirt_stairs", new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
    public static final Block COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));

    public static final Block ROOTED_DIRT_STAIRS = registerBlock("rooted_dirt_stairs", new RootedDirtStairs(Blocks.ROOTED_DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
    public static final Block ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab", new RootedDirtSlab(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));

    public static final Block CRIMSON_NYLIUM_STAIRS = registerBlock("crimson_nylium_stairs", new NyliumStairs(Blocks.CRIMSON_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
    public static final Block CRIMSON_NYLIUM_SLAB = registerBlock("crimson_nylium_slab", new NyliumSlab(AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));

    public static final Block WARPED_NYLIUM_STAIRS = registerBlock("warped_nylium_stairs", new NyliumStairs(Blocks.WARPED_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
    public static final Block WARPED_NYLIUM_SLAB = registerBlock("warped_nylium_slab", new NyliumSlab(AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));

    // setup custom block classes
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs", new StairsBlock(Blocks.NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab", new NetherrackSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CozyConvenience.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CozyConvenience.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CozyConvenience.LOGGER.info("Registering Natural Blocks for " + CozyConvenience.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.addAfter(Blocks.GRASS_BLOCK, GRASS_STAIRS, GRASS_SLAB);
            entries.addAfter(Blocks.PODZOL, PODZOL_STAIRS, PODZOL_SLAB);
            entries.addAfter(Blocks.MYCELIUM, MYCELIUM_STAIRS, MYCELIUM_SLAB);
            entries.addAfter(Blocks.DIRT_PATH, DIRT_PATH_STAIRS, DIRT_PATH_SLAB);
            entries.addAfter(Blocks.DIRT, DIRT_STAIRS, DIRT_SLAB);
            entries.addAfter(Blocks.COARSE_DIRT, COARSE_DIRT_STAIRS, COARSE_DIRT_SLAB);
            entries.addAfter(Blocks.ROOTED_DIRT, ROOTED_DIRT_STAIRS, ROOTED_DIRT_SLAB);
            entries.addAfter(Blocks.CRIMSON_NYLIUM, CRIMSON_NYLIUM_STAIRS, CRIMSON_NYLIUM_SLAB);
            entries.addAfter(Blocks.WARPED_NYLIUM, WARPED_NYLIUM_STAIRS, WARPED_NYLIUM_SLAB);
        });
    }
}
