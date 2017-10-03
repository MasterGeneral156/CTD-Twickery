package com.themastergeneral.ctdtwickery;

import net.minecraftforge.common.MinecraftForge;

public class TwickeryEventHandler {
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new TwickeryEvent());
	}
}
