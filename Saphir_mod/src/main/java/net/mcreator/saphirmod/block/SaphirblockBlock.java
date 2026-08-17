package net.mcreator.saphirmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SaphirblockBlock extends Block {
	public SaphirblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6f).requiresCorrectToolForDrops());
	}
}