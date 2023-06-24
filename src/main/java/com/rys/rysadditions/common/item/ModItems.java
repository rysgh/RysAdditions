package com.rys.rysadditions.common.item;

import com.rys.rysadditions.RysAdditions;
import com.rys.rysadditions.common.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item FIREFLY_SPAWN_EGG = registerItem("firefly_spawn_egg", new SpawnEggItem(ModEntities.FIREFLY, 0x780627, 0xFF8636, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RysAdditions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RysAdditions.LOGGER.info("Registering items for " + RysAdditions.MOD_ID);
    }
}
