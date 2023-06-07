package org.example.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class collection_03 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> intarr = new ArrayList<>();
        HashMap<String, Integer> intMap = new HashMap<>();

        for (Integer i : intarr) {
            System.out.println(i);
        }

        for (String key : intMap.keySet()) {
            Integer i = intMap.get(key);
        }
//        intarr.iterator();
    }
}
