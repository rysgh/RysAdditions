package com.rys.rysadditions.item;

import com.rys.rysadditions.RysAdditions;
import com.rys.rysadditions.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(RysAdditions.MOD_ID, "test_group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.rysadditions.test_group"))
            .icon(() -> new ItemStack(ModItems.TEST_ITEM)).entries(((displayContext, entries) -> {
                //Items
                entries.add(ModItems.TEST_ITEM);

                //Blocks
                entries.add(ModBlocks.TEST_BLOCK);
            })).build());

    public static ItemGroup FISHING_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(RysAdditions.MOD_ID, "fishing_group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.rysadditions.fishing_group"))
            .icon(() -> new ItemStack(ModBlocks.CRATE)).entries(((displayContext, entries) -> {
                //Items
                //entries.add(ModItems.TEST_ITEM);

                //Blocks
                entries.add(ModBlocks.CRATE);
                entries.add(ModBlocks.DEEP_SEA_CRATE);
                entries.add(ModBlocks.JEWEL_CRATE);
                entries.add(ModBlocks.PLANT_CRATE);
                entries.add(ModBlocks.RATION_CRATE);

            })).build());

    public static void registerItemGroups() {

    }
}