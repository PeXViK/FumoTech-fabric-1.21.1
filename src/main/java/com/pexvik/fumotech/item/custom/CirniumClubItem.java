package com.pexvik.fumotech.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

import java.util.Map;

public class CirniumClubItem extends ClubItem{

    private static final Map<Block, Block> TRANSFROM_MAP = Map.of(
            Blocks.LAVA, Blocks.MAGMA_BLOCK,
            Blocks.MAGMA_BLOCK, Blocks.BASALT,
            Blocks.WATER, Blocks.ICE
    );

    public CirniumClubItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockHitResult blockHitResult = raycast(
                world, user, RaycastContext.FluidHandling.SOURCE_ONLY
        );
        Block clickedBlock = world.getBlockState(blockHitResult.getBlockPos()).getBlock();

        if (TRANSFROM_MAP.containsKey(clickedBlock)) {
            if (!world.isClient()) {
                world.setBlockState(blockHitResult.getBlockPos(), TRANSFROM_MAP.get(clickedBlock).getDefaultState());

                user.getStackInHand(hand).damage(1, ((ServerWorld) world), ((ServerPlayerEntity) user),
                     item -> user.sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, blockHitResult.getBlockPos(), SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS);

                return TypedActionResult.success(itemStack);
            }
        }

        return TypedActionResult.pass(itemStack);
    }
}
