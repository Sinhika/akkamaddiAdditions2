package akkamaddi.plugins.additionslib;

import alexndr.api.helpers.game.RenderItemHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ProxyClient extends akkamaddi.plugins.additionslib.ProxyCommon
{
    RenderItemHelper renderHelper = new RenderItemHelper(AdditionsLib.plugin);
    
    @Override
    public void PreInit(FMLPreInitializationEvent event) 
    {
        super.PreInit(event);
        if(event.getSide() == Side.CLIENT) 
        {
            renderHelper.renderItemsAndBlocks();
            renderHelper.renderItemStuff(event);
        }
   } // end PreInit()

    @Override
    public void Init(FMLInitializationEvent event) {
        super.Init(event);
    } // end Init()

    @Override
    public void PostInit(FMLPostInitializationEvent event) {
        super.PostInit(event);
    }

} // end class
