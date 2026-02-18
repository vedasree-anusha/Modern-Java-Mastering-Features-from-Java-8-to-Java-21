import java.util.stream.Collectors;

import javax.security.auth.SubjectDomainCombiner;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;


public class StudentStream {

    public static void main(String[] args) {
        
        //1. List of students and collect to map 
        Map<String,List<String>> outputMap= StudentDataBase.getAllStudents().stream()
        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(outputMap);

        //2. filter students
        System.out.println("\n\nBy applying filter: \n\n");
        Map<String,List<String>> outputMap2= StudentDataBase.getAllStudents()
        .stream()
        .peek((student) -> {
            System.out.println("Before 1st filter: "+student);
        })
        .filter((student) -> student.getGpa()>3)
        .peek((student) -> {
            System.out.println("After 1st filter: "+student);
        })
        .filter((student) -> student.getGradeLevel()>3.9)
        .peek((student) -> {
            System.out.println("After 2nd filter: "+student);
        })
        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(outputMap2);

        
       

        Map<Integer, List<Student>> output = StudentDataBase.getAllStudents()
                                            .stream()
                                            .filter(student -> student.getGpa()>3.5)
                                            .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.toList()));

        System.out.println(output);

        //3. Difference between collections and streams
        //3.1 - iteratable only once - stream can be used only once
        //3.2 - cannot add or modify into streams
    }
}
