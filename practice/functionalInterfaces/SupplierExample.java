import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SupplierExample {
    public static void main(String[] args) {
        Function<Student,String> f1 = (student) -> student.getName();
        Supplier<List<Student>> supplier = () -> StudentDataBase.getAllStudents();
        Supplier<List<String>> supplier2 = () -> {
            List<Student> students = StudentDataBase.getAllStudents();
            return students.stream().map(f1).collect(Collectors.toList());
        };


        System.out.println(supplier.get());
        System.out.println(supplier2.get());

    }
}
