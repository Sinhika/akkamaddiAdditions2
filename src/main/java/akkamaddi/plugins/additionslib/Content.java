package akkamaddi.plugins.additionslib;

import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.items.SimpleItem;
import alexndr.api.logger.LogHelper;
import alexndr.api.registry.ContentCategories;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Content
{
    /**
     * Loads additionsLib content--mostly tab icon objects, by calling the methods below.
     */
    public static void preInitialize()
    {
        try {
            doIconObjects();
            LogHelper.verbose("additionsLib",
                            "Content pre-init completed successfully");
        }
        catch (Exception e) {
            LogHelper.severe("additionsLib",
                    "Content pre-init failed. This is a serious problem!");
            e.printStackTrace();
        }
    } // end preInitialize()

    public static void doIconObjects()
    {
        icon_combat = new SimpleItem(AdditionsLib.plugin, ContentCategories.Item.OTHER)
                        .setUnlocalizedName("icon_combat");
        icon_material = new SimpleItem(AdditionsLib.plugin, ContentCategories.Item.OTHER)
                        .setUnlocalizedName("icon_material");
        icon_tool = new SimpleItem(AdditionsLib.plugin, ContentCategories.Item.OTHER)
                        .setUnlocalizedName("icon_tool");
        icon_block = new SimpleBlock(AdditionsLib.plugin, Material.ROCK, ContentCategories.Block.ORE)
                        .setUnlocalizedName("icon_block");
        icon_decoration = new SimpleBlock(AdditionsLib.plugin, Material.IRON, ContentCategories.Block.OTHER)
                        .setUnlocalizedName("icon_decoration");
        icon_redstone = new SimpleItem(AdditionsLib.plugin, ContentCategories.Item.OTHER)
                        .setUnlocalizedName("icon_redstone");
    } /* end doIconObjects() */
    
    public static Item icon_combat, icon_material, icon_tool, icon_redstone;
    public static Block icon_block, icon_decoration;
} // end class
