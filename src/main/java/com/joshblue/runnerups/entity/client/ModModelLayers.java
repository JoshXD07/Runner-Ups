package com.joshblue.runnerups.entity.client;

import com.joshblue.runnerups.RunnerUps;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MOOBLOOM =
            new EntityModelLayer(new Identifier(RunnerUps.MOD_ID, "moobloom"), "main");
    public static final EntityModelLayer GREAT_HUNGER =
            new EntityModelLayer(new Identifier(RunnerUps.MOD_ID, "great_hunger"), "main");
}
