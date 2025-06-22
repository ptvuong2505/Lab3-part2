package com.example;

import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = null;
            if (s != null) {
                logger.info(String.valueOf(s.length()));
            } else {
                logger.warning("String 's' is null");
            }
        } catch (NullPointerException npe) {
            logger.severe("Null pointer exception occurred: " + npe.getMessage());
        }
    }
}
