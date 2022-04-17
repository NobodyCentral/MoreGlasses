package com.nobody.moreglasses.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class GlassBase extends GlassBlock {
    public GlassBase() {
        super(AbstractBlock.Properties.of(Material.GLASS)
                .strength(0.3f, 0.3f)
                .sound(SoundType.GLASS).noOcclusion());
    }
}
