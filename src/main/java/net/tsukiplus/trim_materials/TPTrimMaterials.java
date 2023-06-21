package net.tsukiplus.trim_materials;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Style;
import net.minecraft.util.Identifier;
import net.tsukiplus.TsukiPlus;
import net.tsukiplus.data.ModTrimMaterials;
import net.tsukiplus.item.ModItems;

public class TPTrimMaterials {

    public static final RegistryKey<ArmorTrimMaterial> RUBY = registerKey("ruby");
    public static final RegistryKey<ArmorTrimMaterial> MYTHRIL = registerKey("mythril");

    public static RegistryKey<ArmorTrimMaterial> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, new Identifier(TsukiPlus.MOD_ID, name));
    }

    public static void bootstrap(Registerable<ArmorTrimMaterial> context) {
        TPTrimMaterials.register(context, RUBY, ModItems.RUBY, Style.EMPTY.withColor(11141120), 0.1f);
        TPTrimMaterials.register(context, MYTHRIL, ModItems.MYTHRIL_INGOT, Style.EMPTY.withColor(170), 0.1f);
    }

    private static void register(Registerable<ArmorTrimMaterial> context, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex) {
        TPTrimMaterials.register(context, key, ingredient, style, itemModelIndex);
    }

}
