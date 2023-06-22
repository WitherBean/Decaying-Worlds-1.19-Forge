package net.witherbean.decayingworlds.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.witherbean.decayingworlds.DecayingWorlds;
import net.witherbean.decayingworlds.entities.CorruptedSkeleton;
import net.witherbean.decayingworlds.entities.CorruptedSpider;
import net.witherbean.decayingworlds.entities.CorruptedVillager;
import net.witherbean.decayingworlds.entities.CorruptedZombie;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DecayingWorlds.MODID);

    public static final RegistryObject<EntityType<CorruptedZombie>> CORRUPTEDZOMBIE = ENTITIES.register("corrupted_zombie", () ->EntityType.Builder.of(CorruptedZombie::new, MobCategory.MONSTER).sized(0.6f, 1.95f).build(new ResourceLocation(DecayingWorlds.MODID, "corrupted_zombie").toString()));
    //public static final RegistryObject<EntityType<CorruptedSkeleton>> CORRUPTEDSKELETON = ENTITIES.register("corrupted_skeleton", () ->EntityType.Builder.of(CorruptedZombie::new, MobCategory.MONSTER).sized(0.6f, 1.95f).build(new ResourceLocation(DecayingWorlds.MODID, "corrupted_skeleton").toString()));
    //public static final RegistryObject<EntityType<CorruptedVillager>> CORRUPTEDVILLAGER = ENTITIES.register("corrupted_villager", () ->EntityType.Builder.of(CorruptedZombie::new, MobCategory.MONSTER).sized(0.6f, 1.95f).build(new ResourceLocation(DecayingWorlds.MODID, "corrupted_villager").toString()));
    //public static final RegistryObject<EntityType<CorruptedSpider>> CORRUPTEDSPIDER = ENTITIES.register("corrupted_spider", () ->EntityType.Builder.of(CorruptedZombie::new, MobCategory.MONSTER).sized(0.6f, 1.95f).build(new ResourceLocation(DecayingWorlds.MODID, "corrupted_spider").toString()));

    public static void register(IEventBus modEventBus) {
        ENTITIES.register(modEventBus);
    }
}
