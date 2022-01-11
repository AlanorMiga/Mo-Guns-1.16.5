package moguns.events;

import moguns.MoGuns;
import moguns.events.loot.AKMBodyStructureAdditionModifier;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MoGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LootEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new AKMBodyStructureAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(MoGuns.MOD_ID,"akm_body_dungeon"))
        );

    }
}
