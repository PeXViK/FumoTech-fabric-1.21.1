package com.pexvik.fumotech.datagen;

import com.pexvik.fumotech.block.ModBlocks;
import com.pexvik.fumotech.item.ModItems;
import com.pexvik.fumotech.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.SATORIUM_SWORD)
                .add(ModItems.SATORIUM_CLUB)
                .add(ModItems.CIRNIUM_SWORD)
                .add(ModItems.CIRNIUM_CLUB)
                .add(ModItems.STEEL_SWORD)
                .add(ModItems.RUBBER_CLUB);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.SATORIUM_AXE)
                .add(ModItems.CIRNIUM_AXE)
                .add(ModItems.STEEL_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.SATORIUM_PICKAXE)
                .add(ModItems.CIRNIUM_PICKAXE)
                .add(ModItems.STEEL_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.SATORIUM_SHOVEL)
                .add(ModItems.CIRNIUM_SHOVEL)
                .add(ModItems.STEEL_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.SATORIUM_HOE)
                .add(ModItems.CIRNIUM_HOE)
                .add(ModItems.STEEL_HOE);

        getOrCreateTagBuilder(ItemTags.FOX_FOOD)
                .add(ModItems.BURGA)
        ;

        getOrCreateTagBuilder(ModTags.Items.RUBBER)
                .add(ModItems.RUBBER);

        getOrCreateTagBuilder(ModTags.Items.HEVEA_LOGS)
                .add(ModBlocks.HEVEA_LOG.asItem());

        getOrCreateTagBuilder(ModTags.Items.STEEL)
                .add(ModItems.STEEL_INGOT);
    }
}
