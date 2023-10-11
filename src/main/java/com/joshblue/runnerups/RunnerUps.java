package com.joshblue.runnerups;

import com.joshblue.runnerups.block.ModBlocks;
import com.joshblue.runnerups.entity.ModEntities;
import com.joshblue.runnerups.entity.custom.GreatHungerEntity;
import com.joshblue.runnerups.entity.custom.MoobloomEntity;
import com.joshblue.runnerups.item.ModItems;
import com.joshblue.runnerups.world.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnerUps implements ModInitializer {
	public static final String MOD_ID = "runnerups";
    public static final Logger LOGGER = LoggerFactory.getLogger("runnerups");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		FabricDefaultAttributeRegistry.register(ModEntities.MOOBLOOM, MoobloomEntity.createMoobloomAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.GREAT_HUNGER, GreatHungerEntity.createGreatHungerAttributes());
	}
}