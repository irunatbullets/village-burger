package com.irunatbullets.villageburger.item;

import com.irunatbullets.villageburger.VillageBurger;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup VILLAGE_BURGER = FabricItemGroupBuilder.build(
            new Identifier(VillageBurger.MOD_ID, "village-burger"), () -> new ItemStack(ModItems.MYSTERY_MEAT));
}
