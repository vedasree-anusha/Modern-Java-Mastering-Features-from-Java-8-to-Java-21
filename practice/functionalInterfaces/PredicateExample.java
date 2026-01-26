import java.util.function.Predicate;

public class PredicateExample {

    public static Predicate<Integer> gradeLevel = (a) -> a>=3;
    public static Predicate<Integer> gpa = (a) -> a>3.5;
    public static Predicate<Student> studenPredicate = (student) -> student.getGradeLevel()>=3 && student.getGpa()>3.5;
    public static void predicateAnd()
    {
        Predicate<Integer> p1 = (a) -> a%2 == 0;
        Predicate<Integer> p2 = (b) -> b%5 == 0;

        System.out.println("Result of predicate And "+ p1.and(p2).test(10));
    }

    public static void predicateOR()
    {
        Predicate<Integer> p1 = (a) -> a%2 == 0;
        Predicate<Integer> p2 = (b) -> b%5 == 0;

        System.out.println("Result of predicate OR "+ p1.or(p2).test(9));
        System.out.println("Result of predicate OR "+ p1.or(p2).test(10));
    }

    public static void predicateNegate()
    {
        Predicate<Integer> p1 = (a) -> a%2 == 0;
        Predicate<Integer> p2 = (b) -> b%5 == 0;

        System.out.println("Result of predicate Negate "+ p1.or(p2).negate().test(10));
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = (a) -> a%2==0;

        System.out.println("Result of predicate: "+predicate.test(2));
        predicateAnd();
        predicateOR();
        predicateNegate();

    }
}
