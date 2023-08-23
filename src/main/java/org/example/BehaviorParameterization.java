package org.example;

import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterization {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 10, 15);

        System.out.println("Multiples of two!!");
        filterAndPrint(numbers,x -> x%2 == 0);
        System.out.println("Multiples of three!!");
        filterAndPrint(numbers,x -> x%3 == 0);
        System.out.println("Completed");

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
