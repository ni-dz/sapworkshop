package com.sap.training;

import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ImmutablePair<T, U> implements Pair<T, U> {

    private T first;
    private U second;

    public ImmutablePair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static class Test {
        public static void main(String[] args) {
            var list = new ArrayList<String>();
            list.add("first");
            list.add("second");

            IntStream.range(0, 10).toArray();

            String s = list.stream()
                .filter(it -> it.length() >= 2)
                .limit(2)
                .map(it -> it + "bla")
                .max((first, second) -> first.length() - second.length())
                .orElse(null);

            String result;
            for (String it : list) {
                if (it.length() < 2) {
                    continue;
                }

                String second = it + "bla";

                String longest = null;
                for (String all : list) {
                    if (longest == null || longest.length() < all.length()) {
                        longest = all;
                    }
                }

                result = longest;
            }

            Integer[] numbers = { 1, 2, 3, 4, 5 };

            Predicate<Integer> evenNumbersPredicate = new Predicate<Integer>() {
                public boolean test(Integer it) {
                    return it % 2 == 0;
                };
            };

            filter(numbers, ImmutablePair.Test::isOdd);
            filter(numbers, it -> {
                return it % 2 == 0;
            });

            System.out.println(Arrays.toString(numbers));
        }

        public static boolean isOdd(int it) {
            return it % 2 == 0;
        } 

        public static <T> void swapComponents(T[] arr, int firstIndex, int secondIndex) {
            T tmp = arr[firstIndex];
            arr[firstIndex] = arr[secondIndex];
            arr[secondIndex] = tmp;
        }

        public static void runTenTimes(Runnable action) {
            for (int i = 0; i < 10; i++) {
                action.run();
            }
        }

        public static <T> void filter(T[] arr, Predicate<T> condition) {
            for (int i = 0; i < arr.length; i++) {
                T component = arr[i];
                if (!condition.test(component)) {
                    arr[i] = null;
                }
            }
        }
    }

    public static class OddFilterPredicate implements Predicate<Integer> {
        @Override
        public boolean test(Integer it) {
            return it % 2 != 0;
        }
    }

    public static class RunnableImplemention implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello from the runnable");
        }

    }
}
