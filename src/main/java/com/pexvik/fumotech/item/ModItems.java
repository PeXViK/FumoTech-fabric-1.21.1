package com.pexvik.fumotech.item;

import com.pexvik.fumotech.FumoTech;
import com.pexvik.fumotech.item.custom.CirniumClubItem;
import com.pexvik.fumotech.item.custom.ClubItem;
import com.pexvik.fumotech.item.custom.HammerItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    // RESOURCES
    public static final Item SATORIUM_SHARD = registerItem("satorium_shard", new Item(new Item.Settings()));
    public static final Item SATORIUM_CRYSTAL = registerItem("satorium_crystal", new Item(new Item.Settings()));
    public static final Item SATORIUM_INGOT = registerItem("satorium_ingot", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item SATORIUM_GEAR = registerItem("satorium_gear", new Item(new Item.Settings()));
    public static final Item SATORIUM_NUGGET = registerItem("satorium_nugget", new Item(new Item.Settings()));
    public static final Item SATORIUM_DUST = registerItem("satorium_dust", new Item(new Item.Settings()));

    public static final Item CIRNIUM_SHARD = registerItem("cirnium_shard", new Item(new Item.Settings()));
    public static final Item CIRNIUM_CRYSTAL = registerItem("cirnium_crystal", new Item(new Item.Settings()));
    public static final Item CIRNIUM_INGOT = registerItem("cirnium_ingot", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item CIRNIUM_GEAR = registerItem("cirnium_gear", new Item(new Item.Settings()));
    public static final Item CIRNIUM_NUGGET = registerItem("cirnium_nugget", new Item(new Item.Settings()));
    public static final Item CIRNIUM_DUST = registerItem("cirnium_dust", new Item(new Item.Settings()));

    public static final Item RUBBER = registerItem("rubber", new Item(new Item.Settings()));
    public static final Item RAW_RUBBER = registerItem("raw_rubber", new Item(new Item.Settings()));

    public static final Item MAGMA_SHARD = registerItem("magma_shard", new Item(new Item.Settings()));
    public static final Item ICE_SHARD = registerItem("ice_shard", new Item(new Item.Settings()));

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_GEAR = registerItem("steel_gear", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));
    public static final Item STEEL_PLATE = registerItem("steel_plate", new Item(new Item.Settings()));
    public static final Item STEEL_DUST = registerItem("steel_dust", new Item(new Item.Settings()));

    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item LEAD_GEAR = registerItem("lead_gear", new Item(new Item.Settings()));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new Item.Settings()));
    public static final Item LEAD_PLATE = registerItem("lead_plate", new Item(new Item.Settings()));
    public static final Item LEAD_DUST = registerItem("lead_dust", new Item(new Item.Settings()));

    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_GEAR = registerItem("silver_gear", new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new Item.Settings()));
    public static final Item SILVER_PLATE = registerItem("silver_plate", new Item(new Item.Settings()));
    public static final Item SILVER_DUST = registerItem("silver_dust", new Item(new Item.Settings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item TIN_GEAR = registerItem("tin_gear", new Item(new Item.Settings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new Item.Settings()));
    public static final Item TIN_PLATE = registerItem("tin_plate", new Item(new Item.Settings()));
    public static final Item TIN_DUST = registerItem("tin_dust", new Item(new Item.Settings()));

    // === Items ===
    // Satorium
    public static final Item SATORI_ITEM = registerItem("satori_item", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SATORIUM_SWORD = registerItem("satorium_sword", new SwordItem(ModToolMaterials.SATORIUM,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SATORIUM, 3, -2.4F))));
    public static final Item SATORIUM_AXE = registerItem("satorium_axe", new AxeItem(ModToolMaterials.SATORIUM,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SATORIUM, 5, -3F))));
    public static final Item SATORIUM_PICKAXE = registerItem("satorium_pickaxe", new PickaxeItem(ModToolMaterials.SATORIUM,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SATORIUM, 1, -2.8F))));
    public static final Item SATORIUM_SHOVEL = registerItem("satorium_shovel", new ShovelItem(ModToolMaterials.SATORIUM,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SATORIUM, 1.5F, -3F))));
    public static final Item SATORIUM_HOE = registerItem("satorium_hoe", new HoeItem(ModToolMaterials.SATORIUM,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SATORIUM, -3, 0F))));
    public static final Item SATORIUM_CLUB = registerItem("satorium_club", new CirniumClubItem(ModToolMaterials.SATORIUM,
            new Item.Settings().attributeModifiers(ClubItem.createAttributeModifiers(ModToolMaterials.SATORIUM, -1, -2.4f))));
    
    // Cirnium
    public static final Item CIRNIUM_SWORD = registerItem("cirnium_sword", new SwordItem(ModToolMaterials.CIRNIUM,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CIRNIUM, 3, -2.4F))));
    public static final Item CIRNIUM_AXE = registerItem("cirnium_axe", new AxeItem(ModToolMaterials.CIRNIUM,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.CIRNIUM, 5, -3F))));
    public static final Item CIRNIUM_PICKAXE = registerItem("cirnium_pickaxe", new PickaxeItem(ModToolMaterials.CIRNIUM,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.CIRNIUM, 1, -2.8F))));
    public static final Item CIRNIUM_SHOVEL = registerItem("cirnium_shovel", new ShovelItem(ModToolMaterials.CIRNIUM,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.CIRNIUM, 1.5F, -3F))));
    public static final Item CIRNIUM_HOE = registerItem("cirnium_hoe", new HoeItem(ModToolMaterials.CIRNIUM,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.CIRNIUM, -3, 0F))));
    public static final Item CIRNIUM_CLUB = registerItem("cirnium_club", new CirniumClubItem(ModToolMaterials.CIRNIUM,
            new Item.Settings().attributeModifiers(ClubItem.createAttributeModifiers(ModToolMaterials.CIRNIUM, -1, -2.4f))));
    
    // Steel
    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 3, -2.4F))));
    public static final Item STEEL_AXE = registerItem("steel_axe", new AxeItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 6, -3F))));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new PickaxeItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 1, -2.8F))));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL, 1.5F, -3F))));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new HoeItem(ModToolMaterials.STEEL,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STEEL, -3, 0F))));
    
    // Rubber
    public static final Item RUBBER_CLUB = registerItem("rubber_club", new ClubItem(ModToolMaterials.RUBBER,
            new Item.Settings().attributeModifiers(ClubItem.createAttributeModifiers(ModToolMaterials.RUBBER, -1, -2.4f))));

    // Hammers
    public static final Item IRON_HAMMER = registerItem("iron_hammer", new HammerItem(ToolMaterials.IRON,
            new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.IRON, 7, -3.2F))));
    public static final Item GOLDEN_HAMMER = registerItem("golden_hammer", new HammerItem(ToolMaterials.GOLD,
            new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.GOLD, 7, -3.2F))));
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer", new HammerItem(ToolMaterials.DIAMOND,
            new Item.Settings().attributeModifiers(HammerItem.createAttributeModifiers(ToolMaterials.DIAMOND, 7, -3.2F))));

    // === FOOD ===
    public static final Item BURGA = registerItem("burga", new Item(new Item.Settings().food(ModFoodComponent.BURGA)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FumoTech.MOD_ID, name), item);
        }

    public static void registerModItems() {
        FumoTech.LOGGER.info(FumoTech.MOD_ID + ": Registering Mod Items");


    }
}
