package com.wgmlgz.kubiki.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    public static final Block POLYKUB_BLOCK = new PolykubBlock(FabricBlockSettings.of(Material.METAL));

    public static void register() {
        System.out.println("Blocks registry");
        Registry.register(Registry.BLOCK, new Identifier("kubiki", "polykub"), POLYKUB_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("kubiki", "polykub"), new BlockItem(POLYKUB_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
