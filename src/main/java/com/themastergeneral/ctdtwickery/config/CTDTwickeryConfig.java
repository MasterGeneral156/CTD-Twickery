package com.themastergeneral.ctdtwickery.config;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdtwickery.CTDTwickery;
import com.themastergeneral.ctdtwickery.proxy.Common;

import net.minecraftforge.common.config.Configuration;

public class CTDTwickeryConfig {
	private static final String CATEGORY_GENERAL = "General";

	public static void readConfig() {
		Configuration cfg = Common.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			CTDTwickery.logger.log(Level.ERROR, "Problem loading config file!",
					e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initGeneralConfig(Configuration cfg) {

	}
}
