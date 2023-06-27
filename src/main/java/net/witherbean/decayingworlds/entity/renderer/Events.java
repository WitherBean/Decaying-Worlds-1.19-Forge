// package net.witherbean.decayingworlds.entity.renderer;

// import net.witherbean.decayingworlds.DecayingWorlds;
// import net.witherbean.decayingworlds.entities.witherstorm.WitherStorm;
// import net.witherbean.decayingworlds.entity.renderer.models.WitherStormHeadModel;
// import net.witherbean.decayingworlds.entity.renderer.models.WitherStormModel;
// import net.witherbean.decayingworlds.entity.ModEntities;
// import net.minecraft.client.renderer.entity.EntityRenderer;
// import net.minecraft.client.renderer.entity.EntityRendererProvider;
// import net.minecraftforge.api.distmarker.Dist;
// import net.minecraftforge.client.event.EntityRenderersEvent;
// import net.minecraftforge.eventbus.api.SubscribeEvent;
// import net.minecraftforge.fml.common.Mod;
// import net.witherbean.decayingworlds.entity.renderer.WitherStormRenderer;

// @Mod.EventBusSubscriber(modid = DecayingWorlds.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
// public class Events {
    
//     public class WitherStormRendererProvider implements EntityRendererProvider<WitherStorm> {

//         @Override
//         public EntityRenderer<WitherStorm> create(Context p_174010_) {
//             throw new UnsupportedOperationException("Unimplemented method 'create'");
//         }
//         @SubscribeEvent
//         public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
//             event.registerEntityRenderer(ModEntities.WITHERSTORM.get(), WitherStormRenderer::new);
//         }
// }
// // public class WitherStormHeadRendererProvider implements EntityRendererProvider<WitherStormHead> {

// //     @Override
// //     public EntityRenderer<WitherStormHead> create(Context p_174010_) {
// //         throw new UnsupportedOperationException("Unimplemented method 'create'");
// //     }
// // }

// }