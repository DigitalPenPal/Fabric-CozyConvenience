package pencil.cozyconvene.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import pencil.cozyconvene.block.MoBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(MoBlocks.STONE_COLUMN);
        addDrop(MoBlocks.STONE_COLUMN_MOSSY);
        addDrop(MoBlocks.STONE_COLUMN_CRACKED);

        addDrop(MoBlocks.WHITE_WOOL_SLAB, slabDrops(MoBlocks.WHITE_WOOL_SLAB));
        addDrop(MoBlocks.LIGHT_GRAY_WOOL_SLAB, slabDrops(MoBlocks.LIGHT_GRAY_WOOL_SLAB));
        addDrop(MoBlocks.GRAY_WOOL_SLAB, slabDrops(MoBlocks.GRAY_WOOL_SLAB));
        addDrop(MoBlocks.BLACK_WOOL_SLAB, slabDrops(MoBlocks.BLACK_WOOL_SLAB));
        addDrop(MoBlocks.BROWN_WOOL_SLAB, slabDrops(MoBlocks.BROWN_WOOL_SLAB));
        addDrop(MoBlocks.RED_WOOL_SLAB, slabDrops(MoBlocks.RED_WOOL_SLAB));
        addDrop(MoBlocks.ORANGE_WOOL_SLAB, slabDrops(MoBlocks.ORANGE_WOOL_SLAB));
        addDrop(MoBlocks.YELLOW_WOOL_SLAB, slabDrops(MoBlocks.YELLOW_WOOL_SLAB));
        addDrop(MoBlocks.LIME_WOOL_SLAB, slabDrops(MoBlocks.LIME_WOOL_SLAB));
        addDrop(MoBlocks.GREEN_WOOL_SLAB, slabDrops(MoBlocks.GREEN_WOOL_SLAB));
        addDrop(MoBlocks.CYAN_WOOL_SLAB, slabDrops(MoBlocks.CYAN_WOOL_SLAB));
        addDrop(MoBlocks.LIGHT_BLUE_WOOL_SLAB, slabDrops(MoBlocks.LIGHT_BLUE_WOOL_SLAB));
        addDrop(MoBlocks.BLUE_WOOL_SLAB, slabDrops(MoBlocks.BLUE_WOOL_SLAB));
        addDrop(MoBlocks.PURPLE_WOOL_SLAB, slabDrops(MoBlocks.PURPLE_WOOL_SLAB));
        addDrop(MoBlocks.MAGENTA_WOOL_SLAB, slabDrops(MoBlocks.MAGENTA_WOOL_SLAB));
        addDrop(MoBlocks.PINK_WOOL_SLAB, slabDrops(MoBlocks.PINK_WOOL_SLAB));
    }
}
