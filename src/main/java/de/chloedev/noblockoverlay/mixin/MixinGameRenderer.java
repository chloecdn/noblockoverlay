package de.chloedev.noblockoverlay.mixin;

import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class MixinGameRenderer {

    @Inject(method = "shouldRenderBlockOutline", at = @At("RETURN"), cancellable = true)
    public void disableOverlay(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}