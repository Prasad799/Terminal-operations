package Terminaloperations;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Collectmethod {
	    public static void main(String[] args) {
	        Stream<String> wordsStream = Stream.of("apple", "banana", "cherry", "date", "elderberry");

	        // Collect elements into a List
	        List<String> wordsList = wordsStream.collect(Collectors.toList());

	        // Print the collected list
	        System.out.println("Collected List: " + wordsList);
	    }

}
