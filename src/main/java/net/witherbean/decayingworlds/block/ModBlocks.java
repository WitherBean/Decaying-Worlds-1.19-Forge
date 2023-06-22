package net.witherbean.decayingworlds.block;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.witherbean.decayingworlds.DecayingWorlds;
import net.witherbean.decayingworlds.item.ModItems;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DecayingWorlds.MODID);

    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK = registerBlock("wither_storm_flesh_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK_IRON = registerBlock("wither_storm_flesh_block_iron", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK_GOLD = registerBlock("wither_storm_flesh_block_gold", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK_LAPIS = registerBlock("wither_storm_flesh_block_lapis", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK_DIAMOND = registerBlock("wither_storm_flesh_block_diamond", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK_COPPER = registerBlock("wither_storm_flesh_block_copper", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK_EMERALD = registerBlock("wither_storm_flesh_block_emerald", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_FLESH_BLOCK_SCAB = registerBlock("wither_storm_flesh_block_scab", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(12)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_COMMAND_BLOCK = registerBlock("wither_storm_command_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WITHER_STORM_BONE_BLOCK = registerBlock("wither_storm_bone_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    }
}
