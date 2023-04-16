package com.irunatbullets.villageburger.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MysteryMeatItem extends Item {
    public MysteryMeatItem() {
        super(new FabricItemSettings()
                .group(ModItemGroup.VILLAGE_BURGER)
                .food(new FoodComponent.Builder()
                        .hunger(4)
                        .saturationModifier(0.6f)
                        .meat()
                        .build()));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.eatFood(world, itemStack);
        return TypedActionResult.success(itemStack);
    }
}
