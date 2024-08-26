package io.gatling.demo;

import org.junit.jupiter.api.Test;

import io.gatling.app.Gatling;

public class Main {
	public static void main(String[] args) {
        // Set up the simulation parameters
        String simulationClass = "io.test.Sim"; // Replace with your simulation class
        String resultsFolder = "target/gatling";
        
        // Retrieve environment variables
        String baseUrl = System.getenv("baseUrl");
        String userCount = System.getenv("userCount");
        String durationSeconds = System.getenv("durationSeconds");

        // Prepare the Gatling arguments
        String[] gatlingArgs = new String[] {
            "--simulation", simulationClass,
            "--results-folder", resultsFolder,
            "-DbaseUrl=" + baseUrl,
            "-DuserCount=" + userCount,
            "-DdurationSeconds=" + durationSeconds
        };
        
        System.out.println("base " + baseUrl);
        // Run Gatling with the prepared arguments
        Gatling.main(gatlingArgs);
    }
	
	@Test
    void testMain() {
        // Your test logic here
		 String simulationClass = "io.test.Sim"; // Replace with your simulation class
	        String resultsFolder = "target/gatling";
	        
	        // Retrieve environment variables
	        String baseUrl = System.getenv("baseUrl");
	        String userCount = System.getenv("userCount");
	        String durationSeconds = System.getenv("durationSeconds");
	        
	        System.setProperty("baseUrl", baseUrl != null ? baseUrl : "https://lsvtest.dla.go.");
	        System.setProperty("userCount", userCount != null ? userCount : "1");
	        System.setProperty("durationSeconds", durationSeconds != null ? durationSeconds : "60");

	        // Prepare the Gatling arguments
	        String[] gatlingArgs = new String[] {
	            "--simulation", simulationClass,
	            "--results-folder", resultsFolder
	        };
	        System.out.println(userCount);
	        Gatling.main(gatlingArgs);
    }
}
