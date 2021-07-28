package com.sap.training;

import java.util.ArrayList;
import java.util.List;

public class ReifiableTest {

    public static void main(String[] args) {
        Object[] arr = new String[2];

        arr[0] = 2;

        List<String> t = new ArrayList<>();
        String bla = (String) t.get(1);
        
        List x = t;
        x.add(2);
    }

}