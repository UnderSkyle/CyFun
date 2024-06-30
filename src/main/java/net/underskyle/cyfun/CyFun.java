package net.underskyle.cyfun;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.util.Identifier;
import net.underskyle.cyfun.block.ModBlocks;
import net.underskyle.cyfun.item.ModItemGroups;
import net.underskyle.cyfun.item.ModItems;
import net.underskyle.cyfun.util.ModCustomTrades;
import net.underskyle.cyfun.util.ModLootTableModifiers;
import net.underskyle.cyfun.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CyFun implements ModInitializer {
	public static final String MOD_ID = "cyfun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();
	}

}