package com.rys.rysadditions.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import java.util.concurrent.ThreadLocalRandom;

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
                    .conditionally(RandomChanceLootCondition.builder(0.080f))
                    .with(ItemEntry.builder(randCrate()))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }

    private static Block randCrate() {
        Block selectedCrate;
        Block[] crates =  {CRATE, DEEP_SEA_CRATE, JEWEL_CRATE, PLANT_CRATE, RATION_CRATE};

        selectedCrate = crates[ThreadLocalRandom.current().nextInt(0, crates.length + 1)];

        return selectedCrate;
    }
}
