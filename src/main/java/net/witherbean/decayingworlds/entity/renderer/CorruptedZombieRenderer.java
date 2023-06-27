// package net.witherbean.decayingworlds.entity.renderer;

// import net.witherbean.decayingworlds.DecayingWorlds;
// import net.witherbean.decayingworlds.entity.renderer.models.CorruptedZombieModel;
// import net.witherbean.decayingworlds.entities.CorruptedZombie;
// import net.minecraft.client.renderer.entity.EntityRendererProvider;
// import net.minecraft.client.renderer.entity.MobRenderer;
// import net.minecraft.resources.ResourceLocation;

// public class CorruptedZombieRenderer extends MobRenderer<CorruptedZombie, CorruptedZombieModel> {
//     private static final ResourceLocation TEXTURE = new ResourceLocation(DecayingWorlds.MODID, "textures/entities/corrupted_zombie.png");

//     public CorruptedZombieRenderer(EntityRendererProvider.Context ctx) {
//         super(ctx, new CorruptedZombieModel(ctx.bakeLayer(CorruptedZombieModel.LAYER_LOCATION)), 0.5f);
//     }

//     @Override
//     public ResourceLocation getTextureLocation(CorruptedZombie entity) {
//         return TEXTURE;
//     }
// }