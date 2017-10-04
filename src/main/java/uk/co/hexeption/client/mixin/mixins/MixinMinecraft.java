package uk.co.hexeption.client.mixin.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import uk.co.hexeption.client.Client;
import uk.co.hexeption.client.mixin.imp.IMixinMinecraft;

@Mixin(Minecraft.class)
public class MixinMinecraft implements IMixinMinecraft {

    @Mutable
    @Shadow
    @Final
    private Session session;

    @Shadow
    @Final
    private Timer timer;

    @Inject(method = "init", at = @At("RETURN"))
    private void init(CallbackInfo callbackInfo){

        Client.INSTANCE.start();
    }

    @Override
    public Session getSession() {

        return session;
    }

    @Override
    public void setSession() {

        this.session = session;
    }

    @Override
    public Timer getTimer() {

        return timer;
    }
}
