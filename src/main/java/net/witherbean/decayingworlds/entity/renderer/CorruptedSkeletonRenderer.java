// package net.witherbean.decayingworlds.entity.renderer;

// import net.minecraft.client.renderer.entity.EntityRendererProvider;
// import net.minecraft.client.renderer.entity.MobRenderer;
// import net.minecraft.client.renderer.entity.ZombieRenderer;
// import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
// import net.minecraft.resources.ResourceLocation;
// import net.witherbean.decayingworlds.DecayingWorlds;
// import net.witherbean.decayingworlds.entities.CorruptedZombie;
// import net.witherbean.decayingworlds.entity.renderer.models.CorruptedSkeletonModel;
// import net.witherbean.decayingworlds.entity.renderer.models.CorruptedZombieModel;

// public class CorruptedSkeletonRenderer extends MobRenderer<CorruptedZombie, CorruptedZombieModel>{
//     private static final ResourceLocation TEXTURE = new ResourceLocation(DecayingWorlds.MODID, "textures/entity/corrupted_skeleton.png");

//     public CorruptedSkeletonRenderer(EntityRendererProvider.Context ctx) {
//         super(ctx, new CorruptedSkeletonModel(ctx.bakeLayer(CorruptedSkeletonModel.LAYER_LOCATION)), 0.5f);
//     }
//     @Override
//     public ResourceLocation getTextureLocation(CorruptedZombie zombie) {
//         return TEXTURE;
//     }
// }