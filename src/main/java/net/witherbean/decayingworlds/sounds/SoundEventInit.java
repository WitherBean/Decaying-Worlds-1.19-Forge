package net.witherbean.decayingworlds.sounds;

import net.witherbean.decayingworlds.DecayingWorlds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundEventInit {
	
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
			DecayingWorlds.MODID);
	
	public static final RegistryObject<SoundEvent> CORRUPTED_SKELETON_IDLE = SOUND_EVENTS.register("entity.corrupted_skeleton.idle", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_skeleton.idle")));
	public static final RegistryObject<SoundEvent> CORRUPTED_SKELETON_HURT = SOUND_EVENTS.register("entity.corrupted_skeleton.hurt", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_skeleton.hurt")));
	public static final RegistryObject<SoundEvent> CORRUPTED_SKELETON_DEATH = SOUND_EVENTS.register("entity.corrupted_skeleton.death", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_skeleton.death")));

	public static final RegistryObject<SoundEvent> CORRUPTED_ZOMBIE_DEATH = SOUND_EVENTS.register("entity.corrupted_zombie.death", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_zombie.death")));
	public static final RegistryObject<SoundEvent> CORRUPTED_ZOMBIE_HURT = SOUND_EVENTS.register("entity.corrupted_zombie.hurt", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_zombie.hurt")));
	public static final RegistryObject<SoundEvent> CORRUPTED_ZOMBIE_IDLE = SOUND_EVENTS.register("entity.corrupted_zombie.idle", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_zombie.idle")));

	public static final RegistryObject<SoundEvent> CORRUPTED_VILLAGER_DEATH = SOUND_EVENTS.register("entity.corrupted_villager.death", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_villager.death")));
	public static final RegistryObject<SoundEvent> CORRUPTED_VILLAGER_HURT = SOUND_EVENTS.register("entity.corrupted_villager.hurt", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_villager.hurt")));
	public static final RegistryObject<SoundEvent> CORRUPTED_VILLAGER_IDLE = SOUND_EVENTS.register("entity.corrupted_villager.idle", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_villager.idle")));

	public static final RegistryObject<SoundEvent> CORRUPTED_SPIDER_DEATH = SOUND_EVENTS.register("entity.corrupted_spider.death", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_spider.death")));
	public static final RegistryObject<SoundEvent> CORRUPTED_SPIDER_IDLE = SOUND_EVENTS.register("entity.corrupted_spider.idle", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_spider.idle")));
	public static final RegistryObject<SoundEvent> CORRUPTED_SPIDER_HURT = SOUND_EVENTS.register("entity.corrupted_spider.hurt", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_spider.hurt")));

	public static final RegistryObject<SoundEvent> CORRUPTED_CREEPER_HURT = SOUND_EVENTS.register("entity.corrupted_creeper.hurt", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_creeper.hurt")));
	public static final RegistryObject<SoundEvent> CORRUPTED_CREEPER_DEATH = SOUND_EVENTS.register("entity.corrupted_creeper.death", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_creeper.death")));
	public static final RegistryObject<SoundEvent> CORRUPTED_CREEPER_IDLE = SOUND_EVENTS.register("entity.corrupted_creeper.idle", () -> new SoundEvent(new ResourceLocation(DecayingWorlds.MODID, "entity.corrupted_creeper.idle")));
}
