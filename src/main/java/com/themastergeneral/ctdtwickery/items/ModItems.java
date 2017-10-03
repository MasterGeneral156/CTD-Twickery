package com.themastergeneral.ctdtwickery.items;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdtwickery.CTDTwickery;

public class ModItems extends RegisterItem {
	public static FoodItem chocolate;
	public static FoodItem candycorn;
	public static FoodItem mm;
	public static FoodItem suckerpink;
	public static FoodItem suckerteal;
	public static FoodItem airhead;
	public static FoodItem airhead2;
	public static FoodItem lifesaver;
	public static FoodItem nerds;
	public static FoodItem pbcup;
	public static FoodItem starburst;
	public static FoodItem swedishfish;
	public static FoodItem tripleoreo;

	public static BaseItem candycontainer;

	public static void init() {
		chocolate = register(new FoodItem("chocolate", CTDTwickery.MODID, 4, 2F));
		candycorn = register(new FoodItem("candycorn", CTDTwickery.MODID, 2, 0F));
		mm = register(new FoodItem("mm", CTDTwickery.MODID, 1, 2F));
		suckerpink = register(new FoodItem("suckerpink", CTDTwickery.MODID, 2,
				0F));
		suckerteal = register(new FoodItem("suckerteal", CTDTwickery.MODID, 2,
				0F));
		airhead = register(new FoodItem("airhead", CTDTwickery.MODID, 2, 1F));
		airhead2 = register(new FoodItem("airhead2", CTDTwickery.MODID, 2, 1F));
		lifesaver = register(new FoodItem("lifesaver", CTDTwickery.MODID, 2,
				0.25F));
		nerds = register(new FoodItem("nerds", CTDTwickery.MODID, 2, 0.5F));
		pbcup = register(new FoodItem("pbcup", CTDTwickery.MODID, 3, 1.5F));
		starburst = register(new FoodItem("starburst", CTDTwickery.MODID, 2,
				0.25F));
		swedishfish = register(new FoodItem("swedishfish", CTDTwickery.MODID,
				2, 0.5F));
		tripleoreo = register(new FoodItem("tripleoreo", CTDTwickery.MODID, 3,
				0.75F));
		candycontainer = register(new BaseItem("candycontainer",
				CTDTwickery.MODID));
	}
}
