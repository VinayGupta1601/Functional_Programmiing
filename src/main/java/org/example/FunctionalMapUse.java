package org.example;

import java.util.Comparator;
import java.util.List;

public class FunctionalMapUse {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 10, 15);
        //printSquareOfEvenNumbersInListFunctional(numbers);
        sortUsingFunctional(numbers);

    }

    private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers)
    {
        numbers.stream()
                .filter(number -> number%2 == 0) //filter uses lambda expression
                .map(number -> number * number) // map uses lambda expression
                .forEach(System.out::println);
    }
    private static void sortUsingFunctional(List<Integer>numbers)
    {
//        numbers.stream()
//                .sorted()
//                .distinct()
//                .forEach(System.out::println);

//        numbers.stream()
//                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

        numbers.stream()
                .sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
