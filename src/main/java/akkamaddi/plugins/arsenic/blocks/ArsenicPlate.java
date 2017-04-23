package akkamaddi.plugins.arsenic.blocks;

import alexndr.api.config.types.ConfigBlock;
import alexndr.api.helpers.game.IConfigureBlockHelper;
import alexndr.api.helpers.game.TooltipHelper;
import alexndr.api.registry.ContentCategories;
import alexndr.api.registry.Plugin;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ArsenicPlate extends BlockPressurePlate implements IConfigureBlockHelper<ArsenicPlate>
{
    protected Plugin plugin;
    protected Material material;
    protected ContentCategories.Block category;
    protected ConfigBlock entry;

    protected ArsenicPlate(Plugin plugin, Material materialIn, ContentCategories.Block category)
    {
        super(materialIn, BlockPressurePlate.Sensitivity.EVERYTHING);
        this.plugin = plugin;
        this.material = materialIn;
        this.category = category;
    }

    @Override
    protected void playClickOnSound(World worldIn, BlockPos color)
    {
        worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 0.3F, 0.90000004F);
    }

    @Override
    protected void playClickOffSound(World worldIn, BlockPos pos)
    {
        worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 0.3F, 0.75F);
    }

    public ArsenicPlate setStepSound(SoundType sound)
    {
        setSoundType(sound);
        return this;
    } // end setStepSound
    
    
    @Override
    public ConfigBlock getConfigEntry()
    {
        return this.entry;
    }

    @Override
    public ArsenicPlate setConfigEntry(ConfigBlock entry)
    {
        this.entry = entry;
        this.setHardness(entry.getHardness());
        this.setResistance(entry.getResistance());
        this.setLightLevel(entry.getLightValue());
        this.setHarvestLevel(entry.getHarvestTool(), entry.getHarvestLevel());
        this.setAdditionalProperties();
        return this;
    }
    
    @Override
    public ArsenicPlate addToolTip(String toolTip)
    {
        TooltipHelper.addTooltipToBlock(this, toolTip);
        return this;
   }

    @Override
    public void setAdditionalProperties()
    {
        // TODO Auto-generated method stub
    }

} // end class
