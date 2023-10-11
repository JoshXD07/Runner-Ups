package com.joshblue.runnerups.entity;

import com.joshblue.runnerups.RunnerUps;
import com.joshblue.runnerups.entity.custom.GreatHungerEntity;
import com.joshblue.runnerups.entity.custom.MoobloomEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MoobloomEntity> MOOBLOOM = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RunnerUps.MOD_ID, "moobloom"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MoobloomEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());

    public static final EntityType<GreatHungerEntity> GREAT_HUNGER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RunnerUps.MOD_ID, "great_hunger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GreatHungerEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
