package com.pexvik.fumotech.datagen;

import com.pexvik.fumotech.FumoTech;
import com.pexvik.fumotech.block.ModBlocks;
import com.pexvik.fumotech.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        // === Blocks and ingots ===
        reversibleForBlocks(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SATORIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SATORIUM_BLOCK, "satorium_ingot");
        reversibleForBlocks(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CIRNIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CIRNIUM_BLOCK, "cirnium_ingot");
        reversibleForBlocks(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEAD_BLOCK, "lead_ingot");
        reversibleForBlocks(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK, "tin_ingot");
        reversibleForBlocks(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVER_BLOCK, "silver_ingot");
        reversibleForBlocks(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK, "steel_ingot");
        reversibleForBlocks(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBBER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_BLOCK, "rubber");

        // === Blocks and ingots ===
        reversibleForBlocks(recipeExporter, RecipeCategory.MISC, ModItems.SATORIUM_NUGGET, RecipeCategory.MISC, ModItems.SATORIUM_INGOT, "satorium_nugget");
        reversibleForBlocks(recipeExporter, RecipeCategory.MISC, ModItems.CIRNIUM_NUGGET, RecipeCategory.MISC, ModItems.CIRNIUM_INGOT, "cirnium_nugget");
        reversibleForBlocks(recipeExporter, RecipeCategory.MISC, ModItems.LEAD_NUGGET, RecipeCategory.MISC, ModItems.LEAD_INGOT, "lead_nugget");
        reversibleForBlocks(recipeExporter, RecipeCategory.MISC, ModItems.TIN_NUGGET, RecipeCategory.MISC, ModItems.TIN_INGOT, "tin_nugget");
        reversibleForBlocks(recipeExporter, RecipeCategory.MISC, ModItems.SILVER_NUGGET, RecipeCategory.MISC, ModItems.SILVER_INGOT, "silver_nugget");
        reversibleForBlocks(recipeExporter, RecipeCategory.MISC, ModItems.STEEL_NUGGET, RecipeCategory.MISC, ModItems.STEEL_INGOT, "steel_nugget");

        // === Raw Blocks ===
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.RAW_LEAD, RecipeCategory.MISC, ModBlocks.RAW_LEAD_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.RAW_TIN, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.RAW_SILVER, RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK);

        // offerPlanksRecipe(recipeExporter, ModBlocks.HEVEA_PLANKS, ModTags.HEVEA_WOOD, 4);

        // === Crystals ===
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SATORIUM_CRYSTAL)
                .pattern("A  ")
                .pattern(" A ")
                .pattern("  A")
                .input('A', ModItems.SATORIUM_SHARD)
                .group("crystals")
                .criterion("has_satorium_shard",
                        InventoryChangedCriterion.Conditions.items(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CIRNIUM_CRYSTAL)
                .pattern("A  ")
                .pattern(" A ")
                .pattern("  A")
                .input('A', ModItems.SATORIUM_SHARD)
                .group("crystals")
                .criterion("has_cirnium_shard",
                        InventoryChangedCriterion.Conditions.items(ModItems.CIRNIUM_INGOT))
                .offerTo(recipeExporter);
    }

    public static void offerReversibleCompactingRecipes(
            RecipeExporter exporter,
            RecipeCategory reverseCategory,
            ItemConvertible baseItem,
            RecipeCategory compactingCategory,
            ItemConvertible compactItem,
            String compactingId,
            String reverseId
    ) {
        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 9)
                .input(compactItem)
                .criterion(hasItem(compactItem), conditionsFromItem(compactItem))
                .offerTo(exporter, Identifier.of(reverseId));
        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem)
                .input('#', baseItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(baseItem), conditionsFromItem(baseItem))
                .offerTo(exporter, Identifier.of(compactingId));
    }

    private static void reversibleForBlocks(
            RecipeExporter exporter,
            RecipeCategory reverseCategory, ItemConvertible baseItem,
            RecipeCategory compactingCategory, ItemConvertible compactItem,
            String baseName
    ) {
        offerReversibleCompactingRecipes(
                exporter,
                reverseCategory, baseItem,
                compactingCategory, compactItem,
                Identifier.of(FumoTech.MOD_ID, baseName + "_to_block").toString(),
                Identifier.of(FumoTech.MOD_ID, "block_to_" + baseName).toString()
        );
    }

    private static void reversibleForNuggets(
            RecipeExporter exporter,
            RecipeCategory reverseCategory, ItemConvertible baseItem,
            RecipeCategory compactingCategory, ItemConvertible compactItem,
            String baseName
    ) {
        offerReversibleCompactingRecipes(
                exporter,
                reverseCategory, baseItem,
                compactingCategory, compactItem,
                Identifier.of(FumoTech.MOD_ID, baseName + "_to_ingot").toString(),
                Identifier.of(FumoTech.MOD_ID, "ingots_to_" + baseName).toString()
        );
    }

}
