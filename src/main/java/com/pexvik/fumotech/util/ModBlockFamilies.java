package com.pexvik.fumotech.util;

import com.pexvik.fumotech.block.ModBlocks;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

public class ModBlockFamilies {

    public static final BlockFamily HEVEA =
            new BlockFamily.Builder(ModBlocks.HEVEA_PLANKS)
                    .stairs(ModBlocks.HEVEA_STAIRS)
                    .slab(ModBlocks.HEVEA_SLAB)
                    .button(ModBlocks.HEVEA_BUTTON)
                    .pressurePlate(ModBlocks.HEVEA_PRESSURE_PLATE)
                    .fence(ModBlocks.HEVEA_FENCE)
                    .fenceGate(ModBlocks.HEVEA_FENCE_GATE)
                    .door(ModBlocks.HEVEA_DOOR)
                    .trapdoor(ModBlocks.HEVEA_TRAPDOOR)
                    .build();

    private ModBlockFamilies() {}
}