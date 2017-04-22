package akkamaddi.plugins.additionslib;

import java.util.List;

import com.google.common.collect.Lists;

import alexndr.api.logger.LogHelper;
import alexndr.api.registry.ContentRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyCommon
{
    public void PreInit(FMLPreInitializationEvent event)
    {   
        // configuration
        ContentRegistry.registerPlugin(AdditionsLib.plugin);
        AdditionsLib.tabPreInit();
        MainSettings.createOrLoadSettings(event);

        // content
        Content.preInitialize();
    } // end PreInit

    public void Init(FMLInitializationEvent event)
    {
        // content
        setTabIcons();
    } // end Init()

    public void PostInit(FMLPostInitializationEvent event)
    {
    } // end PostInit()

    private static void setTabIcons() 
    {
        LogHelper.verbose("additionsLib", "Setting tab icons");
        List<Item> list = Lists.newArrayList(
                    Item.getItemFromBlock(Content.icon_block), 
                    Item.getItemFromBlock(Content.icon_decoration), 
                    Content.icon_material, 
                    Content.icon_tool, 
                    Content.icon_combat,
                    Item.getItemFromBlock(Blocks.RAIL));
        AdditionsLib.setTabIcons(list);
    }
  

} // end class
