package com.rys.rysadditions;

import com.rys.rysadditions.block.ModBlocks;
import com.rys.rysadditions.item.ModItemGroups;
import com.rys.rysadditions.item.ModItems;
import com.rys.rysadditions.util.ModLootTableModification;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RysAdditions implements ModInitializer {
    public static final String MOD_ID = "rysadditions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Starting RysAdditions... ");

        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModLootTableModification.modifyLootTables();
    }
}