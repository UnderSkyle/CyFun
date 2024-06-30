package net.underskyle.cyfun.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.underskyle.cyfun.CyFun;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> ZAOUCHE_POI_KEY = poiKey("zaouchepoi");
    public static final PointOfInterestType ZAOUCHE_POI = registerPoi("zaouchepoi", Blocks.MUD_BRICKS);

    public static final VillagerProfession NITWIT_TEACHER = registerProfession("nitwit_teacher", ZAOUCHE_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(CyFun.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(CyFun.MOD_ID, name), 1, 4, block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(CyFun.MOD_ID, name));
    }

    public static void registerVillagers() {
        CyFun.LOGGER.info("Registering Villagers " + CyFun.MOD_ID);
    }



}
