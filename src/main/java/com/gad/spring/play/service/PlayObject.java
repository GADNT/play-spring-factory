package com.gad.spring.play.service;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.gad.spring.play.service.Student.CollegeYearEnum.YEAR_FIRST;

public class PlayObject {



//    private List<String> getNameOfStudentByYear(Student.CollegeYearEnum year ,List<Student> students){
//        List<String> studentList = Collections.emptyList();
//
//        switch (year){
//           case YEAR_FIRST:
//               getStudentNameLastYear()
//        }
//
//
//        return studentList;
//    }



//
//    private Optional<String> getStudentNameLastYear(Student student) {
//        Optional<String> studentName;
//
//        Optional<Student> studentOptional = Optional.ofNullable(student);
//
//        studentName = studentOptional.filter(st -> Student.CollegeYearEnum.YEAR_FOUR.getYear() == st.getCollegeYear())
//                .map(Student::getName);
//
//
//        List<Student> students = new ArrayList<>();
//
//        students.stream()
//                .filter(nameContainsNumbers().or())
//                .map(this::getStudentNameLastYear)
//
//
//        getNameOfStudentByYear(Student.CollegeYearEnum.YEAR_FIRST, students).stream()
//                .filter(s -> s)
//
//        return studentName;
//    }


    public List<String> getRealNames(List<Student> students){

        List<String> collect = students.stream()
                .filter(nameContainsNumbers())
                .map(Student::getName)
                .collect(Collectors.toList());

//        students.forEach(student -> System.out.println(student.getName()));
        return collect;


    }

    private Predicate<Student> nameContainsNumbers(){
        return student->  student.getName() != null && student.getName().matches(".*?\\d$");
    }


}
