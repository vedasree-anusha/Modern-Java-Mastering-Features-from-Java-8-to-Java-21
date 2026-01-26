import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryandBinaryExample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (s) -> s.toLowerCase();
        System.out.println(unaryOperator.apply("Hello"));

        BinaryOperator<String> binaryOperator = (s1,s2) -> s1.concat(s2);

        System.out.println(binaryOperator.apply("hello","world"));

        Comparator<Integer> comparator = (a,b) -> a.compareTo(b);


        System.out.println("Max: " + BinaryOperator.maxBy(comparator).apply(10, 5)); // Output: 10
        System.out.println("Min: " + BinaryOperator.minBy(comparator).apply(10, 5)); // Output: 5
    }
}
