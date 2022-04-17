package com.nobody.moreglasses.items;

import com.nobody.moreglasses.MoreGlasses;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(MoreGlasses.TAB));
    }
}
