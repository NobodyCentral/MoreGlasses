package com.nobody.moreglasses.util;

import com.nobody.moreglasses.MoreGlasses;
import com.nobody.moreglasses.blocks.BlockItemBase;
import com.nobody.moreglasses.blocks.CrystalOre;
import com.nobody.moreglasses.blocks.GlassBase;
import com.nobody.moreglasses.items.ItemBase;
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
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> CLEAR_GLASS = BLOCKS.register("clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_WHITE_GLASS = BLOCKS.register("white_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_ORANGE_GLASS = BLOCKS.register("orange_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_MAGENTA_GLASS = BLOCKS.register("magenta_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_LIGHT_BLUE_GLASS = BLOCKS.register("light_blue_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_YELLOW_GLASS = BLOCKS.register("yellow_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_LIME_GLASS = BLOCKS.register("lime_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_PINK_GLASS = BLOCKS.register("pink_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_GRAY_GLASS = BLOCKS.register("gray_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_LIGHT_GRAY_GLASS = BLOCKS.register("light_gray_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_CYAN_GLASS = BLOCKS.register("cyan_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_PURPLE_GLASS = BLOCKS.register("purple_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_BLUE_GLASS = BLOCKS.register("blue_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_BROWN_GLASS = BLOCKS.register("brown_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_GREEN_GLASS = BLOCKS.register("green_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_RED_GLASS = BLOCKS.register("red_clear_glass", GlassBase::new);
    public static final RegistryObject<Block> CLEAR_BLACK_GLASS = BLOCKS.register("black_clear_glass", GlassBase::new);

    // Block Items
    public static final RegistryObject<Item> CLEAR_GLASS_ITEM = ITEMS.register("clear_glass", () -> new BlockItemBase(CLEAR_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_WHITE_GLASS_ITEM = ITEMS.register("white_clear_glass", () -> new BlockItemBase(CLEAR_WHITE_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_ORANGE_GLASS_ITEM = ITEMS.register("orange_clear_glass", () -> new BlockItemBase(CLEAR_ORANGE_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_MAGENTA_GLASS_ITEM = ITEMS.register("magenta_clear_glass", () -> new BlockItemBase(CLEAR_MAGENTA_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_LIGHT_BLUE_GLASS_ITEM = ITEMS.register("light_blue_clear_glass", () -> new BlockItemBase(CLEAR_LIGHT_BLUE_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_YELLOW_GLASS_ITEM = ITEMS.register("yellow_clear_glass", () -> new BlockItemBase(CLEAR_YELLOW_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_LIME_GLASS_ITEM = ITEMS.register("lime_clear_glass", () -> new BlockItemBase(CLEAR_LIME_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_PINK_GLASS_ITEM = ITEMS.register("pink_clear_glass", () -> new BlockItemBase(CLEAR_PINK_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_GRAY_GLASS_ITEM = ITEMS.register("gray_clear_glass", () -> new BlockItemBase(CLEAR_GRAY_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_LIGHT_GRAY_GLASS_ITEM = ITEMS.register("light_gray_clear_glass", () -> new BlockItemBase(CLEAR_LIGHT_GRAY_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_CYAN_GLASS_ITEM = ITEMS.register("cyan_clear_glass", () -> new BlockItemBase(CLEAR_CYAN_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_PURPLE_GLASS_ITEM = ITEMS.register("purple_clear_glass", () -> new BlockItemBase(CLEAR_PURPLE_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_BLUE_GLASS_ITEM = ITEMS.register("blue_clear_glass", () -> new BlockItemBase(CLEAR_BLUE_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_BROWN_GLASS_ITEM = ITEMS.register("brown_clear_glass", () -> new BlockItemBase(CLEAR_BROWN_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_GREEN_GLASS_ITEM = ITEMS.register("green_clear_glass", () -> new BlockItemBase(CLEAR_GREEN_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_RED_GLASS_ITEM = ITEMS.register("red_clear_glass", () -> new BlockItemBase(CLEAR_RED_GLASS.get()));
    public static final RegistryObject<Item> CLEAR_BLACK_GLASS_ITEM = ITEMS.register("black_clear_glass", () -> new BlockItemBase(CLEAR_BLACK_GLASS.get()));

    // Ore Blocks
    public static final RegistryObject<Block> CRYSTAL_ORE = BLOCKS.register("crystal_geode", CrystalOre::new);

    // Ore Block Items
    public static final RegistryObject<Item> CRYSTAL_ORE_ITEM = ITEMS.register("crystal_geode", () -> new BlockItemBase(CRYSTAL_ORE.get()));
}
