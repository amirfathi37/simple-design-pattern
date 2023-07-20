import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 5, 70, 0, -500);
        List<Integer> collect = numbers.stream()
                .filter(integer -> integer >= 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        collect.stream()
                .forEach(System.out::println);
    }
}
