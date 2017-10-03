package com.themastergeneral.ctdtwickery.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class FoodItem extends ItemFood implements ItemModelProvider {
	protected String name; // Name of the item.
	protected String modid; // Mod ID domain to look for textures/models.

	public FoodItem(String name, String modid, int amount, float saturation) {
		super(amount, saturation, false);
		this.name = name;
		this.modid = modid;
		this.setAlwaysEdible();
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);
	}

}
