package com.nobody.moreglasses.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;
import java.util.concurrent.ThreadLocalRandom;

public class CrystalOre extends OreBlock {
    public CrystalOre() {
        super(
                AbstractBlock.Properties.of(Material.STONE)
                .strength(3f,3f)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE
        ));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        if (silktouch != 1){
            int xp = ThreadLocalRandom.current().nextInt(1, 2 + 1);
            return xp;
        }
        return 0;
    }
}
