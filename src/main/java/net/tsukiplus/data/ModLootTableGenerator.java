package net.tsukiplus.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.tsukiplus.block.ModBlocks;
import net.tsukiplus.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.BLOCK_OF_MYTHRIL);
        addDrop(ModBlocks.MYTHRIL_ORE, oreDrops(ModBlocks.MYTHRIL_ORE, ModItems.RAW_MYTHRIL) );
        addDrop(ModBlocks.DEEPSLATE_MYTHRIL_ORE,oreDrops(ModBlocks.DEEPSLATE_MYTHRIL_ORE, ModItems.RAW_MYTHRIL) );

    }
}
