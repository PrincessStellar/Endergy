package com.enderio.endergy.datagen.client;

import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.init.EndergyBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

public class EndergyBlockStateProvider extends ModelProvider {
    public EndergyBlockStateProvider(PackOutput output) {
        super(output, EnderIOEndergy.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        blockModels.createTrivialCube(EndergyBlocks.CRUDE_STEEL_BLOCK.get());
        blockModels.createTrivialCube(EndergyBlocks.CRYSTALLINE_ALLOY_BLOCK.get());
        blockModels.createTrivialCube(EndergyBlocks.MELODIC_ALLOY_BLOCK.get());
        blockModels.createTrivialCube(EndergyBlocks.STELLAR_ALLOY_BLOCK.get());
        blockModels.createTrivialCube(EndergyBlocks.VIVID_ALLOY_BLOCK.get());
    }

    private Identifier key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private String name(Block block) {
        return this.key(block).getPath();
    }
}
