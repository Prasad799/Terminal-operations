package Terminaloperations;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;
public class Reducemethoddemo {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Integer> numbers = new ArrayList<>();

	        // Collect numbers from the user
	        while (true) {
	            System.out.print("Enter a number (or 'q' to calculate the sum): ");
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
	            // Calculate the sum using streams and reduce()
	            Optional<Integer> sum = numbers.stream().reduce((x, y) -> x + y);

	            if (sum.isPresent()) {
	                System.out.println("The sum is: " + sum.get());
	            } else {
	                System.out.println("Sum calculation failed.");
	            }
	        }

	        scanner.close();
	    }
	
}
