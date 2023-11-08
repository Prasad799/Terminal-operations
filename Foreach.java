package Terminaloperations;
import java.util.Scanner;
public class Foreach {
	
	    public static void main(String[] args) {
	        // Create a Scanner to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter lines of text (type 'exit' to stop):");

	        // Read and process input lines using a loop
	        String line;
	        while (scanner.hasNextLine()) {
	            line = scanner.nextLine();

	            if ("exit".equalsIgnoreCase(line)) {
	                break;
	            }

	            // Process the line (you can perform any desired action here)
	            System.out.println("You entered: " + line);
	        }

	        // Close the scanner when done with it
	        scanner.close();
	    }
	}

