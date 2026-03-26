package org.example;

public class App {
    public static void main(String[] args) {
        Course course = new DSA();

        Student s =new Student(); // Dependency injection
        s.setCourse(course);

        s.study();
    }
}
