package com.shblock.integrated_tools.block;

import com.shblock.integrated_tools.IntegratedTools;
import com.shblock.integrated_tools.item.ItemBlockToolReceiver;
import net.minecraft.item.Item;
import org.cyclops.cyclopscore.config.extendedconfig.BlockContainerConfig;

public class BlockToolReceiverConfig extends BlockContainerConfig {

    public static BlockToolReceiverConfig _instance;

    public BlockToolReceiverConfig() {
        super(
                IntegratedTools._instance,
                true,
                "tool_receiver",
                null,
                BlockToolReceiver.class
        );
    }

    @Override
    public Class<? extends Item> getItemBlockClass() {
        return ItemBlockToolReceiver.class;
    }

    @Override
    public boolean isDisableable() {
        return false;
    }
}
