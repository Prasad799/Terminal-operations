package Terminaloperations;
import java.util.List;
public class Allmatchdemo {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(2, 4, 6, 8, 10);

	        // Check if all numbers in the list are even
	        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);

	        System.out.println("All numbers are even: " + allEven);

	        // Check if all numbers in the list are greater than 5
	        boolean allGreaterThan5 = numbers.stream().allMatch(n -> n > 5);

	        System.out.println("All numbers are greater than 5: " + allGreaterThan5);
	    }
	}
