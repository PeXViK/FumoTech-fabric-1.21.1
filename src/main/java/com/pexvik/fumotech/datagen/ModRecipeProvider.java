package com.pexvik.fumotech.datagen;

import com.pexvik.fumotech.FumoTech;
import com.pexvik.fumotech.block.ModBlocks;
import com.pexvik.fumotech.item.ModItems;
import com.pexvik.fumotech.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        List<ItemConvertible> SATORIUM_SMELTABLES = List.of(ModItems.SATORIUM_DUST, ModItems.SATORIUM_CRYSTAL);
        List<ItemConvertible> CIRNIUM_SMELTABLES = List.of(ModItems.CIRNIUM_DUST, ModItems.CIRNIUM_CRYSTAL);
        List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.TIN_DUST, ModItems.RAW_TIN, ModBlocks.TIN_ORE);
        List<ItemConvertible> LEAD_SMELTABLES = List.of(ModItems.LEAD_DUST, ModItems.RAW_LEAD, ModBlocks.LEAD_ORE);
        List<ItemConvertible> SILVER_SMELTABLES = List.of(ModItems.SILVER_DUST, ModItems.RAW_SILVER, ModBlocks.SILVER_ORE);

        // === Material Smelting ===
        offerSmeltingAndBlasting(recipeExporter, SATORIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SATORIUM_INGOT, 1.0f, 800, "satorium");
        offerSmeltingAndBlasting(recipeExporter, CIRNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CIRNIUM_INGOT, 1.0f, 800, "cirnium");
        offerSmeltingAndBlasting(recipeExporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f, 400, "tin");
        offerSmeltingAndBlasting(recipeExporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT, 0.5f, 400, "lead");
        offerSmeltingAndBlasting(recipeExporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 1.0f, 400, "silver");
        offerSmeltingAndBlasting(recipeExporter, List.of(ModItems.STEEL_DUST), RecipeCategory.MISC, ModItems.STEEL_INGOT, 0.5f, 400, "steel");

        offerSmelting(recipeExporter, List.of(ModItems.RAW_RUBBER), RecipeCategory.MISC, ModItems.RUBBER, 0.25f, 400, "rubber");

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

        offerPlanksRecipe(recipeExporter, ModBlocks.HEVEA_PLANKS, ModTags.Items.HEVEA_LOGS, 4);
        createStairsRecipe(ModBlocks.HEVEA_STAIRS, Ingredient.ofItems(ModBlocks.HEVEA_PLANKS))
                .criterion(hasItem(ModBlocks.HEVEA_PLANKS),  conditionsFromItem(ModBlocks.HEVEA_PLANKS))
                .offerTo(recipeExporter);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HEVEA_SLAB, ModBlocks.HEVEA_PLANKS);
        offerShapelessRecipe(recipeExporter, ModBlocks.HEVEA_BUTTON, ModBlocks.HEVEA_PLANKS, "hevea_button", 1);
        offerPressurePlateRecipe(recipeExporter, ModBlocks.HEVEA_PRESSURE_PLATE, ModBlocks.HEVEA_PLANKS);
        createFenceRecipe(ModBlocks.HEVEA_FENCE, Ingredient.ofItems(ModBlocks.HEVEA_PLANKS))
                .criterion(hasItem(ModBlocks.HEVEA_PLANKS), conditionsFromItem(ModBlocks.HEVEA_PLANKS))
                .offerTo(recipeExporter);
        createFenceGateRecipe(ModBlocks.HEVEA_FENCE_GATE, Ingredient.ofItems(ModBlocks.HEVEA_PLANKS))
                .criterion(hasItem(ModBlocks.HEVEA_PLANKS), conditionsFromItem(ModBlocks.HEVEA_PLANKS))
                .offerTo(recipeExporter);
        createDoorRecipe(ModBlocks.HEVEA_DOOR, Ingredient.ofItems(ModBlocks.HEVEA_PLANKS))
                .criterion(hasItem(ModBlocks.HEVEA_PLANKS), conditionsFromItem(ModBlocks.HEVEA_PLANKS))
                .offerTo(recipeExporter);
        createTrapdoorRecipe(ModBlocks.HEVEA_TRAPDOOR, Ingredient.ofItems(ModBlocks.HEVEA_PLANKS))
                .criterion(hasItem(ModBlocks.HEVEA_PLANKS), conditionsFromItem(ModBlocks.HEVEA_PLANKS))
                .offerTo(recipeExporter);

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

        // === Machines ===
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBBER_CLUB_GENERATOR)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("CCC")
                .input('A', ModBlocks.RUBBER_BLOCK)
                .input('B', ModItems.RUBBER_CLUB)
                .input('C', Blocks.IRON_BLOCK)
                .group("machines")
                .criterion("has_rubber_club",
                        InventoryChangedCriterion.Conditions.items(ModItems.RUBBER_CLUB))
                .offerTo(recipeExporter);

        // === Armor and Tools ===
        offerAllTools(recipeExporter, ModItems.SATORIUM_INGOT, ModItems.SATORIUM_SWORD, ModItems.SATORIUM_AXE,
                ModItems.SATORIUM_PICKAXE, ModItems.SATORIUM_SHOVEL, ModItems.SATORIUM_HOE);
        offerAllTools(recipeExporter, ModItems.CIRNIUM_INGOT, ModItems.CIRNIUM_SWORD, ModItems.CIRNIUM_AXE,
                ModItems.CIRNIUM_PICKAXE, ModItems.CIRNIUM_SHOVEL, ModItems.CIRNIUM_HOE);
        offerAllTools(recipeExporter, ModItems.STEEL_INGOT, ModItems.STEEL_SWORD, ModItems.STEEL_AXE,
                ModItems.STEEL_PICKAXE, ModItems.STEEL_SHOVEL, ModItems.STEEL_HOE);
    }

    // Programmer is very lazy
    private static void offerAllTools(RecipeExporter exporter, ItemConvertible material, ItemConvertible swordItem,
                                      ItemConvertible axeItem, ItemConvertible pickaxeItem, ItemConvertible shovelItem, ItemConvertible hoeItem) {
        offerSwordRecipe(exporter, swordItem, material);
        offerAxeRecipe(exporter, axeItem, material);
        offerPickaxeRecipe(exporter, pickaxeItem, material);
        offerShovelRecipe(exporter, shovelItem, material);
        offerHoeRecipe(exporter, hoeItem, material);
    }

    private static void offerSwordRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', material)
                .input('S', Items.STICK)
                .group("equipment")
                .criterion(hasItem(material), InventoryChangedCriterion.Conditions.items(material))
                .offerTo(exporter);
    }

    private static void offerAxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', material)
                .input('S', Items.STICK)
                .group("equipment")
                .criterion(hasItem(material), InventoryChangedCriterion.Conditions.items(material))
                .offerTo(exporter);
    }

    private static void offerPickaxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', material)
                .input('S', Items.STICK)
                .group("equipment")
                .criterion(hasItem(material), InventoryChangedCriterion.Conditions.items(material))
                .offerTo(exporter);
    }

    private static void offerShovelRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', material)
                .input('S', Items.STICK)
                .group("equipment")
                .criterion(hasItem(material), InventoryChangedCriterion.Conditions.items(material))
                .offerTo(exporter);
    }

    private static void offerHoeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', material)
                .input('S', Items.STICK)
                .group("equipment")
                .criterion(hasItem(material), InventoryChangedCriterion.Conditions.items(material))
                .offerTo(exporter);
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

    private static void offerSmeltingAndBlasting(
            RecipeExporter exporter, List<ItemConvertible> inputs, RecipeCategory category, ItemConvertible output, float experience, int cookingTime, String group) {
        offerSmelting(exporter, inputs, category, output, experience, cookingTime, group);
        offerBlasting(exporter, inputs, category, output, experience, cookingTime/2, group);
    }

}
