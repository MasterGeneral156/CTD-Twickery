package com.themastergeneral.ctdtwickery;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.themastergeneral.ctdtwickery.items.ModItems;

public class TwickeryEvent {
	@SubscribeEvent
	public void onLivingDrop(LivingDropsEvent event) {
		Entity player = event.getSource().getTrueSource();
		if (player instanceof EntityPlayer) {
			EntityPlayer eplayer = (EntityPlayer) player;
			if (eplayer.getHeldItemOffhand().getItem() == ModItems.candycontainer) {
				if (eplayer.inventory.armorItemInSlot(1).getItem() != Items.AIR
						&& eplayer.inventory.armorItemInSlot(0).getItem() != Items.AIR
						&& eplayer.inventory.armorItemInSlot(2).getItem() != Items.AIR
						&& eplayer.inventory.armorItemInSlot(3).getItem() != Items.AIR) {
					if (event.getEntity() instanceof EntityLiving) {
						Random RNG = new Random();
						int itemToDrop = RNG.nextInt(130);
						if (itemToDrop <= 10) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.airhead, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 20 && itemToDrop > 10) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.airhead2, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 30 && itemToDrop > 20) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.chocolate, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 40 && itemToDrop > 30) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.mm, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 50 && itemToDrop > 40) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.suckerpink, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 60 && itemToDrop > 50) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.suckerteal, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 70 && itemToDrop > 60) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.lifesaver, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 80 && itemToDrop > 70) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.nerds, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 90 && itemToDrop > 80) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.pbcup, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 100 && itemToDrop > 90) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.starburst, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 110 && itemToDrop > 100) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.swedishfish, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else if (itemToDrop <= 120 && itemToDrop > 110) {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.tripleoreo, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						} else {
							ItemStack itemStackToDrop = new ItemStack(
									ModItems.candycorn, 1);
							event.getDrops().add(
									new EntityItem(event.getEntity().world,
											event.getEntity().posX, event
													.getEntity().posY, event
													.getEntity().posZ,
											itemStackToDrop));
						}
					}
				} else {
					TextComponentString warning = new TextComponentString(
							"You cannot twick or tweat without a complete costume on...");
					eplayer.sendMessage(warning);
				}
			}
		}
	}

}
