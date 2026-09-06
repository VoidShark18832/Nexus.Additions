package net.nexus.nexusadditions.datagen;

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
                // TABLES
                shaped(RecipeCategory.MISC, Items.CRAFTING_TABLE, 4)
                        .pattern("PP")
                        .pattern("PP")
                        .define('P', ItemTags.PLANKS)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE));
                // ITEMS
                shaped(RecipeCategory.MISC, Items.STICK, 64)
                        .pattern("P")
                        .pattern("P")
                        .define('P', ItemTags.PLANKS)
                        .group("Crafting")
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);
                // STAIRS
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.OAK_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.OAK_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.OAK_PLANKS), has(Items.OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.SPRUCE_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.SPRUCE_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.SPRUCE_PLANKS), has(Items.SPRUCE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.JUNGLE_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.JUNGLE_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.JUNGLE_PLANKS), has(Items.JUNGLE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.MANGROVE_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.MANGROVE_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.MANGROVE_PLANKS), has(Items.MANGROVE_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.DARK_OAK_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.DARK_OAK_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.DARK_OAK_PLANKS), has(Items.DARK_OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.PALE_OAK_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.PALE_OAK_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.PALE_OAK_PLANKS), has(Items.PALE_OAK_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.BIRCH_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.BIRCH_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.BIRCH_STAIRS), has(Items.BIRCH_STAIRS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.CHERRY_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.CHERRY_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.CHERRY_PLANKS), has(Items.CHERRY_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.ACACIA_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.ACACIA_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.ACACIA_PLANKS), has(Items.ACACIA_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.CRIMSON_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.CRIMSON_PLANKS), has(Items.CRIMSON_PLANKS))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_STAIRS, 8)
                        .pattern("P  ")
                        .pattern("PP ")
                        .pattern("PPP")
                        .define('P', Items.WARPED_PLANKS)
                        .group("Building")
                        .unlockedBy(getHasName(Items.WARPED_PLANKS), has(Items.WARPED_PLANKS))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Nexus Recipe Provider On";
    }
}