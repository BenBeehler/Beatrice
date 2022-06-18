package com.benbeehler.beatrice.objects;

/**
 * Class for determining whether a given route is providing healthy responses.
 * @author Ben Beehler
 *
 */
public class AppHealth {

	public static final String ERROR = "{ \"healthy\": false }";
	
	private boolean healthy;
	
	public AppHealth(boolean healthy) {
		this.healthy = healthy;
	}
	
	public AppHealth() {
		this(true);
	}
	
	public boolean isHealthy() {
		return this.healthy;
	}
}
