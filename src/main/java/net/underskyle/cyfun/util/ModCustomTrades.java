package net.underskyle.cyfun.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.underskyle.cyfun.villager.ModVillagers;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.NITWIT_TEACHER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 32),
                            new ItemStack(Items.DEAD_BUBBLE_CORAL, 2),
                            6, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.NITWIT_TEACHER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 4),
                            new ItemStack(Items.DEAD_BUSH, 1),
                            20, 2, 0.075f));
                });
    }
}
