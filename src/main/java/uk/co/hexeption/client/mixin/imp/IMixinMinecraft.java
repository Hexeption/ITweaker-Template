package uk.co.hexeption.client.mixin.imp;

import net.minecraft.util.Session;
import net.minecraft.util.Timer;

public interface IMixinMinecraft {

    Session getSession();

    void setSession();

    Timer getTimer();
}
