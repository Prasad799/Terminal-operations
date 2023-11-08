package Terminaloperations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Maxmethoddemo {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Double> numbers = new ArrayList<>();

	        // Collect numbers from the user
	        while (true) {
	            System.out.print("Enter a number (or 'q' to quit): ");
	            if (scanner.hasNextDouble()) {
	                double number = scanner.nextDouble();
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
	            // Find the maximum using streams
	            double max = numbers.stream()
	                .mapToDouble(Double::doubleValue)
	                .max()
	                .getAsDouble();
	            
	            System.out.println("The maximum value is: " + max);
	        }

	        scanner.close();
	    }
	}

