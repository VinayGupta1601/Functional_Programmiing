package org.example;

import java.util.List;

public class BasicPrint {
    public static void main(String[] args) {

        printAllNumbersInList(List.of(1,2,5,12,67,90,87,34,23,56,79));

    }

    private static void printAllNumbersInList(List<Integer> numbers) {

        for(int x:numbers)
        {
            System.out.println(x + " ");
        }
    }
}