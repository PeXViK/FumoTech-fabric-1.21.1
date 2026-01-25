package com.pexvik.fumotech;

import com.pexvik.fumotech.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FumoTechClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.CIRNO,
                RenderLayer.getCutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.FUMO_PEDESTAL,
                RenderLayer.getCutout()
        );
    }
}
