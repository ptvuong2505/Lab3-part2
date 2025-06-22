package com.example;

import java.util.logging.Logger;

class Animal {
    void speak() {
        Logger.getLogger(Animal.class.getName()).info("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        Logger.getLogger(Dog.class.getName()).info("Dog barks");
    }
}
