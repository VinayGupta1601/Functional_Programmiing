package org.example;

import java.util.List;

public class Functional_01 {

    public static void main(String[] args) {

        //printAllNumbersInListFunctional(List.of(1,2,5,12,67,90,87,34,23,56,79));
        printAllEvenNumbersInListFunctional(List.of(1,2,5,12,67,90,87,34,23,56,79));

    }

    private static void print(int numbers)
    {
        System.out.println(numbers);
    }
    private static boolean isEven(int number)
    {
        return number%2 == 0;
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

//         numbers.stream()
//                    .forEach(Functional_01::print);

        numbers.stream()    //stream converts the input into stream of numbers or sequence of elements
                .forEach(System.out::println); //perform an action for each element of stream

    }

    private static void printAllEvenNumbersInListFunctional(List<Integer>numbers)
    {
//        numbers.stream()
//                .filter(Functional_01::isEven) //returns a stream that matches the predicate
//                .forEach(System.out::println); //method reference

        numbers.stream()
                .filter(num->num%2 == 0) //lambda expression
                .forEach(System.out::println);
    }

}
