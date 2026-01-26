import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


public class FunctionExample {


    public static Function<List<Student>, Map<String,Double>> studentFunction = (students) -> {
        Map<String,Double> output = new HashMap();        

        students.forEach((s) -> {
            if(PredicateExample.studenPredicate.test(s)){
                output.put(s.getName(), s.getGpa());
            }
        });

        return output;
    };
    public static void main(String[] args) {
        Function<String,String> function = (a) -> a.toUpperCase();
        Function<String,String> function1 = (a) -> a.concat("Examples").toLowerCase();

        System.out.println(function.apply("java8"));
        System.out.println(function1.andThen(function).apply("java8"));
        System.out.println(function1.compose(function).apply("java8"));

        
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
