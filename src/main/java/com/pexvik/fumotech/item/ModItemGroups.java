package com.pexvik.fumotech.item;

import com.pexvik.fumotech.FumoTech;
import com.pexvik.fumotech.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FumoTech.MOD_ID, "items"), FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SATORIUM_INGOT))
                            .displayName(Text.translatable("itemgroup.fumotech.items"))
                            .entries((displayContext, entries) -> {

                                // === SATORIUM ===
                                entries.add(ModItems.SATORIUM_SHARD);
                                entries.add(ModItems.SATORIUM_CRYSTAL);
                                entries.add(ModItems.SATORIUM_INGOT);
                                entries.add(ModItems.SATORIUM_NUGGET);
                                entries.add(ModItems.SATORIUM_DUST);
                                entries.add(ModItems.SATORIUM_GEAR);

                                // === CIRNIUM ===
                                entries.add(ModItems.CIRNIUM_SHARD);
                                entries.add(ModItems.CIRNIUM_CRYSTAL);
                                entries.add(ModItems.CIRNIUM_INGOT);
                                entries.add(ModItems.CIRNIUM_NUGGET);
                                entries.add(ModItems.CIRNIUM_DUST);
                                entries.add(ModItems.CIRNIUM_GEAR);

                                // === RUBBER ===
                                entries.add(ModItems.RAW_RUBBER);
                                entries.add(ModItems.RUBBER);

                                // === ELEMENTAL ===
                                entries.add(ModItems.MAGMA_SHARD);
                                entries.add(ModItems.ICE_SHARD);

                                // === STEEL ===
                                entries.add(ModItems.STEEL_INGOT);
                                entries.add(ModItems.STEEL_NUGGET);
                                entries.add(ModItems.STEEL_DUST);
                                entries.add(ModItems.STEEL_PLATE);
                                entries.add(ModItems.STEEL_GEAR);

                                // === LEAD ===
                                entries.add(ModItems.RAW_LEAD);
                                entries.add(ModItems.LEAD_INGOT);
                                entries.add(ModItems.LEAD_NUGGET);
                                entries.add(ModItems.LEAD_DUST);
                                entries.add(ModItems.LEAD_PLATE);
                                entries.add(ModItems.LEAD_GEAR);

                                // === SILVER ===
                                entries.add(ModItems.RAW_SILVER);
                                entries.add(ModItems.SILVER_INGOT);
                                entries.add(ModItems.SILVER_NUGGET);
                                entries.add(ModItems.SILVER_DUST);
                                entries.add(ModItems.SILVER_PLATE);
                                entries.add(ModItems.SILVER_GEAR);

                                // === TIN ===
                                entries.add(ModItems.RAW_TIN);
                                entries.add(ModItems.TIN_INGOT);
                                entries.add(ModItems.TIN_NUGGET);
                                entries.add(ModItems.TIN_DUST);
                                entries.add(ModItems.TIN_PLATE);
                                entries.add(ModItems.TIN_GEAR);

                            }).build());

    public static final ItemGroup BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FumoTech.MOD_ID, "blocks"), FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SATORIUM_BLOCK))
                            .displayName(Text.translatable("itemgroup.fumotech.blocks"))
                            .entries((displayContext, entries) -> {
                                entries.add(ModBlocks.SATORIUM_BLOCK);
                                entries.add(ModBlocks.SATORIUM_ORE);
                                entries.add(ModBlocks.DEEPSLATE_SATORIUM_ORE);
                                entries.add(ModBlocks.CIRNIUM_BLOCK);
                                entries.add(ModBlocks.CIRNIUM_ORE);
                                entries.add(ModBlocks.DEEPSLATE_CIRNIUM_ORE);
                                entries.add(ModBlocks.LEAD_ORE);
                                entries.add(ModBlocks.LEAD_BLOCK);
                                entries.add(ModBlocks.RAW_LEAD_BLOCK);
                                entries.add(ModBlocks.TIN_BLOCK);
                                entries.add(ModBlocks.TIN_ORE);
                                entries.add(ModBlocks.RAW_TIN_BLOCK);
                                entries.add(ModBlocks.SILVER_BLOCK);
                                entries.add(ModBlocks.SILVER_ORE);
                                entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
                                entries.add(ModBlocks.RAW_SILVER_BLOCK);
                                entries.add(ModBlocks.STEEL_BLOCK);
                                entries.add(ModBlocks.RUBBER_BLOCK);
                                entries.add(ModBlocks.HEVEA_PLANKS);
                                entries.add(ModBlocks.HEVEA_LOG);

                            }).build());


    public static void registerItemGroups() {
        FumoTech.LOGGER.info(FumoTech.MOD_ID + ": Registering Item Groups");
    }
}
