package akkamaddi.plugins.simpletungsten;

import akkamaddi.plugins.additionslib.SubModHandler;
import alexndr.api.registry.Plugin;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION, 
acceptedMinecraftVersions=ModInfo.ACCEPTED_VERSIONS,
dependencies = ModInfo.DEPENDENCIES, updateJSON=ModInfo.VERSIONURL)
public class SimpleTungsten
{
    @Mod.Instance(value = ModInfo.ID)
    public static SimpleTungsten INSTANCE;

    @SidedProxy(clientSide = "akkamaddi.plugins.simpletungsten.ProxyClient", 
                    serverSide = "akkamaddi.plugins.simpletungsten.ProxyCommon")
    public static ProxyCommon proxy;

    public static Plugin plugin = new Plugin(ModInfo.ID, ModInfo.NAME);

    /**
     * Called during the PreInit phase.
     * @param event FMLPreInitializationEvent
     */
    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        if (!SubModHandler.moduleEnabled(SubModHandler.MODULE_TUNGSTEN)) 
            return;
        
        proxy.PreInit(event);
    } // end PreInit()
    
    /**
     * Called during the Init phase.
     * @param event FMLInitializationEvent
     */
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        if (!SubModHandler.moduleEnabled(SubModHandler.MODULE_TUNGSTEN)) 
            return;
        
        proxy.Init(event);
    } // end Init()
    
    /**
     * Called during the PostInit phase.
     * @param event FMLPostIntializationEvent
     */
    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        if (!SubModHandler.moduleEnabled(SubModHandler.MODULE_TUNGSTEN)) 
            return;
        
        proxy.PostInit(event);
    }
         
} // end class
