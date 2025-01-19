package com.cursee.ender_pack.core.registry;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.Trinket;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class ModTrinketsFabric {

    public static void register() {}

    public static final Trinket TRINKET_BASE = new Trinket() {
        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            // Trinket.super.tick(stack, slot, entity);
            // no-op
        }
    };
}
