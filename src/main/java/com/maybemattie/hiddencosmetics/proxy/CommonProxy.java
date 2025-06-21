package com.maybemattie.hiddencosmetics.proxy;

import com.maybemattie.hiddencosmetics.Config;
import com.maybemattie.hiddencosmetics.HiddenCosmetics;
import com.maybemattie.hiddencosmetics.Tags;
import com.maybemattie.hiddencosmetics.init.LoadedMods;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public LoadedMods loadedMods;

    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {
        loadedMods = new LoadedMods();
    }

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
