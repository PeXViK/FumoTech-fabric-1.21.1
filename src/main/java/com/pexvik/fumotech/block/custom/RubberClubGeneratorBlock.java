package com.pexvik.fumotech.block.custom;

import com.pexvik.fumotech.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubberClubGeneratorBlock extends Block {

    public RubberClubGeneratorBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if(!world.isClient()) {
            if(stack.getItem() == ModItems.RUBBER && stack.getCount() >= 4 && hand == Hand.MAIN_HAND) {
                ItemStack resultItem = new ItemStack(ModItems.RUBBER_CLUB);
                world.spawnEntity(new ItemEntity(world, hit.getBlockPos().getX() + 0.5f, hit.getBlockPos().getY() + 1, hit.getBlockPos().getZ() + 0.5f, resultItem));

                stack.decrement(4);
            }
        }

        // TODO сделать подкидывание игрока

        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

}
