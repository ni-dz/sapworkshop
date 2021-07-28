package com.sap.training;

public class RawPair {

    private Object first;
    private Object second;

    public RawPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }


    public static class Test {
        public static void main(String[] args) {
            var pair = new RawPair("", 1);

            ((String) pair.getFirst()).length();
        }
    }
    
}
