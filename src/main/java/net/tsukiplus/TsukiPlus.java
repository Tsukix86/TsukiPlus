package net.tsukiplus;
//test
import net.fabricmc.api.ModInitializer;

import net.tsukiplus.block.ModBlocks;
import net.tsukiplus.item.ModItemGroup;
import net.tsukiplus.item.ModItems;
import net.tsukiplus.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TsukiPlus implements ModInitializer {
	public static final String MOD_ID = "tsukiplus";
    public static final Logger LOGGER = LoggerFactory.getLogger("tsukiplus");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}
}