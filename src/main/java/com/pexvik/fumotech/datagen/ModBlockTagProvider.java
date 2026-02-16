package com.pexvik.fumotech.datagen;

import com.pexvik.fumotech.block.ModBlocks;
import com.pexvik.fumotech.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SATORIUM_BLOCK)
                .add(ModBlocks.SATORIUM_ORE)
                .add(ModBlocks.DEEPSLATE_SATORIUM_ORE)

                .add(ModBlocks.CIRNIUM_BLOCK)
                .add(ModBlocks.CIRNIUM_ORE)
                .add(ModBlocks.DEEPSLATE_CIRNIUM_ORE)

                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.RAW_LEAD_BLOCK)
                .add(ModBlocks.LEAD_ORE)

                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)

                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.RAW_SILVER_BLOCK)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)

                .add(ModBlocks.STEEL_BLOCK)

                .add(ModBlocks.RUBBER_CLUB_GENERATOR)
        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.HEVEA_PLANKS)
                .add(ModBlocks.HEVEA_LOG);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SATORIUM_ORE)
                .add(ModBlocks.DEEPSLATE_SATORIUM_ORE)
                .add(ModBlocks.CIRNIUM_ORE)
                .add(ModBlocks.DEEPSLATE_CIRNIUM_ORE)
                .add(ModBlocks.STEEL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SATORIUM_BLOCK)
                .add(ModBlocks.CIRNIUM_BLOCK)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.RAW_LEAD_BLOCK)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.SILVER_BLOCK)
                .add(ModBlocks.RAW_SILVER_BLOCK)
                .add(ModBlocks.SILVER_ORE)
                .add(ModBlocks.DEEPSLATE_SILVER_ORE)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.RUBBER_CLUB_GENERATOR)
        ;

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.HEVEA_PLANKS);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.HEVEA_LOG);

        getOrCreateTagBuilder(ModTags.Blocks.HEVEA_LOGS)
                .add(ModBlocks.HEVEA_LOG);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.HEVEA_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.HEVEA_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.HEVEA_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.HEVEA_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.HEVEA_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.HEVEA_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.HEVEA_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.HEVEA_TRAPDOOR);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_SATORIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_CIRNIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .add(ModBlocks.SATORIUM_ORE)
                .add(ModBlocks.DEEPSLATE_SATORIUM_ORE)
                .add(ModBlocks.CIRNIUM_ORE)
                .add(ModBlocks.DEEPSLATE_CIRNIUM_ORE)
                .add(ModBlocks.STEEL_BLOCK)
                .addTag(BlockTags.NEEDS_IRON_TOOL);



    }
}
