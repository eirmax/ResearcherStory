package com.eirmax.researcherstory.item;

import com.eirmax.researcherstory.ResearcherStory;
import com.eirmax.researcherstory.item.custom.brush.DiamondBrush;
import com.eirmax.researcherstory.item.custom.brush.GoldBrush;
import com.eirmax.researcherstory.item.custom.brush.IronBrush;
import com.eirmax.researcherstory.item.custom.brush.NetheriteBrush;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ResearcherStory.MODID);


    public static final RegistryObject<Item> GOLD_BRUSH = ITEMS.register("gold_brush",
            () -> new GoldBrush(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> IRON_BRUSH = ITEMS.register("iron_brush",
            () -> new IronBrush(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> DIAMOND_BRUSH = ITEMS.register("diamond_brush",
            () -> new DiamondBrush(new Item.Properties().durability(340)));
    public static final RegistryObject<Item> NETHERITE_BRUSH = ITEMS.register("netherite_brush",
            () -> new NetheriteBrush(new Item.Properties().durability(500)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}