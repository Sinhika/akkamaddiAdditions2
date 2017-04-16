package akkamaddi.plugins.additionslib;

import java.io.File;

import alexndr.api.logger.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class MainSettings
{
    public static Configuration config;
    
    /**
     * Get configuration instance.
     * @param cfgdir author-specific configuration sub-directory.
     * @param configname mod-specific configuration file name.
     * @return the configuration instance.
     */
    public static Configuration GetConfig(FMLPreInitializationEvent event, String cfgdir, String configname )
    {
        File installDir = event.getModConfigurationDirectory();
        File configDir = new File(installDir, cfgdir);
        File configFile = new File(configDir, configname);
        return new Configuration(configFile);
    } // end GetConfig()
    
    /** 
     * umbrella config loading routine. must be instantiated by child classes.
     * @param event
     */
    public static void createOrLoadSettings(FMLPreInitializationEvent event) 
    {
        config = GetConfig(event, "akkamaddi", "additions_modules.cfg");
        try {
            LogHelper.verbose(ModInfo.ID, "Loading Settings...");
            config.load();
            for(String s : SubModHandler.MODULES)
                SubModHandler.setStatus( s, 
                  config.getBoolean(s, Configuration.CATEGORY_GENERAL, 
                                    !SubModHandler.DISABLED_MODULES_BY_DEFAULT.contains(s), ""));
        } // end-try
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Settings failed to load correctly. The plugin may not function correctly");
        }
        finally {
            if(config.hasChanged())
                config.save();
            LogHelper.verbose(ModInfo.ID, "Settings loaded successfully");
        }
   } // end createOrLoadSettings() 

} // end class
