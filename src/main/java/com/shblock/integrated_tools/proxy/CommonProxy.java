package com.shblock.integrated_tools.proxy;

import com.shblock.integrated_tools.IntegratedTools;
import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.network.PacketHandler;
import org.cyclops.cyclopscore.proxy.CommonProxyComponent;

public class CommonProxy extends CommonProxyComponent {
    @Override
    public ModBase getMod() {
        return IntegratedTools._instance;
    }

    @Override
    public void registerPacketHandlers(PacketHandler packetHandler) {
        super.registerPacketHandlers(packetHandler);
    }

    @Override
    public void registerEventHooks() {
        super.registerEventHooks();

        //MinecraftForge.EVENT_BUS.register(TileAccessProxy.class);
    }
}
