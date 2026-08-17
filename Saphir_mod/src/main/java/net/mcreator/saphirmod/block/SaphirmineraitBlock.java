package net.mcreator.saphirmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class SaphirmineraitBlock extends Block {
	public SaphirmineraitBlock() {
		super(BlockBehaviour.Properties.of().strength(5f, 8f).lightLevel(blockstate -> 2).requiresCorrectToolForDrops());
	}

	@Override
	public int getExpDrop(BlockState state, LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
		return Mth.randomBetweenInclusive(randomSource, 5, 10);
	}
}