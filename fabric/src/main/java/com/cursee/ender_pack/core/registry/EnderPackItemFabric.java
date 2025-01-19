package com.cursee.ender_pack.core.registry;

import com.cursee.ender_pack.core.item.custom.EnderPackItem;
import dev.emi.trinkets.api.Trinket;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class EnderPackItemFabric extends EnderPackItem implements Trinket {

    public EnderPackItemFabric(ArmorMaterial armorMaterial, ArmorItem.Type armorItemType, Properties itemProperties) {
        super(armorMaterial, armorItemType, itemProperties);
        TrinketsApi.registerTrinket(this, this);
    }
}
