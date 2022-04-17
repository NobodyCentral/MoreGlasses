package com.nobody.moreglasses.util;

import com.nobody.moreglasses.MoreGlasses;
import com.nobody.moreglasses.blocks.BlockItemBase;
import com.nobody.moreglasses.blocks.GlassBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreGlasses.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreGlasses.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items


    // Blocks
    public static final RegistryObject<Block> CLEAR_GLASS = BLOCKS.register("clear_glass", GlassBase::new);

    // Block Items
    public static final RegistryObject<Item> CLEAR_GLASS_ITEM = ITEMS.register("clear_glass", () -> new BlockItemBase(CLEAR_GLASS.get()));
}
