package com.nobody.moreglasses.blocks;

import net.minecraft.block.*;

public class SandyCrystals extends FallingBlock {
    public SandyCrystals() {
        super(AbstractBlock.Properties.copy(Blocks.SAND).strength(0.7f, 0.7f));
    }
}
