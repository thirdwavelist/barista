package com.thirdwavelist.barista;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaristaApplication {
	private static final Log log = LogFactory.getLog(BaristaApplication.class);

	private static final String[] requiredEnvVariables = {
			"SSL_KEYSTORE",
			"SSL_KEYSTORE_PWD",
			"SSL_KEYSTORE_KEY_ALIAS",
			"FIREBASE_PROJECT_ID",
			"GOOGLE_APPLICATION_CREDENTIALS",
	};

	public static void main(String[] args) {
//		checkRequiredEnvVars();
		SpringApplication.run(BaristaApplication.class, args);
	}

	private static void checkRequiredEnvVars() {
		for (String env : requiredEnvVariables) {
			log.debug("Checking the existence of " + env);
			if (System.getenv(env) == null) {
				log.error(env + " is not set");
				System.exit(-1);
			}
			log.debug(env + " is set!");
		}
		log.debug("All required environment variables are set!");
	}

}
