package com.company.assigment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApplication {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male","Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        studentList.stream().map(s -> s.engDepartment).distinct().forEach(System.out::println); // departments in college
        System.out.println("name of students after 2018");
        studentList.stream().filter(s -> s.yearOfEnrollment > 2018).map(s -> s.name).forEach(System.out::println); // name of students after 2018
        studentList.stream().filter(s -> {
            return s.gender.equals("Male") && s.engDepartment.equals("Computer Science"); // Male computer Science Students
        }).map(s -> s.toString()).forEach(System.out::println);

        Map<String, List<Student>> studentByGender = studentList.stream().collect(Collectors.groupingBy(Student::getGender));
        for(String gen : studentByGender.keySet()) {
            studentByGender.get(gen).size();
        }

        System.out.println("average age of the male and female");
        for(String gen : studentByGender.keySet()) {
            Double avg = studentByGender.get(gen).stream().mapToDouble(Student::getAge).average().getAsDouble();
            System.out.println(gen + " " + avg);
        } // average age of the male and female students

        System.out.println("count of the students in each department:");
        Map<String, List<Student>> studentByDepartment = studentList.stream().collect(Collectors.
                groupingBy(Student::getEngDepartment));

        for(String dept : studentByDepartment.keySet()) {
            System.out.println(dept + " : " + studentByDepartment.size());
        }// count of the students in each department

        Double max = studentList.stream().mapToDouble(s -> s.getPerTillDate()).max().getAsDouble(); // max percentage of the student
        studentList.stream().filter(s -> s.getPerTillDate() == max).forEach(System.out::println); // student name with max percentage

        //average percentage of each dept
        System.out.println("Average percentage of each dept");
        for(String dept: studentByDepartment.keySet()) {
            Double avg = studentByDepartment.get(dept).stream().mapToDouble(Student::getPerTillDate).average().getAsDouble();
            System.out.println(dept + ":" + avg);
        }

        System.out.print("Details  of youngest male student:");
        Integer minAge = studentList.stream().mapToInt(Student::getAge).max().getAsInt();
        studentList.stream().filter(s -> s.getAge().equals(minAge)).forEach(System.out::println);

        System.out.println("count of students in computer science dept:");
        List<Student> studentList1 = studentByDepartment.get("Computer Science");
        Map<String, List<Student>> studentByGen1 = studentList1.stream().collect(Collectors.groupingBy(Student::getGender));
        for(String gen : studentByGen1.keySet()) {
            System.out.println(gen + " : " + studentByGen1.get(gen).size());
        }
    }



}

/*
1.new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
        2.new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
        3 new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
        4.new Student(144, "Murali Gowda", 18, "Male", “Electrical”, 2018, 80)
        5.new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
        6.new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
        7.new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
        8.new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        9.new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        10.new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        11.new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        12.new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        13.new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        14.new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        15.new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        16.new Student(266, "Sanvi Pandey", 17, "Female", “Electric”, 2019, 72.4);
        17.new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
*/
