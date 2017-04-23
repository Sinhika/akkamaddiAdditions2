package akkamaddi.plugins.arsenic.items;

import akkamaddi.plugins.arsenic.helpers.ArsenicHandler;
import alexndr.api.content.items.SimpleSword;
import alexndr.api.registry.Plugin;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ArsenicSwords extends SimpleSword
{

    public ArsenicSwords(Plugin plugin, ToolMaterial material)
    {
        super(plugin, material);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        return ArsenicHandler.INSTANCE.hitEntity(stack, target, attacker) &&
                        super.hitEntity(stack, target, attacker);
    } // end hitEntity()

    
} // end class
