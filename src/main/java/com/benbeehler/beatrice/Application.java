package com.benbeehler.beatrice;

import io.micronaut.runtime.Micronaut;

/**
 * Application entry point.
 * @author Ben Beehler
 */
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
