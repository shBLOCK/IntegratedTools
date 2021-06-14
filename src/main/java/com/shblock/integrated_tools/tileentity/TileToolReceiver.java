package com.shblock.integrated_tools.tileentity;

import com.shblock.integrated_tools.id_network.ToolReceiverNetworkElement;
import org.cyclops.cyclopscore.persist.IDirtyMarkListener;
import org.cyclops.integrateddynamics.api.network.INetworkEventListener;
import org.cyclops.integrateddynamics.api.network.event.INetworkEvent;
import org.cyclops.integrateddynamics.core.tileentity.TileCableConnectableInventory;

import java.util.Set;

public class TileToolReceiver extends TileCableConnectableInventory implements IDirtyMarkListener, INetworkEventListener<ToolReceiverNetworkElement> {

    @Override
    public void onDirty() {

    }

    @Override
    public boolean hasEventSubscriptions() {
        return false;
    }

    @Override
    public Set<Class<? extends INetworkEvent>> getSubscribedEvents() {
        return null;
    }

    @Override
    public void onEvent(INetworkEvent event, ToolReceiverNetworkElement networkElement) {

    }
}
