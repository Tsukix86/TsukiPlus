package net.tsukiplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tsukiplus.TsukiPlus;


public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings()));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings()));

    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe", new PickaxeItem(ModToolMaterials.MYTHRIL, 4, 4.5f, new FabricItemSettings()));
    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword", new SwordItem(ModToolMaterials.MYTHRIL_SWORD, 5, -2.4f, new FabricItemSettings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TsukiPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TsukiPlus.LOGGER.info("Registering Mod Items for " + TsukiPlus.MOD_ID);
    }

}
