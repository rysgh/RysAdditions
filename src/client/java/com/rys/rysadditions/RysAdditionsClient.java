package com.rys.rysadditions;

import com.rys.rysadditions.common.entity.ModEntities;
import com.rys.rysadditions.common.entity.custom.FireflyEntity;
import com.rys.rysadditions.renderer.entity.FireflyRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class RysAdditionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.FIREFLY, FireflyRenderer::new);
    }
}