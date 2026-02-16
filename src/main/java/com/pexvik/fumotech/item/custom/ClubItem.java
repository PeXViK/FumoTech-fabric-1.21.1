package com.pexvik.fumotech.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class ClubItem extends SwordItem {

    public ClubItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);

        if (isCriticalHit(attacker)) {
            Vec3d knockback = new Vec3d(
                    -Math.sin(attacker.getYaw() * ((float) Math.PI / 180F)) * 1,
                    0.2,
                    Math.cos(attacker.getYaw() * ((float) Math.PI / 180F)) * 1
            );
            target.addVelocity(knockback);
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 1, false, true, false));
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.fumotech.club_item.shift_down.0"));
            tooltip.add(Text.translatable("tooltip.fumotech.club_item.shift_down.1"));
        } else {
          tooltip.add(Text.translatable("tooltip.fumotech.club_item"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }

    protected static boolean isCriticalHit(LivingEntity player) {
        return player.fallDistance > 0.0F
                && !player.isOnGround()
                && !player.isClimbing()
                && !player.isTouchingWater()
                && !player.hasVehicle()
                && !player.isSprinting()
                && !player.hasStatusEffect(StatusEffects.BLINDNESS);
    }


}
