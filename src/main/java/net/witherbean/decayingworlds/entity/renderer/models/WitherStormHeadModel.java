package net.witherbean.decayingworlds.entity.renderer.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.witherbean.decayingworlds.client.animation.WitherStormHeadAnimation;

public class WitherStormHeadModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart head;
	private float p_233515_;

	public WitherStormHeadModel(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 156).addBox(-2.0F, -0.25F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 156).addBox(-1.0F, 3.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition teeth = jaw.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(96, 95).addBox(-31.2F, -10.8F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -10.0F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -9.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -8.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-32.2F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-32.2F, -6.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-33.2F, -6.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-33.8F, -6.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-33.8F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -8.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -9.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -10.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F)), PartPose.offset(25.0F, 2.75F, -0.5F));

		PartDefinition upper_jaw = head.addOrReplaceChild("upper_jaw", CubeListBuilder.create().texOffs(0, 156).addBox(-2.0F, -3.25F, -0.5F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 156).addBox(-2.0F, -3.25F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 156).addBox(1.0F, -3.25F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 156).addBox(-1.0F, -3.25F, 1.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 156).addBox(-1.0F, 0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.25F, -2.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition teeth2 = upper_jaw.addOrReplaceChild("teeth2", CubeListBuilder.create().texOffs(96, 95).addBox(-31.2F, -10.8F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -10.0F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -9.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -8.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-31.2F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-32.2F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-32.2F, -6.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-33.2F, -6.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-33.8F, -6.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-33.8F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -7.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -8.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -9.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F))
		.texOffs(96, 95).addBox(-34.8F, -10.2F, -8.2F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.8F)), PartPose.offset(25.0F, -0.25F, -0.5F));

		PartDefinition eye = upper_jaw.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(96, 63).addBox(-8.0F, -6.5F, -7.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(-7.7F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
	}

	@Override
	public ModelPart root() {
		throw new UnsupportedOperationException("Unimplemented method 'root'");
	}

	@Override
	public void setupAnim(T p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_,
			float p_102623_) {
		throw new UnsupportedOperationException("Unimplemented method 'setupAnim'");
	}

	// @Override
	// public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	// 	this.root().getAllParts().forEach(ModelPart::resetPose);
	// 	Object p_233531_;
	// 	float f = ageInTicks - (float)p_233531_.tickCount;
	// 	Object p_233535_;
	// 	Object p_233536_;
	// 	this.animateHeadLookTarget(p_233535_, p_233536_);
	// 	this.animateIdlePose(ageInTicks);
	// 	this.animate(p_233531_.attackAnimationState, WitherStormHeadAnimation.BITE, ageInTicks);
	// 	this.animate(p_233531_.shootAnimationState, WitherStormHeadAnimation.SHOOT, ageInTicks);
	// 	this.animate(p_233531_.hurtAnimationState, WitherStormHeadAnimation.HURT, ageInTicks);
	// 	this.animate(p_233531_.deathAnimationState, WitherStormHeadAnimation.DEATH, ageInTicks);
	// }

	// private void animateHeadLookTarget(Object p_233535_, Object p_233536_) {
	// }

	// private void animateIdlePose(float ageInTicks) {
	// 	float f = p_233515_ * 0.1F;
    //   float f2 = Mth.sin(f);
    //   this.head.xRot += 0.06F * f2;
	// }

	// @Override
	// public void renderToBuffer(PoseStack p_103111_, VertexConsumer p_103112_, int p_103113_, int p_103114_,
	// 		float p_103115_, float p_103116_, float p_103117_, float p_103118_) {
	// 	throw new UnsupportedOperationException("Unimplemented method 'renderToBuffer'");
	// }
}