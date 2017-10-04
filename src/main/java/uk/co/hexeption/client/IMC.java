package uk.co.hexeption.client;

import net.minecraft.client.Minecraft;
import uk.co.hexeption.client.mixin.imp.IMixinMinecraft;

public interface IMC {

    Minecraft mc = Minecraft.getMinecraft();
    IMixinMinecraft mixMC = (IMixinMinecraft) mc;

}
