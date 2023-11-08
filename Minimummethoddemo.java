package Terminaloperations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Minimummethoddemo {
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
	            // Find the minimum using streams
	            double min = numbers.stream()
	                .mapToDouble(Double::doubleValue)
	                .min()
	                .getAsDouble();
	            
	            System.out.println("The minimum value is: " + min);
	        }

	        scanner.close();
	    }
	
}
