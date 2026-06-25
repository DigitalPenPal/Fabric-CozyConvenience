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
import pencil.cozyconvenience.block.BuildingBlocks;
import pencil.cozyconvenience.block.ColoredBlocks;
import pencil.cozyconvenience.block.NaturalBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        // "Dirt + Grass" Slab Blocks
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.GRASS_SLAB, Blocks.GRASS_BLOCK);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.DIRT_SLAB, Blocks.DIRT);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.DIRT_PATH_SLAB, Blocks.DIRT_PATH);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.COARSE_DIRT_SLAB, Blocks.COARSE_DIRT);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.PODZOL_SLAB, Blocks.PODZOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.MYCELIUM_SLAB, Blocks.MYCELIUM);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.CRIMSON_NYLIUM_SLAB, Blocks.CRIMSON_NYLIUM);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, NaturalBlocks.WARPED_NYLIUM_SLAB, Blocks.WARPED_NYLIUM);

        // Concrete Blocks ** NOTE: Must add concrete variant recipes.
        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.WHITE_CONCRETE_TILES, Blocks.WHITE_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.WHITE_CONCRETE_TILES, Blocks.WHITE_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIGHT_GRAY_CONCRETE_TILES, Blocks.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIGHT_GRAY_CONCRETE_TILES, Blocks.LIGHT_GRAY_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.GRAY_CONCRETE_TILES, Blocks.GRAY_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.GRAY_CONCRETE_TILES, Blocks.GRAY_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BLACK_CONCRETE_TILES, Blocks.BLACK_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BLACK_CONCRETE_TILES, Blocks.BLACK_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BROWN_CONCRETE_TILES, Blocks.BROWN_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BROWN_CONCRETE_TILES, Blocks.BROWN_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.RED_CONCRETE_TILES, Blocks.RED_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.RED_CONCRETE_TILES, Blocks.RED_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.ORANGE_CONCRETE_TILES, Blocks.ORANGE_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.ORANGE_CONCRETE_TILES, Blocks.ORANGE_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.YELLOW_CONCRETE_TILES, Blocks.YELLOW_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.YELLOW_CONCRETE_TILES, Blocks.YELLOW_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIME_CONCRETE_TILES, Blocks.LIME_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIME_CONCRETE_TILES, Blocks.LIME_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.GREEN_CONCRETE_TILES, Blocks.GREEN_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.GREEN_CONCRETE_TILES, Blocks.GREEN_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.CYAN_CONCRETE_TILES, Blocks.CYAN_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.CYAN_CONCRETE_TILES, Blocks.CYAN_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIGHT_BLUE_CONCRETE_TILES, Blocks.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIGHT_BLUE_CONCRETE_TILES, Blocks.LIGHT_BLUE_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BLUE_CONCRETE_TILES, Blocks.BLUE_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BLUE_CONCRETE_TILES, Blocks.BLUE_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.PURPLE_CONCRETE_TILES, Blocks.PURPLE_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.PURPLE_CONCRETE_TILES, Blocks.PURPLE_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.MAGENTA_CONCRETE_TILES, Blocks.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.MAGENTA_CONCRETE_TILES, Blocks.MAGENTA_CONCRETE);

        offer2x2CompactingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.PINK_CONCRETE_TILES, Blocks.PINK_CONCRETE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.PINK_CONCRETE_TILES, Blocks.PINK_CONCRETE);

        // Pillar Blocks
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BuildingBlocks.STONE_COLUMN, 2)
                .pattern("#")
                .pattern("#")
                .input('#', Blocks.STONE)
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BuildingBlocks.MOSSY_STONE_COLUMN)
                .input(BuildingBlocks.STONE_COLUMN)
                .input(Ingredient.ofItems(Blocks.VINE, Blocks.MOSS_BLOCK))
                .criterion(hasItem(BuildingBlocks.STONE_COLUMN), conditionsFromItem(BuildingBlocks.STONE_COLUMN))
                .offerTo(recipeExporter);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, BuildingBlocks.STONE_COLUMN, Blocks.STONE);
        offerCrackingRecipe(recipeExporter, BuildingBlocks.CRACKED_STONE_COLUMN, BuildingBlocks.STONE_COLUMN);

        // Wool Blocks ** NOTE: Stair recipes still have not been added :3 I'm lazy
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.RED_WOOL_SLAB, Blocks.RED_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIME_WOOL_SLAB, Blocks.LIME_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ColoredBlocks.PINK_WOOL_SLAB, Blocks.PINK_WOOL);
    }
}
