package com.rys.rysadditions.common.item;

import com.rys.rysadditions.RysAdditions;
import com.rys.rysadditions.common.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(RysAdditions.MOD_ID, "group"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.rysadditions.group"))
            .icon(() -> new ItemStack(ModBlocks.CRATE)).entries(((displayContext, entries) -> {
                //Items
                entries.add(ModItems.FIREFLY_SPAWN_EGG);

                //Blocks
                entries.add(ModBlocks.CRATE);
                entries.add(ModBlocks.DEEP_SEA_CRATE);
                entries.add(ModBlocks.JEWEL_CRATE);
                entries.add(ModBlocks.PLANT_CRATE);
                entries.add(ModBlocks.RATION_CRATE);

                entries.add(ModBlocks.FIREFLY_JAR);

            })).build());

    public static void registerItemGroups() {

    }
}
