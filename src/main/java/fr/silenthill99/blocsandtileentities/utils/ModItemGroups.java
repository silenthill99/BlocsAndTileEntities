package fr.silenthill99.blocsandtileentities.utils;

import fr.silenthill99.blocsandtileentities.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups
{
    public static final ItemGroup BLOCS_AND_TILE_ENTITIES = new ItemGroup("blocs_and_tile_entities") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST.get());
        }
    };
}
