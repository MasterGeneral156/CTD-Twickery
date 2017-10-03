package com.themastergeneral.ctdtwickery.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdtwickery.CTDTwickery;

public class BaseItem extends CTDItem {

	public BaseItem(String name, String modid) {
		super(name, modid);
		this.setCreativeTab(CreativeTabs.MISC);
		this.setMaxStackSize(1);
	}
}
