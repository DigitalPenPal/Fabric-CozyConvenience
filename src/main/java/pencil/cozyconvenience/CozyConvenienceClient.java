package pencil.cozyconvenience;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import pencil.cozyconvenience.block.ModBlocks;

public class CozyConvenienceClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRON_BAR_GATE, RenderLayer.getCutout());
    }
}
