package net.tsukiplus;
//test
import net.fabricmc.api.ModInitializer;

import net.tsukiplus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TsukiPlus implements ModInitializer {
	public static final String MOD_ID = "tsukiplus";
    public static final Logger LOGGER = LoggerFactory.getLogger("tsukiplus");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}