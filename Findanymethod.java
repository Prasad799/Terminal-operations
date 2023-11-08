package Terminaloperations;
import java.util.Scanner;
public class Findanymethod {

	    public static void main(String[] args) {
	        // Create a Scanner to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Close the scanner when done with it
	        scanner.close();

	        // Check if the input contains the word "Java"
	        if (input.contains("Java")) {
	            System.out.println("The word 'Java' is found in the input.");
	        } else {
	            System.out.println("The word 'Java' is not found in the input.");
	        }
	    }
	}


