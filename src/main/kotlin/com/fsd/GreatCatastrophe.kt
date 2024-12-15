package com.fsd

import co.aikar.commands.PaperCommandManager
import com.fsd.commands.AcidRainCommand
import com.fsd.commands.LightningStormCommand
import com.fsd.commands.RevengeCommand
import com.fsd.config.ConfigManager
import com.fsd.listeners.PeacefulRevengeListener
import org.bukkit.plugin.java.JavaPlugin

class GreatCatastrophe : JavaPlugin() {

    private var isRevengeEnabled: Boolean = false

    override fun onEnable() {
        showStartupMessage()

        ConfigManager.initialize(this)

        val manager = PaperCommandManager(this)
        manager.registerCommand(AcidRainCommand(this))
        manager.registerCommand(RevengeCommand(this))
        manager.registerCommand(LightningStormCommand(this))

        server.pluginManager.registerEvents(PeacefulRevengeListener(this), this)
    }

    fun isRevengeEnabled(): Boolean {
        return isRevengeEnabled
    }

    fun setRevengeEnabled(value: Boolean) {
        isRevengeEnabled = value
    }

    override fun onDisable() {
        logger.info("§cGreatCatastrophe plugin disabled!")
    }

    private fun showStartupMessage() {
        val reset = "\u001B[0m"
        val blue = "\u001B[34m"
        val cyan = "\u001B[36m"
        val yellow = "\u001B[33m"
        val bold = "\u001B[1m"

        logger.info("${cyan}=================================================================================")
        logger.info("${blue}   ___                _       ___      _            _                   _          ")
        logger.info("${blue}  / _ \\_ __ ___  __ _| |_    / __\\__ _| |_ __ _ ___| |_ _ __ ___  _ __ | |__   ___ ")
        logger.info("${blue} / /_\\/ '__/ _ \\/ _` | __|  / /  / _` | __/ _` / __| __| '__/ _ \\| '_ \\| '_ \\ / _ \\")
        logger.info("${blue}/ /_\\\\| | |  __/ (_| | |_  / /__| (_| | || (_| \\__ \\ |_| | | (_) | |_) | | | |  __/")
        logger.info("${blue}\\____/|_|  \\___|\\__,_|\\__| \\____/\\__,_|\\__\\__,_|___/\\__|_|  \\___/| .__/|_| |_|\\___|")
        logger.info("${blue}                                                                 |_|               ")
        logger.info("${yellow}${bold}                             Разработано Felleus Development${reset}")
        logger.info("${cyan}=================================================================================${reset}")
    }
}
