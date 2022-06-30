package com.benbeehler.beatrice;

import io.micronaut.runtime.Micronaut;

/**
 * Beatrice application entry point.
 * @author Benjamin Beehler
 */
public class Application {
	
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
    
}
