package com.rys.rysadditions.renderer.entity;

import com.rys.rysadditions.RysAdditions;
import com.rys.rysadditions.common.entity.custom.FireflyEntity;
import com.rys.rysadditions.model.entity.FireflyModel;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FireflyRenderer extends GeoEntityRenderer<FireflyEntity> {
    public FireflyRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new FireflyModel());
    }

    @Override
    public Identifier getTextureLocation(FireflyEntity animatable) {
        return new Identifier(RysAdditions.MOD_ID, "textures/entity/firefly.png");
    }

    @Override
    public void render(FireflyEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
