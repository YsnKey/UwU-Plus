package dev.uwu.main;

import com.example.addon.commands.CommandExample;
import com.mojang.logging.LogUtils;
import dev.uwu.main.hud.HudExample;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class System extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final String VERSION = "0.1";
    public static final Category CATEGORY = new Category("UwU");
    public static final HudGroup HUD_GROUP = new HudGroup("UwUHud");

    @Override
    public void onInitialize() {
        LOG.info("Downloading UwU Addon");

        // Modules

        // Commands
        Commands.add(new CommandExample());

        // HUD
        Hud.get().register(HudExample.INFO);

    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "dev.uwu";
    }

}
