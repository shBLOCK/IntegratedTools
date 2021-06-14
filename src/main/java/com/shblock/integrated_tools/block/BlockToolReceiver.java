package com.shblock.integrated_tools.block;

import com.shblock.integrated_tools.client.gui.GuiToolReceiver;
import com.shblock.integrated_tools.inventory.container.ContainerToolReceiver;
import com.shblock.integrated_tools.tileentity.TileToolReceiver;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.Container;
import org.cyclops.cyclopscore.config.extendedconfig.BlockConfig;
import org.cyclops.cyclopscore.config.extendedconfig.ExtendedConfig;
import org.cyclops.integrateddynamics.core.block.BlockContainerGuiCabled;

public class BlockToolReceiver extends BlockContainerGuiCabled {

    private static BlockToolReceiver _instance;

    public static BlockToolReceiver getInstance() {
        return _instance;
    }

    public BlockToolReceiver(ExtendedConfig<BlockConfig> eConfig) {
        super(eConfig, TileToolReceiver.class);
    }

    @Override
    public Class<? extends Container> getContainer() {
        return ContainerToolReceiver.class;
    }

    @Override
    public Class<? extends GuiScreen> getGui() {
        return GuiToolReceiver.class;
    }

    @Override
    public boolean isKeepNBTOnDrop() {
        return false;
    }
}
