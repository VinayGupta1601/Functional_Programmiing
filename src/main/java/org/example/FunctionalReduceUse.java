package org.example;

import java.util.List;

public class FunctionalReduceUse {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,5,6,12,34,8,10,13,5,7);

        int ans = printSumOfAllNumbersInList(numbers); //using reduce
        System.out.println(ans);
    }

    private static int printSum(int a, int b)
    {
        System.out.println(a + " " + b);
        return a+b;
    }

    private static int printSumOfAllNumbersInList(List<Integer> numbers) {

        return numbers.stream()
                //.reduce(0,FunctionalReduceUse::printSum); //method reference
                //.reduce(0,(x,y) -> x+y); // lambda function
                .reduce(0,Integer::sum);

    }
}
