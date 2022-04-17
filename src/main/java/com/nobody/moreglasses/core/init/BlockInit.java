package com.nobody.moreglasses.core.init;

import com.nobody.moreglasses.MoreGlasses;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreGlasses.MOD_ID);

	public static final RegistryObject<Block> NULL = BLOCKS.register("null_block",
			() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).strength(5f, 6f)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));

}
