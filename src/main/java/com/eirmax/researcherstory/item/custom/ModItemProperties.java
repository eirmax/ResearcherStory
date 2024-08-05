package com.eirmax.researcherstory.item.custom;


import com.eirmax.researcherstory.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {

    ItemProperties.register(ModItems.GOLD_BRUSH.get(), new ResourceLocation("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
        return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float) (p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;});
    ItemProperties.register(ModItems.NETHERITE_BRUSH.get(), new ResourceLocation("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
        return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float) (p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;});
    ItemProperties.register(ModItems.GOLD_BRUSH.get(), new ResourceLocation("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
            return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float) (p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;});
    ItemProperties.register(ModItems.DIAMOND_BRUSH.get(), new ResourceLocation("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
            return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float) (p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;});



    }
}

