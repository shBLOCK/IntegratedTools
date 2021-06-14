package com.shblock.integrated_tools.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockToolReceiver extends ItemBlock {
    public ItemBlockToolReceiver(Block block) {
        super(block);
        setMaxStackSize(64);
    }
}
