package com.irunatbullets.villageburger;

import com.irunatbullets.villageburger.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillageBurger implements ModInitializer {
	public static final String MOD_ID = "village-burger";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("What's that cookin'?!");
		ModItems.registerModItems();
	}
}