package fr.silenthill99.blocsandtileentities.init;

import fr.silenthill99.blocsandtileentities.Main;
import fr.silenthill99.blocsandtileentities.init.blocks.TestBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    public static final RegistryObject<Block> TEST = BLOCKS.register("test", TestBlock::new);


}
