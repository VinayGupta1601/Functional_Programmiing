package org.example;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {

        List<Integer> number = List.of(1,2,4,12,13,10,23,17,30);
        useOfPredicate(number);

    }

    private static void useOfPredicate(List<Integer> number)
    {
        number.stream()
                .filter(getPredicate())
                .map(getMapper())
                .forEach(getPrintln());
    }

    //Consume is a functional Interface that accepts single argument and return no result.
    private static Consumer<Integer> getPrintln() {
        return System.out::println;
    }

    //Function is a functional Interface that Represents a function
    // that accepts one argument and produces a result.
    private static Function<Integer, Integer> getMapper() {
        return x -> x * x;
    }

    //Represents a predicate (boolean-valued function) of one argument.
    //This is a functional interface whose functional method is test(Object).
    private static Predicate<Integer> getPredicate() {
        return x -> x % 2 == 0;
    }
}
