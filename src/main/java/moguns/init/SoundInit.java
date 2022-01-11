package moguns.init;

import moguns.MoGuns;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * This class is where all of the mod's sounds are registered
 * Author: Bomb787
 */
public class SoundInit {
	
	/*
     * This creates a Deferred Register where all of the sounds will be registered
     * This is called and added to the event bus in the main mod file.
     */
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoGuns.MOD_ID);
	
	public static final RegistryObject<SoundEvent> SCARL_FIRE = register("item.scarl.fire");
	
	public static final RegistryObject<SoundEvent> SCARL_FIRE_SUPPRESSED = register("item.scarl.suppressed_fire");
	
	public static final RegistryObject<SoundEvent> SCARL_COCK = register("item.scarl.cock");
	
	public static final RegistryObject<SoundEvent> G36C_FIRE = register("item.g36c.fire");
	
	public static final RegistryObject<SoundEvent> G36C_FIRE_SUPPRESSED = register("item.g36c.suppressed_fire");
	
	public static final RegistryObject<SoundEvent> G36C_COCK = register("item.g36c.cock");

	public static final RegistryObject<SoundEvent> AKM_FIRE = register("item.akm.fire");

	public static final RegistryObject<SoundEvent> AKM_COCK = register("item.akm.cock");

	public static final RegistryObject<SoundEvent> AS_VAL_FIRE = register("item.as_val_fire");

	public static final RegistryObject<SoundEvent> AS_VAL_COCK = register("item.as_val_cock");

	public static final RegistryObject<SoundEvent> THOMPSON_FIRE = register("item.thompson_fire");

	public static final RegistryObject<SoundEvent> THOMPSON_COCK = register("item.thompson_cock");

	public static final RegistryObject<SoundEvent> M16A1_FIRE = register("item.m16a1_fire");

	public static final RegistryObject<SoundEvent> M16A1_COCK = register("item.m16a1_cock");

	public static final RegistryObject<SoundEvent> FAMAS_FIRE = register("item.famas_fire");

	public static final RegistryObject<SoundEvent> FAMAS_COCK = register("item.famas_cock");

	public static final RegistryObject<SoundEvent> M1_GARAND_FIRE = register("item.m1_garand_fire");

	public static final RegistryObject<SoundEvent> M1_GARAND_COCK = register("item.m1_garand_cock");

	public static final RegistryObject<SoundEvent> M1_GARAND_RELOAD = register("item.m1_garand_reload");

	public static final RegistryObject<SoundEvent> M1_GARAND_PING = register("item.m1_garand_ping");

	public static final RegistryObject<SoundEvent> GLOCK_SUPRESSED_FIRE = register("item.glock_supressed_fire");

	public static final RegistryObject<SoundEvent> GLOCK_FIRE = register("item.glock_fire");

	public static final RegistryObject<SoundEvent> GLOCK_COCK = register("item.glock_cock");

	public static final RegistryObject<SoundEvent> WRAPPED_RIFLE_FIRE = register("item.wrapped_rifle_fire");

	public static final RegistryObject<SoundEvent> WRAPPED_RIFLE_COCK = register("item.wrapped_rifle_cock");

	public static final RegistryObject<SoundEvent> WRAPPED_RIFLE_TUNE = register("item.wrapped_rifle_tune");

	public static final RegistryObject<SoundEvent> SNOWBALL_LAUNCHER_FIRE = register("item.snowball_launcher_fire");

	public static final RegistryObject<SoundEvent> BOOM = register("item.trashcan.boom");
	
	public static final RegistryObject<SoundEvent> LAUGH = register("item.trashcan.reload");
	
	public static final RegistryObject<SoundEvent> BIG_IRON_FIRE = register("item.big_iron.fire");
	
	//Method to help us register sounds
	private static RegistryObject<SoundEvent> register(String key) {
			
		return SOUNDS.register(key, () -> new SoundEvent(new ResourceLocation(MoGuns.MOD_ID, key)));
	        
	}

}
