package com.ceplavia.ashesofsoul;

import com.ceplavia.ashesofsoul.proxy.CommonProxy;
import com.ceplavia.ashesofsoul.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MODID, name=Reference.NAME, version=Reference.VERSION)
public class AshesOfSoul
{
    @Instance
    public static AshesOfSoul instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){

    }
    @EventHandler
    public static void Init(FMLPreInitializationEvent event){

    }
    @EventHandler
    public static void postInit(FMLPreInitializationEvent event){

    }
}
