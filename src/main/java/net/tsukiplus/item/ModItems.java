package net.tsukiplus.item;

import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tsukiplus.TsukiPlus;
import net.minecraft.*;


public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new FabricItemSettings()));

    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe", new PickaxeItem(ModToolMaterials.MYTHRIL, 4, -2.8f, new FabricItemSettings()));
    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword", new SwordItem(ModToolMaterials.MYTHRIL, 6, -2.4f, new FabricItemSettings()));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel", new ShovelItem(ModToolMaterials.MYTHRIL, 4, -3f, new FabricItemSettings()));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe", new AxeItem(ModToolMaterials.MYTHRIL, 8, -3.05f, new FabricItemSettings()));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe", new HoeItem(ModToolMaterials.MYTHRIL, 0, -0.5f, new FabricItemSettings()));

    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet", new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.HELMET,  new FabricItemSettings()));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate", new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings", new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots", new ArmorItem(ModArmorMaterials.MYTHRIL, ArmorItem.Type.BOOTS,  new FabricItemSettings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TsukiPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TsukiPlus.LOGGER.info("Registering Mod Items for " + TsukiPlus.MOD_ID);
    }

}
