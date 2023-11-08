package Terminaloperations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Toarraymethoddemo {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Integer> numbers = new ArrayList<>();

	        // Collect numbers from the user
	        while (true) {
	            System.out.print("Enter a number (or 'q' to finish): ");
	            if (scanner.hasNextInt()) {
	                int number = scanner.nextInt();
	                numbers.add(number);
	            } else {
	                String input = scanner.next();
	                if (input.equalsIgnoreCase("q")) {
	                    break;
	                } else {
	                    System.out.println("Invalid input. Please enter a valid number.");
	                }
	            }
	        }

	        if (numbers.isEmpty()) {
	            System.out.println("No numbers entered.");
	        } else {
	            // Convert the list to an array using streams and toArray()
	            Integer[] numberArray = numbers.stream()
	                    .toArray(Integer[]::new);

	            System.out.println("Entered numbers as an array: " + java.util.Arrays.toString(numberArray));
	        }

	        scanner.close();
	    }
	}


