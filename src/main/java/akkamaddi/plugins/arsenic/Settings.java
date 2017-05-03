package akkamaddi.plugins.arsenic;

import java.io.File;

import alexndr.api.config.Configuration;
import alexndr.api.config.types.ConfigEntry;
import alexndr.api.config.types.ConfigValue;
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
            
            // Generic settings
            // Toggles
            ConfigEntry toggles = new ConfigEntry("Simple Arsenic and Old Lace", "General");
            toggles.createNewValue("enableRecycling").setDataType("@B")
                    .setCurrentValue("false").setDefaultValue("false");
            toggles = settings.get(toggles);
            enableRecycling = toggles.getValueByName("enableRecycling").asBoolean();

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
    
    // generic togggles
    public static boolean enableRecycling;
    public static boolean enableArmorStatModification;
    public static boolean enableBlockStatModification;
    public static boolean enableToolStatModification;
    // TODO - public static config vars here
} // end class
