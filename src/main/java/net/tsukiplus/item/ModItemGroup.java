package net.tsukiplus.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tsukiplus.TsukiPlus;
import net.tsukiplus.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup Mod_Items = Registry.register(Registries.ITEM_GROUP, new Identifier(TsukiPlus.MOD_ID, "ruby"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Modded Item Group"))
                    .icon(() -> new ItemStack(ModItems.MYTHRIL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_MYTHRIL);
                        entries.add(ModItems.MYTHRIL_NUGGET);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.MYTHRIL_SWORD);
                        entries.add(ModItems.MYTHRIL_PICKAXE);
                        entries.add(ModItems.MYTHRIL_SHOVEL);
                        entries.add(ModItems.MYTHRIL_AXE);
                        entries.add(ModItems.MYTHRIL_HOE);
                        entries.add(ModBlocks.BLOCK_OF_MYTHRIL);
                        entries.add(ModBlocks.MYTHRIL_ORE);
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE);
                    }).build());


    public static void registerItemGroups() {
        //adding items to minecraft(existing) groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

            entries.add(ModItems.RUBY);
            entries.add(ModItems.MYTHRIL_INGOT);
            entries.add(ModItems.RAW_MYTHRIL);
            entries.add(ModItems.MYTHRIL_NUGGET);

        });
    }

}
