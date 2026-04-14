package com.enderio.endergy.datagen.common.recipes;

import com.enderio.core.data.recipe.SubRecipeProvider;
import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.EndergyConduits;
import com.enderio.endergy.common.init.EndergyItems;
import com.enderio.enderio.api.EnderIORegistries;
import com.enderio.enderio.api.conduits.Conduit;
import com.enderio.enderio.api.conduits.ConduitApi;
import com.enderio.enderio.api.conduits.ConduitIngredient;
import com.enderio.enderio.foundation.tag.EIOTags;
import com.enderio.enderio.init.EIOConduits;
import com.enderio.enderio.init.EIOItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;

public class ConduitRecipeProvider extends SubRecipeProvider {

    private HolderLookup.RegistryLookup<Item> items;
    
    @Override
    public void buildRecipes(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        this.items = provider.lookupOrThrow(Registries.ITEM);
        
        // We know that the registries are now available.
        HolderGetter<Conduit<?, ?>> conduitRegistry = provider
                .lookupOrThrow(EnderIORegistries.Keys.CONDUIT);

        var vibrantEnergyConduit = conduitRegistry.getOrThrow(EIOConduits.VIBRANT_ENERGY);

        var crudeEnergyConduit = conduitRegistry.getOrThrow(EndergyConduits.CRUDE_ENERGY);
        var copperEnergyConduit = conduitRegistry.getOrThrow(EndergyConduits.COPPER_ENERGY);
        var ironEnergyConduit = conduitRegistry.getOrThrow(EndergyConduits.IRON_ENERGY);
        var goldEnergyConduit = conduitRegistry.getOrThrow(EndergyConduits.GOLD_ENERGY);
        var crystallineEnergyConduit = conduitRegistry.getOrThrow(EndergyConduits.CRYSTALLINE_ENERGY);
        var melodicEnergyConduit = conduitRegistry.getOrThrow(EndergyConduits.MELODIC_ENERGY);
        var stellarEnergyConduit = conduitRegistry.getOrThrow(EndergyConduits.STELLAR_ENERGY);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(crudeEnergyConduit, 8))
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('I', EndergyItems.CRUDE_STEEL_INGOT)
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("crude_energy_conduit").toString());

        ShapedRecipeBuilder
            .shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(copperEnergyConduit, 8))
            .pattern("BBB")
            .pattern("IGI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('G', EIOTags.Items.DUSTS_GRAINS_OF_INFINITY)
            .define('I', Tags.Items.INGOTS_COPPER)
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("copper_energy_conduit").toString());

        ShapedRecipeBuilder
            .shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(ironEnergyConduit, 8))
            .pattern("BBB")
            .pattern("IGI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('G', EIOTags.Items.DUSTS_GRAINS_OF_INFINITY)
            .define('I', Tags.Items.INGOTS_IRON)
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("iron_energy_conduit").toString());

        ShapedRecipeBuilder
            .shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(goldEnergyConduit, 8))
            .pattern("BBB")
            .pattern("IGI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('G', EIOTags.Items.DUSTS_GRAINS_OF_INFINITY)
            .define('I', Tags.Items.INGOTS_GOLD)
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("gold_energy_conduit").toString());

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(crystallineEnergyConduit, 8))
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('I', EndergyItems.CRYSTALLINE_ALLOY_INGOT)
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("crystalline_energy_conduit").toString());

        ShapedRecipeBuilder
            .shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(crystallineEnergyConduit, 8))
            .pattern("BBB")
            .pattern("ICI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('I', EndergyItems.CRYSTALLINE_ALLOY_INGOT)
            .define('C', ConduitIngredient.of(vibrantEnergyConduit))
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("crystalline_energy_conduit_upgrade").toString());

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(melodicEnergyConduit, 8))
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('I', EndergyItems.MELODIC_ALLOY_INGOT)
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("melodic_energy_conduit").toString());

        ShapedRecipeBuilder
            .shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(melodicEnergyConduit, 8))
            .pattern("BBB")
            .pattern("ICI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('I', EndergyItems.MELODIC_ALLOY_INGOT)
            .define('C', ConduitIngredient.of(crystallineEnergyConduit))
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("melodic_energy_conduit_upgrade").toString());

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(stellarEnergyConduit, 8))
            .pattern("BBB")
            .pattern("III")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('I', EndergyItems.STELLAR_ALLOY_INGOT)
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("stellar_energy_conduit").toString());

        ShapedRecipeBuilder
            .shaped(items, RecipeCategory.BUILDING_BLOCKS, ConduitApi.INSTANCE.getConduitStackTemplate(stellarEnergyConduit, 8))
            .pattern("BBB")
            .pattern("ICI")
            .pattern("BBB")
            .define('B', EIOItems.CONDUIT_BINDER)
            .define('I', EndergyItems.STELLAR_ALLOY_INGOT)
            .define('C', ConduitIngredient.of(melodicEnergyConduit))
            .unlockedBy("has_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(EIOItems.CONDUIT_BINDER))
            .save(recipeOutput, EnderIOEndergy.id("stellar_energy_conduit_upgrade").toString());
    }
}
