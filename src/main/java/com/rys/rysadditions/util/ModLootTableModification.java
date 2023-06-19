package com.rys.rysadditions.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.GroupEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import static com.rys.rysadditions.block.ModBlocks.CRATE;
import static com.rys.rysadditions.block.ModBlocks.DEEP_SEA_CRATE;
import static com.rys.rysadditions.block.ModBlocks.JEWEL_CRATE;
import static com.rys.rysadditions.block.ModBlocks.PLANT_CRATE;
import static com.rys.rysadditions.block.ModBlocks.RATION_CRATE;

public class ModLootTableModification {
    private static final Identifier FISHING_TREASURE_ID = new Identifier("minecraft", "gameplay/fishing/treasure");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(FISHING_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1.00f))
                    .with(GroupEntry.create(ItemEntry.builder(CRATE), ItemEntry.builder(DEEP_SEA_CRATE), ItemEntry.builder(JEWEL_CRATE), ItemEntry.builder(PLANT_CRATE), ItemEntry.builder(RATION_CRATE)).build())
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
