package com.eirmax.researcherstory.creativeytabs;


import com.eirmax.researcherstory.ResearcherStory;
import com.eirmax.researcherstory.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ResearcherStory.MODID);

    public static final RegistryObject<CreativeModeTab> RESEARCHERSTORY = CREATIVE_MODE_TABS.register("researcherstory",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_BRUSH.get()))
                    .title(Component.translatable("creativetab.researcherstory"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.IRON_BRUSH.get());
                        output.accept(ModItems.GOLD_BRUSH.get());
                        output.accept(ModItems.DIAMOND_BRUSH.get());
                        output.accept(ModItems.NETHERITE_BRUSH.get());
                        output.accept(ModItems.IMPROVED_FEATHER.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
