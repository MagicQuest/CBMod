package megalonemo.crumblingblocks;

//import megalonemo.greygoo.init.ModBlocks;
//import megalonemo.greygoo.init.ModCrafting;
//import megalonemo.greygoo.init.ModItems;
//import megalonemo.greygoo.init.ModPotions;
//import megalonemo.greygoo.proxy.CommonProxy;
//import megalonemo.greygoo.tileentity.*;
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

//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;


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
		/*ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
		            System.out.println("A second past");
		},0, 1, TimeUnit.SECONDS);*/
		
		//ModItems.init();
		//ModItems.register();
		
		//ModBlocks.init();
		//ModBlocks.register();
		
		//ModPotions.registerPotions();



		//GameRegistry.registerTileEntity(TileEntityGreyGoo.class, Reference.MODID + ":grey_goo");
		///GameRegistry.registerTileEntity(TileEntityOrangeGoo.class, Reference.MODID + ":orange_goo");
		//GameRegistry.registerTileEntity(TileEntityBlueGoo.class, Reference.MODID + ":blue_goo");
		//GameRegistry.registerTileEntity(TileEntityRedGoo.class, Reference.MODID + ":red_goo");
		///GameRegistry.registerTileEntity(TileEntityPlagueGoo.class,Reference.MODID+":plague_goo");
		//GameRegistry.registerTileEntity(TileEntityWhiteGoo.class,Reference.MODID+":white_goo");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//proxy.registerRenders();
		
		//ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new CBModEventHandler());
	}

}
