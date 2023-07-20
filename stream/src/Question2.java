import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("amir", "s", "asdasdk");
        double avg = strings.stream()
                .mapToDouble(String::length)
                .average()
                .orElse(0L);

        System.out.println(avg);


    }
}
