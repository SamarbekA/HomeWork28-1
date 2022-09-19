import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 9, 2, 10, 3, 8, 4, 7);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        int maxSquaredValue = numbers.stream().map(a->a*a).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(("Maximum value: " + maxSquaredValue));

    }
}