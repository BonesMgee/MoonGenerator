package me.shoko.moongenerator;


import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;


public final class mainMoonGenerator extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new ChunkMoonGenerator();
    }

    @Override
    public void onDisable() {

    }

}
