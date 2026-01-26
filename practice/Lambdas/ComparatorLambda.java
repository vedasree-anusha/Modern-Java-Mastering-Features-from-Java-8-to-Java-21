import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;


public class ComparatorLambda {
    public static void main(String[] args) {

        //without lambda
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer I1, Integer I2)
            {
                return I1.compareTo(I2);
            }
        };

        System.out.println("Without lambda:  "+ comparator.compare(3,2));

        //with lambda

        Comparator<Integer> comparatorLambda = (a,b) -> {return a.compareTo(b);};

        System.out.println("With lambda: "+ comparatorLambda.compare(3, 2));

        List<String> fruits = Arrays.asList("Pineapple", "Apple","Kiwi","Banana");
        
        fruits.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(fruits);

        fruits.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(fruits);

        Comparator<String> fruitsComparator = (s1,s2) -> Integer.compare(s1.length(), s2.length());
        fruits.sort(fruitsComparator.reversed());
        System.out.println(fruits);

        Function<String,String> function1 = (s) -> s.toUpperCase();
        List<String> output = fruits.stream().map(function1).collect(Collectors.toList());
        System.out.println(output);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        List<Integer> evenNumbers = new ArrayList<>();
        Predicate<String> p1 = (s) -> s.length()>5;
        Predicate<String> p2 = (s) -> s.contains('a');
        evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        

        System.out.println(evenNumbers);


    }
}
