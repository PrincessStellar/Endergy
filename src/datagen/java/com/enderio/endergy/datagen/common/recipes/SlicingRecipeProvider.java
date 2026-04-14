package com.enderio.endergy.datagen.common.recipes;

import com.enderio.core.data.recipe.SubRecipeProvider;
import com.enderio.endergy.common.EnderIOEndergy;
import com.enderio.endergy.common.init.EndergyItems;
import com.enderio.enderio.content.machines.slicer.SlicingRecipe;
import com.enderio.enderio.foundation.tag.EIOTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import java.util.List;

public class SlicingRecipeProvider extends SubRecipeProvider {

    private HolderLookup.RegistryLookup<Item> items;

    protected Ingredient ingredientFromTag(TagKey<Item> tag) {
        return Ingredient.of(this.items.getOrThrow(tag));
    }

    @Override
    public void buildRecipes(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        this.items = provider.lookupOrThrow(Registries.ITEM);

        build(EndergyItems.TOTEMIC_CAPACITOR.get(),
                List.of(ingredientFromTag(EIOTags.Items.INGOTS_SOULARIUM), Ingredient.of(Items.TOTEM_OF_UNDYING),
                        ingredientFromTag(EIOTags.Items.INGOTS_SOULARIUM), ingredientFromTag(EIOTags.Items.DUSTS_GRAINS_OF_VIBRANCY),
                        Ingredient.of(EndergyItems.CRYSTALLINE_CAPACITOR.get()), ingredientFromTag(EIOTags.Items.DUSTS_GRAINS_OF_VIBRANCY)),
                20000, recipeOutput);
    }

    protected void build(Item output, List<Ingredient> inputs, int energy, RecipeOutput recipeOutput) {
        recipeOutput.accept(
                ResourceKey.create(Registries.RECIPE,
                        EnderIOEndergy.id("slicing/" + BuiltInRegistries.ITEM.getKey(output).getPath())),
                new SlicingRecipe(new ItemStackTemplate(output), inputs, energy), null);
    }

}
