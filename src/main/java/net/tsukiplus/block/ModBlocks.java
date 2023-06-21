package net.tsukiplus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.tsukiplus.TsukiPlus;
import net.tsukiplus.item.ModItems;


public class ModBlocks {

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(4.0f).requiresTool(),
            UniformIntProvider.create(2,6)));

    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4.0f).requiresTool(),
            UniformIntProvider.create(2,6)));

    public static final Block BLOCK_OF_MYTHRIL = registerBlock("block_of_mythril", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

private static Item registerBlockItem(String name, Block block) {

    Item item = Registry.register(Registries.ITEM, new Identifier(TsukiPlus.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
            return item;

    }
private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, new Identifier(TsukiPlus.MOD_ID, name), block);
}
    public static void registerModBlocks() {
        TsukiPlus.LOGGER.info("Registering Mod Blocks for " + TsukiPlus.MOD_ID);
    }

}
