package net.underskyle.cyfun.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.underskyle.cyfun.block.ModBlocks;
import net.underskyle.cyfun.item.ModItems;
import net.underskyle.cyfun.villager.ModVillagers;

public class ModCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CORN, 32),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 2),
                            6, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY_SWORD, 1),
                            new ItemStack(ModItems.RUBY_HELMET, 1),
                            2, 12, 0.075f));
                });
    }
}
