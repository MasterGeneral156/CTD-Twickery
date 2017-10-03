package com.themastergeneral.ctdtwickery;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdtwickery.proxy.Common;

@Mod(modid = CTDTwickery.MODID, name = CTDTwickery.MODNAME, dependencies = CTDTwickery.DEPENDENCIES, version = CTDTwickery.VERSION, acceptedMinecraftVersions = CTDTwickery.acceptedMinecraftVersions, updateJSON = CTDTwickery.updateJSON, certificateFingerprint = CTDTwickery.certificateFingerprint)
public class CTDTwickery {
	public static final String MODID = "ctdtwickery";
	public static final String MODNAME = "CTD Twickery";
	public static final String VERSION = "1.0.0";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Twickery.json";
	public static final String acceptedMinecraftVersions = "1.12.2";
	public static final String certificateFingerprint = "441b509a0f58a0ef41aca8daf1be20d96287635e";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.2,];";

	@Instance
	public static CTDTwickery instance = new CTDTwickery();

	@SidedProxy(clientSide = "com.themastergeneral.ctdtwickery.proxy.Client", serverSide = "com.themastergeneral.ctdtwickery.proxy.Server")
	public static Common proxy;
	public static Logger logger;

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for CTD Twickery! TheMasterGeneral will not support this version!");
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("CTD Twickery is now loading. How spoopy!");
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		logger.info("*Evil Laughter* CTD Twickery has loaded.");
	}
}
