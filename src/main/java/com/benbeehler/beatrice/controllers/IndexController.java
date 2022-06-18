package com.benbeehler.beatrice.controllers;

import com.benbeehler.beatrice.objects.AppHealth;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * Handle index routes queries.
 * @author Ben Beehler
 */
@Controller("/")
public class IndexController {
	
    @Get(produces = MediaType.TEXT_JSON)
    public String index() {
    	ObjectMapper mapper = new ObjectMapper();
    	
    	AppHealth health = new AppHealth(true);
    	
        try {
			String response = mapper
					.writerWithDefaultPrettyPrinter().writeValueAsString(health);
			
	        return response;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        
        return AppHealth.ERROR;
    }
    
}
