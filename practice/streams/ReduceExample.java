import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static int multiply(List<Integer> numbers) {
        return numbers.stream()
                    .reduce(1, (a,b) -> a*b);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(multiply(numbers));
      
        
    }
}

