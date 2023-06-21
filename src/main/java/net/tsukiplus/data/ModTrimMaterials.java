package net.tsukiplus.data;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.util.Identifier;
import net.minecraft.item.*;
import net.tsukiplus.TsukiPlus;
import net.tsukiplus.item.ModItems;

import java.util.Optional;

public class ModTrimMaterials {

    public static final RegistryKey<ArmorTrimMaterial> RUBY = registerKey("ruby");
    public static final RegistryKey<ArmorTrimMaterial> MYTHRIL = registerKey("mythril");

    public static RegistryKey<ArmorTrimMaterial> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.TRIM_MATERIAL, new Identifier(TsukiPlus.MOD_ID, name));
    }

    public static void bootstrap(Registerable<ArmorTrimMaterial> context) {
        ModTrimMaterials.register(context, RUBY, ModItems.RUBY, Style.EMPTY.withColor(11141120), 0.1f);
        ModTrimMaterials.register(context, MYTHRIL, ModItems.MYTHRIL_INGOT, Style.EMPTY.withColor(170), 0.1f);
    }

    private static void register(Registerable<ArmorTrimMaterial> context, RegistryKey<ArmorTrimMaterial> key, Item ingredient, Style style, float itemModelIndex) {
        ModTrimMaterials.register(context, key, ingredient, style, itemModelIndex);
    }

    public static Optional<RegistryEntry.Reference<ArmorTrimMaterial>> get(DynamicRegistryManager registryManager, ItemStack stack) {
        return registryManager.get(RegistryKeys.TRIM_MATERIAL).streamEntries().filter(recipe -> stack.itemMatches(((ArmorTrimMaterial)recipe.value()).ingredient())).findFirst();
    }

}
