package Terminaloperations;
import java.util.Scanner;
public class Findfirst {
	    public static void main(String[] args) {
	        // Create a Scanner to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter the word to find: ");
	        String wordToFind = scanner.next();

	        scanner.close();

	        int index = input.indexOf(wordToFind);

	        if (index != -1) {
	            System.out.println("The word '" + wordToFind + "' is found at index " + index + " in the input.");
	        } else {
	            System.out.println("The word '" + wordToFind + "' is not found in the input.");
	        }
	    }
	}

