package com.rys.rysadditions.block;

import com.rys.rysadditions.RysAdditions;
import com.rys.rysadditions.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block", new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(4.0f).requiresTool()));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RysAdditions.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RysAdditions.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        RysAdditions.LOGGER.info("Registering blocks for " + RysAdditions.MOD_ID);
    }
}
