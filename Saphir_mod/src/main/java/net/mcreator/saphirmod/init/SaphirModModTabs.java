/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saphirmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.saphirmod.SaphirModMod;

public class SaphirModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SaphirModMod.MODID);
	public static final RegistryObject<CreativeModeTab> SAPHIRMOD = REGISTRY.register("saphirmod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.saphir_mod.saphirmod")).icon(() -> new ItemStack(SaphirModModItems.SAPHIR_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SaphirModModItems.SAPHIR_PICKAXE.get());
				tabData.accept(SaphirModModItems.SAPHIR_SWORD.get());
				tabData.accept(SaphirModModItems.SAPHIRAXE.get());
				tabData.accept(SaphirModModItems.SAPHIRSHOVEL.get());
				tabData.accept(SaphirModModItems.SAPHIRHOE.get());
				tabData.accept(SaphirModModItems.SUPER_TOOL.get());
				tabData.accept(SaphirModModItems.SAPHIR_ARMURE_HELMET.get());
				tabData.accept(SaphirModModItems.SAPHIR_ARMURE_CHESTPLATE.get());
				tabData.accept(SaphirModModItems.SAPHIR_ARMURE_LEGGINGS.get());
				tabData.accept(SaphirModModItems.SAPHIR_ARMURE_BOOTS.get());
				tabData.accept(SaphirModModItems.SAPHIR.get());
				tabData.accept(SaphirModModBlocks.SAPHIRBLOCK.get().asItem());
				tabData.accept(SaphirModModBlocks.SAPHIRMINERAIS.get().asItem());
			}).withSearchBar().build());
}