package io.gatling.demo;

//import io.gatling.app.Gatling;

public class Mains {
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
        System.out.println("xxxx");
        // Run Gatling with the prepared arguments
//        Gatling.main(gatlingArgs);
        
    }
}