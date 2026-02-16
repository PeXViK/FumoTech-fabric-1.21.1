package com.pexvik.fumotech.util;

import com.pexvik.fumotech.FumoTech;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> HEVEA_LOGS = createTag("hevea_logs");

        public static final TagKey<Block> NEEDS_SATORIUM_TOOL = createTag("needs_satorium_tool");
        public static final TagKey<Block> INCORRECT_FOR_SATORIUM_TOOL = createTag("incorrect_for_satorium_tool");
        public static final TagKey<Block> NEEDS_CIRNIUM_TOOL = createTag("needs_cirnium_tool");
        public static final TagKey<Block> INCORRECT_FOR_CIRNIUM_TOOL = createTag("incorrect_for_cirnium_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(FumoTech.MOD_ID, name));
        }
    }

    public static  class Items {
        public static final TagKey<Item> RUBBER = createTag("rubber");
        public static final TagKey<Item> STEEL = createTag("steel");
        public static final TagKey<Item> HEVEA_LOGS = createTag("hevea_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(FumoTech.MOD_ID, name));
        }
    }
}
