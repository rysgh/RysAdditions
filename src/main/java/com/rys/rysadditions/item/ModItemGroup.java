package com.rys.rysadditions.item;

import com.rys.rysadditions.RysAdditions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TEST_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(RysAdditions.MOD_ID, "test_group"),
            FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.rysadditions.test_group"))
                .icon(() -> new ItemStack(ModItems.TEST_ITEM)).entries(((displayContext, entries) -> {
                    entries.add(ModItems.TEST_ITEM);
                })).build());

    public static void registerItemGroups() {

    }
}
