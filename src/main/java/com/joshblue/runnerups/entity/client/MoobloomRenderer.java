package com.joshblue.runnerups.entity.client;

import com.joshblue.runnerups.RunnerUps;
import com.joshblue.runnerups.entity.custom.MoobloomEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MoobloomRenderer extends MobEntityRenderer<MoobloomEntity, Moobloom<MoobloomEntity>> {
    private static final Identifier TEXTURE = new Identifier(RunnerUps.MOD_ID, "textures/entity/moobloom.png");

    public MoobloomRenderer(EntityRendererFactory.Context context) {
        super(context, new Moobloom<>(context.getPart(ModModelLayers.MOOBLOOM)), 0.6f);
    }

    @Override
    public Identifier getTexture(MoobloomEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(MoobloomEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
