package com.shblock.integrated_tools.proxy;

import com.shblock.integrated_tools.IntegratedTools;
import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.proxy.ClientProxyComponent;

public class ClientProxy extends ClientProxyComponent {
    public ClientProxy() {
        super(new CommonProxy());
    }

    @Override
    public ModBase getMod() {
        return IntegratedTools._instance;
    }

    @Override
    public void registerEventHooks() {
        super.registerEventHooks();
    }
}
