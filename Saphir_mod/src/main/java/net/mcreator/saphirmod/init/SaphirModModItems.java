/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saphirmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.saphirmod.item.*;
import net.mcreator.saphirmod.SaphirModMod;

public class SaphirModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SaphirModMod.MODID);
	public static final RegistryObject<Item> SAPHIR_PICKAXE;
	public static final RegistryObject<Item> SAPHIR;
	public static final RegistryObject<Item> SAPHIRMINERAIS;
	public static final RegistryObject<Item> SAPHIR_SWORD;
	public static final RegistryObject<Item> SAPHIRBLOCK;
	public static final RegistryObject<Item> SAPHIRAXE;
	public static final RegistryObject<Item> SAPHIRSHOVEL;
	public static final RegistryObject<Item> SAPHIRHOE;
	public static final RegistryObject<Item> SAPHIR_ARMURE_HELMET;
	public static final RegistryObject<Item> SAPHIR_ARMURE_CHESTPLATE;
	public static final RegistryObject<Item> SAPHIR_ARMURE_LEGGINGS;
	public static final RegistryObject<Item> SAPHIR_ARMURE_BOOTS;
	public static final RegistryObject<Item> SUPER_TOOL;
	static {
		SAPHIR_PICKAXE = REGISTRY.register("saphir_pickaxe", SaphirPickaxeItem::new);
		SAPHIR = REGISTRY.register("saphir", SaphirItem::new);
		SAPHIRMINERAIS = block(SaphirModModBlocks.SAPHIRMINERAIS, new Item.Properties().fireResistant());
		SAPHIR_SWORD = REGISTRY.register("saphir_sword", SaphirSwordItem::new);
		SAPHIRBLOCK = block(SaphirModModBlocks.SAPHIRBLOCK, new Item.Properties().fireResistant());
		SAPHIRAXE = REGISTRY.register("saphiraxe", SaphiraxeItem::new);
		SAPHIRSHOVEL = REGISTRY.register("saphirshovel", SaphirshovelItem::new);
		SAPHIRHOE = REGISTRY.register("saphirhoe", SaphirhoeItem::new);
		SAPHIR_ARMURE_HELMET = REGISTRY.register("saphir_armure_helmet", SaphirbootsItem.Helmet::new);
		SAPHIR_ARMURE_CHESTPLATE = REGISTRY.register("saphir_armure_chestplate", SaphirbootsItem.Chestplate::new);
		SAPHIR_ARMURE_LEGGINGS = REGISTRY.register("saphir_armure_leggings", SaphirbootsItem.Leggings::new);
		SAPHIR_ARMURE_BOOTS = REGISTRY.register("saphir_armure_boots", SaphirbootsItem.Boots::new);
		SUPER_TOOL = REGISTRY.register("super_tool", SaphirmegaoutilItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}