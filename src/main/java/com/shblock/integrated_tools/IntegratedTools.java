package com.shblock.integrated_tools;

import com.shblock.integrated_proxy.block.BlockAccessProxyConfig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Level;
import org.cyclops.cyclopscore.config.ConfigHandler;
import org.cyclops.cyclopscore.config.extendedconfig.BlockItemConfigReference;
import org.cyclops.cyclopscore.init.ItemCreativeTab;
import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.init.RecipeHandler;
import org.cyclops.cyclopscore.proxy.ICommonProxy;

@Mod(
        modid = IntegratedTools.MODID,
        name = IntegratedTools.NAME,
        useMetadata = true,
        dependencies = "required-after:forge;required-after:cyclopscore;required-after:integrateddynamics;"
)
@Mod.EventBusSubscriber(modid = IntegratedTools.MODID)
public class IntegratedTools extends ModBase {

    public static final String MODID = "integrated_tools";
    public static final String NAME = "Integrated Tools";

    @SidedProxy(clientSide = "com.shblock.integrated_tools.proxy.ClientProxy", serverSide = "com.shblock.integrated_tools.proxy.CommonProxy")
    public static ICommonProxy proxy;

    @Mod.Instance(value = MODID)
    public static IntegratedTools _instance;

    public IntegratedTools() {
        super(MODID, NAME);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Mod.EventHandler
    @Override
    public final void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Mod.EventHandler
    @Override
    public final void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    protected RecipeHandler constructRecipeHandler() {
        return null;
    }

    @Override
    public CreativeTabs constructDefaultCreativeTab() {
        return new ItemCreativeTab(this, new BlockItemConfigReference(BlockAccessProxyConfig.class));
    }

    @Override
    public void onMainConfigsRegister(ConfigHandler configHandler) {
        configHandler.add(new BlockAccessProxyConfig());
    }

    @Override
    public ICommonProxy getProxy() {
        return proxy;
    }

    public static void clog(String message) {
        IntegratedTools._instance.log(Level.INFO, message);
    }

    public static void clog(Level level, String message) {
        IntegratedTools._instance.log(level, message);
    }

    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(MODID)) {
            ConfigManager.sync(MODID, Config.Type.INSTANCE);
            clog("Changed config: range: " + BlockAccessProxyConfig.range);
        }
    }
}
