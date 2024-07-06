package com.test.pract.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122), new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67), new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164), new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26), new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12), new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90), new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324), new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433), new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7), new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        List<Student> newList = null;
        //Firstname startwith A
        newList = students.stream().filter(student -> student.getFirstName().toUpperCase().startsWith("A")).collect(Collectors.toList());

        System.out.println("Firstname startwith A" + newList);

        //Group The Student By Department Names
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getDepartmantName));

        System.out.println(map);

        //Find the total count of student using stream
        System.out.println("\n count: "+students.stream().count());

        //Max age among all students
        System.out.println("\n Max age: "+students.stream().mapToInt(Student::getAge).max().getAsInt());

        //Find out in unique depart names in order
        System.out.println("\n Unique depart names: "+students.stream().map(Student::getDepartmantName).distinct().sorted().collect(Collectors.toList()));

        //No of students in each dept
        System.out.println("\n No of Students in each dept:"+students.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())));


        //Find the list of students whose age is less than 30
        System.out.println("\n students whose age is less than 30: "+students.stream().filter(s -> s.getAge()<30).collect(Collectors.toList()).toString());

        // Find the average age of male and female students

        System.out.println("\n Average age of male and female students:"+students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge))));


        // Find the Max age of male and female students

        System.out.println("\n Max age of male and female students:"+students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.maxBy((s1,s2)->s1.getAge()-s2.getAge()))));


        //Find the department who is having maximum number of students
        System.out.println("\n department who is having maximum number of students: "+students
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByKey()).get());













    }
}
