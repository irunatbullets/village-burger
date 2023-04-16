package com.irunatbullets.villageburger.item;

import com.irunatbullets.villageburger.VillageBurger;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MYSTERY_MEAT = registerItem("mystery-meat", new MysteryMeatItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VillageBurger.MOD_ID, name), item);
    }
    public static void registerModItems() {
        VillageBurger.LOGGER.debug("Registering " + VillageBurger.MOD_ID + " items");
    }
}
