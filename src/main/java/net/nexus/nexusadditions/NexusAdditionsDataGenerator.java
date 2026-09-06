package net.nexus.nexusadditions;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.nexus.nexusadditions.datagen.NexusRecipeProvider;
import org.jspecify.annotations.NonNull;

public class NexusAdditionsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(@NonNull FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(NexusRecipeProvider::new);
	}
}
