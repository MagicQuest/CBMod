package megalonemo.crumblingblocks;
import megalonemo.crumblingblocks.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;




@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION,acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class CBMod {
	
	@Instance()
	public static CBMod instance;
	
	@SidedProxy(serverSide = Reference.COMMON_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CBModTab CREATIVE_TAB = new CBModTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Console.log("UR MOM GAE");
	
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new CBModEventHandler());
	}

}
