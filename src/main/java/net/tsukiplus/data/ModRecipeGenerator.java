package net.tsukiplus.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.tsukiplus.TsukiPlus;
import net.tsukiplus.block.ModBlocks;
import net.tsukiplus.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {

    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_MYTHRIL), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 0.7f, 200, "");
        offerBlasting(exporter, List.of(ModItems.RAW_MYTHRIL), RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, 1.4f, 100, "");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MYTHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_MYTHRIL);
        //offerSmithingTrimRecipe(exporter, ModItems.MYTHRIL_INGOT, new Identifier(TsukiPlus.MOD_ID, "mythril_trim"));
        //offerSmithingTrimRecipe(exporter, ModItems.RUBY, new Identifier(TsukiPlus.MOD_ID, "ruby_trim"));

    }
}
