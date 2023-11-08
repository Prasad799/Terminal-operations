package Terminaloperations;
import java.util.stream.Stream;
public class Countmethod {
	    public static void main(String[] args) {
	        Stream<String> wordsStream = Stream.of("apple", "banana", "cherry", "date", "elderberry");

	        long count = wordsStream.count();

	        System.out.println("Number of words: " + count);
	    }
	}


