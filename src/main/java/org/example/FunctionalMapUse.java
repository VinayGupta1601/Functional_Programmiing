package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalMapUse {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 10, 15);
        //printSquareOfEvenNumbersInListFunctional(numbers);
        sortUsingFunctional(numbers);
        //List<Integer>doubled = numbers.stream().map(x->x+1).sorted().collect(Collectors.toList());
        //System.out.println(doubled);

        //List<Integer>doubledNew = numbers.stream().filter(x->x%2==0).sorted().collect(Collectors.toList());
        //System.out.println(doubledNew);

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
//                .sorted() //Intermediate operation returns stream
//                .distinct() //Intermediate operation return stream
//                .forEach(System.out::println); //terminal operation

//        numbers.stream()
//                .sorted(Comparator.naturalOrder()).forEach(System.out::println);

        numbers.stream()
                .sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
