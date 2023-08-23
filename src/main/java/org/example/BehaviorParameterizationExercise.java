package org.example;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviorParameterizationExercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 10, 15);


        Function<Integer, Integer> mappingFunction = x -> x * x;

        System.out.println(mapAndPrint(numbers, mappingFunction));

    }

    private static List<Integer> mapAndPrint(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
