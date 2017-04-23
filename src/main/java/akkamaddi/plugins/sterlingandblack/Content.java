package akkamaddi.plugins.sterlingandblack;

import alexndr.api.logger.LogHelper;

/**
 * This is where objects get initialized and registered.
 * @author Sinhika
 *
 */
public class Content
{
    public static void preInitialize() 
    {
        setToolAndArmorStats();

        try {
            doItems();
            doBlocks();
            doTools();
            doArmor();
            doAchievements();

            //Registers
            LogHelper.verbose(ModInfo.ID,
                            "Content pre-init completed successfully");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Content pre-init failed. This is a serious problem!");
            e.printStackTrace();
        }
    } // end preInitialize()

    /**
     * initialize crafting materials and other non-tool, non-weapon, non-armor items.
     */
    public static void doItems() 
    {
    } // end doItems()
    
    /**
     * initialize blocks.
     */
    public static void doBlocks() 
    {
    } // end doBlocks()
    
    /**
     * initialize tool items.
     */
    public static void doTools() 
    {
    } // end doTools()
    
    /**
     * initialize armor items.
     */
    public static void doArmor() 
    {
    } // end doArmor()
    
    /**
     * initialize achievements, if any.
     */
    public static void doAchievements() 
    {
    } // end doAchievements()

    /**
     * Define tool and armor materials--may use configuration settings.
     */
    public static void setToolAndArmorStats() 
    {
        LogHelper.verbose(ModInfo.ID, "Setting Tool and Armor stats");
    } // end setToolAndArmorStats()
    
    /**
     * Define repair materials for tools and armor.
     */
    public static void setRepairMaterials() 
    {
        LogHelper.verbose(ModInfo.ID, "Setting Tool and Armor repair materials");
        //Tools
        //Armor
    } // end setRepairMaterials()
    
    /**
     * set achievement triggers, if any.
     */
    public static void setAchievementTriggers() 
    {
        LogHelper.verbose(ModInfo.ID, "Setting achievement triggers");
        //Pickup Triggers
        //Crafting Triggers
        //Smelting Triggers
    } // end setAchievementTriggers()
    

    // CONTENT FIELDS
    //Tool Materials
    //Armor Materials
    // Blocks
    // Tools
    // Weapons
    // Armor
    // other items
    // Achievements
    
} // end class
