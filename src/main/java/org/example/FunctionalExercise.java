package org.example;

import java.util.List;

public class FunctionalExercise {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS",
                "PCF","Azure", "Docker", "Kubernetes");

        printAllStringsInList(courses);
    }

    private static void printAllStringsInList(List<String> course) {

        course.stream()
                .forEach(System.out::println);
    }
}
