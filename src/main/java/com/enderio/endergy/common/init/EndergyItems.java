package com.enderio.endergy.common.init;

import com.enderio.core.common.registries.ItemDeferredRegister;
import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.item.TotemicCapacitorItem;
import com.enderio.enderio.api.EnderIODataComponents;
import com.enderio.enderio.api.capacitor.CapacitorData;
import com.enderio.enderio.api.components.GrindingBallData;
import com.enderio.enderio.content.capacitors.CapacitorItem;
import com.enderio.enderio.init.EIODataComponents;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;

public class EndergyItems {
    public static final ItemDeferredRegister ITEMS = ItemDeferredRegister.create(EnderIOEndergy.MOD_ID);

    // region Alloys

    public static final DeferredItem<Item> CRUDE_STEEL_INGOT = basic("crude_steel_ingot");
    public static final DeferredItem<Item> CRYSTALLINE_ALLOY_INGOT = basic("crystalline_alloy_ingot");
    public static final DeferredItem<Item> MELODIC_ALLOY_INGOT = basic("melodic_alloy_ingot");
    public static final DeferredItem<Item> STELLAR_ALLOY_INGOT = basic("stellar_alloy_ingot");
    public static final DeferredItem<Item> VIVID_ALLOY_INGOT = basic("vivid_alloy_ingot");

    public static final DeferredItem<Item> CRUDE_STEEL_NUGGET = basic("crude_steel_nugget");
    public static final DeferredItem<Item> CRYSTALLINE_ALLOY_NUGGET = basic("crystalline_alloy_nugget");
    public static final DeferredItem<Item> MELODIC_ALLOY_NUGGET = basic("melodic_alloy_nugget");
    public static final DeferredItem<Item> STELLAR_ALLOY_NUGGET = basic("stellar_alloy_nugget");
    public static final DeferredItem<Item> VIVID_ALLOY_NUGGET = basic("vivid_alloy_nugget");

    // endregion

    // region Grinding Balls

    // TODO: Can we power the default values with configs?

    public static final DeferredItem<Item> CRUDE_STEEL_BALL = grindingBall("crude_steel_grinding_ball",
            new GrindingBallData(1.2F, 1.25F, 0.85F, 24000));

    public static final DeferredItem<Item> CRYSTALLINE_ALLOY_BALL = grindingBall("crystalline_alloy_grinding_ball",
            new GrindingBallData(1.8F, 1.4F, 1.45F, 80000));

    public static final DeferredItem<Item> MELODIC_ALLOY_BALL = grindingBall("melodic_alloy_grinding_ball",
            new GrindingBallData(2.00F, 1.45F, 1.55F, 80000));

    public static final DeferredItem<Item> STELLAR_ALLOY_BALL = grindingBall("stellar_alloy_grinding_ball",
            new GrindingBallData(2.30F, 2.25F, 2.2F, 160000));

    public static final DeferredItem<Item> VIVID_ALLOY_BALL = grindingBall("vivid_alloy_grinding_ball",
            new GrindingBallData(1.75F, 1.35F, 1.35F, 80000));

    private static DeferredItem<Item> grindingBall(String name, GrindingBallData data) {
        return ITEMS.registerItem(name, Item::new, new Item.Properties()
                .component(EnderIODataComponents.GRINDING_BALL, data));
    }

    // endregion

    public static final DeferredItem<CapacitorItem> GRAINY_CAPACITOR = ITEMS.registerItem("grainy_capacitor",
        CapacitorItem::new, new Item.Properties().component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(1)));

    public static final DeferredItem<CapacitorItem> VIVID_CAPACITOR = ITEMS.registerItem("vivid_capacitor",
        CapacitorItem::new, new Item.Properties().component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(3)));

    public static final DeferredItem<CapacitorItem> CRYSTALLINE_CAPACITOR = ITEMS.registerItem("crystalline_capacitor",
        CapacitorItem::new, new Item.Properties().component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(3.5f)));

    public static final DeferredItem<CapacitorItem> MELODIC_CAPACITOR = ITEMS.registerItem("melodic_capacitor",
        CapacitorItem::new, new Item.Properties().component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(4)));

    public static final DeferredItem<CapacitorItem> STELLAR_CAPACITOR = ITEMS.registerItem("stellar_capacitor",
        CapacitorItem::new, new Item.Properties().component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(5)));

    public static final DeferredItem<CapacitorItem> TOTEMIC_CAPACITOR = ITEMS.registerItem("totemic_capacitor",
        TotemicCapacitorItem::new);

    private static DeferredItem<Item> basic(String name) {
        return ITEMS.registerItem(name, Item::new);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
