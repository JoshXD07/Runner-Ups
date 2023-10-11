package com.joshblue.runnerups;

import com.joshblue.runnerups.block.ModBlocks;
import com.joshblue.runnerups.entity.ModEntities;
import com.joshblue.runnerups.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class RunnerUpsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MOOBLOOM, MoobloomRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MOOBLOOM, Moobloom::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.GREAT_HUNGER, GreatHungerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GREAT_HUNGER, GreatHunger::getTexturedModelData);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUTTERCUP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BUTTERCUP, RenderLayer.getCutout());
    }
}
