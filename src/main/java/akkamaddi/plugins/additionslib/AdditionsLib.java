package akkamaddi.plugins.additionslib;

import java.util.List;

import akkamaddi.plugins.additionslib.helpers.AdditionsTabHelper;
import alexndr.api.content.inventory.SimpleTab;
import alexndr.api.logger.LogHelper;
import alexndr.api.registry.ContentCategories;
import alexndr.api.registry.Plugin;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION, 
     acceptedMinecraftVersions=ModInfo.ACCEPTED_VERSIONS,
     dependencies = ModInfo.DEPENDENCIES, updateJSON=ModInfo.VERSIONURL)
public class AdditionsLib
{
    @Mod.Instance(value = ModInfo.ID)
    public static AdditionsLib INSTANCE;

    @SidedProxy(clientSide = "akkamaddi.plugins.additionslib.ProxyClient", 
                serverSide = "akkamaddi.plugins.additionslib.ProxyCommon")
    public static ProxyCommon proxy;

    public static Plugin plugin = new Plugin(ModInfo.ID, ModInfo.NAME);

    /* Creative Tabs stuff */
    private static boolean iconsSet = false;
    private static SimpleTab additionBlocks, additionDecorations, additionMaterials, 
                             additionTools, additionCombat, additionRedstone;
    
    /**
     * Called during the PreInit phase.
     * @param event FMLPreInitializationEvent
     */
    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        proxy.PreInit(event);
    } // end PreInit()
    
    /**
     * Called during the Init phase.
     * @param event FMLInitializationEvent
     */
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.Init(event);
    } // end Init()
    
    /**
     * Called during the PostInit phase.
     * @param event FMLPostIntializationEvent
     */
    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        proxy.PostInit(event);
    }

    /**
     * create separate tabs for akkamaddi's Additions -- Sinhika
     */
    public static void tabPreInit() 
    {
        LogHelper.verbose("Creating tabs");
        additionBlocks = new SimpleTab(AdditionsLib.plugin, "AdditionBlocks", ContentCategories.CreativeTab.BLOCKS);
        additionDecorations = new SimpleTab(AdditionsLib.plugin, "AdditionDecorations", ContentCategories.CreativeTab.DECORATIONS);
        additionMaterials = new SimpleTab(AdditionsLib.plugin, "AdditionMaterials", ContentCategories.CreativeTab.MATERIALS);
        additionTools = new SimpleTab(AdditionsLib.plugin, "AdditionTools", ContentCategories.CreativeTab.TOOLS);
        additionCombat = new SimpleTab(AdditionsLib.plugin, "AdditionCombat", ContentCategories.CreativeTab.COMBAT);
        additionRedstone = new SimpleTab(AdditionsLib.plugin, "AdditionRedstone", ContentCategories.CreativeTab.REDSTONE);
        AdditionsTabHelper.setTabInitDone(true);
    } // end tabPreInit()
    
    /**
     * Sets the Icons for the CreativeTabs added by this mod. Call this during Initialisation phase.
     * Must be in correct order, with the correct number of elements (5). They are: 
     * 1. AdditionsBlocks.
     * 2. AdditionsDecorations.
     * 3. AdditionsMaterials.
     * 4. AdditionsTools.
     * 5. AdditionsCombat.
     * 6. AdditionsRedstone
     * @param iconItemsList List of Items with which to set the tab icons
     */
    public static void setTabIcons(List<Item> iconItemsList) 
    {
        if(!iconsSet) 
        {
            iconsSet = true;
            additionBlocks.setIcon(iconItemsList.get(0));
            additionDecorations.setIcon(iconItemsList.get(1));
            additionMaterials.setIcon(iconItemsList.get(2));
            additionTools.setIcon(iconItemsList.get(3));
            additionCombat.setIcon(iconItemsList.get(4));
            additionRedstone.setIcon(iconItemsList.get(5));
        } // end-if !iconsSet
    } // end setTabIcons()

} // end class
