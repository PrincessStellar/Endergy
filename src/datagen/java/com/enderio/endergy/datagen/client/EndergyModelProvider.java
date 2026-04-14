package com.enderio.endergy.datagen.client;

import com.enderio.endergy.common.EnderIOEndergy;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public class EndergyModelProvider extends ModelProvider {

    private final EndergyBlockStateProvider block;
    private final EndergyItemModelProvider item;

    public EndergyModelProvider(PackOutput output) {
        super(output, EnderIOEndergy.MOD_ID);
        this.block = new EndergyBlockStateProvider(output);
        this.item = new EndergyItemModelProvider(output);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        block.registerModels(blockModels, itemModels);
        item.registerModels(blockModels, itemModels);
    }

    @Override
    public String getName() {
        return "EnderIO Model Provider";
    }
}