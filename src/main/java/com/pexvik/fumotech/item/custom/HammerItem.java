package com.pexvik.fumotech.item.custom;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class HammerItem extends MiningToolItem {

    public HammerItem(ToolMaterial material, Settings settings) {
        super(material, BlockTags.PICKAXE_MINEABLE, settings);
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initialBlockPos, ServerPlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);
        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHitResult = (BlockHitResult) hit;

            if(blockHitResult.getSide() == Direction.DOWN || blockHitResult.getSide() == Direction.UP) {
                for (int x = -range; x <= range; ++x) {
                    for (int z = -range; z <= range; ++z) {
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY(), initialBlockPos.getZ() + z));
                    }
                }
            }

            if(blockHitResult.getSide() == Direction.NORTH || blockHitResult.getSide() == Direction.SOUTH) {
                for (int x = -range; x <= range; ++x) {
                    for (int y = -range; y <= range; ++y) {
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY() + y, initialBlockPos.getZ()));
                    }
                }
            }

            if(blockHitResult.getSide() == Direction.EAST || blockHitResult.getSide() == Direction.WEST) {
                for (int z = -range; z <= range; ++z) {
                    for (int y = -range; y <= range; ++y) {
                        positions.add(new BlockPos(initialBlockPos.getX(), initialBlockPos.getY() + y, initialBlockPos.getZ() + z));
                    }
                }
            }
        }
        return positions;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.fumotech.hammer_item.shift_down.0"));
            tooltip.add(Text.translatable("tooltip.fumotech.hammer_item.shift_down.1"));
        } else {
            tooltip.add(Text.translatable("tooltip.fumotech.hammer_item"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
