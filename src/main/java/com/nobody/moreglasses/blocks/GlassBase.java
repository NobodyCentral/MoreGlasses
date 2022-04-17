package com.nobody.moreglasses.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class GlassBase extends GlassBlock {
    public GlassBase() {
        super(AbstractBlock.Properties.copy(Blocks.GLASS).noOcclusion());
        //                              of((Material.GLASS)
        //                .strength(0.3f, 0.3f)
        //                .sound(SoundType.GLASS).noOcclusion()));
    }
}
