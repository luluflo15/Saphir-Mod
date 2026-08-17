/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.saphirmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.saphirmod.block.SaphirmineraitBlock;
import net.mcreator.saphirmod.block.SaphirblockBlock;
import net.mcreator.saphirmod.SaphirModMod;

public class SaphirModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SaphirModMod.MODID);
	public static final RegistryObject<Block> SAPHIRMINERAIS;
	public static final RegistryObject<Block> SAPHIRBLOCK;
	static {
		SAPHIRMINERAIS = REGISTRY.register("saphirminerais", SaphirmineraitBlock::new);
		SAPHIRBLOCK = REGISTRY.register("saphirblock", SaphirblockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}