package com.maybemattie.hiddencosmetics;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    public static boolean enabled = true;

    public static void synchronizeConfiguration(File configFile) {
        Configuration configuration = new Configuration(configFile);

        enabled = configuration.getBoolean("enabled", Configuration.CATEGORY_GENERAL, enabled, "Enables all features");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
