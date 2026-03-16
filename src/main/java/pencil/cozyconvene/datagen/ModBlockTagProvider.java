package pencil.cozyconvene.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import pencil.cozyconvene.block.MoBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(MoBlocks.WHITE_WOOL_SLAB)
                .add(MoBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(MoBlocks.GRAY_WOOL_SLAB)
                .add(MoBlocks.BLACK_WOOL_SLAB)
                .add(MoBlocks.BROWN_WOOL_SLAB)
                .add(MoBlocks.RED_WOOL_SLAB)
                .add(MoBlocks.ORANGE_WOOL_SLAB)
                .add(MoBlocks.YELLOW_WOOL_SLAB)
                .add(MoBlocks.LIME_WOOL_SLAB)
                .add(MoBlocks.GREEN_WOOL_SLAB)
                .add(MoBlocks.CYAN_WOOL_SLAB)
                .add(MoBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(MoBlocks.BLUE_WOOL_SLAB)
                .add(MoBlocks.PURPLE_WOOL_SLAB)
                .add(MoBlocks.MAGENTA_WOOL_SLAB)
                .add(MoBlocks.PINK_WOOL_SLAB);

        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
                .add(MoBlocks.WHITE_WOOL_SLAB)
                .add(MoBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(MoBlocks.GRAY_WOOL_SLAB)
                .add(MoBlocks.BLACK_WOOL_SLAB)
                .add(MoBlocks.BROWN_WOOL_SLAB)
                .add(MoBlocks.RED_WOOL_SLAB)
                .add(MoBlocks.ORANGE_WOOL_SLAB)
                .add(MoBlocks.YELLOW_WOOL_SLAB)
                .add(MoBlocks.LIME_WOOL_SLAB)
                .add(MoBlocks.GREEN_WOOL_SLAB)
                .add(MoBlocks.CYAN_WOOL_SLAB)
                .add(MoBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(MoBlocks.BLUE_WOOL_SLAB)
                .add(MoBlocks.PURPLE_WOOL_SLAB)
                .add(MoBlocks.MAGENTA_WOOL_SLAB)
                .add(MoBlocks.PINK_WOOL_SLAB);

        getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
                .add(MoBlocks.WHITE_WOOL_SLAB)
                .add(MoBlocks.LIGHT_GRAY_WOOL_SLAB)
                .add(MoBlocks.GRAY_WOOL_SLAB)
                .add(MoBlocks.BLACK_WOOL_SLAB)
                .add(MoBlocks.BROWN_WOOL_SLAB)
                .add(MoBlocks.RED_WOOL_SLAB)
                .add(MoBlocks.ORANGE_WOOL_SLAB)
                .add(MoBlocks.YELLOW_WOOL_SLAB)
                .add(MoBlocks.LIME_WOOL_SLAB)
                .add(MoBlocks.GREEN_WOOL_SLAB)
                .add(MoBlocks.CYAN_WOOL_SLAB)
                .add(MoBlocks.LIGHT_BLUE_WOOL_SLAB)
                .add(MoBlocks.BLUE_WOOL_SLAB)
                .add(MoBlocks.PURPLE_WOOL_SLAB)
                .add(MoBlocks.MAGENTA_WOOL_SLAB)
                .add(MoBlocks.PINK_WOOL_SLAB);
    }
}
