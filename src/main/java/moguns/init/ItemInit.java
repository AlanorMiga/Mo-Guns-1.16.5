package moguns.init;

import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.AmmoItem;
import com.mrcrayfish.guns.item.GrenadeItem;
import com.mrcrayfish.guns.item.GunItem;
import com.mrcrayfish.guns.item.ScopeItem;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import moguns.MoGuns;
import moguns.items.BurstGunItem;
import moguns.items.GarandGunItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * This class is where all of the mod's items are registered
 * Author: Bomb787 and lowkey AlanorMiga aubrey_twirl
 */
public class ItemInit {
	
	/*
     * This creates a Deferred Register where all of the items will be registered
     * This is called and added to the event bus in the main mod file.
     */
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			MoGuns.MOD_ID);

	//Gun Items
	public static final RegistryObject<GunItem> SCARL = ITEMS.register("scarl", 
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GunItem> SCARH = ITEMS.register("scarh",
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<BurstGunItem> G36C = ITEMS.register("g36c",
			() -> new BurstGunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP	 )));

	public static final RegistryObject<GunItem> AKM = ITEMS.register("akm",
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GunItem> AS_VAL = ITEMS.register("as_val",
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GunItem> THOMPSON = ITEMS.register("thompson",
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<BurstGunItem> M16A1 = ITEMS.register("m16a1",
			() -> new BurstGunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<BurstGunItem> FAMAS = ITEMS.register("famas",
			() -> new BurstGunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GarandGunItem> M1_GARAND = ITEMS.register("m1_garand",
			() -> new GarandGunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GunItem> GLOCK = ITEMS.register("glock",
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GunItem> WRAPPED_RIFLE = ITEMS.register("wrapped_rifle",
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GunItem> SNOWBALL_LAUNCHER = ITEMS.register("snowball_launcher",
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	public static final RegistryObject<GunItem> BIG_IRON = ITEMS.register("big_iron", 
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));
	
	public static final RegistryObject<GunItem> TRASHCAN = ITEMS.register("trashcan", 
			() -> new GunItem(new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	//Scope Items
	public static final RegistryObject<ScopeItem> REFLEX_SIGHT = ITEMS.register("reflex_sight",
			() -> new ScopeItem(Scope.create(0.1F, 2F, GunModifiers.SLOW_ADS).viewFinderOffset(0.3), new Item.Properties().maxStackSize(1).group(MoGuns.GROUP)));

	//Ammo Items
	public static final RegistryObject<Item> AMMO556X45 = ITEMS.register("556x45",
			() -> new AmmoItem(new Item.Properties().maxStackSize(60).group(MoGuns.AMMO)));

	public static final RegistryObject<Item> AMMO762X51 = ITEMS.register("762x51",
			() -> new AmmoItem(new Item.Properties().maxStackSize(60).group(MoGuns.AMMO)));

	public static final RegistryObject<Item> AMMO9x39 = ITEMS.register("9x39",
			() -> new AmmoItem(new Item.Properties().maxStackSize(60).group(MoGuns.AMMO)));

	public static final RegistryObject<Item> AMMO9 = ITEMS.register("9",
			() -> new AmmoItem(new Item.Properties().maxStackSize(60).group(MoGuns.AMMO)));

	public static final RegistryObject<Item> X_MAS_LIGHT = ITEMS.register("x_mas_light",
			() -> new AmmoItem(new Item.Properties().maxStackSize(64).group(MoGuns.AMMO)));

	public static final RegistryObject<GrenadeItem> SNOWBALL = ITEMS.register("snowball",
			() -> new GrenadeItem(new Item.Properties().group(MoGuns.AMMO), 20 * 4));
	
	public static final RegistryObject<Item> GARBAGE = ITEMS.register("garbage",
			() -> new AmmoItem(new Item.Properties().group(MoGuns.AMMO)));

	//Resources

	public static final RegistryObject<Item> RAW_SULFUR = ITEMS.register("raw_sulfur",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> RAW_NITER = ITEMS.register("raw_niter",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> NITER = ITEMS.register("niter",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register("steel_sheet",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
			() -> new Item(new Item.Properties().maxStackSize(64).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> BARREL = ITEMS.register("barrel",
			() -> new Item(new Item.Properties().maxStackSize(16).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> SPRING = ITEMS.register("spring",
			() -> new Item(new Item.Properties().maxStackSize(16).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> TRIGGER = ITEMS.register("trigger",
			() -> new Item(new Item.Properties().maxStackSize(16).group(MoGuns.COMPONENTS)));

	//Comps

	public static final RegistryObject<Item> SCARL_GRIP = ITEMS.register("scarl_grip",
			() -> new Item(new Item.Properties().maxStackSize(8).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> SCARL_RECEIVER = ITEMS.register("scarl_receiver",
			() -> new Item(new Item.Properties().maxStackSize(8).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> G36C_GRIP = ITEMS.register("g36c_grip",
			() -> new Item(new Item.Properties().maxStackSize(8).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> G36C_RECEIVER = ITEMS.register("g36c_receiver",
			() -> new Item(new Item.Properties().maxStackSize(8).group(MoGuns.COMPONENTS)));

	public static final RegistryObject<Item> AKM_BODY = ITEMS.register("akm_body",
			() -> new Item(new Item.Properties().maxStackSize(8).group(MoGuns.COMPONENTS)));

}
