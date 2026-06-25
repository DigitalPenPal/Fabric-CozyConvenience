package pencil.cozyconvenience.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pencil.cozyconvenience.block.NaturalBlocks;

import static net.minecraft.block.SlabBlock.TYPE;

@Mixin(ShovelItem.class)
public class ShovelItemMixin {

    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    private void flattenDirtSlabs(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        PlayerEntity playerEntity = context.getPlayer();

        if (context.getSide() == Direction.DOWN) return;
        if (!world.getBlockState(blockPos.up()).isAir()) return;

        boolean isGrassSlab = blockState.isOf(NaturalBlocks.GRASS_SLAB);
        boolean isDirtSlab = blockState.isOf(NaturalBlocks.DIRT_SLAB);
        boolean isCoarseDirtSlab = blockState.isOf(NaturalBlocks.COARSE_DIRT_SLAB);
        boolean isPodzolSlab = blockState.isOf(NaturalBlocks.PODZOL_SLAB);
        boolean isRootedDirtSlab = blockState.isOf(NaturalBlocks.ROOTED_DIRT_SLAB);
        boolean isMyceliumSlab = blockState.isOf(NaturalBlocks.MYCELIUM_SLAB);

        if (isGrassSlab || isDirtSlab || isCoarseDirtSlab || isPodzolSlab || isRootedDirtSlab || isMyceliumSlab) {
            world.playSound(playerEntity, blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

            if (!world.isClient) {
                BlockState newState = NaturalBlocks.DIRT_PATH_SLAB.getDefaultState()
                        .with(TYPE, blockState.get(TYPE));
                world.setBlockState(blockPos, newState, Block.NOTIFY_ALL_AND_REDRAW);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, newState));
                if (playerEntity != null) {
                    context.getStack().damage(1, playerEntity, LivingEntity.getSlotForHand(context.getHand()));
                }
            }

            cir.setReturnValue(ActionResult.success(world.isClient));
        }
    }
}