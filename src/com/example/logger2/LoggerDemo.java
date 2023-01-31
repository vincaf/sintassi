package com.example.logger2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	protected static final Logger Log = LogManager.getLogger();
	
	public static void main(String[] args) {

		Log.trace("Messaggio di demo trace");
		Log.debug("Messaggio di demo debug");
		Log.info("Messaggio di demo info");
		Log.warn("Messaggio di demo warn");
		Log.error("Messaggio di demo error");
		Log.fatal("Messaggio di demo fatal");
	}

}
