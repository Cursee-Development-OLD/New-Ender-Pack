package com.cursee.ender_pack.core.registry;

import com.cursee.ender_pack.core.item.custom.EnderPackItem;
import com.cursee.ender_pack.platform.Services;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;

public class ModItemsFabric {

    public static final Item ENDER_PACK = RegistryFabric.registerItem("ender_pack", () -> new EnderPackItemFabric(ArmorMaterials.LEATHER.value(), ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static void register() {
         if (Services.PLATFORM.isModLoaded("trinkets")) {
             ModTrinketsFabric.register();
             TrinketsApi.registerTrinket(ENDER_PACK, ModTrinketsFabric.TRINKET_BASE);
         }
    }
}
