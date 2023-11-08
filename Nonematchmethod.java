package Terminaloperations;
import java.util.List;
public class Nonematchmethod {

	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 3, 5, 7, 9,-9);

	        // Check if none of the numbers in the list are even
	        boolean noneAreEven = numbers.stream().noneMatch(n -> n % 2 == 0);

	        System.out.println("None of the numbers are even: " + noneAreEven);

	        // Check if none of the numbers in the list are negative
	        boolean noneAreNegative = numbers.stream().noneMatch(n -> n < 0);

	        System.out.println("None of the numbers are negative: " + noneAreNegative);
	    }

}
