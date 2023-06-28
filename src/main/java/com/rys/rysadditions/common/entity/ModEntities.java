package com.rys.rysadditions.common.entity;

import com.rys.rysadditions.RysAdditions;
import com.rys.rysadditions.common.entity.custom.FireflyEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<FireflyEntity> FIREFLY = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(RysAdditions.MOD_ID, "firefly"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FireflyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.4f)).build());
}
