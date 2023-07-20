import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example: Sum of even numbers in the list using streams
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)  // Keep only even numbers
                .mapToInt(Integer::intValue)  // Convert Integer to int
                .sum();  // Sum the elements

        System.out.println("Sum of even numbers: " + sum);
    }
}