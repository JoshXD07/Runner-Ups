package com.joshblue.runnerups.block;

import com.joshblue.runnerups.RunnerUps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BUTTERCUP = registerBlock("buttercup",
            new FlowerBlock(StatusEffects.REGENERATION, 10,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));
    public static final Block POTTED_BUTTERCUP = Registry.register(Registries.BLOCK, new Identifier(RunnerUps.MOD_ID, "potted_buttercup"),
            new FlowerPotBlock(BUTTERCUP, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RunnerUps.MOD_ID, name), block);
    }

    private static Item  registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RunnerUps.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        RunnerUps.LOGGER.info("Registering ModBlocks for " + RunnerUps.MOD_ID);
    }
}
