package com.joshblue.runnerups.entity.client;

import com.joshblue.runnerups.RunnerUps;
import com.joshblue.runnerups.entity.custom.GreatHungerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GreatHungerRenderer extends MobEntityRenderer<GreatHungerEntity, GreatHunger<GreatHungerEntity>> {
    private static final Identifier TEXTURE = new Identifier(RunnerUps.MOD_ID, "textures/entity/great-hunger.png");

    public GreatHungerRenderer(EntityRendererFactory.Context context) {
        super(context, new GreatHunger<>(context.getPart(ModModelLayers.GREAT_HUNGER)), 0.6f);
    }

    @Override
    public Identifier getTexture(GreatHungerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GreatHungerEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
