package net.nexus.nexusadditions.datagen;

import java.io.File;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;

import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.world.item.Items;

public class NexusRecipeProvider extends FabricRecipeProvider {
    public NexusRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.MISC, Items.CRAFTING_TABLE, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .define('P', ItemTags.PLANKS)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                        .save(output, "planks_to_crafting_table");
                shaped(RecipeCategory.MISC, Items.STICK, 64)
                        .pattern("P")
                        .pattern("P")
                        .define('P', ItemTags.PLANKS)
                        .group("crafting")
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output, "minecraft:stick");

            }
        };
    }

    @Override
    public String getName() {
        return "Nexus Recipe Provider On";
    }
}