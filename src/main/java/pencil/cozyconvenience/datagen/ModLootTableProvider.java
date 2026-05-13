package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.state.property.Properties;
import pencil.cozyconvenience.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // ++ Building Blocks Category ++

        addDrop(ModBlocks.GRASS_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)                                              // silk touch + not double → slab
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.GRASS_BLOCK)                             // silk touch + double → grass block
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                        .with(ItemEntry.builder(ModBlocks.DIRT_SLAB)
                                                .conditionally(this.createSilkTouchCondition().invert())
                                                .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                        .properties(StatePredicate.Builder.create()
                                                                .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                        .invert()))                                                  // not double → dirt slab
                                        .with(ItemEntry.builder(Blocks.DIRT)
                                                .conditionally(this.createSilkTouchCondition().invert())
                                                .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                        .properties(StatePredicate.Builder.create()
                                                                .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));   // double → dirt block

        addDrop(ModBlocks.DIRT_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)                                              // silk touch + not double → slab
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.DIRT)                             // silk touch + double → dirt block
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.DIRT_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))                                                  // not double → dirt slab
                                .with(ItemEntry.builder(Blocks.DIRT)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));   // double → dirt block

        addDrop(ModBlocks.DIRT_PATH_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.DIRT_PATH)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.DIRT_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.DIRT)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));

        addDrop(ModBlocks.COARSE_DIRT_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.COARSE_DIRT)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.COARSE_DIRT_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.COARSE_DIRT)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));

        addDrop(ModBlocks.ROOTED_DIRT_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.ROOTED_DIRT)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.ROOTED_DIRT_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.ROOTED_DIRT)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));

        addDrop(ModBlocks.PODZOL_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.PODZOL)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.DIRT_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.DIRT)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));

        addDrop(ModBlocks.MYCELIUM_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.MYCELIUM)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.DIRT_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.DIRT)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));

        addDrop(ModBlocks.CRIMSON_NYLIUM_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.CRIMSON_NYLIUM)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.NETHERRACK_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.NETHERRACK)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));

        addDrop(ModBlocks.WARPED_NYLIUM_SLAB, block ->
                LootTable.builder()
                        .pool(LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(block)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.WARPED_NYLIUM)
                                        .conditionally(this.createSilkTouchCondition())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))
                                .with(ItemEntry.builder(ModBlocks.NETHERRACK_SLAB)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))
                                                .invert()))
                                .with(ItemEntry.builder(Blocks.NETHERRACK)
                                        .conditionally(this.createSilkTouchCondition().invert())
                                        .conditionally(BlockStatePropertyLootCondition.builder(block)
                                                .properties(StatePredicate.Builder.create()
                                                        .exactMatch(Properties.SLAB_TYPE, SlabType.DOUBLE))))));

        // Wood Blocks
        addDrop(ModBlocks.OAK_WALL);
        addDrop(ModBlocks.SPRUCE_WALL);
        addDrop(ModBlocks.BIRCH_WALL);
        addDrop(ModBlocks.JUNGLE_WALL);
        addDrop(ModBlocks.ACACIA_WALL);
        addDrop(ModBlocks.DARK_OAK_WALL);
        addDrop(ModBlocks.MANGROVE_WALL);
        addDrop(ModBlocks.CHERRY_WALL);
        addDrop(ModBlocks.BAMBOO_WALL);
        addDrop(ModBlocks.BAMBOO_MOSAIC_WALL);
        addDrop(ModBlocks.CRIMSON_WALL);
        addDrop(ModBlocks.WARPED_WALL);


        // Stone Blocks
        addDrop(ModBlocks.STONE_WALL);
        addDrop(ModBlocks.COBBLESTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLESTONE_BUTTON);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_BUTTON);
        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_STONE_WALL);
        addDrop(ModBlocks.SMOOTH_STONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_STONE_BUTTON);
        addDrop(ModBlocks.STONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.STONE_BRICK_BUTTON);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_STONE_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_STONE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_STONE_BRICK_BUTTON);
        addDrop(ModBlocks.MOSSY_STONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.MOSSY_STONE_BRICK_BUTTON);

        addDrop(ModBlocks.STONE_COLUMN);
        addDrop(ModBlocks.MOSSY_STONE_COLUMN);
        addDrop(ModBlocks.CRACKED_STONE_COLUMN);


        // Granite Blocks
        addDrop(ModBlocks.GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRANITE_BUTTON);
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_GRANITE_BUTTON);


        // Diorite Blocks
        addDrop(ModBlocks.DIORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.DIORITE_BUTTON);
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DIORITE_BUTTON);


        // Andesite Blocks
        addDrop(ModBlocks.ANDESITE_PRESSURE_PLATE);
        addDrop(ModBlocks.ANDESITE_BUTTON);
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_ANDESITE_BUTTON);


        // Deepslate Blocks
        addDrop(ModBlocks.DEEPSLATE_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_SLAB, slabDrops(ModBlocks.DEEPSLATE_SLAB));
        addDrop(ModBlocks.DEEPSLATE_WALL);
        addDrop(ModBlocks.DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_BUTTON);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.COBBLED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_BRICK_BUTTON);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_BRICK_BUTTON);
        addDrop(ModBlocks.DEEPSLATE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPSLATE_TILE_BUTTON);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB, slabDrops(ModBlocks.CRACKED_DEEPSLATE_TILE_SLAB));
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILE_WALL);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_DEEPSLATE_TILE_BUTTON);


        // Tuff Blocks
        addDrop(ModBlocks.TUFF_PRESSURE_PLATE);
        addDrop(ModBlocks.TUFF_BUTTON);
        addDrop(ModBlocks.POLISHED_TUFF_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_TUFF_BUTTON);
        addDrop(ModBlocks.TUFF_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.TUFF_BRICK_BUTTON);


        // Brick Blocks
        addDrop(ModBlocks.BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.BRICK_BUTTON);


        // Mud Blocks
        addDrop(ModBlocks.PACKED_MUD_STAIRS);
        addDrop(ModBlocks.PACKED_MUD_SLAB, slabDrops(ModBlocks.PACKED_MUD_SLAB));
        addDrop(ModBlocks.PACKED_MUD_WALL);
        addDrop(ModBlocks.PACKED_MUD_PRESSURE_PLATE);
        addDrop(ModBlocks.PACKED_MUD_BUTTON);
        addDrop(ModBlocks.MUD_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.MUD_BRICK_BUTTON);


        // Sandstone Blocks -- [ Here be Broken Blocks ]
        addDrop(ModBlocks.SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SANDSTONE_BUTTON);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_SANDSTONE_BUTTON);
        addDrop(ModBlocks.CUT_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CUT_SANDSTONE_WALL);
        addDrop(ModBlocks.CUT_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_SANDSTONE_BUTTON);
        addDrop(ModBlocks.RED_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_SANDSTONE_BUTTON);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_BUTTON);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_WALL);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_BUTTON);


        // Prismarine Blocks
        addDrop(ModBlocks.PRISMARINE_PRESSURE_PLATE);
        addDrop(ModBlocks.PRISMARINE_BUTTON);
        addDrop(ModBlocks.PRISMARINE_BRICK_WALL);
        addDrop(ModBlocks.PRISMARINE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.PRISMARINE_BRICK_BUTTON);
        addDrop(ModBlocks.DARK_PRISMARINE_WALL);
        addDrop(ModBlocks.DARK_PRISMARINE_PRESSURE_PLATE);
        addDrop(ModBlocks.DARK_PRISMARINE_BUTTON);


        // Netherrack Blocks
        addDrop(ModBlocks.NETHERRACK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_SLAB, slabDrops(ModBlocks.NETHERRACK_SLAB));
        addDrop(ModBlocks.NETHERRACK_WALL);
        addDrop(ModBlocks.NETHERRACK_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHERRACK_BUTTON);
        addDrop(ModBlocks.NETHER_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHER_BRICK_BUTTON);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_NETHER_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_NETHER_BRICK_BUTTON);
        addDrop(ModBlocks.RED_NETHER_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_NETHER_BRICK_BUTTON);


        // Basalt Blocks -- [ Here be Broken Blocks ]
        addDrop(ModBlocks.BASALT_STAIRS);
        addDrop(ModBlocks.BASALT_SLAB, slabDrops(ModBlocks.BASALT_SLAB));
        addDrop(ModBlocks.BASALT_WALL);
        addDrop(ModBlocks.BASALT_PRESSURE_PLATE);
        addDrop(ModBlocks.BASALT_BUTTON);
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_BASALT_BUTTON);
        addDrop(ModBlocks.POLISHED_BASALT_STAIRS);
        addDrop(ModBlocks.POLISHED_BASALT_SLAB, slabDrops(ModBlocks.POLISHED_BASALT_SLAB));
        addDrop(ModBlocks.POLISHED_BASALT_WALL);
        addDrop(ModBlocks.POLISHED_BASALT_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_BASALT_BUTTON);


        // Blackstone Blocks
        addDrop(ModBlocks.BLACKSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACKSTONE_BUTTON);
        addDrop(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.GILDED_BLACKSTONE_SLAB, slabDrops(ModBlocks.GILDED_BLACKSTONE_SLAB));
        addDrop(ModBlocks.GILDED_BLACKSTONE_WALL);
        addDrop(ModBlocks.GILDED_BLACKSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.GILDED_BLACKSTONE_BUTTON);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_BUTTON);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, slabDrops(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_BUTTON);


        // Endstone Blocks
        addDrop(ModBlocks.END_STONE_STAIRS);
        addDrop(ModBlocks.END_STONE_SLAB, slabDrops(ModBlocks.END_STONE_SLAB));
        addDrop(ModBlocks.END_STONE_WALL);
        addDrop(ModBlocks.END_STONE_PRESSURE_PLATE);
        addDrop(ModBlocks.END_STONE_BUTTON);
        addDrop(ModBlocks.END_STONE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.END_STONE_BRICK_BUTTON);


        // Purpur Blocks
        addDrop(ModBlocks.PURPUR_WALL);
        addDrop(ModBlocks.PURPUR_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPUR_BUTTON);


        // Iron Blocks
        addDrop(ModBlocks.IRON_STAIRS);
        addDrop(ModBlocks.IRON_SLAB, slabDrops(ModBlocks.IRON_SLAB));
        addDrop(ModBlocks.IRON_WALL);
        addDrop(ModBlocks.IRON_BUTTON);

        addDrop(ModBlocks.IRON_BAR_GATE);


        // Gold Blocks
        addDrop(ModBlocks.GOLD_STAIRS);
        addDrop(ModBlocks.GOLD_SLAB, slabDrops(ModBlocks.GOLD_SLAB));
        addDrop(ModBlocks.GOLD_WALL);
        addDrop(ModBlocks.GOLD_BUTTON);


        // Emerald Blocks
        addDrop(ModBlocks.EMERALD_STAIRS);
        addDrop(ModBlocks.EMERALD_SLAB, slabDrops(ModBlocks.EMERALD_SLAB));
        addDrop(ModBlocks.EMERALD_WALL);
        addDrop(ModBlocks.EMERALD_PRESSURE_PLATE);
        addDrop(ModBlocks.EMERALD_BUTTON);


        // Lapis Lazuli Blocks
        addDrop(ModBlocks.LAPIS_STAIRS);
        addDrop(ModBlocks.LAPIS_SLAB, slabDrops(ModBlocks.LAPIS_SLAB));
        addDrop(ModBlocks.LAPIS_WALL);
        addDrop(ModBlocks.LAPIS_PRESSURE_PLATE);
        addDrop(ModBlocks.LAPIS_BUTTON);


        // Diamond Blocks
        addDrop(ModBlocks.DIAMOND_STAIRS);
        addDrop(ModBlocks.DIAMOND_SLAB, slabDrops(ModBlocks.DIAMOND_SLAB));
        addDrop(ModBlocks.DIAMOND_WALL);
        addDrop(ModBlocks.DIAMOND_PRESSURE_PLATE);
        addDrop(ModBlocks.DIAMOND_BUTTON);


        // Netherite Blocks
        addDrop(ModBlocks.NETHERITE_STAIRS);
        addDrop(ModBlocks.NETHERITE_SLAB, slabDrops(ModBlocks.NETHERITE_SLAB));
        addDrop(ModBlocks.NETHERITE_WALL);
        addDrop(ModBlocks.NETHERITE_PRESSURE_PLATE);
        addDrop(ModBlocks.NETHERITE_BUTTON);


        // Quartz Blocks -- [ Here be Broken Blocks ]
        addDrop(ModBlocks.QUARTZ_WALL);
        addDrop(ModBlocks.QUARTZ_PRESSURE_PLATE);
        addDrop(ModBlocks.QUARTZ_BUTTON);
        addDrop(ModBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(ModBlocks.QUARTZ_BRICK_SLAB, slabDrops(ModBlocks.QUARTZ_BRICK_SLAB));
        addDrop(ModBlocks.QUARTZ_BRICK_WALL);
        addDrop(ModBlocks.QUARTZ_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.QUARTZ_BRICK_BUTTON);
        addDrop(ModBlocks.SMOOTH_QUARTZ_WALL);
        addDrop(ModBlocks.SMOOTH_QUARTZ_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_QUARTZ_BUTTON);


        // Amethyst Blocks
        addDrop(ModBlocks.AMETHYST_STAIRS);
        addDrop(ModBlocks.AMETHYST_SLAB, slabDrops(ModBlocks.AMETHYST_SLAB));
        addDrop(ModBlocks.AMETHYST_WALL);
        addDrop(ModBlocks.AMETHYST_PRESSURE_PLATE);
        addDrop(ModBlocks.AMETHYST_BUTTON);


        // ++ Colored Blocks Category ++


        // Concrete Blocks
        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ModBlocks.WHITE_CONCRETE_WALL);
        addDrop(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_CONCRETE_BUTTON);

        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);

        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_WALL);
        addDrop(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_CONCRETE_BUTTON);

        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_WALL);
        addDrop(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_CONCRETE_BUTTON);

        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_WALL);
        addDrop(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_CONCRETE_BUTTON);

        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_SLAB, slabDrops(ModBlocks.RED_CONCRETE_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_WALL);
        addDrop(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_CONCRETE_BUTTON);

        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_WALL);
        addDrop(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_BUTTON);

        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_WALL);
        addDrop(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_BUTTON);

        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_WALL);
        addDrop(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_CONCRETE_BUTTON);

        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_WALL);
        addDrop(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_CONCRETE_BUTTON);

        addDrop(ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB, slabDrops(ModBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_WALL);
        addDrop(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_CONCRETE_BUTTON);

        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);

        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_WALL);
        addDrop(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_CONCRETE_BUTTON);

        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_WALL);
        addDrop(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_BUTTON);

        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_WALL);
        addDrop(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_BUTTON);

        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_WALL);
        addDrop(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_CONCRETE_BUTTON);

        addDrop(ModBlocks.WHITE_CONCRETE_TILES);
        addDrop(ModBlocks.WHITE_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.WHITE_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.WHITE_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TILES);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.GRAY_CONCRETE_TILES);
        addDrop(ModBlocks.GRAY_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.GRAY_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.BLACK_CONCRETE_TILES);
        addDrop(ModBlocks.BLACK_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.BLACK_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.BROWN_CONCRETE_TILES);
        addDrop(ModBlocks.BROWN_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.BROWN_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.RED_CONCRETE_TILES);
        addDrop(ModBlocks.RED_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.RED_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.RED_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.ORANGE_CONCRETE_TILES);
        addDrop(ModBlocks.ORANGE_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.ORANGE_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.YELLOW_CONCRETE_TILES);
        addDrop(ModBlocks.YELLOW_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.YELLOW_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.LIME_CONCRETE_TILES);
        addDrop(ModBlocks.LIME_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.LIME_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.GREEN_CONCRETE_TILES);
        addDrop(ModBlocks.GREEN_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.GREEN_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.CYAN_CONCRETE_TILES);
        addDrop(ModBlocks.CYAN_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.CYAN_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.CYAN_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TILES);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.BLUE_CONCRETE_TILES);
        addDrop(ModBlocks.BLUE_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.BLUE_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.PURPLE_CONCRETE_TILES);
        addDrop(ModBlocks.PURPLE_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.PURPLE_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.MAGENTA_CONCRETE_TILES);
        addDrop(ModBlocks.MAGENTA_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.MAGENTA_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_CONCRETE_TILE_BUTTON);

        addDrop(ModBlocks.PINK_CONCRETE_TILES);
        addDrop(ModBlocks.PINK_CONCRETE_TILE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_TILE_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_TILE_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_TILE_WALL);
        addDrop(ModBlocks.PINK_CONCRETE_TILE_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_CONCRETE_TILE_BUTTON);


        // Terracotta Blocks
        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SLAB, slabDrops(ModBlocks.TERRACOTTA_SLAB));
        addDrop(ModBlocks.TERRACOTTA_WALL);
        addDrop(ModBlocks.TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.TERRACOTTA_BUTTON);

        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_SLAB, slabDrops(ModBlocks.WHITE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.WHITE_TERRACOTTA_WALL);
        addDrop(ModBlocks.WHITE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GRAY_TERRACOTTA_WALL);
        addDrop(ModBlocks.GRAY_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLACK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLACK_TERRACOTTA_WALL);
        addDrop(ModBlocks.BLACK_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_SLAB, slabDrops(ModBlocks.BROWN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BROWN_TERRACOTTA_WALL);
        addDrop(ModBlocks.BROWN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_SLAB, slabDrops(ModBlocks.RED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.RED_TERRACOTTA_WALL);
        addDrop(ModBlocks.RED_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_SLAB, slabDrops(ModBlocks.ORANGE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.ORANGE_TERRACOTTA_WALL);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_SLAB, slabDrops(ModBlocks.YELLOW_TERRACOTTA_SLAB));
        addDrop(ModBlocks.YELLOW_TERRACOTTA_WALL);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIME_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIME_TERRACOTTA_WALL);
        addDrop(ModBlocks.LIME_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_SLAB, slabDrops(ModBlocks.GREEN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GREEN_TERRACOTTA_WALL);
        addDrop(ModBlocks.GREEN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_SLAB, slabDrops(ModBlocks.CYAN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.CYAN_TERRACOTTA_WALL);
        addDrop(ModBlocks.CYAN_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLUE_TERRACOTTA_WALL);
        addDrop(ModBlocks.BLUE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_SLAB, slabDrops(ModBlocks.PURPLE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PURPLE_TERRACOTTA_WALL);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_SLAB, slabDrops(ModBlocks.MAGENTA_TERRACOTTA_SLAB));
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_WALL);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_BUTTON);

        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_SLAB, slabDrops(ModBlocks.PINK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PINK_TERRACOTTA_WALL);
        addDrop(ModBlocks.PINK_TERRACOTTA_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_TERRACOTTA_BUTTON);


        // Wool Blocks
        addDrop(ModBlocks.WHITE_WOOL_STAIRS);
        addDrop(ModBlocks.WHITE_WOOL_SLAB, slabDrops(ModBlocks.WHITE_WOOL_SLAB));
        addDrop(ModBlocks.WHITE_WOOL_WALL);
        addDrop(ModBlocks.WHITE_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_WOOL_BUTTON);

        addDrop(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_WOOL_BUTTON);

        addDrop(ModBlocks.GRAY_WOOL_STAIRS);
        addDrop(ModBlocks.GRAY_WOOL_SLAB, slabDrops(ModBlocks.GRAY_WOOL_SLAB));
        addDrop(ModBlocks.GRAY_WOOL_WALL);
        addDrop(ModBlocks.GRAY_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_WOOL_BUTTON);

        addDrop(ModBlocks.BLACK_WOOL_STAIRS);
        addDrop(ModBlocks.BLACK_WOOL_SLAB, slabDrops(ModBlocks.BLACK_WOOL_SLAB));
        addDrop(ModBlocks.BLACK_WOOL_WALL);
        addDrop(ModBlocks.BLACK_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_WOOL_BUTTON);

        addDrop(ModBlocks.BROWN_WOOL_STAIRS);
        addDrop(ModBlocks.BROWN_WOOL_SLAB, slabDrops(ModBlocks.BROWN_WOOL_SLAB));
        addDrop(ModBlocks.BROWN_WOOL_WALL);
        addDrop(ModBlocks.BROWN_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_WOOL_BUTTON);

        addDrop(ModBlocks.RED_WOOL_STAIRS);
        addDrop(ModBlocks.RED_WOOL_SLAB, slabDrops(ModBlocks.RED_WOOL_SLAB));
        addDrop(ModBlocks.RED_WOOL_WALL);
        addDrop(ModBlocks.RED_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_WOOL_BUTTON);

        addDrop(ModBlocks.ORANGE_WOOL_STAIRS);
        addDrop(ModBlocks.ORANGE_WOOL_SLAB, slabDrops(ModBlocks.ORANGE_WOOL_SLAB));
        addDrop(ModBlocks.ORANGE_WOOL_WALL);
        addDrop(ModBlocks.ORANGE_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_WOOL_BUTTON);

        addDrop(ModBlocks.YELLOW_WOOL_STAIRS);
        addDrop(ModBlocks.YELLOW_WOOL_SLAB, slabDrops(ModBlocks.YELLOW_WOOL_SLAB));
        addDrop(ModBlocks.YELLOW_WOOL_WALL);
        addDrop(ModBlocks.YELLOW_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_WOOL_BUTTON);

        addDrop(ModBlocks.LIME_WOOL_STAIRS);
        addDrop(ModBlocks.LIME_WOOL_SLAB, slabDrops(ModBlocks.LIME_WOOL_SLAB));
        addDrop(ModBlocks.LIME_WOOL_WALL);
        addDrop(ModBlocks.LIME_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_WOOL_BUTTON);

        addDrop(ModBlocks.GREEN_WOOL_STAIRS);
        addDrop(ModBlocks.GREEN_WOOL_SLAB, slabDrops(ModBlocks.GREEN_WOOL_SLAB));
        addDrop(ModBlocks.GREEN_WOOL_WALL);
        addDrop(ModBlocks.GREEN_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_WOOL_BUTTON);

        addDrop(ModBlocks.CYAN_WOOL_STAIRS);
        addDrop(ModBlocks.CYAN_WOOL_SLAB, slabDrops(ModBlocks.CYAN_WOOL_SLAB));
        addDrop(ModBlocks.CYAN_WOOL_WALL);
        addDrop(ModBlocks.CYAN_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_WOOL_BUTTON);

        addDrop(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_WOOL_BUTTON);

        addDrop(ModBlocks.BLUE_WOOL_STAIRS);
        addDrop(ModBlocks.BLUE_WOOL_SLAB, slabDrops(ModBlocks.BLUE_WOOL_SLAB));
        addDrop(ModBlocks.BLUE_WOOL_WALL);
        addDrop(ModBlocks.BLUE_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_WOOL_BUTTON);

        addDrop(ModBlocks.PURPLE_WOOL_STAIRS);
        addDrop(ModBlocks.PURPLE_WOOL_SLAB, slabDrops(ModBlocks.PURPLE_WOOL_SLAB));
        addDrop(ModBlocks.PURPLE_WOOL_WALL);
        addDrop(ModBlocks.PURPLE_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_WOOL_BUTTON);

        addDrop(ModBlocks.MAGENTA_WOOL_STAIRS);
        addDrop(ModBlocks.MAGENTA_WOOL_SLAB, slabDrops(ModBlocks.MAGENTA_WOOL_SLAB));
        addDrop(ModBlocks.MAGENTA_WOOL_WALL);
        addDrop(ModBlocks.MAGENTA_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_WOOL_BUTTON);

        addDrop(ModBlocks.PINK_WOOL_STAIRS);
        addDrop(ModBlocks.PINK_WOOL_SLAB, slabDrops(ModBlocks.PINK_WOOL_SLAB));
        addDrop(ModBlocks.PINK_WOOL_WALL);
        addDrop(ModBlocks.PINK_WOOL_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_WOOL_BUTTON);
    }
}
