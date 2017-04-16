package akkamaddi.plugins.additionslib.helpers;

public class TabHelper extends alexndr.api.helpers.game.TabHelper
{
    protected static boolean tabInitDone = false;
    
    public static boolean wereTabsInitialized() { return tabInitDone; }
    public static void setTabInitDone(boolean done) { tabInitDone = done; }

}
