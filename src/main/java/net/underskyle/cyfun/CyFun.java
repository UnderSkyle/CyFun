package net.underskyle.cyfun;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CyFun implements ModInitializer {
	public static final String MOD_ID = "cyfun";
    public static final Logger LOGGER = LoggerFactory.getLogger("cyfun");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}