import java.util.List;
import java.util.function.Consumer;

public class consumerExample {

    public static Consumer<Student> c1 = (student) -> System.out.print(student.getName()+" ");
    public static Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());

    public static void getStudentName() {
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c1);

    }

    public static void getStudentswithCondition() {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("\nActivities of female students with gpa > 3:");
        students.forEach(student -> {
            if(student.getGpa()>3 && student.getGender().equals("female")) {
                c1.andThen(c2).accept(student);
            }
        });
    }
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

        consumer.accept("java8");

        getStudentName();
        getStudentswithCondition();
    }
}
