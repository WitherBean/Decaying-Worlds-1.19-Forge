package net.witherbean.decayingworlds.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.witherbean.decayingworlds.DecayingWorlds;
import net.witherbean.decayingworlds.entity.ModEntities;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DecayingWorlds.MODID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        final RegistryObject<Item> SwordShard = ITEMS.register("sword_shard", () -> new Item(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
        final RegistryObject<Item> SwordBlade = ITEMS.register("sword_blade", () -> new Item(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
        final RegistryObject<Item> CommandBlockShard = ITEMS.register("command_block_shard", () -> new Item(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
        final RegistryObject<Item> CorruptedNetherStar = ITEMS.register("corrupted_nether_star", () -> new Item(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_MISC).fireResistant()));
    }
//    public static final RegistryObject<ForgeSpawnEggItem> CORRUPTED_ZOMBIE_SPAWN_EGG = ITEMS.register("corrupted_zombie_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.CORRUPTEDZOMBIE, "6F5883", "8247B5", props().stacksTo(64)));
    //  public static final RegistryObject<SwordItem> ULTIMATE_SWORD = ITEMS.register("ultimate_sword", () -> new SwordItem(null, 12, 3.5f, new Item.Properties().tab(null)));
    //  public static class Tiers {
    //      public static final Tier ULTIMATE = new ForgeTier(
    //          7, 
    //          18288, 
    //          18f, 
    //         8, 
    //         30, 
    //         null, () -> Ingredient.EMPTY);
    // }
    
}
