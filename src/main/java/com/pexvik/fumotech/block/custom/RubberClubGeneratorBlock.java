package com.pexvik.fumotech.block.custom;

import com.pexvik.fumotech.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
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

        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    // TODO сделать подкидывание игрока


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof PlayerEntity) {
            entity.addVelocity(0, 1,0);
            world.playSound(entity, pos, SoundEvents.BLOCK_ANVIL_LAND, SoundCategory.BLOCKS, 0.5f, 0.5f);
            spawnCircleParticles(world, pos.toCenterPos().add(0, 0.7F,0), 0.4F, 100);
        }


    }

    public static void spawnCircleParticles(
            World world,
            Vec3d center,
            double radius,
            int particleCount
    ) {
        for (int i = 0; i < particleCount; i++) {
            double angle = 2 * Math.PI * i / particleCount;

            double x = center.x + Math.cos(angle) * radius;
            double z = center.z + Math.sin(angle) * radius;
            double y = center.y;

            world.addParticle(
                    ParticleTypes.WHITE_SMOKE,
                    x,
                    y,
                    z,
                    0.0, 0.0, 0.0
            );
        }
    }

}
