package net.tsukiplus.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.tsukiplus.block.ModBlocks;
import net.tsukiplus.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_MYTHRIL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MYTHRIL_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MYTHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_HOE, Models.HANDHELD);
    }
}
