package com.shblock.integrated_tools.id_network;

import com.shblock.integrated_tools.tileentity.TileToolReceiver;
import net.minecraft.util.ResourceLocation;
import org.cyclops.cyclopscore.datastructure.DimPos;
import org.cyclops.integrateddynamics.api.network.IEventListenableNetworkElement;
import org.cyclops.integrateddynamics.api.network.IIdentifiableNetworkElement;
import org.cyclops.integrateddynamics.api.network.INetwork;
import org.cyclops.integrateddynamics.core.network.TileNetworkElement;

import javax.annotation.Nullable;

public class ToolReceiverNetworkElement extends TileNetworkElement<TileToolReceiver> implements IEventListenableNetworkElement<TileToolReceiver> {
    public ToolReceiverNetworkElement(DimPos pos) {
        super(pos);
    }

    @Nullable
    @Override
    public TileToolReceiver getNetworkEventListener() {
        return getTile();
    }

    @Override
    protected Class<TileToolReceiver> getTileClass() {
        return TileToolReceiver.class;
    }

    @Override
    public void setPriorityAndChannel(INetwork network, int priority, int channel) { }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public int getChannel() {
        return 0;
    }
}
