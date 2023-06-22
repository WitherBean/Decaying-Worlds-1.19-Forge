package net.witherbean.decayingworlds.entity.renderer;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.witherbean.decayingworlds.entity.ModEntities;
import net.witherbean.decayingworlds.entity.renderer.models.CorruptedZombieModel;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
   


public class Events {

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.CORRUPTEDZOMBIE.get(), CorruptedZombieRenderer::new);
        // event.registerEntityRenderer(ModEntities.CORRUPTEDSPIDER.get(), CorruptedSpiderRenderer::new);
        // event.registerEntityRenderer(ModEntities.CORRUPTEDSKELETON.get(), CorruptedSkeletonRenderer::new);
        // event.registerEntityRenderer(ModEntities.CORRUPTEDVILLAGER.get(), CorruptedVillagerRenderer::new);
    }
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CorruptedZombieModel.LAYER_LOCATION, CorruptedZombieModel::createBodyLayer);
    }
    
}
