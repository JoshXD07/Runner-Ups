package com.joshblue.runnerups.entity.client;

import com.joshblue.runnerups.entity.animation.ModAnimations;
import com.joshblue.runnerups.entity.custom.GreatHungerEntity;
import com.joshblue.runnerups.entity.custom.MoobloomEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class GreatHunger<T extends GreatHungerEntity> extends SinglePartEntityModel<T> {
	private final ModelPart great_hunger;
	private final ModelPart head;

	public GreatHunger(ModelPart root) {
		this.great_hunger = root.getChild("great_hunger");
		this.head = great_hunger.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData great_hunger = modelPartData.addChild("great_hunger", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 2.0F));

		ModelPartData FLleg = great_hunger.addChild("FLleg", ModelPartBuilder.create().uv(0, 18).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -3.0F, -2.0F));

		ModelPartData BLleg = great_hunger.addChild("BLleg", ModelPartBuilder.create().uv(0, 18).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -3.0F, 2.0F));

		ModelPartData FRleg = great_hunger.addChild("FRleg", ModelPartBuilder.create().uv(0, 18).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -3.0F, -2.0F));

		ModelPartData BRleg = great_hunger.addChild("BRleg", ModelPartBuilder.create().uv(0, 18).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -3.0F, 2.0F));

		ModelPartData body = great_hunger.addChild("body", ModelPartBuilder.create().uv(0, 26).cuboid(-3.0F, -4.0F, -1.0F, 6.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData head = great_hunger.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, -1.0F));

		ModelPartData bottom = head.addChild("bottom", ModelPartBuilder.create().uv(0, 13).cuboid(-4.0F, -5.0F, -6.0F, 8.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData top = head.addChild("top", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -3.0F, -10.0F, 8.0F, 3.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, 4.0F));
		return TexturedModelData.of(modelData, 48, 48);
	}

	@Override
	public void setAngles(GreatHungerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.GREAT_HUNGER_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.GREAT_HUNGER_ATTACK, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		great_hunger.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return great_hunger;
	}
}