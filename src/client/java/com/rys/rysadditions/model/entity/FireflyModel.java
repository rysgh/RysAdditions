package com.rys.rysadditions.model.entity;

import com.rys.rysadditions.RysAdditions;
import com.rys.rysadditions.common.entity.custom.FireflyEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class FireflyModel extends GeoModel<FireflyEntity> {
    @Override
    public Identifier getModelResource(FireflyEntity animatable) {
        return new Identifier(RysAdditions.MOD_ID, "geo/firefly.geo.json");
    }

    @Override
    public Identifier getTextureResource(FireflyEntity animatable) {
        return new Identifier(RysAdditions.MOD_ID, "textures/entity/firefly.png");
    }

    @Override
    public Identifier getAnimationResource(FireflyEntity animatable) {
        return new Identifier(RysAdditions.MOD_ID, "animations/firefly.animation.json");
    }

    @Override
    public void setCustomAnimations(FireflyEntity animatable, long instanceId, AnimationState<FireflyEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if(head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
