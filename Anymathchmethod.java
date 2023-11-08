package Terminaloperations;
import java.util.List;
import java.util.function.Predicate;
public class Anymathchmethod {
	    public static <T> boolean anyMatch(List<T> list, Predicate<T> condition) {
	        return list.stream().anyMatch(condition);
	    }

	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,-9);

	        boolean hasEvenNumber = anyMatch(numbers, n -> n % 2 == 0);
	        boolean hasNegativeNumber = anyMatch(numbers, n -> n < 0);

	        System.out.println("Has even number: " + hasEvenNumber);
	        System.out.println("Has negative number: " + hasNegativeNumber);
	    }
	}

