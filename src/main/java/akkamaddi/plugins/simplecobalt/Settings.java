package akkamaddi.plugins.simplecobalt;

import java.io.File;

import alexndr.api.config.Configuration;
import alexndr.api.logger.LogHelper;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Settings
{
    private static Configuration settings = new Configuration();
    
    public static void createOrLoadSettings(FMLPreInitializationEvent event) 
    {
        settings.setModName(ModInfo.NAME);
        File configDir = new File(event.getModConfigurationDirectory(), "akkamaddi");
        File settingsFile = new File(configDir, ModInfo.ID + ".xml" );
        settings.setFile(settingsFile);
        
        try {
            LogHelper.verbose(ModInfo.ID, "Loading Settings...");
            settings.load();
            settings.createHelpEntry("https://minecraft.curseforge.com/projects/akkamaddis-additions");

            //Blocks
            //Items
            //Tools
            //Armor
        }
        catch(Exception e) {
            LogHelper.severe(ModInfo.ID, "Failed to load settings");
            e.printStackTrace();
        }
        finally {
            settings.save();
            LogHelper.verbose(ModInfo.ID, "Settings loaded successfully");
        }
        
    } // end createOrLoadSettings()
    
    // TODO - public static config vars here
} // end class
