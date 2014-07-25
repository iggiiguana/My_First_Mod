package com.iggiiguana.WoodenAmour;

import com.iggiiguana.WoodenAmour.client.gui.GuiFactory;
import com.iggiiguana.WoodenAmour.handler.ConfigurationHandler;
import com.iggiiguana.WoodenAmour.proxy.IProxy;
import com.iggiiguana.WoodenAmour.refrence.refrence;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = refrence.MOD_ID, name = refrence.MOD_NAME, version = refrence.VERSION, guiFactory = refrence.GUI_FACTORY_CLASS)
public class WoodenAmour
{
    @Mod.Instance(refrence.MOD_ID)
    public static WoodenAmour instance;

    @SidedProxy(clientSide = refrence.CLIENT_PROXY_CLASS, serverSide = refrence.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
