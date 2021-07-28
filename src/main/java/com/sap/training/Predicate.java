package com.sap.training;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T subject);

    default void printHelloWorld() {
        System.out.println("Hello world");
    }

}
