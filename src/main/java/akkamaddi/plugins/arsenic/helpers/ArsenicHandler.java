package akkamaddi.plugins.arsenic.helpers;

import alexndr.api.helpers.game.IWeaponEffectHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ArsenicHandler implements IWeaponEffectHelper
{
    public static ArsenicHandler INSTANCE = new ArsenicHandler();
    
    /* singleton class, therefore private constructor */
    private ArsenicHandler() {};
    
    /**
     * Hitting things poisons the target, but loses chips off itself.
     * @param stack
     * @param target
     * @param attacker
     * @return
     */
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        int poisonTime = 55;
        
        // TODO sort out poisontime by type of sword 
        
        target.addPotionEffect(new PotionEffect(MobEffects.POISON, poisonTime));
        stack.damageItem(1, attacker);
        return true;
    } // end hitEntity()

} // end class
