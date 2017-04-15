package akkamaddi.plugins.additionslib;

import java.util.HashMap;

import com.google.common.collect.ImmutableSet;

/**
 * Manages configured and unconfigured sub-modules.
 * @author Sinhika
 *
 */
public class SubModHandler
{
    public static final String MODULE_ARSENIC = "Arsenic";
    public static final String MODULE_CLASSICAL_ALCHEMY = "ClassicalAlchemy";
    public static final String MODULE_CTHON = "SimpleCthon";
    public static final String MODULE_GOLDENGLITTER = "GoldenGlitter";
    public static final String MODULE_HADITE = "HaditeCoal";
    public static final String MODULE_COBALT = "SimpleCobalt";
    public static final String MODULE_TUNGSTEN = "SimpleTungsten";
    public static final String MODULE_STERLING_BLACK = "SterlingAndBlack";
    
    public static final String[] MODULES =  {
        MODULE_ARSENIC, MODULE_CLASSICAL_ALCHEMY, MODULE_CTHON, MODULE_GOLDENGLITTER, MODULE_HADITE,
        MODULE_COBALT, MODULE_TUNGSTEN, MODULE_STERLING_BLACK
    };

    public static final ImmutableSet<String> DISABLED_MODULES_BY_DEFAULT = 
                    ImmutableSet.of(MODULE_ARSENIC, MODULE_CLASSICAL_ALCHEMY, MODULE_CTHON, MODULE_GOLDENGLITTER, MODULE_HADITE,
                                    MODULE_COBALT, MODULE_TUNGSTEN, MODULE_STERLING_BLACK);
    
    private static final HashMap<String, Boolean> moduleStatus = new HashMap<String, Boolean>();
    
    public static boolean moduleEnabled(String module) {
        return moduleStatus.get(module);
    }
    public static Boolean setStatus(String module, Boolean status) {
        return moduleStatus.put(module, status);
    }

    public static String getModuleId(String mod) {
        return mod.toLowerCase();
    }
} // end class


