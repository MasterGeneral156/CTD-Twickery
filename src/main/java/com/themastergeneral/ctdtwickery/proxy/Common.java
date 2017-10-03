package com.themastergeneral.ctdtwickery.proxy;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdtwickery.TwickeryEvent;
import com.themastergeneral.ctdtwickery.TwickeryEventHandler;
import com.themastergeneral.ctdtwickery.config.CTDTwickeryConfig;
import com.themastergeneral.ctdtwickery.items.ModItems;

public class Common {
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(),
				"ctd/ctdtwickery.cfg"));
		CTDTwickeryConfig.readConfig();
		ModItems.init();
	}

	public void init(FMLInitializationEvent e) {
		TwickeryEventHandler.init();
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
