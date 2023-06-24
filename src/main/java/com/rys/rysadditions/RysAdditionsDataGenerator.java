package com.rys.rysadditions;

import com.rys.rysadditions.common.data.ModBlockstateGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;

public class RysAdditionsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockstateGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        ///registryBuilder.addRegistry();
    }
}
