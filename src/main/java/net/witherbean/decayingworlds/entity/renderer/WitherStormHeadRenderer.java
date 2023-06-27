// package net.witherbean.decayingworlds.entity.renderer;

// import net.witherbean.decayingworlds.DecayingWorlds;
// import net.witherbean.decayingworlds.entity.renderer.models.WitherStormHeadModel;
// import net.minecraft.client.renderer.entity.EntityRendererProvider;
// import net.minecraft.client.renderer.entity.MobRenderer;
// import net.minecraft.resources.ResourceLocation;

// public class WitherStormHeadRenderer extends MobRenderer<WitherStormHeadModel, WitherStormHeadModel> {
//     private static final ResourceLocation TEXTURE = new ResourceLocation(DecayingWorlds.MODID, "textures/entities/wither_storm_dead_fake.png");

//     public WitherStormHeadRenderer(EntityRendererProvider.Context ctx) {
//         super(ctx, new WitherStormHeadModel(ctx.bakeLayer(WitherStormHeadModel.LAYER_LOCATION)), 0.5f);
//     }

//     @Override
//     public ResourceLocation getTextureLocation(WitherStormHeadModel entity) {
//         return TEXTURE;
//     }
// }