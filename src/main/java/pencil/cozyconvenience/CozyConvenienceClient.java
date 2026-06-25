package pencil.cozyconvenience;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import pencil.cozyconvenience.block.BuildingBlocks;
import pencil.cozyconvenience.block.ColoredBlocks;
import pencil.cozyconvenience.block.NaturalBlocks;

public class CozyConvenienceClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BuildingBlocks.IRON_BAR_GATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NaturalBlocks.GRASS_SLAB, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ColoredBlocks.MESH_GLASS, RenderLayer.getTranslucent());

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view, pos), NaturalBlocks.GRASS_STAIRS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x72b06a, NaturalBlocks.GRASS_STAIRS);

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view, pos), NaturalBlocks.GRASS_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x72b06a, NaturalBlocks.GRASS_SLAB);
    }
}
