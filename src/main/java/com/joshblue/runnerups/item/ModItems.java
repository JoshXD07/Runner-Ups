package com.joshblue.runnerups.item;

import com.joshblue.runnerups.RunnerUps;
import com.joshblue.runnerups.block.ModBlocks;
import com.joshblue.runnerups.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MOOBLOOM_SPAWN_EGG = registerItem("moobloom_spawn_egg",
            new SpawnEggItem(ModEntities.MOOBLOOM, 0xfdd500, 0xfbf8de, new FabricItemSettings()));
    public static final Item GREAT_HUNGER_SPAWN_EGG = registerItem("great_hunger_spawn_egg",
            new SpawnEggItem(ModEntities.GREAT_HUNGER, 0x767679, 0x5c5b2b, new FabricItemSettings()));

    private static void addItemsToSpawnEggsTab(FabricItemGroupEntries entries){
        entries.add(MOOBLOOM_SPAWN_EGG);
        entries.add(GREAT_HUNGER_SPAWN_EGG);
    }

    private static void addItemsToNaturalTab(FabricItemGroupEntries entries){
        entries.add(ModBlocks.BUTTERCUP);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RunnerUps.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RunnerUps.LOGGER.info("Registering Mod Items for " + RunnerUps.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggsTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalTab);
    }
}
