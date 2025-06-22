package com.example;
import java.util.logging.Level;
import java.util.logging.Logger;
// Use a final class for constants
final class Constants {
    public static final int MAX_USERS = 100;

    // Private constructor to prevent instantiation
    private Constants() {}
}

public class InterfaceFieldModificationExample {
    static Logger logger = Logger.getLogger(InterfaceFieldModificationExample.class.getName());
    public static void main(String[] args) {
        // Example usage:
        int maxUsers = Constants.MAX_USERS;
        if (logger.isLoggable(Level.INFO)) {
            User user = new User();
            logger.info("User: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}