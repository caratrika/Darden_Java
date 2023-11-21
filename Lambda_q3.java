package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Lambda_q3 {

 
    public static void main(String[] args) {
        
        Supplier<Double> randomSupplier = Math::random;
        double randomNumber = randomSupplier.get();
        System.out.println("Random number: " + randomNumber);
     
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Consumer<String> printConsumer = System.out::println;
        names.forEach(printConsumer);
 
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(isEven).forEach(System.out::println);
 
        Function<String, Integer> stringToInteger = Integer::parseInt;
        String numberString = "42";
        int parsedNumber = stringToInteger.apply(numberString);
        System.out.println("Parsed number: " + parsedNumber);
    }
}