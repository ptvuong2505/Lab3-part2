package com.example;
import java.util.logging.Logger;

public class OvercatchingExceptionExample {
    private static final Logger logger = Logger.getLogger(OvercatchingExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            logger.info(String.valueOf(arr[10]));
        } catch (ArrayIndexOutOfBoundsException ex) {
            logger.severe("Array index out of bounds: " + ex.getMessage());
        }
    }
}

