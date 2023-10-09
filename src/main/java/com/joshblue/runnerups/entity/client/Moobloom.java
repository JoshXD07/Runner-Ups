package com.joshblue.runnerups.entity.client;

import com.joshblue.runnerups.entity.animation.ModAnimations;
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
public class Moobloom<T extends MoobloomEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Moobloom;
	private final ModelPart head;

	public Moobloom(ModelPart root) {
		this.Moobloom = root.getChild("Moobloom");
		this.head = Moobloom.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Moobloom = modelPartData.addChild("Moobloom", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leg0 = Moobloom.addChild("leg0", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -12.0F, 7.0F));

		ModelPartData leg2 = Moobloom.addChild("leg2", ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -12.0F, -6.0F));

		ModelPartData leg1 = Moobloom.addChild("leg1", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, -12.0F, 7.0F));

		ModelPartData Flowers = Moobloom.addChild("Flowers", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData B = Flowers.addChild("B", ModelPartBuilder.create().uv(52, 4).cuboid(2.0F, -30.0F, -14.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 2.0F, 11.0F));

		ModelPartData cube_r1 = B.addChild("cube_r1", ModelPartBuilder.create().uv(52, 4).cuboid(-12.0F, -30.0F, -4.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData C = Flowers.addChild("C", ModelPartBuilder.create().uv(52, 4).cuboid(2.0F, -30.0F, -14.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 2.0F, 13.0F));

		ModelPartData cube_r2 = C.addChild("cube_r2", ModelPartBuilder.create().uv(52, 4).cuboid(-12.0F, -30.0F, -4.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData D = Flowers.addChild("D", ModelPartBuilder.create().uv(52, 4).cuboid(2.0F, -30.0F, -14.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 2.0F, 19.0F));

		ModelPartData cube_r3 = D.addChild("cube_r3", ModelPartBuilder.create().uv(52, 4).cuboid(-12.0F, -30.0F, -4.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData leg3 = Moobloom.addChild("leg3", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-2.0F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, -12.0F, -6.0F));

		ModelPartData head = Moobloom.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, new Dilation(0.0F))
		.uv(22, 0).cuboid(-5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 0).cuboid(4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -20.0F, -8.0F));

		ModelPartData A = head.addChild("A", ModelPartBuilder.create().uv(52, 4).cuboid(2.0F, -30.0F, -14.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.0F, 8.0F));

		ModelPartData cube_r4 = A.addChild("cube_r4", ModelPartBuilder.create().uv(52, 4).cuboid(-12.0F, -30.0F, -4.0F, 0.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData body = Moobloom.addChild("body", ModelPartBuilder.create().uv(18, 4).cuboid(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, new Dilation(0.0F))
		.uv(52, 0).cuboid(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -19.0F, 2.0F, 1.5708F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}
	@Override
	public void setAngles(MoobloomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.MOOBLOOM_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Moobloom.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Moobloom;
	}
}