package net.witherbean.decayingworlds.entity;

import net.witherbean.decayingworlds.DecayingWorlds;
import net.witherbean.decayingworlds.entities.witherstorm.WitherStorm;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DecayingWorlds.MODID);

    public static final EntityType<WitherStorm> WITHERSTORM = register("wither_storm", EntityType.Builder.<WitherStorm>of(WitherStorm::new, MobCategory.MONSTER).sized(5F, 14F).clientTrackingRange(10));

    private static EntityType<WitherStorm> register(String string, Builder<WitherStorm> clientTrackingRange) {
        return null;
    }
}