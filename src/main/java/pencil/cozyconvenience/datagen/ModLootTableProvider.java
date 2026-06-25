package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.SlabType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.state.property.Properties;
import pencil.cozyconvenience.block.BuildingBlocks;
import pencil.cozyconvenience.block.ColoredBlocks;
import pencil.cozyconvenience.block.NaturalBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // ++ Building Blocks Category ++

        addDrop(NaturalBlocks.GRASS_SLAB, block ->
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
                                        .with(ItemEntry.builder(NaturalBlocks.DIRT_SLAB)
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

        addDrop(NaturalBlocks.DIRT_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.DIRT_SLAB)
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

        addDrop(NaturalBlocks.DIRT_PATH_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.DIRT_SLAB)
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

        addDrop(NaturalBlocks.COARSE_DIRT_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.COARSE_DIRT_SLAB)
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

        addDrop(NaturalBlocks.ROOTED_DIRT_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.ROOTED_DIRT_SLAB)
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

        addDrop(NaturalBlocks.PODZOL_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.DIRT_SLAB)
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

        addDrop(NaturalBlocks.MYCELIUM_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.DIRT_SLAB)
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

        addDrop(NaturalBlocks.CRIMSON_NYLIUM_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.NETHERRACK_SLAB)
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

        addDrop(NaturalBlocks.WARPED_NYLIUM_SLAB, block ->
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
                                .with(ItemEntry.builder(NaturalBlocks.NETHERRACK_SLAB)
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
        addDrop(BuildingBlocks.OAK_WALL);
        addDrop(BuildingBlocks.SPRUCE_WALL);
        addDrop(BuildingBlocks.BIRCH_WALL);
        addDrop(BuildingBlocks.JUNGLE_WALL);
        addDrop(BuildingBlocks.ACACIA_WALL);
        addDrop(BuildingBlocks.DARK_OAK_WALL);
        addDrop(BuildingBlocks.MANGROVE_WALL);
        addDrop(BuildingBlocks.CHERRY_WALL);
        addDrop(BuildingBlocks.BAMBOO_WALL);
        addDrop(BuildingBlocks.BAMBOO_MOSAIC_WALL);
        addDrop(BuildingBlocks.CRIMSON_WALL);
        addDrop(BuildingBlocks.WARPED_WALL);


        // Stone Blocks
        addDrop(BuildingBlocks.STONE_WALL);

        addDrop(BuildingBlocks.SMOOTH_STONE_STAIRS);
        addDrop(BuildingBlocks.SMOOTH_STONE_WALL);

        addDrop(BuildingBlocks.CRACKED_STONE_BRICK_STAIRS);
        addDrop(BuildingBlocks.CRACKED_STONE_BRICK_SLAB, slabDrops(BuildingBlocks.CRACKED_STONE_BRICK_SLAB));
        addDrop(BuildingBlocks.CRACKED_STONE_BRICK_WALL);


        addDrop(BuildingBlocks.STONE_COLUMN);
        addDrop(BuildingBlocks.MOSSY_STONE_COLUMN);
        addDrop(BuildingBlocks.CRACKED_STONE_COLUMN);


        // Granite Blocks

        addDrop(BuildingBlocks.POLISHED_GRANITE_WALL);



        // Diorite Blocks

        addDrop(BuildingBlocks.POLISHED_DIORITE_WALL);



        // Andesite Blocks

        addDrop(BuildingBlocks.POLISHED_ANDESITE_WALL);



        // Deepslate Blocks
        addDrop(BuildingBlocks.DEEPSLATE_STAIRS);
        addDrop(BuildingBlocks.DEEPSLATE_SLAB, slabDrops(BuildingBlocks.DEEPSLATE_SLAB));
        addDrop(BuildingBlocks.DEEPSLATE_WALL);

        addDrop(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
        addDrop(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, slabDrops(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_SLAB));
        addDrop(BuildingBlocks.CRACKED_DEEPSLATE_BRICK_WALL);

        addDrop(BuildingBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
        addDrop(BuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB, slabDrops(BuildingBlocks.CRACKED_DEEPSLATE_TILE_SLAB));
        addDrop(BuildingBlocks.CRACKED_DEEPSLATE_TILE_WALL);
        

        // Mud Blocks
        addDrop(BuildingBlocks.PACKED_MUD_STAIRS);
        addDrop(BuildingBlocks.PACKED_MUD_SLAB, slabDrops(BuildingBlocks.PACKED_MUD_SLAB));
        addDrop(BuildingBlocks.PACKED_MUD_WALL);



        // Sandstone Blocks -- [ Here be Broken Blocks ]

        addDrop(BuildingBlocks.SMOOTH_SANDSTONE_WALL);

        addDrop(BuildingBlocks.CUT_SANDSTONE_STAIRS);
        addDrop(BuildingBlocks.CUT_SANDSTONE_WALL);

        addDrop(BuildingBlocks.SMOOTH_RED_SANDSTONE_WALL);

        addDrop(BuildingBlocks.CUT_RED_SANDSTONE_STAIRS);
        addDrop(BuildingBlocks.CUT_RED_SANDSTONE_WALL);



        // Prismarine Blocks

        addDrop(BuildingBlocks.PRISMARINE_BRICK_WALL);

        addDrop(BuildingBlocks.DARK_PRISMARINE_WALL);



        // Netherrack Blocks
        addDrop(NaturalBlocks.NETHERRACK_STAIRS);
        addDrop(NaturalBlocks.NETHERRACK_SLAB, slabDrops(NaturalBlocks.NETHERRACK_SLAB));
        addDrop(NaturalBlocks.NETHERRACK_WALL);


        addDrop(BuildingBlocks.CRACKED_NETHER_BRICK_STAIRS);
        addDrop(BuildingBlocks.CRACKED_NETHER_BRICK_SLAB, slabDrops(BuildingBlocks.CRACKED_NETHER_BRICK_SLAB));
        addDrop(BuildingBlocks.CRACKED_NETHER_BRICK_WALL);




        // Basalt Blocks -- [ Here be Broken Blocks ]
        addDrop(BuildingBlocks.BASALT_STAIRS);
        addDrop(BuildingBlocks.BASALT_SLAB, slabDrops(BuildingBlocks.BASALT_SLAB));
        addDrop(BuildingBlocks.BASALT_WALL);
        addDrop(BuildingBlocks.SMOOTH_BASALT_STAIRS);
        addDrop(BuildingBlocks.SMOOTH_BASALT_SLAB, slabDrops(BuildingBlocks.SMOOTH_BASALT_SLAB));
        addDrop(BuildingBlocks.SMOOTH_BASALT_WALL);
        addDrop(BuildingBlocks.POLISHED_BASALT_STAIRS);
        addDrop(BuildingBlocks.POLISHED_BASALT_SLAB, slabDrops(BuildingBlocks.POLISHED_BASALT_SLAB));
        addDrop(BuildingBlocks.POLISHED_BASALT_WALL);


        // Blackstone Blocks
        addDrop(BuildingBlocks.GILDED_BLACKSTONE_STAIRS);
        addDrop(BuildingBlocks.GILDED_BLACKSTONE_SLAB, slabDrops(BuildingBlocks.GILDED_BLACKSTONE_SLAB));
        addDrop(BuildingBlocks.GILDED_BLACKSTONE_WALL);
        addDrop(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        addDrop(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, slabDrops(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB));
        addDrop(BuildingBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);


        // Endstone Blocks
        addDrop(BuildingBlocks.END_STONE_STAIRS);
        addDrop(BuildingBlocks.END_STONE_SLAB, slabDrops(BuildingBlocks.END_STONE_SLAB));
        addDrop(BuildingBlocks.END_STONE_WALL);


        // Purpur Blocks
        addDrop(BuildingBlocks.PURPUR_WALL);


        // Iron Blocks
        addDrop(BuildingBlocks.IRON_STAIRS);
        addDrop(BuildingBlocks.IRON_SLAB, slabDrops(BuildingBlocks.IRON_SLAB));
        addDrop(BuildingBlocks.IRON_WALL);

        addDrop(BuildingBlocks.IRON_BAR_GATE);


        // Gold Blocks
        addDrop(BuildingBlocks.GOLD_STAIRS);
        addDrop(BuildingBlocks.GOLD_SLAB, slabDrops(BuildingBlocks.GOLD_SLAB));
        addDrop(BuildingBlocks.GOLD_WALL);


        // Emerald Blocks
        addDrop(BuildingBlocks.EMERALD_STAIRS);
        addDrop(BuildingBlocks.EMERALD_SLAB, slabDrops(BuildingBlocks.EMERALD_SLAB));
        addDrop(BuildingBlocks.EMERALD_WALL);


        // Lapis Lazuli Blocks
        addDrop(BuildingBlocks.LAPIS_STAIRS);
        addDrop(BuildingBlocks.LAPIS_SLAB, slabDrops(BuildingBlocks.LAPIS_SLAB));
        addDrop(BuildingBlocks.LAPIS_WALL);


        // Diamond Blocks
        addDrop(BuildingBlocks.DIAMOND_STAIRS);
        addDrop(BuildingBlocks.DIAMOND_SLAB, slabDrops(BuildingBlocks.DIAMOND_SLAB));
        addDrop(BuildingBlocks.DIAMOND_WALL);


        // Netherite Blocks
        addDrop(BuildingBlocks.NETHERITE_STAIRS);
        addDrop(BuildingBlocks.NETHERITE_SLAB, slabDrops(BuildingBlocks.NETHERITE_SLAB));
        addDrop(BuildingBlocks.NETHERITE_WALL);


        // Quartz Blocks -- [ Here be Broken Blocks ]
        addDrop(BuildingBlocks.QUARTZ_WALL);
        addDrop(BuildingBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(BuildingBlocks.QUARTZ_BRICK_SLAB, slabDrops(BuildingBlocks.QUARTZ_BRICK_SLAB));
        addDrop(BuildingBlocks.QUARTZ_BRICK_WALL);
        addDrop(BuildingBlocks.SMOOTH_QUARTZ_WALL);


        // Amethyst Blocks
        addDrop(BuildingBlocks.AMETHYST_STAIRS);
        addDrop(BuildingBlocks.AMETHYST_SLAB, slabDrops(BuildingBlocks.AMETHYST_SLAB));
        addDrop(BuildingBlocks.AMETHYST_WALL);


        addDrop(ColoredBlocks.WHITE_WOOL_STAIRS);
        addDrop(ColoredBlocks.WHITE_WOOL_SLAB, slabDrops(ColoredBlocks.WHITE_WOOL_SLAB));
        addDrop(ColoredBlocks.WHITE_WOOL_WALL);

        addDrop(ColoredBlocks.LIGHT_GRAY_WOOL_STAIRS);
        addDrop(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(ColoredBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(ColoredBlocks.LIGHT_GRAY_WOOL_WALL);

        addDrop(ColoredBlocks.GRAY_WOOL_STAIRS);
        addDrop(ColoredBlocks.GRAY_WOOL_SLAB, slabDrops(ColoredBlocks.GRAY_WOOL_SLAB));
        addDrop(ColoredBlocks.GRAY_WOOL_WALL);

        addDrop(ColoredBlocks.BLACK_WOOL_STAIRS);
        addDrop(ColoredBlocks.BLACK_WOOL_SLAB, slabDrops(ColoredBlocks.BLACK_WOOL_SLAB));
        addDrop(ColoredBlocks.BLACK_WOOL_WALL);

        addDrop(ColoredBlocks.BROWN_WOOL_STAIRS);
        addDrop(ColoredBlocks.BROWN_WOOL_SLAB, slabDrops(ColoredBlocks.BROWN_WOOL_SLAB));
        addDrop(ColoredBlocks.BROWN_WOOL_WALL);

        addDrop(ColoredBlocks.RED_WOOL_STAIRS);
        addDrop(ColoredBlocks.RED_WOOL_SLAB, slabDrops(ColoredBlocks.RED_WOOL_SLAB));
        addDrop(ColoredBlocks.RED_WOOL_WALL);

        addDrop(ColoredBlocks.ORANGE_WOOL_STAIRS);
        addDrop(ColoredBlocks.ORANGE_WOOL_SLAB, slabDrops(ColoredBlocks.ORANGE_WOOL_SLAB));
        addDrop(ColoredBlocks.ORANGE_WOOL_WALL);

        addDrop(ColoredBlocks.YELLOW_WOOL_STAIRS);
        addDrop(ColoredBlocks.YELLOW_WOOL_SLAB, slabDrops(ColoredBlocks.YELLOW_WOOL_SLAB));
        addDrop(ColoredBlocks.YELLOW_WOOL_WALL);

        addDrop(ColoredBlocks.LIME_WOOL_STAIRS);
        addDrop(ColoredBlocks.LIME_WOOL_SLAB, slabDrops(ColoredBlocks.LIME_WOOL_SLAB));
        addDrop(ColoredBlocks.LIME_WOOL_WALL);

        addDrop(ColoredBlocks.GREEN_WOOL_STAIRS);
        addDrop(ColoredBlocks.GREEN_WOOL_SLAB, slabDrops(ColoredBlocks.GREEN_WOOL_SLAB));
        addDrop(ColoredBlocks.GREEN_WOOL_WALL);

        addDrop(ColoredBlocks.CYAN_WOOL_STAIRS);
        addDrop(ColoredBlocks.CYAN_WOOL_SLAB, slabDrops(ColoredBlocks.CYAN_WOOL_SLAB));
        addDrop(ColoredBlocks.CYAN_WOOL_WALL);

        addDrop(ColoredBlocks.LIGHT_BLUE_WOOL_STAIRS);
        addDrop(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(ColoredBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(ColoredBlocks.LIGHT_BLUE_WOOL_WALL);

        addDrop(ColoredBlocks.BLUE_WOOL_STAIRS);
        addDrop(ColoredBlocks.BLUE_WOOL_SLAB, slabDrops(ColoredBlocks.BLUE_WOOL_SLAB));
        addDrop(ColoredBlocks.BLUE_WOOL_WALL);

        addDrop(ColoredBlocks.PURPLE_WOOL_STAIRS);
        addDrop(ColoredBlocks.PURPLE_WOOL_SLAB, slabDrops(ColoredBlocks.PURPLE_WOOL_SLAB));
        addDrop(ColoredBlocks.PURPLE_WOOL_WALL);

        addDrop(ColoredBlocks.MAGENTA_WOOL_STAIRS);
        addDrop(ColoredBlocks.MAGENTA_WOOL_SLAB, slabDrops(ColoredBlocks.MAGENTA_WOOL_SLAB));
        addDrop(ColoredBlocks.MAGENTA_WOOL_WALL);

        addDrop(ColoredBlocks.PINK_WOOL_STAIRS);
        addDrop(ColoredBlocks.PINK_WOOL_SLAB, slabDrops(ColoredBlocks.PINK_WOOL_SLAB));
        addDrop(ColoredBlocks.PINK_WOOL_WALL);


        addDrop(ColoredBlocks.TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.TERRACOTTA_SLAB, slabDrops(ColoredBlocks.TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.TERRACOTTA_WALL);

        addDrop(ColoredBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.WHITE_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.WHITE_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.WHITE_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.GRAY_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.GRAY_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.GRAY_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.BLACK_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.BLACK_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.BLACK_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.BROWN_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.BROWN_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.BROWN_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.RED_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.RED_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.RED_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.ORANGE_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.ORANGE_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.ORANGE_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.YELLOW_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.YELLOW_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.YELLOW_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.LIME_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.LIME_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.LIME_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.GREEN_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.GREEN_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.GREEN_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.CYAN_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.CYAN_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.CYAN_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.BLUE_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.BLUE_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.BLUE_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.PURPLE_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.PURPLE_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.PURPLE_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.MAGENTA_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.MAGENTA_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.MAGENTA_TERRACOTTA_WALL);

        addDrop(ColoredBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ColoredBlocks.PINK_TERRACOTTA_SLAB, slabDrops(ColoredBlocks.PINK_TERRACOTTA_SLAB));
        addDrop(ColoredBlocks.PINK_TERRACOTTA_WALL);


        addDrop(ColoredBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.WHITE_CONCRETE_SLAB, slabDrops(ColoredBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ColoredBlocks.WHITE_CONCRETE_WALL);

        addDrop(ColoredBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ColoredBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ColoredBlocks.LIGHT_GRAY_CONCRETE_WALL);

        addDrop(ColoredBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.GRAY_CONCRETE_SLAB, slabDrops(ColoredBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ColoredBlocks.GRAY_CONCRETE_WALL);

        addDrop(ColoredBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.BLACK_CONCRETE_SLAB, slabDrops(ColoredBlocks.BLACK_CONCRETE_SLAB));
        addDrop(ColoredBlocks.BLACK_CONCRETE_WALL);

        addDrop(ColoredBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.BROWN_CONCRETE_SLAB, slabDrops(ColoredBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ColoredBlocks.BROWN_CONCRETE_WALL);

        addDrop(ColoredBlocks.RED_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.RED_CONCRETE_SLAB, slabDrops(ColoredBlocks.RED_CONCRETE_SLAB));
        addDrop(ColoredBlocks.RED_CONCRETE_WALL);

        addDrop(ColoredBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ColoredBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ColoredBlocks.ORANGE_CONCRETE_WALL);

        addDrop(ColoredBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ColoredBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ColoredBlocks.YELLOW_CONCRETE_WALL);

        addDrop(ColoredBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.LIME_CONCRETE_SLAB, slabDrops(ColoredBlocks.LIME_CONCRETE_SLAB));
        addDrop(ColoredBlocks.LIME_CONCRETE_WALL);

        addDrop(ColoredBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.GREEN_CONCRETE_SLAB, slabDrops(ColoredBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ColoredBlocks.GREEN_CONCRETE_WALL);

        addDrop(ColoredBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.CYAN_CONCRETE_SLAB, slabDrops(ColoredBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ColoredBlocks.CYAN_CONCRETE_WALL);

        addDrop(ColoredBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ColoredBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ColoredBlocks.LIGHT_BLUE_CONCRETE_WALL);

        addDrop(ColoredBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.BLUE_CONCRETE_SLAB, slabDrops(ColoredBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ColoredBlocks.BLUE_CONCRETE_WALL);

        addDrop(ColoredBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ColoredBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ColoredBlocks.PURPLE_CONCRETE_WALL);

        addDrop(ColoredBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ColoredBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ColoredBlocks.MAGENTA_CONCRETE_WALL);

        addDrop(ColoredBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ColoredBlocks.PINK_CONCRETE_SLAB, slabDrops(ColoredBlocks.PINK_CONCRETE_SLAB));
        addDrop(ColoredBlocks.PINK_CONCRETE_WALL);


        addDrop(ColoredBlocks.WHITE_CONCRETE_TILES);
        addDrop(ColoredBlocks.WHITE_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.WHITE_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.WHITE_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.WHITE_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILES);
        addDrop(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.GRAY_CONCRETE_TILES);
        addDrop(ColoredBlocks.GRAY_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.GRAY_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.GRAY_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.GRAY_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.BLACK_CONCRETE_TILES);
        addDrop(ColoredBlocks.BLACK_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.BLACK_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.BLACK_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.BLACK_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.BROWN_CONCRETE_TILES);
        addDrop(ColoredBlocks.BROWN_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.BROWN_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.BROWN_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.BROWN_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.RED_CONCRETE_TILES);
        addDrop(ColoredBlocks.RED_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.RED_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.RED_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.RED_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.ORANGE_CONCRETE_TILES);
        addDrop(ColoredBlocks.ORANGE_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.ORANGE_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.ORANGE_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.ORANGE_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.YELLOW_CONCRETE_TILES);
        addDrop(ColoredBlocks.YELLOW_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.YELLOW_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.YELLOW_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.YELLOW_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.LIME_CONCRETE_TILES);
        addDrop(ColoredBlocks.LIME_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.LIME_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.LIME_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.LIME_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.GREEN_CONCRETE_TILES);
        addDrop(ColoredBlocks.GREEN_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.GREEN_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.GREEN_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.GREEN_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.CYAN_CONCRETE_TILES);
        addDrop(ColoredBlocks.CYAN_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.CYAN_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.CYAN_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.CYAN_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILES);
        addDrop(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.BLUE_CONCRETE_TILES);
        addDrop(ColoredBlocks.BLUE_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.BLUE_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.BLUE_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.BLUE_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.PURPLE_CONCRETE_TILES);
        addDrop(ColoredBlocks.PURPLE_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.PURPLE_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.PURPLE_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.PURPLE_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.MAGENTA_CONCRETE_TILES);
        addDrop(ColoredBlocks.MAGENTA_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.MAGENTA_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.MAGENTA_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.MAGENTA_CONCRETE_TILE_WALL);

        addDrop(ColoredBlocks.PINK_CONCRETE_TILES);
        addDrop(ColoredBlocks.PINK_CONCRETE_TILE_STAIRS);
        addDrop(ColoredBlocks.PINK_CONCRETE_TILE_SLAB, slabDrops(ColoredBlocks.PINK_CONCRETE_TILE_SLAB));
        addDrop(ColoredBlocks.PINK_CONCRETE_TILE_WALL);
    }
}
