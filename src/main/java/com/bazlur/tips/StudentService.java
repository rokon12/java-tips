package com.bazlur.tips;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Bazlur Rahman Rokon
 * @since 11/30/15.
 */
public class StudentService {

    List<Student> list = new ArrayList<>();

    List<Student> findStudent(Predicate<Student> predicate) {

        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        //MALE, 10
        studentService.findStudent(student -> student.getAge() > 10 && student.getGender() == Gender.MALE);
        studentService.findStudent(student -> student.getAge() > 10 && student.getGender() == Gender.FEMALE);

    }

}

//
//@FunctionalInterface
//interface StudentPredicate {
//    boolean test(Student student);
//}