package pencil.cozyconvenience.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import pencil.cozyconvenience.CozyConvenience;
import pencil.cozyconvenience.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup COZY_CONVENIENCE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CozyConvenience.MOD_ID, "cozy_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.ARMOR_STAND))
                    .displayName(Text.translatable("itemgroup.cozy-convenience.cozy_items"))
                    .entries((displayContext, entries) -> {
                    }).build());

    public static final ItemGroup COZY_CONVENIENCE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CozyConvenience.MOD_ID, "cozy_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.STONE_COLUMN))
                    .displayName(Text.translatable("itemgroup.cozy-convenience.cozy_blocks"))
                    .entries((displayContext, entries) -> {
                        // Concrete Blocks
                        entries.add(ModBlocks.WHITE_CONCRETE_TILES);
                        entries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.WHITE_CONCRETE_SLAB);
                        entries.add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.WHITE_CONCRETE_BUTTON);
                        entries.add(ModBlocks.WHITE_CONCRETE_WALL);

                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_TILES);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

                        entries.add(ModBlocks.GRAY_CONCRETE_TILES);
                        entries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_CONCRETE_BUTTON);
                        entries.add(ModBlocks.GRAY_CONCRETE_WALL);

                        entries.add(ModBlocks.BLACK_CONCRETE_TILES);
                        entries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLACK_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLACK_CONCRETE_BUTTON);
                        entries.add(ModBlocks.BLACK_CONCRETE_WALL);

                        entries.add(ModBlocks.BROWN_CONCRETE_TILES);
                        entries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BROWN_CONCRETE_SLAB);
                        entries.add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BROWN_CONCRETE_BUTTON);
                        entries.add(ModBlocks.BROWN_CONCRETE_WALL);

                        entries.add(ModBlocks.RED_CONCRETE_TILES);
                        entries.add(ModBlocks.RED_CONCRETE_STAIRS);
                        entries.add(ModBlocks.RED_CONCRETE_SLAB);
                        entries.add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.RED_CONCRETE_BUTTON);
                        entries.add(ModBlocks.RED_CONCRETE_WALL);

                        entries.add(ModBlocks.ORANGE_CONCRETE_TILES);
                        entries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
                        entries.add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ORANGE_CONCRETE_BUTTON);
                        entries.add(ModBlocks.ORANGE_CONCRETE_WALL);

                        entries.add(ModBlocks.YELLOW_CONCRETE_TILES);
                        entries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        entries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
                        entries.add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.YELLOW_CONCRETE_BUTTON);
                        entries.add(ModBlocks.YELLOW_CONCRETE_WALL);

                        entries.add(ModBlocks.LIME_CONCRETE_TILES);
                        entries.add(ModBlocks.LIME_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIME_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIME_CONCRETE_BUTTON);
                        entries.add(ModBlocks.LIME_CONCRETE_WALL);

                        entries.add(ModBlocks.GREEN_CONCRETE_TILES);
                        entries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GREEN_CONCRETE_SLAB);
                        entries.add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.GREEN_CONCRETE_BUTTON);
                        entries.add(ModBlocks.GREEN_CONCRETE_WALL);

                        entries.add(ModBlocks.CYAN_CONCRETE_TILES);
                        entries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.CYAN_CONCRETE_SLAB);
                        entries.add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CYAN_CONCRETE_BUTTON);
                        entries.add(ModBlocks.CYAN_CONCRETE_WALL);

                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_TILES);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

                        entries.add(ModBlocks.BLUE_CONCRETE_TILES);
                        entries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLUE_CONCRETE_BUTTON);
                        entries.add(ModBlocks.BLUE_CONCRETE_WALL);

                        entries.add(ModBlocks.PURPLE_CONCRETE_TILES);
                        entries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
                        entries.add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PURPLE_CONCRETE_BUTTON);
                        entries.add(ModBlocks.PURPLE_CONCRETE_WALL);

                        entries.add(ModBlocks.MAGENTA_CONCRETE_TILES);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_BUTTON);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_WALL);

                        entries.add(ModBlocks.PINK_CONCRETE_TILES);
                        entries.add(ModBlocks.PINK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PINK_CONCRETE_SLAB);
                        entries.add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_CONCRETE_BUTTON);
                        entries.add(ModBlocks.PINK_CONCRETE_WALL);

                        // Pillar Blocks
                        entries.add(ModBlocks.STONE_COLUMN);
                        entries.add(ModBlocks.MOSSY_STONE_COLUMN);
                        entries.add(ModBlocks.CRACKED_STONE_COLUMN);

                        // Wool Blocks
                        entries.add(ModBlocks.WHITE_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.GRAY_WOOL_SLAB);
                        entries.add(ModBlocks.BLACK_WOOL_SLAB);
                        entries.add(ModBlocks.BROWN_WOOL_SLAB);
                        entries.add(ModBlocks.RED_WOOL_SLAB);
                        entries.add(ModBlocks.ORANGE_WOOL_SLAB);
                        entries.add(ModBlocks.YELLOW_WOOL_SLAB);
                        entries.add(ModBlocks.LIME_WOOL_SLAB);
                        entries.add(ModBlocks.GREEN_WOOL_SLAB);
                        entries.add(ModBlocks.CYAN_WOOL_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.BLUE_WOOL_SLAB);
                        entries.add(ModBlocks.PURPLE_WOOL_SLAB);
                        entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
                        entries.add(ModBlocks.PINK_WOOL_SLAB);
                    }).build());

    // Registries
    public static void registerItemGroups() {
        CozyConvenience.LOGGER.info("Registering Item Groups for " + CozyConvenience.MOD_ID);
    }
}
