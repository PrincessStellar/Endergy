package com.enderio.endergy.datagen.client;

import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.init.EndergyItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class EndergyItemModelProvider extends ModelProvider {
    public EndergyItemModelProvider(PackOutput output) {
        super(output, EnderIOEndergy.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Alloys
        itemModels.generateFlatItem(EndergyItems.CRUDE_STEEL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.CRYSTALLINE_ALLOY_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.MELODIC_ALLOY_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.STELLAR_ALLOY_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.VIVID_ALLOY_INGOT.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(EndergyItems.CRUDE_STEEL_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.CRYSTALLINE_ALLOY_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.MELODIC_ALLOY_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.STELLAR_ALLOY_NUGGET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.VIVID_ALLOY_NUGGET.get(), ModelTemplates.FLAT_ITEM);

        // Grinding Balls
        itemModels.generateFlatItem(EndergyItems.CRUDE_STEEL_BALL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.CRYSTALLINE_ALLOY_BALL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.MELODIC_ALLOY_BALL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.STELLAR_ALLOY_BALL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.VIVID_ALLOY_BALL.get(), ModelTemplates.FLAT_ITEM);

        // Capacitors
        itemModels.generateFlatItem(EndergyItems.GRAINY_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.VIVID_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.CRYSTALLINE_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.MELODIC_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.STELLAR_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(EndergyItems.TOTEMIC_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);
    }
}
