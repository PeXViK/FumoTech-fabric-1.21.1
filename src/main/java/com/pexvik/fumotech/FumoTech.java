 package com.pexvik.fumotech;

import com.pexvik.fumotech.block.ModBlocks;
import com.pexvik.fumotech.item.ModItemGroups;
import com.pexvik.fumotech.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FumoTech implements ModInitializer {
	public static final String MOD_ID = "fumotech";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}