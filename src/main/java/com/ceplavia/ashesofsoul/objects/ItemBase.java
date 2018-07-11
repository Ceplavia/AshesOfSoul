package com.ceplavia.ashesofsoul.objects;

import com.ceplavia.ashesofsoul.AshesOfSoul;
import com.ceplavia.ashesofsoul.init.ItemInit;
import com.ceplavia.ashesofsoul.proxy.ClientProxy;
import com.ceplavia.ashesofsoul.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        AshesOfSoul.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
