import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class PredicateAndConsumerExample {

    public static Consumer<Student> consumer = (student) -> System.out.println(student.getName()+"::"+student.getActivities());

    public static void getActivitiesbyGradeAndGPA()
    {
        List<Student> students = StudentDataBase.getAllStudents();

        // students.forEach(student -> {
        //     if(BiPredicateExample.gradeAndGPA.test(student.getGradeLevel(), student.getGpa())){
        //         consumer.accept(student);
        //     }
        // });

        students.forEach(student -> {
            if(PredicateExample.studenPredicate.test(student)){
                consumer.accept(student);
            }
        });
    }
    public static void main(String[] args) {
        getActivitiesbyGradeAndGPA();
    }
}
