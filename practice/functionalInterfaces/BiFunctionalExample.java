import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionalExample {

    public static Predicate<Double> p1 = (gpa) -> gpa>3.5;
    public static BiFunction<List<Student>,Predicate<Double>,Map<String,List<String>>> f2 = (studentList, p1) -> {
        Map<String, List<String>> output = new HashMap<>();
        studentList.forEach(student -> {
            if(p1.test(student.getGpa())){
                output.put(student.getName(),student.getActivities());
            }
        
        });
        return output;
    };
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a+b;

        System.out.println(biFunction.apply(10, 5));

        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(f2.apply(students, p1));
    }
}
