package com.pexvik.fumotech.datagen;

import com.pexvik.fumotech.block.ModBlocks;
import com.pexvik.fumotech.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.SATORIUM_BLOCK);

        addDrop(ModBlocks.CIRNIUM_BLOCK);

        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.RAW_LEAD_BLOCK);

        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);

        addDrop(ModBlocks.SILVER_BLOCK);
        addDrop(ModBlocks.RAW_SILVER_BLOCK);

        addDrop(ModBlocks.STEEL_BLOCK);

        addDrop(ModBlocks.RUBBER_BLOCK);

        addDrop(ModBlocks.HEVEA_LOG);
        addDrop(ModBlocks.HEVEA_PLANKS);

        addDrop(ModBlocks.DEEPSLATE_SATORIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_SATORIUM_ORE, ModItems.SATORIUM_SHARD));
        addDrop(ModBlocks.SATORIUM_ORE, oreDrops(ModBlocks.SATORIUM_ORE, ModItems.SATORIUM_SHARD));

        addDrop(ModBlocks.DEEPSLATE_CIRNIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_CIRNIUM_ORE, ModItems.CIRNIUM_SHARD));
        addDrop(ModBlocks.CIRNIUM_ORE, oreDrops(ModBlocks.CIRNIUM_ORE, ModItems.CIRNIUM_SHARD));

        addDrop(ModBlocks.LEAD_ORE, oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));

        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));

        addDrop(ModBlocks.SILVER_ORE, oreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.DEEPSLATE_SILVER_ORE, oreDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER));

        addDrop(ModBlocks.RUBBER_CLUB_GENERATOR);
        addDrop(ModBlocks.FUMO_PEDESTAL);
        addDrop(ModBlocks.CIRNO);


    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    public LootTable.Builder multipleOreDropsWithoutFortune(Block drop, Item item, float minDrops, float maxDrops) {
        return this.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
                )
        );
    }
}
