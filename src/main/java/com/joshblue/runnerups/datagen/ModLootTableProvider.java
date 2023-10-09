package com.joshblue.runnerups.datagen;

import com.joshblue.runnerups.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BUTTERCUP);
        addPottedPlantDrops(ModBlocks.POTTED_BUTTERCUP);
    }
}
