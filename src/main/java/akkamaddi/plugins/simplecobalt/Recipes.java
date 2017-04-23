package akkamaddi.plugins.simplecobalt;

import alexndr.api.logger.LogHelper;

/**
 * Handles recipes for this sub-module.
 * @author Sinhika
 *
 */
public class Recipes
{
    /** 
     * during pre-init phase, set up ore dictionary entries.
     */
    public static void preInitialize() 
    {
        try{
            doOreDictRecipes(); 
            LogHelper.verbose(ModInfo.ID, 
                "All OreDictionary entries were added successfully.");
        }
        catch(Exception e) {
            LogHelper.severe(ModInfo.ID, 
                    "OreDictionary entries were not added successfully. This is a serious problem!"); 
            e.printStackTrace();
        }
    } // end preInitialize()
    
    /**
     * during load/init phase, actually define recipes.
     */
    public static void initialize() 
    {
        try {
            doRecipes();
            doFurnaceRecipes();
            doFusionFurnaceRecipes();
            LogHelper.verbose(ModInfo.ID,
                    "All recipes were added successfully.");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Recipes were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
    } // end initialize()

    /**
     * in post-init, do recipe stuff that depends on everything else being loaded/fully-initialized.
     * Rare that this is actually needed.
     */
    public static void postInitialize()
    {
    } // end postInitialzie()
    

    /**
     * register ore-dictionary entries for mod objects.
     */
    public static void doOreDictRecipes()
    {
        // TODO
    } // end doOreDictRecipes()

    /**
     * Add crafting table recipes.
     */
    public static void doRecipes()
    {
        //Block Recipes
        //Item Recipes
        //Tool Recipes
        // Armor Recipes
    } // end doRecipes()

    /**
     * add conventional furnace recipes.
     */
    public static void doFurnaceRecipes()
    {
        // TODO
    } // end doFurnaceRecipes()
    
    /**
     * add fusion furnace recipes.
     */
    public static void doFusionFurnaceRecipes()
    {
        // TODO
    } // end doFusionFurnaceRecipes()
    
} // end class
