package moguns;

import com.mrcrayfish.guns.Config;
import com.mrcrayfish.guns.client.render.gun.ModelOverrides;

import com.mrcrayfish.guns.common.BoundingBoxManager;
import com.mrcrayfish.guns.common.ProjectileManager;
import com.mrcrayfish.guns.network.PacketHandler;
import moguns.client.render.gun.model.*;
import moguns.init.ItemInit;
import moguns.init.SoundInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moguns")
public class MoGuns {
	
	public static final String MOD_ID = "moguns";
	
	//Creative Tab
	public static final ItemGroup GROUP = new ItemGroup("group") {
		/*
		 * We use this to tell the game what item to use as the icon for the tab.
		 * You can just use "return new ItemStack(Items.xxx);" replacing xxx with the item you want, instead of adding ".get()" at the end if you want to use a vanilla item.
		 */
		@Override
		public ItemStack createIcon() {
			
			//Gets the gun item, unneeded if you're not gonna use a gun.
			ItemStack stack = new ItemStack(ItemInit.SCARL.get());
			//Makes sure that the icon gun has full ammo so the durability bar doesn't show up.
			stack.getOrCreateTag().putInt("AmmoCount", ItemInit.SCARL.get().getGun().getGeneral().getMaxAmmo());
			//Returns the loaded gun icon.
	        return stack;
			
		}
		
		/**
		 * Adds a search bar to our tab.
		 * You don't need this if you don't want a search bar.
		 */
		@Override
		public boolean hasSearchBar() {
			
			return true;
			
		}
		
		/**
		 * Sets the background image for our tab.
		 * You don't need this if you don't have a search bar.
		 */
		@Override
		public String getBackgroundImageName(){
			
			return ("item_search.png");
			
		}
    };

	public static final ItemGroup AMMO = new ItemGroup("ammo") {
		/*
		 * We use this to tell the game what item to use as the icon for the tab.
		 * You can just use "return new ItemStack(Items.xxx);" replacing xxx with the item you want, instead of adding ".get()" at the end if you want to use a vanilla item.
		 */
		@Override
		public ItemStack createIcon() {

			//Gets the gun item, unneeded if you're not gonna use a gun.
			ItemStack stack = new ItemStack(ItemInit.AMMO556X45.get());
			//Makes sure that the icon gun has full ammo so the durability bar doesn't show up.
			stack.getOrCreateTag().putInt("AmmoCount", ItemInit.SCARL.get().getGun().getGeneral().getMaxAmmo());
			//Returns the loaded gun icon.
			return stack;

		}

		/**
		 * Adds a search bar to our tab.
		 * You don't need this if you don't want a search bar.
		 */
		@Override
		public boolean hasSearchBar() {

			return true;

		}

		/**
		 * Sets the background image for our tab.
		 * You don't need this if you don't have a search bar.
		 */
		@Override
		public String getBackgroundImageName(){

			return ("item_search.png");

		}
	};

	public static final ItemGroup COMPONENTS = new ItemGroup("components") {
		/*
		 * We use this to tell the game what item to use as the icon for the tab.
		 * You can just use "return new ItemStack(Items.xxx);" replacing xxx with the item you want, instead of adding ".get()" at the end if you want to use a vanilla item.
		 */
		@Override
		public ItemStack createIcon() {

			//Gets the gun item, unneeded if you're not gonna use a gun.
			ItemStack stack = new ItemStack(ItemInit.SCARL_GRIP.get());
			//Returns the loaded gun icon.
			return stack;

		}

		/**
		 * Adds a search bar to our tab.
		 * You don't need this if you don't want a search bar.
		 */
		@Override
		public boolean hasSearchBar() {

			return true;

		}

		/**
		 * Sets the background image for our tab.
		 * You don't need this if you don't have a search bar.
		 */
		@Override
		public String getBackgroundImageName(){

			return ("item_search.png");

		}
	};
	
	public MoGuns() {
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		
		MinecraftForge.EVENT_BUS.register(this);
		
		//Registers all the Deferred Registers from our init classes.
		ItemInit.ITEMS.register(bus);
		SoundInit.SOUNDS.register(bus);
		
		bus.addListener(this::onClientSetup);
		
	}
	
	//This is the common setup event, it doesn't do much for this addon.
	private void setup(final FMLCommonSetupEvent event) {

		System.out.println("MoGuns preinit, if you're reading this then I hope you're having a nice day :)");
	}
	
	//This is the client setup event.
	private void onClientSetup(FMLClientSetupEvent event) {
		
		//Register all of our models.
		ModelOverrides.register(ItemInit.SCARL.get(), new ScarModel());
		ModelOverrides.register(ItemInit.SCARH.get(), new ScarHModel());
		ModelOverrides.register(ItemInit.G36C.get(), new G36CModel());
		ModelOverrides.register(ItemInit.AKM.get(), new AKMModel());
		ModelOverrides.register(ItemInit.AS_VAL.get(), new AS_VALModel());
		ModelOverrides.register(ItemInit.THOMPSON.get(), new ThompsonModel());
		ModelOverrides.register(ItemInit.M16A1.get(), new M16a1Model());
		ModelOverrides.register(ItemInit.FAMAS.get(), new FamasModel());
		ModelOverrides.register(ItemInit.M1_GARAND.get(), new M1_GarandModel());
		ModelOverrides.register(ItemInit.GLOCK.get(), new GlockModel());
		ModelOverrides.register(ItemInit.WRAPPED_RIFLE.get(), new Wrapped_RifleModel());
		ModelOverrides.register(ItemInit.SNOWBALL_LAUNCHER.get(), new Snowball_LauncherModel());
		ModelOverrides.register(ItemInit.REFLEX_SIGHT.get(), new ReflexSightModel());

	}
}