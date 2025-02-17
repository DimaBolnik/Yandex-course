package ru.dev.bolnik.sprint1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
//        byte a = 10;
//        byte b = 20;
//        System.out.println(findMax(a, b));
//        int count = 8;
//        for (int i = 0; i < 7; i++) {
//            System.out.println(--count);
//        }

        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        Set<String> strings = map.keySet();
        for (String str : map.values()) {
            System.out.println(str);
        }
        System.out.println(map);
    }

    private static byte findMax(byte a, byte b) {
        return (byte) Integer.max(a, b);
    }
}
