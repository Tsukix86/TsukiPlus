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

public class ModItemGroup {
    public static ItemGroup RUBY = Registry.register(Registries.ITEM_GROUP, new Identifier(TsukiPlus.MOD_ID, "ruby"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Modded Item Group"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                    }).build());


    public static void registerItemGroups() {
        //adding items to minecraft(existing) groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.RUBY);

            /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                entries.add(ModItems.MYTHRIL_INGOT); */
        });
    }

}
