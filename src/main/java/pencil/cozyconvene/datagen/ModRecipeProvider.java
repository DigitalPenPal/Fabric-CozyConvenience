package pencil.cozyconvene.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import pencil.cozyconvene.block.MoBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.RED_WOOL_SLAB, Blocks.RED_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.LIME_WOOL_SLAB, Blocks.LIME_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, MoBlocks.PINK_WOOL_SLAB, Blocks.PINK_WOOL);
    }
}
