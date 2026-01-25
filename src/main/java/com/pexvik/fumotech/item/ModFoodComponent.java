package com.pexvik.fumotech.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponent {
    public static final FoodComponent BURGA = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 300, 3), 0.25F).build();

}
