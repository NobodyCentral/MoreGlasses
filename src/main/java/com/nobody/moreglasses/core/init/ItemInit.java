package com.nobody.moreglasses.core.init;

import com.nobody.moreglasses.MoreGlasses;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreGlasses.MOD_ID);

	public static final RegistryObject<Item> NULL = ITEMS.register("null_item",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}