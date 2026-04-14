package com.enderio.endergy.datagen.common.recipes;

import com.enderio.core.data.recipe.EnderRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;

public class EndergyRecipeProvider extends EnderRecipeProvider {
    public EndergyRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);

        addProvider(new AlloyRecipeProvider());
        addProvider(new ConduitRecipeProvider());
        addProvider(new MaterialRecipeProvider());
        addProvider(new SlicingRecipeProvider());
    }

    public static final class Runner extends RecipeProvider.Runner
    {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
        {
            super(output, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output)
        {
            return new EndergyRecipeProvider(registries, output);
        }

        @Override
        public String getName()
        {
            return "Endergy Recipe Generator";
        }
    }
}
