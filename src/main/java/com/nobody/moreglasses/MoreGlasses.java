package com.nobody.moreglasses;

import com.nobody.moreglasses.util.RegistryHandler;
import net.minecraft.block.BlockRenderType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moreglasses")
@Mod.EventBusSubscriber(modid = MoreGlasses.MOD_ID, bus = Bus.MOD)
public class MoreGlasses {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moreglasses";

    public MoreGlasses() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_WHITE_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_ORANGE_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_MAGENTA_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_LIGHT_BLUE_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_YELLOW_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_LIME_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_PINK_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_GRAY_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_LIGHT_GRAY_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_CYAN_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_PURPLE_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_BLUE_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_BROWN_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_GREEN_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_RED_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(RegistryHandler.CLEAR_BLACK_GLASS.get(), RenderType.translucent());

    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("moreglassestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.CLEAR_GLASS_ITEM.get());
        }
    };
}
