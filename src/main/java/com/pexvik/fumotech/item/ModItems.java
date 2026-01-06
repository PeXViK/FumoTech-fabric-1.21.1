package com.pexvik.fumotech.item;

import com.pexvik.fumotech.FumoTech;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // RESOURCES
    public static final Item SATORIUM_SHARD = registerItem("satorium_shard", new Item(new Item.Settings()));
    public static final Item SATORIUM_CRYSTAL = registerItem("satorium_crystal", new Item(new Item.Settings()));
    public static final Item SATORIUM_INGOT = registerItem("satorium_ingot", new Item(new Item.Settings()));
    public static final Item SATORIUM_GEAR = registerItem("satorium_gear", new Item(new Item.Settings()));
    public static final Item SATORIUM_NUGGET = registerItem("satorium_nugget", new Item(new Item.Settings()));
    public static final Item SATORIUM_DUST = registerItem("satorium_dust", new Item(new Item.Settings()));

    public static final Item CIRNIUM_SHARD = registerItem("cirnium_shard", new Item(new Item.Settings()));
    public static final Item CIRNIUM_CRYSTAL = registerItem("cirnium_crystal", new Item(new Item.Settings()));
    public static final Item CIRNIUM_INGOT = registerItem("cirnium_ingot", new Item(new Item.Settings()));
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FumoTech.MOD_ID, name), item);
        }

    public static void registerModItems() {
        FumoTech.LOGGER.info(FumoTech.MOD_ID + ": Registering Mod Items");


    }
}
