package net.underskyle.cyfun.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.underskyle.cyfun.CyFun;

public class ModItems {
/*
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette",
            new Item(new FabricItemSettings()));


    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));


*/


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CyFun.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CyFun.LOGGER.info("Registering Mod Items for " + CyFun.MOD_ID);

    }
}
