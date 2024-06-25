package com.tech.placementdrive;

import java.util.*;

class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;
    private int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
    public static Comparator<Student> ageComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s2.age - s1.age;
        }
    };

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StudentSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "John", 20));
        students.add(new Student(102, "Alice", 22));
        students.add(new Student(103, "Bob", 21));
        students.add(new Student(104, "Emily", 19));
        students.add(new Student(105, "Charlie", 23));

        Collections.sort(students);
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.ageComparator);
        System.out.println("\nSorted by age (descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
