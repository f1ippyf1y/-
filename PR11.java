import java.util.*;
import java.util.stream.Collectors;

public class PR11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5);

        List<Integer> squaredPositive = numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + numbers);
        System.out.println("Результат (квадраты положительных чисел): " + squaredPositive);
    }
}