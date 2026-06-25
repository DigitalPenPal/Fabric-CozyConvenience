package pencil.cozyconvenience.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;

public class ColoredBlocks {
    // Wool
    public static final Block WHITE_WOOL_STAIRS = registerWoolStairs(DyeColor.WHITE, Blocks.WHITE_WOOL);
    public static final Block WHITE_WOOL_SLAB = registerWoolSlab(DyeColor.WHITE, Blocks.WHITE_WOOL);
    public static final Block WHITE_WOOL_WALL = registerWoolWall(DyeColor.WHITE, Blocks.WHITE_WOOL);

    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerWoolStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL);
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerWoolSlab(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL);
    public static final Block LIGHT_GRAY_WOOL_WALL = registerWoolWall(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL);

    public static final Block GRAY_WOOL_STAIRS = registerWoolStairs(DyeColor.GRAY, Blocks.GRAY_WOOL);
    public static final Block GRAY_WOOL_SLAB = registerWoolSlab(DyeColor.GRAY, Blocks.GRAY_WOOL);
    public static final Block GRAY_WOOL_WALL = registerWoolWall(DyeColor.GRAY, Blocks.GRAY_WOOL);

    public static final Block BLACK_WOOL_STAIRS = registerWoolStairs(DyeColor.BLACK, Blocks.BLACK_WOOL);
    public static final Block BLACK_WOOL_SLAB = registerWoolSlab(DyeColor.BLACK, Blocks.BLACK_WOOL);
    public static final Block BLACK_WOOL_WALL = registerWoolWall(DyeColor.BLACK, Blocks.BLACK_WOOL);

    public static final Block BROWN_WOOL_STAIRS = registerWoolStairs(DyeColor.BROWN, Blocks.BROWN_WOOL);
    public static final Block BROWN_WOOL_SLAB = registerWoolSlab(DyeColor.BROWN, Blocks.BROWN_WOOL);
    public static final Block BROWN_WOOL_WALL = registerWoolWall(DyeColor.BROWN, Blocks.BROWN_WOOL);

    public static final Block RED_WOOL_STAIRS = registerWoolStairs(DyeColor.RED, Blocks.RED_WOOL);
    public static final Block RED_WOOL_SLAB = registerWoolSlab(DyeColor.RED, Blocks.RED_WOOL);
    public static final Block RED_WOOL_WALL = registerWoolWall(DyeColor.RED, Blocks.RED_WOOL);

    public static final Block ORANGE_WOOL_STAIRS = registerWoolStairs(DyeColor.ORANGE, Blocks.ORANGE_WOOL);
    public static final Block ORANGE_WOOL_SLAB = registerWoolSlab(DyeColor.ORANGE, Blocks.ORANGE_WOOL);
    public static final Block ORANGE_WOOL_WALL = registerWoolWall(DyeColor.ORANGE, Blocks.ORANGE_WOOL);

    public static final Block YELLOW_WOOL_STAIRS = registerWoolStairs(DyeColor.YELLOW, Blocks.YELLOW_WOOL);
    public static final Block YELLOW_WOOL_SLAB = registerWoolSlab(DyeColor.YELLOW, Blocks.YELLOW_WOOL);
    public static final Block YELLOW_WOOL_WALL = registerWoolWall(DyeColor.YELLOW, Blocks.YELLOW_WOOL);

    public static final Block LIME_WOOL_STAIRS = registerWoolStairs(DyeColor.LIME, Blocks.LIME_WOOL);
    public static final Block LIME_WOOL_SLAB = registerWoolSlab(DyeColor.LIME, Blocks.LIME_WOOL);
    public static final Block LIME_WOOL_WALL = registerWoolWall(DyeColor.LIME, Blocks.LIME_WOOL);

    public static final Block GREEN_WOOL_STAIRS = registerWoolStairs(DyeColor.GREEN, Blocks.GREEN_WOOL);
    public static final Block GREEN_WOOL_SLAB = registerWoolSlab(DyeColor.GREEN, Blocks.GREEN_WOOL);
    public static final Block GREEN_WOOL_WALL = registerWoolWall(DyeColor.GREEN, Blocks.GREEN_WOOL);

    public static final Block CYAN_WOOL_STAIRS = registerWoolStairs(DyeColor.CYAN, Blocks.CYAN_WOOL);
    public static final Block CYAN_WOOL_SLAB = registerWoolSlab(DyeColor.CYAN, Blocks.CYAN_WOOL);
    public static final Block CYAN_WOOL_WALL = registerWoolWall(DyeColor.CYAN, Blocks.CYAN_WOOL);

    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerWoolStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL);
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerWoolSlab(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL);
    public static final Block LIGHT_BLUE_WOOL_WALL = registerWoolWall(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL);

    public static final Block BLUE_WOOL_STAIRS = registerWoolStairs(DyeColor.BLUE, Blocks.BLUE_WOOL);
    public static final Block BLUE_WOOL_SLAB = registerWoolSlab(DyeColor.BLUE, Blocks.BLUE_WOOL);
    public static final Block BLUE_WOOL_WALL = registerWoolWall(DyeColor.BLUE, Blocks.BLUE_WOOL);

    public static final Block PURPLE_WOOL_STAIRS = registerWoolStairs(DyeColor.PURPLE, Blocks.PURPLE_WOOL);
    public static final Block PURPLE_WOOL_SLAB = registerWoolSlab(DyeColor.PURPLE, Blocks.PURPLE_WOOL);
    public static final Block PURPLE_WOOL_WALL = registerWoolWall(DyeColor.PURPLE, Blocks.PURPLE_WOOL);

    public static final Block MAGENTA_WOOL_STAIRS = registerWoolStairs(DyeColor.MAGENTA, Blocks.MAGENTA_WOOL);
    public static final Block MAGENTA_WOOL_SLAB = registerWoolSlab(DyeColor.MAGENTA, Blocks.MAGENTA_WOOL);
    public static final Block MAGENTA_WOOL_WALL = registerWoolWall(DyeColor.MAGENTA, Blocks.MAGENTA_WOOL);

    public static final Block PINK_WOOL_STAIRS = registerWoolStairs(DyeColor.PINK, Blocks.PINK_WOOL);
    public static final Block PINK_WOOL_SLAB = registerWoolSlab(DyeColor.PINK, Blocks.PINK_WOOL);
    public static final Block PINK_WOOL_WALL = registerWoolWall(DyeColor.PINK, Blocks.PINK_WOOL);

    // Terracotta
    public static final Block TERRACOTTA_STAIRS = registerStairsCopy("terracotta", Blocks.TERRACOTTA);
    public static final Block TERRACOTTA_SLAB = registerSlabCopy("terracotta", Blocks.TERRACOTTA);
    public static final Block TERRACOTTA_WALL = registerWallCopy("terracotta", Blocks.TERRACOTTA);

    public static final Block WHITE_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
    public static final Block WHITE_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);
    public static final Block WHITE_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.WHITE, Blocks.WHITE_TERRACOTTA);

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_TERRACOTTA);

    public static final Block GRAY_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.GRAY, Blocks.GRAY_TERRACOTTA);

    public static final Block BLACK_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.BLACK, Blocks.BLACK_TERRACOTTA);

    public static final Block BROWN_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.BROWN, Blocks.BROWN_TERRACOTTA);

    public static final Block RED_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.RED, Blocks.RED_TERRACOTTA);
    public static final Block RED_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.RED, Blocks.RED_TERRACOTTA);
    public static final Block RED_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.RED, Blocks.RED_TERRACOTTA);

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.ORANGE, Blocks.ORANGE_TERRACOTTA);

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.YELLOW, Blocks.YELLOW_TERRACOTTA);

    public static final Block LIME_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.LIME, Blocks.LIME_TERRACOTTA);
    public static final Block LIME_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.LIME, Blocks.LIME_TERRACOTTA);

    public static final Block GREEN_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.GREEN, Blocks.GREEN_TERRACOTTA);

    public static final Block CYAN_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.CYAN, Blocks.CYAN_TERRACOTTA);

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_TERRACOTTA);

    public static final Block BLUE_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.BLUE, Blocks.BLUE_TERRACOTTA);

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.PURPLE, Blocks.PURPLE_TERRACOTTA);

    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.MAGENTA, Blocks.MAGENTA_TERRACOTTA);

    public static final Block PINK_TERRACOTTA_STAIRS = registerTerracottaStairs(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_SLAB = registerTerracottaSlab(DyeColor.PINK, Blocks.PINK_TERRACOTTA);
    public static final Block PINK_TERRACOTTA_WALL = registerTerracottaWall(DyeColor.PINK, Blocks.PINK_TERRACOTTA);

    // Glazed Terracotta
    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.WHITE, Blocks.WHITE_GLAZED_TERRACOTTA);
    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.WHITE, Blocks.WHITE_GLAZED_TERRACOTTA);
    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.WHITE, Blocks.WHITE_GLAZED_TERRACOTTA);

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);

    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.GRAY, Blocks.GRAY_GLAZED_TERRACOTTA);
    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.GRAY, Blocks.GRAY_GLAZED_TERRACOTTA);
    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.GRAY, Blocks.GRAY_GLAZED_TERRACOTTA);

    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.BLACK, Blocks.BLACK_GLAZED_TERRACOTTA);
    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.BLACK, Blocks.BLACK_GLAZED_TERRACOTTA);
    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.BLACK, Blocks.BLACK_GLAZED_TERRACOTTA);

    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.BROWN, Blocks.BROWN_GLAZED_TERRACOTTA);
    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.BROWN, Blocks.BROWN_GLAZED_TERRACOTTA);
    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.BROWN, Blocks.BROWN_GLAZED_TERRACOTTA);

    public static final Block RED_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.RED, Blocks.RED_GLAZED_TERRACOTTA);
    public static final Block RED_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.RED, Blocks.RED_GLAZED_TERRACOTTA);
    public static final Block RED_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.RED, Blocks.RED_GLAZED_TERRACOTTA);

    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.ORANGE, Blocks.ORANGE_GLAZED_TERRACOTTA);
    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.ORANGE, Blocks.ORANGE_GLAZED_TERRACOTTA);
    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.ORANGE, Blocks.ORANGE_GLAZED_TERRACOTTA);

    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.YELLOW, Blocks.YELLOW_GLAZED_TERRACOTTA);
    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.YELLOW, Blocks.YELLOW_GLAZED_TERRACOTTA);
    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.YELLOW, Blocks.YELLOW_GLAZED_TERRACOTTA);

    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.LIME, Blocks.LIME_GLAZED_TERRACOTTA);
    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.LIME, Blocks.LIME_GLAZED_TERRACOTTA);
    public static final Block LIME_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.LIME, Blocks.LIME_GLAZED_TERRACOTTA);

    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.GREEN, Blocks.GREEN_GLAZED_TERRACOTTA);
    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.GREEN, Blocks.GREEN_GLAZED_TERRACOTTA);
    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.GREEN, Blocks.GREEN_GLAZED_TERRACOTTA);

    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.CYAN, Blocks.CYAN_GLAZED_TERRACOTTA);
    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.CYAN, Blocks.CYAN_GLAZED_TERRACOTTA);
    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.CYAN, Blocks.CYAN_GLAZED_TERRACOTTA);

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);

    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.BLUE, Blocks.BLUE_GLAZED_TERRACOTTA);
    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.BLUE, Blocks.BLUE_GLAZED_TERRACOTTA);
    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.BLUE, Blocks.BLUE_GLAZED_TERRACOTTA);

    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.PURPLE, Blocks.PURPLE_GLAZED_TERRACOTTA);
    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.PURPLE, Blocks.PURPLE_GLAZED_TERRACOTTA);
    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.PURPLE, Blocks.PURPLE_GLAZED_TERRACOTTA);

    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.MAGENTA, Blocks.MAGENTA_GLAZED_TERRACOTTA);
    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.MAGENTA, Blocks.MAGENTA_GLAZED_TERRACOTTA);
    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.MAGENTA, Blocks.MAGENTA_GLAZED_TERRACOTTA);

    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS = registerGlazedTerracottaStairs(DyeColor.PINK, Blocks.PINK_GLAZED_TERRACOTTA);
    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = registerGlazedTerracottaSlab(DyeColor.PINK, Blocks.PINK_GLAZED_TERRACOTTA);
    public static final Block PINK_GLAZED_TERRACOTTA_WALL = registerGlazedTerracottaWall(DyeColor.PINK, Blocks.PINK_GLAZED_TERRACOTTA);

    // Concrete
    public static final Block WHITE_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.WHITE, Blocks.WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_SLAB = registerConcreteSlab(DyeColor.WHITE, Blocks.WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_WALL = registerConcreteWall(DyeColor.WHITE, Blocks.WHITE_CONCRETE);

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerConcreteSlab(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerConcreteWall(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);

    public static final Block GRAY_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.GRAY, Blocks.GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_SLAB = registerConcreteSlab(DyeColor.GRAY, Blocks.GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_WALL = registerConcreteWall(DyeColor.GRAY, Blocks.GRAY_CONCRETE);

    public static final Block BLACK_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.BLACK, Blocks.BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_SLAB = registerConcreteSlab(DyeColor.BLACK, Blocks.BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_WALL = registerConcreteWall(DyeColor.BLACK, Blocks.BLACK_CONCRETE);

    public static final Block BROWN_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.BROWN, Blocks.BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_SLAB = registerConcreteSlab(DyeColor.BROWN, Blocks.BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_WALL = registerConcreteWall(DyeColor.BROWN, Blocks.BROWN_CONCRETE);

    public static final Block RED_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.RED, Blocks.RED_CONCRETE);
    public static final Block RED_CONCRETE_SLAB = registerConcreteSlab(DyeColor.RED, Blocks.RED_CONCRETE);
    public static final Block RED_CONCRETE_WALL = registerConcreteWall(DyeColor.RED, Blocks.RED_CONCRETE);

    public static final Block ORANGE_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_SLAB = registerConcreteSlab(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_WALL = registerConcreteWall(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);

    public static final Block YELLOW_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_SLAB = registerConcreteSlab(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_WALL = registerConcreteWall(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);

    public static final Block LIME_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.LIME, Blocks.LIME_CONCRETE);
    public static final Block LIME_CONCRETE_SLAB = registerConcreteSlab(DyeColor.LIME, Blocks.LIME_CONCRETE);
    public static final Block LIME_CONCRETE_WALL = registerConcreteWall(DyeColor.LIME, Blocks.LIME_CONCRETE);

    public static final Block GREEN_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.GREEN, Blocks.GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_SLAB = registerConcreteSlab(DyeColor.GREEN, Blocks.GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_WALL = registerConcreteWall(DyeColor.GREEN, Blocks.GREEN_CONCRETE);

    public static final Block CYAN_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.CYAN, Blocks.CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_SLAB = registerConcreteSlab(DyeColor.CYAN, Blocks.CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_WALL = registerConcreteWall(DyeColor.CYAN, Blocks.CYAN_CONCRETE);

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerConcreteSlab(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerConcreteWall(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);

    public static final Block BLUE_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.BLUE, Blocks.BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_SLAB = registerConcreteSlab(DyeColor.BLUE, Blocks.BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_WALL = registerConcreteWall(DyeColor.BLUE, Blocks.BLUE_CONCRETE);

    public static final Block PURPLE_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_SLAB = registerConcreteSlab(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_WALL = registerConcreteWall(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);

    public static final Block MAGENTA_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_SLAB = registerConcreteSlab(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_WALL = registerConcreteWall(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);

    public static final Block PINK_CONCRETE_STAIRS = registerConcreteStairs(DyeColor.PINK, Blocks.PINK_CONCRETE);
    public static final Block PINK_CONCRETE_SLAB = registerConcreteSlab(DyeColor.PINK, Blocks.PINK_CONCRETE);
    public static final Block PINK_CONCRETE_WALL = registerConcreteWall(DyeColor.PINK, Blocks.PINK_CONCRETE);

    // Concrete Tiles
    public static final Block WHITE_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.WHITE, Blocks.WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.WHITE, Blocks.WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.WHITE, Blocks.WHITE_CONCRETE);
    public static final Block WHITE_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.WHITE, Blocks.WHITE_CONCRETE);

    public static final Block LIGHT_GRAY_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);
    public static final Block LIGHT_GRAY_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE);

    public static final Block GRAY_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.GRAY, Blocks.GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.GRAY, Blocks.GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.GRAY, Blocks.GRAY_CONCRETE);
    public static final Block GRAY_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.GRAY, Blocks.GRAY_CONCRETE);

    public static final Block BLACK_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.BLACK, Blocks.BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.BLACK, Blocks.BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.BLACK, Blocks.BLACK_CONCRETE);
    public static final Block BLACK_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.BLACK, Blocks.BLACK_CONCRETE);

    public static final Block BROWN_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.BROWN, Blocks.BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.BROWN, Blocks.BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.BROWN, Blocks.BROWN_CONCRETE);
    public static final Block BROWN_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.BROWN, Blocks.BROWN_CONCRETE);

    public static final Block RED_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.RED, Blocks.RED_CONCRETE);
    public static final Block RED_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.RED, Blocks.RED_CONCRETE);
    public static final Block RED_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.RED, Blocks.RED_CONCRETE);
    public static final Block RED_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.RED, Blocks.RED_CONCRETE);

    public static final Block ORANGE_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);
    public static final Block ORANGE_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE);

    public static final Block YELLOW_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);
    public static final Block YELLOW_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE);

    public static final Block LIME_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.LIME, Blocks.LIME_CONCRETE);
    public static final Block LIME_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.LIME, Blocks.LIME_CONCRETE);
    public static final Block LIME_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.LIME, Blocks.LIME_CONCRETE);
    public static final Block LIME_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.LIME, Blocks.LIME_CONCRETE);

    public static final Block GREEN_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.GREEN, Blocks.GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.GREEN, Blocks.GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.GREEN, Blocks.GREEN_CONCRETE);
    public static final Block GREEN_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.GREEN, Blocks.GREEN_CONCRETE);

    public static final Block CYAN_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.CYAN, Blocks.CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.CYAN, Blocks.CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.CYAN, Blocks.CYAN_CONCRETE);
    public static final Block CYAN_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.CYAN, Blocks.CYAN_CONCRETE);

    public static final Block LIGHT_BLUE_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);
    public static final Block LIGHT_BLUE_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE);

    public static final Block BLUE_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.BLUE, Blocks.BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.BLUE, Blocks.BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.BLUE, Blocks.BLUE_CONCRETE);
    public static final Block BLUE_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.BLUE, Blocks.BLUE_CONCRETE);

    public static final Block PURPLE_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);
    public static final Block PURPLE_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE);

    public static final Block MAGENTA_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);
    public static final Block MAGENTA_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE);

    public static final Block PINK_CONCRETE_TILES = registerConcreteTileBlock(DyeColor.PINK, Blocks.PINK_CONCRETE);
    public static final Block PINK_CONCRETE_TILE_STAIRS = registerConcreteTileStairs(DyeColor.PINK, Blocks.PINK_CONCRETE);
    public static final Block PINK_CONCRETE_TILE_SLAB = registerConcreteTileSlab(DyeColor.PINK, Blocks.PINK_CONCRETE);
    public static final Block PINK_CONCRETE_TILE_WALL = registerConcreteTileWall(DyeColor.PINK, Blocks.PINK_CONCRETE);

    public static final Block MESH_GLASS = registerTransparentBlockCopy("mesh_glass", Blocks.GLASS);


    private static Block registerWoolStairs(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_wool_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
    }

    private static Block registerWoolSlab(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerWoolWall(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_wool_wall", new WallBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerTerracottaStairs(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_terracotta_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
    }

    private static Block registerTerracottaSlab(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerTerracottaWall(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerGlazedTerracottaStairs(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_glazed_terracotta_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
    }

    private static Block registerGlazedTerracottaSlab(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_glazed_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerGlazedTerracottaWall(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_glazed_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerConcreteStairs(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_concrete_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
    }

    private static Block registerConcreteSlab(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerConcreteWall(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerConcreteTileBlock(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_concrete_tiles", new Block(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerConcreteTileStairs(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_concrete_tile_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
    }

    private static Block registerConcreteTileSlab(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_concrete_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerConcreteTileWall(DyeColor color, Block base) {
        return registerBlock(color.getName() + "_concrete_tile_wall", new WallBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerTransparentBlockCopy(String name, Block base) {
        return registerBlock(name, new TransparentBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerBlockCopy(String name, Block base) {
        return registerBlock(name, new Block(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerStairsCopy(String name, Block base) {
        return registerBlock(name + "_stairs", new StairsBlock(base.getDefaultState(), AbstractBlock.Settings.copy(base)));
    }

    private static Block registerSlabCopy(String name, Block base) {
        return registerBlock(name + "_slab", new SlabBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerWallCopy(String name, Block base) {
        return registerBlock(name + "_wall", new WallBlock(AbstractBlock.Settings.copy(base)));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CozyConvenience.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CozyConvenience.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CozyConvenience.LOGGER.info("Registering Colored Blocks for " + CozyConvenience.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.addAfter(Blocks.WHITE_WOOL, WHITE_WOOL_STAIRS, WHITE_WOOL_SLAB, WHITE_WOOL_WALL, Blocks.WHITE_CARPET);
            entries.addAfter(Blocks.LIGHT_GRAY_WOOL, LIGHT_GRAY_WOOL_STAIRS, LIGHT_GRAY_WOOL_SLAB, LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_CARPET);
            entries.addAfter(Blocks.GRAY_WOOL, GRAY_WOOL_STAIRS, GRAY_WOOL_SLAB, GRAY_WOOL_WALL, Blocks.GRAY_CARPET);
            entries.addAfter(Blocks.BLACK_WOOL, BLACK_WOOL_STAIRS, BLACK_WOOL_SLAB, BLACK_WOOL_WALL, Blocks.BLACK_CARPET);
            entries.addAfter(Blocks.BROWN_WOOL, BROWN_WOOL_STAIRS, BROWN_WOOL_SLAB, BROWN_WOOL_WALL, Blocks.BROWN_CARPET);
            entries.addAfter(Blocks.RED_WOOL, RED_WOOL_STAIRS, RED_WOOL_SLAB, RED_WOOL_WALL, Blocks.RED_CARPET);
            entries.addAfter(Blocks.ORANGE_WOOL, ORANGE_WOOL_STAIRS, ORANGE_WOOL_SLAB, ORANGE_WOOL_WALL, Blocks.ORANGE_CARPET);
            entries.addAfter(Blocks.YELLOW_WOOL, YELLOW_WOOL_STAIRS, YELLOW_WOOL_SLAB, YELLOW_WOOL_WALL, Blocks.YELLOW_CARPET);
            entries.addAfter(Blocks.LIME_WOOL, LIME_WOOL_STAIRS, LIME_WOOL_SLAB, LIME_WOOL_WALL, Blocks.LIME_CARPET);
            entries.addAfter(Blocks.GREEN_WOOL, GREEN_WOOL_STAIRS, GREEN_WOOL_SLAB, GREEN_WOOL_WALL, Blocks.GREEN_CARPET);
            entries.addAfter(Blocks.CYAN_WOOL, CYAN_WOOL_STAIRS, CYAN_WOOL_SLAB, CYAN_WOOL_WALL, Blocks.CYAN_CARPET);
            entries.addAfter(Blocks.LIGHT_BLUE_WOOL, LIGHT_BLUE_WOOL_STAIRS, LIGHT_BLUE_WOOL_SLAB, LIGHT_BLUE_WOOL_WALL, Blocks.LIGHT_BLUE_CARPET);
            entries.addAfter(Blocks.BLUE_WOOL, BLUE_WOOL_STAIRS, BLUE_WOOL_SLAB, BLUE_WOOL_WALL, Blocks.BLUE_CARPET);
            entries.addAfter(Blocks.PURPLE_WOOL, PURPLE_WOOL_STAIRS, PURPLE_WOOL_SLAB, PURPLE_WOOL_WALL, Blocks.PURPLE_CARPET);
            entries.addAfter(Blocks.MAGENTA_WOOL, MAGENTA_WOOL_STAIRS, MAGENTA_WOOL_SLAB, MAGENTA_WOOL_WALL, Blocks.MAGENTA_CARPET);
            entries.addAfter(Blocks.PINK_WOOL, PINK_WOOL_STAIRS, PINK_WOOL_SLAB, PINK_WOOL_WALL, Blocks.PINK_CARPET);

            entries.addAfter(Blocks.TERRACOTTA, TERRACOTTA_STAIRS, TERRACOTTA_SLAB, TERRACOTTA_WALL);
            entries.addAfter(Blocks.WHITE_TERRACOTTA, WHITE_TERRACOTTA_STAIRS, WHITE_TERRACOTTA_SLAB, WHITE_TERRACOTTA_WALL);
            entries.addAfter(Blocks.LIGHT_GRAY_TERRACOTTA, LIGHT_GRAY_TERRACOTTA_STAIRS, LIGHT_GRAY_TERRACOTTA_SLAB, LIGHT_GRAY_TERRACOTTA_WALL);
            entries.addAfter(Blocks.GRAY_TERRACOTTA, GRAY_TERRACOTTA_STAIRS, GRAY_TERRACOTTA_SLAB, GRAY_TERRACOTTA_WALL);
            entries.addAfter(Blocks.BLACK_TERRACOTTA, BLACK_TERRACOTTA_STAIRS, BLACK_TERRACOTTA_SLAB, BLACK_TERRACOTTA_WALL);
            entries.addAfter(Blocks.BROWN_TERRACOTTA, BROWN_TERRACOTTA_STAIRS, BROWN_TERRACOTTA_SLAB, BROWN_TERRACOTTA_WALL);
            entries.addAfter(Blocks.RED_TERRACOTTA, RED_TERRACOTTA_STAIRS, RED_TERRACOTTA_SLAB, RED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.ORANGE_TERRACOTTA, ORANGE_TERRACOTTA_STAIRS, ORANGE_TERRACOTTA_SLAB, ORANGE_TERRACOTTA_WALL);
            entries.addAfter(Blocks.YELLOW_TERRACOTTA, YELLOW_TERRACOTTA_STAIRS, YELLOW_TERRACOTTA_SLAB, YELLOW_TERRACOTTA_WALL);
            entries.addAfter(Blocks.LIME_TERRACOTTA, LIME_TERRACOTTA_STAIRS, LIME_TERRACOTTA_SLAB, LIME_TERRACOTTA_WALL);
            entries.addAfter(Blocks.GREEN_TERRACOTTA, GREEN_TERRACOTTA_STAIRS, GREEN_TERRACOTTA_SLAB, GREEN_TERRACOTTA_WALL);
            entries.addAfter(Blocks.CYAN_TERRACOTTA, CYAN_TERRACOTTA_STAIRS, CYAN_TERRACOTTA_SLAB, CYAN_TERRACOTTA_WALL);
            entries.addAfter(Blocks.LIGHT_BLUE_TERRACOTTA, LIGHT_BLUE_TERRACOTTA_STAIRS, LIGHT_BLUE_TERRACOTTA_SLAB, LIGHT_BLUE_TERRACOTTA_WALL);
            entries.addAfter(Blocks.BLUE_TERRACOTTA, BLUE_TERRACOTTA_STAIRS, BLUE_TERRACOTTA_SLAB, BLUE_TERRACOTTA_WALL);
            entries.addAfter(Blocks.PURPLE_TERRACOTTA, PURPLE_TERRACOTTA_STAIRS, PURPLE_TERRACOTTA_SLAB, PURPLE_TERRACOTTA_WALL);
            entries.addAfter(Blocks.MAGENTA_TERRACOTTA, MAGENTA_TERRACOTTA_STAIRS, MAGENTA_TERRACOTTA_SLAB, MAGENTA_TERRACOTTA_WALL);
            entries.addAfter(Blocks.PINK_TERRACOTTA, PINK_TERRACOTTA_STAIRS, PINK_TERRACOTTA_SLAB, PINK_TERRACOTTA_WALL);

            entries.addAfter(Blocks.WHITE_GLAZED_TERRACOTTA, WHITE_GLAZED_TERRACOTTA_STAIRS, WHITE_GLAZED_TERRACOTTA_SLAB, WHITE_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.GRAY_GLAZED_TERRACOTTA, GRAY_GLAZED_TERRACOTTA_STAIRS, GRAY_GLAZED_TERRACOTTA_SLAB, GRAY_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.BLACK_GLAZED_TERRACOTTA, BLACK_GLAZED_TERRACOTTA_STAIRS, BLACK_GLAZED_TERRACOTTA_SLAB, BLACK_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.BROWN_GLAZED_TERRACOTTA, BROWN_GLAZED_TERRACOTTA_STAIRS, BROWN_GLAZED_TERRACOTTA_SLAB, BROWN_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.RED_GLAZED_TERRACOTTA, RED_GLAZED_TERRACOTTA_STAIRS, RED_GLAZED_TERRACOTTA_SLAB, RED_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.ORANGE_GLAZED_TERRACOTTA, ORANGE_GLAZED_TERRACOTTA_STAIRS, ORANGE_GLAZED_TERRACOTTA_SLAB, ORANGE_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.YELLOW_GLAZED_TERRACOTTA, YELLOW_GLAZED_TERRACOTTA_STAIRS, YELLOW_GLAZED_TERRACOTTA_SLAB, YELLOW_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.LIME_GLAZED_TERRACOTTA, LIME_GLAZED_TERRACOTTA_STAIRS, LIME_GLAZED_TERRACOTTA_SLAB, LIME_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.GREEN_GLAZED_TERRACOTTA, GREEN_GLAZED_TERRACOTTA_STAIRS, GREEN_GLAZED_TERRACOTTA_SLAB, GREEN_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.CYAN_GLAZED_TERRACOTTA, CYAN_GLAZED_TERRACOTTA_STAIRS, CYAN_GLAZED_TERRACOTTA_SLAB, CYAN_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.BLUE_GLAZED_TERRACOTTA, BLUE_GLAZED_TERRACOTTA_STAIRS, BLUE_GLAZED_TERRACOTTA_SLAB, BLUE_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.PURPLE_GLAZED_TERRACOTTA, PURPLE_GLAZED_TERRACOTTA_STAIRS, PURPLE_GLAZED_TERRACOTTA_SLAB, PURPLE_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.MAGENTA_GLAZED_TERRACOTTA, MAGENTA_GLAZED_TERRACOTTA_STAIRS, MAGENTA_GLAZED_TERRACOTTA_SLAB, MAGENTA_GLAZED_TERRACOTTA_WALL);
            entries.addAfter(Blocks.PINK_GLAZED_TERRACOTTA, PINK_GLAZED_TERRACOTTA_STAIRS, PINK_GLAZED_TERRACOTTA_SLAB, PINK_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.WHITE_CONCRETE, WHITE_CONCRETE_STAIRS, WHITE_CONCRETE_SLAB, WHITE_CONCRETE_WALL);
            entries.addAfter(Blocks.LIGHT_GRAY_CONCRETE, LIGHT_GRAY_CONCRETE_STAIRS, LIGHT_GRAY_CONCRETE_SLAB, LIGHT_GRAY_CONCRETE_WALL);
            entries.addAfter(Blocks.GRAY_CONCRETE, GRAY_CONCRETE_STAIRS, GRAY_CONCRETE_SLAB, GRAY_CONCRETE_WALL);
            entries.addAfter(Blocks.BLACK_CONCRETE, BLACK_CONCRETE_STAIRS, BLACK_CONCRETE_SLAB, BLACK_CONCRETE_WALL);
            entries.addAfter(Blocks.BROWN_CONCRETE, BROWN_CONCRETE_STAIRS, BROWN_CONCRETE_SLAB, BROWN_CONCRETE_WALL);
            entries.addAfter(Blocks.RED_CONCRETE, RED_CONCRETE_STAIRS, RED_CONCRETE_SLAB, RED_CONCRETE_WALL);
            entries.addAfter(Blocks.ORANGE_CONCRETE, ORANGE_CONCRETE_STAIRS, ORANGE_CONCRETE_SLAB, ORANGE_CONCRETE_WALL);
            entries.addAfter(Blocks.YELLOW_CONCRETE, YELLOW_CONCRETE_STAIRS, YELLOW_CONCRETE_SLAB, YELLOW_CONCRETE_WALL);
            entries.addAfter(Blocks.LIME_CONCRETE, LIME_CONCRETE_STAIRS, LIME_CONCRETE_SLAB, LIME_CONCRETE_WALL);
            entries.addAfter(Blocks.GREEN_CONCRETE, GREEN_CONCRETE_STAIRS, GREEN_CONCRETE_SLAB, GREEN_CONCRETE_WALL);
            entries.addAfter(Blocks.CYAN_CONCRETE, CYAN_CONCRETE_STAIRS, CYAN_CONCRETE_SLAB, CYAN_CONCRETE_WALL);
            entries.addAfter(Blocks.LIGHT_BLUE_CONCRETE, LIGHT_BLUE_CONCRETE_STAIRS, LIGHT_BLUE_CONCRETE_SLAB, LIGHT_BLUE_CONCRETE_WALL);
            entries.addAfter(Blocks.BLUE_CONCRETE, BLUE_CONCRETE_STAIRS, BLUE_CONCRETE_SLAB, BLUE_CONCRETE_WALL);
            entries.addAfter(Blocks.PURPLE_CONCRETE, PURPLE_CONCRETE_STAIRS, PURPLE_CONCRETE_SLAB, PURPLE_CONCRETE_WALL);
            entries.addAfter(Blocks.MAGENTA_CONCRETE, MAGENTA_CONCRETE_STAIRS, MAGENTA_CONCRETE_SLAB, MAGENTA_CONCRETE_WALL);
            entries.addAfter(Blocks.PINK_CONCRETE, PINK_CONCRETE_STAIRS, PINK_CONCRETE_SLAB, PINK_CONCRETE_WALL);

            entries.addAfter(PINK_CONCRETE_WALL, WHITE_CONCRETE_TILES, WHITE_CONCRETE_TILE_STAIRS, WHITE_CONCRETE_TILE_SLAB, WHITE_CONCRETE_TILE_WALL);
            entries.addAfter(WHITE_CONCRETE_TILE_WALL, LIGHT_GRAY_CONCRETE_TILES, LIGHT_GRAY_CONCRETE_TILE_STAIRS, LIGHT_GRAY_CONCRETE_TILE_SLAB, LIGHT_GRAY_CONCRETE_TILE_WALL);
            entries.addAfter(LIGHT_GRAY_CONCRETE_TILE_WALL, GRAY_CONCRETE_TILES, GRAY_CONCRETE_TILE_STAIRS, GRAY_CONCRETE_TILE_SLAB, GRAY_CONCRETE_TILE_WALL);
            entries.addAfter(GRAY_CONCRETE_TILE_WALL, BLACK_CONCRETE_TILES, BLACK_CONCRETE_TILE_STAIRS, BLACK_CONCRETE_TILE_SLAB, BLACK_CONCRETE_TILE_WALL);
            entries.addAfter(BLACK_CONCRETE_TILE_WALL, BROWN_CONCRETE_TILES, BROWN_CONCRETE_TILE_STAIRS, BROWN_CONCRETE_TILE_SLAB, BROWN_CONCRETE_TILE_WALL);
            entries.addAfter(BROWN_CONCRETE_TILE_WALL, RED_CONCRETE_TILES, RED_CONCRETE_TILE_STAIRS, RED_CONCRETE_TILE_SLAB, RED_CONCRETE_TILE_WALL);
            entries.addAfter(RED_CONCRETE_TILE_WALL, ORANGE_CONCRETE_TILES, ORANGE_CONCRETE_TILE_STAIRS, ORANGE_CONCRETE_TILE_SLAB, ORANGE_CONCRETE_TILE_WALL);
            entries.addAfter(ORANGE_CONCRETE_TILE_WALL, YELLOW_CONCRETE_TILES, YELLOW_CONCRETE_TILE_STAIRS, YELLOW_CONCRETE_TILE_SLAB, YELLOW_CONCRETE_TILE_WALL);
            entries.addAfter(YELLOW_CONCRETE_TILE_WALL, LIME_CONCRETE_TILES, LIME_CONCRETE_TILE_STAIRS, LIME_CONCRETE_TILE_SLAB, LIME_CONCRETE_TILE_WALL);
            entries.addAfter(LIME_CONCRETE_TILE_WALL, GREEN_CONCRETE_TILES, GREEN_CONCRETE_TILE_STAIRS, GREEN_CONCRETE_TILE_SLAB, GREEN_CONCRETE_TILE_WALL);
            entries.addAfter(GREEN_CONCRETE_TILE_WALL, CYAN_CONCRETE_TILES, CYAN_CONCRETE_TILE_STAIRS, CYAN_CONCRETE_TILE_SLAB, CYAN_CONCRETE_TILE_WALL);
            entries.addAfter(CYAN_CONCRETE_TILE_WALL, LIGHT_BLUE_CONCRETE_TILES, LIGHT_BLUE_CONCRETE_TILE_STAIRS, LIGHT_BLUE_CONCRETE_TILE_SLAB, LIGHT_BLUE_CONCRETE_TILE_WALL);
            entries.addAfter(LIGHT_BLUE_CONCRETE_TILE_WALL, BLUE_CONCRETE_TILES, BLUE_CONCRETE_TILE_STAIRS, BLUE_CONCRETE_TILE_SLAB, BLUE_CONCRETE_TILE_WALL);
            entries.addAfter(BLUE_CONCRETE_TILE_WALL, PURPLE_CONCRETE_TILES, PURPLE_CONCRETE_TILE_STAIRS, PURPLE_CONCRETE_TILE_SLAB, PURPLE_CONCRETE_TILE_WALL);
            entries.addAfter(PURPLE_CONCRETE_TILE_WALL, MAGENTA_CONCRETE_TILES, MAGENTA_CONCRETE_TILE_STAIRS, MAGENTA_CONCRETE_TILE_SLAB, MAGENTA_CONCRETE_TILE_WALL);
            entries.addAfter(MAGENTA_CONCRETE_TILE_WALL, PINK_CONCRETE_TILES, PINK_CONCRETE_TILE_STAIRS, PINK_CONCRETE_TILE_SLAB, PINK_CONCRETE_TILE_WALL);

            entries.addAfter(Blocks.GLASS, MESH_GLASS);

        });
    }
}
