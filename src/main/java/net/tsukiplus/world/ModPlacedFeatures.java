package net.tsukiplus.world;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.tsukiplus.TsukiPlus;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.tsukiplus.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MYTHRIL_ORE_PLACED_KEY = registerKey("mythril_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {

        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MYTHRIL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MYTHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,//veins per chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TsukiPlus.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
