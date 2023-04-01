package fr.silenthill99.blocsandtileentities.init;

import fr.silenthill99.blocsandtileentities.Main;
import fr.silenthill99.blocsandtileentities.utils.ModItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new BlockItem(ModBlocks.TEST.get(),new Item.Properties().tab(ModItemGroups.BLOCS_AND_TILE_ENTITIES)));
}
