package com.maybemattie.hiddencosmetics.init;

import com.maybemattie.hiddencosmetics.references.Reference;
import cpw.mods.fml.common.Loader;

public class LoadedMods {

    private final boolean adventureBackpackLoaded;

    public LoadedMods() {
        adventureBackpackLoaded = Loader.isModLoaded(Reference.ADVENTURE_BACKPACK_MOD_ID);
    }

    public boolean adventureBackpackLoaded() {
        return adventureBackpackLoaded;
    }

}
