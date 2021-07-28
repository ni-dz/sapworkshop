package com.sap.training;

/**
 * Prints the phrase every programmer has written to the command line at least once in their lifetime.
 */
public class App {

    private static String testString;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        testString = "Bla";
        testString = "asdf";
    }

    public static <T> void swap(T[] arr, int firstIndex, int secondIndex) {
        if (firstIndex >= arr.length || firstIndex < 0) {
            throw new IllegalArgumentException("Invalid indices");
        }
        
        T tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }
}
