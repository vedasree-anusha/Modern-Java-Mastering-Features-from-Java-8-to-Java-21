import java.util.List;
import java.util.function.BiPredicate;
public class BiPredicateExample {

    public static BiPredicate<Integer,Double> gradeAndGPA = (grade, gpa) -> grade>=3 && gpa>3.5;

    public static void filterGradeandGPA(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(gradeAndGPA.test(student.getGradeLevel(), student.getGpa())){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a%2==0 && b%5==0;

        System.out.println(biPredicate.test(10, 5));

        filterGradeandGPA();
    }
}
