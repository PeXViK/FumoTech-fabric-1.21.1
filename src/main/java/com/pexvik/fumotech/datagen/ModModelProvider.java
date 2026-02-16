package com.pexvik.fumotech.datagen;

import com.pexvik.fumotech.block.ModBlocks;
import com.pexvik.fumotech.item.ModItems;
import com.pexvik.fumotech.util.ModBlockFamilies;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HEVEA_PLANKS)
                .family(ModBlockFamilies.HEVEA);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SATORIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SATORIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SATORIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CIRNIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CIRNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_CIRNIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SILVER_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBBER_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.HEVEA_LOG).log(ModBlocks.HEVEA_LOG);

        blockStateModelGenerator.registerSingleton(ModBlocks.RUBBER_CLUB_GENERATOR, TexturedModel.CUBE_BOTTOM_TOP);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // === SATORIUM ===
        itemModelGenerator.register(ModItems.SATORI_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATORIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATORIUM_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATORIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATORIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATORIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATORIUM_GEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SATORIUM_CLUB, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SATORIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SATORIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SATORIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SATORIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SATORIUM_HOE, Models.HANDHELD);

        // === CIRNIUM ===
        itemModelGenerator.register(ModItems.CIRNIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRNIUM_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRNIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRNIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRNIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRNIUM_GEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.CIRNIUM_CLUB, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CIRNIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CIRNIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CIRNIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CIRNIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CIRNIUM_HOE, Models.HANDHELD);

        // === RUBBER ===
        itemModelGenerator.register(ModItems.RAW_RUBBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBBER_CLUB, Models.HANDHELD);

        // === ELEMENTAL ===
        itemModelGenerator.register(ModItems.MAGMA_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_SHARD, Models.GENERATED);

        // === STEEL ===
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_GEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        // === LEAD ===
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_GEAR, Models.GENERATED);

        // === SILVER ===
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_GEAR, Models.GENERATED);

        // === TIN ===
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_GEAR, Models.GENERATED);

        // === OTHER ===
        itemModelGenerator.register(ModItems.BURGA, Models.GENERATED);

    }
}
