package com.rys.rysadditions.common.data;

import com.google.gson.JsonElement;
import com.rys.rysadditions.common.block.ModBlocks;
import com.rys.rysadditions.common.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModBlockstateGenerator extends FabricModelProvider {
    public BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;
    public Consumer<BlockStateSupplier> blockStateCollector;

    public ModBlockstateGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerParentedItemModel(ModItems.FIREFLY_SPAWN_EGG, ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));
        registerFireflyJar(ModBlocks.FIREFLY_JAR);
    }

    public final void registerFireflyJar(Block fireflyJar) {
        Identifier identifier = TexturedModel.TEMPLATE_LANTERN.upload(fireflyJar, this.modelCollector);
        Identifier identifier2 = TexturedModel.TEMPLATE_HANGING_LANTERN.upload(fireflyJar, this.modelCollector);
        this.registerItemModel(fireflyJar.asItem());
        this.blockStateCollector.accept(VariantsBlockStateSupplier.create(fireflyJar).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.HANGING, identifier2, identifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    public void registerItemModel(Item item) {
        Models.GENERATED.upload(ModelIds.getItemModelId(item), TextureMap.layer0(item), this.modelCollector);
    }
}
