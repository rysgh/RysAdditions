package com.rys.rysadditions.common.block;

import com.rys.rysadditions.RysAdditions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlocks("test_block", new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(4.0f).requiresTool()));
    public static final Block CRATE = registerBlocks("crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(0.5f)));
    public static final Block DEEP_SEA_CRATE = registerBlocks("deep_sea_crate", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.STONE).strength(0.5f)));
    public static final Block JEWEL_CRATE = registerBlocks("jewel_crate", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(0.5f)));
    public static final Block PLANT_CRATE = registerBlocks("plant_crate", new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).strength(0.5f)));
    public static final Block RATION_CRATE = registerBlocks("ration_crate", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).strength(0.5f)));


    private static Block registerBlocks(String name, Block block) {
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
