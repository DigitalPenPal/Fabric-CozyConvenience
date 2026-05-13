package pencil.cozyconvenience.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pencil.cozyconvenience.block.ModBlocks;

import static net.minecraft.block.SlabBlock.TYPE;

@Mixin(PlantBlock.class)
public class PlantBlockMixin {

    @Inject(method = "canPlantOnTop", at = @At("RETURN"), cancellable = true)
    private void allowPlantingOnDirtSlab(BlockState floor, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (floor.isOf(ModBlocks.DIRT_SLAB) && floor.get(TYPE) == SlabType.DOUBLE || floor.isOf(ModBlocks.DIRT_SLAB) && floor.get(TYPE) == SlabType.TOP) {

            cir.setReturnValue(true);
        } else if (floor.isOf(ModBlocks.GRASS_SLAB) && floor.get(TYPE) == SlabType.DOUBLE || floor.isOf(ModBlocks.GRASS_SLAB) && floor.get(TYPE) == SlabType.TOP) {

            cir.setReturnValue(true);
        }
    }
}