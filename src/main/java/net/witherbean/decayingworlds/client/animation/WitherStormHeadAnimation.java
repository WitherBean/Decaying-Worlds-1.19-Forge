package net.witherbean.decayingworlds.client.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WitherStormHeadAnimation {
   
public static final AnimationDefinition BITE = AnimationDefinition.Builder.withLength(0.5834334f)
.addAnimation("jaw",
	new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(57.5f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM))).build();
public static final AnimationDefinition SHOOT = AnimationDefinition.Builder.withLength(1.25f)
.addAnimation("jaw",
	new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(80f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(1f, KeyframeAnimations.degreeVec(80f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(1.1676667f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM))).build();
public static final AnimationDefinition HURT = AnimationDefinition.Builder.withLength(0.75f)
.addAnimation("head",
	new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, -17.5f, 10f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(0f, -17.5f, 10f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.7083434f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM)))
.addAnimation("jaw",
	new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.125f, KeyframeAnimations.degreeVec(14.78f, 2.58f, -9.67f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.25f, KeyframeAnimations.degreeVec(22.16f, -3.21f, 12.09f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-0.15f, 0.58f, 0.33f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(14.78f, 2.58f, -9.67f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.7083434f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM))).build();
public static final AnimationDefinition DEATH = AnimationDefinition.Builder.withLength(2.5f)
.addAnimation("head",
	new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(92.5f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.375f, KeyframeAnimations.degreeVec(82.5f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(90f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM)))
.addAnimation("jaw",
	new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(12.5f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.375f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM),
		new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
			AnimationChannel.Interpolations.CATMULLROM))).build();
}