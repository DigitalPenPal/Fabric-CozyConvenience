package pencil.cozyconvenience.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import pencil.cozyconvenience.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        // Pillar Blocks
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONE_COLUMN, 2)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.STONE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_COLUMN)
                .input(ModBlocks.STONE_COLUMN)
                .input(Ingredient.ofItems(Blocks.VINE, Blocks.MOSS_BLOCK))
                .criterion(hasItem(ModBlocks.STONE_COLUMN), conditionsFromItem(ModBlocks.STONE_COLUMN))
                .offerTo(recipeExporter);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_COLUMN, Blocks.STONE);
        offerCrackingRecipe(recipeExporter, ModBlocks.CRACKED_STONE_COLUMN, ModBlocks.STONE_COLUMN);

        // Slab Blocks
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_WOOL_SLAB, Blocks.RED_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_WOOL_SLAB, Blocks.LIME_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WOOL_SLAB, Blocks.PINK_WOOL);
    }
}
