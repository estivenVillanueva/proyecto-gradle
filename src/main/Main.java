package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    // Crear el logger
    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        // Registrar mensajes en diferentes niveles de severidad
        logger.debug("Esto es un mensaje de depuración (DEBUG)");
        logger.info("Esto es un mensaje informativo (INFO)");
        logger.warn("Esto es una advertencia (WARN)");
        logger.error("Esto es un error (ERROR)");
        logger.fatal("Esto es un error fatal (FATAL)");
    }
}
