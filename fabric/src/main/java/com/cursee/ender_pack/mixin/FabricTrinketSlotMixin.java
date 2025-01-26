package com.cursee.ender_pack.mixin;

import com.cursee.ender_pack.platform.Services;
import dev.emi.trinkets.TrinketSlot;
import dev.emi.trinkets.api.SlotReference;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TrinketSlot.class)
public interface FabricTrinketSlotMixin {

    @Inject(method = "canInsert", at = @At("HEAD"), cancellable = true)
    private static void injected_$_onCanInsert(ItemStack stack, SlotReference slotRef, LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        // System.out.println(slotRef.getId()); // chest/back/0
        if (stack.getItem() == Services.PLATFORM.getRegisteredEnderPackItem() && slotRef.getId().contains("back")) cir.setReturnValue(true);
    }
}
