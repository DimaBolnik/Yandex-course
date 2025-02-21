package ru.dev.bolnik.sprint1;

import java.io.IOException;
import java.nio.file.Files;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
//        byte a = 10;
//        byte b = 20;
//        System.out.println(findMax(a, b));
//        int count = 8;
//        for (int i = 0; i < 7; i++) {
//            System.out.println(--count);
//        }

//        HashMap<String, String> map = new HashMap<>();
//        map.put("key1", "value1");
//        map.put("key2", "value2");
//        map.put("key3", "value3");
//        Set<String> strings = map.keySet();
//        for (String str : map.values()) {
//            System.out.println(str);
//        }
//        System.out.println(map);
//        String[] str = new String[]{};
//        FileWriter fw = new FileWriter("file1.txt",true);
//        fw.write("Hello World\n");
//        fw.write("Dima");
//        fw.close();
//        FileReader reader = new FileReader("file1.txt");
//        BufferedReader br = new BufferedReader(reader);
//        String line = null;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        br.close();

//        Instant instant = Instant.now();
//        System.out.println(instant);
//        Instant instant1 = instant.plusSeconds(10);
//        System.out.println(instant1);
//        String in = "20 часов, 12 минут, а день = 14 и год = 2025, месяц 01";
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH часов, mm минут, а день = dd и год = yyyy, месяц MM");
//        LocalDateTime ldt = LocalDateTime.parse(in, dtf);
//        System.out.println(ldt);
//        LocalTime loc = LocalTime.now();
        LocalDate localDateTime = LocalDate.now();
        LocalDate birthDay = LocalDate.of(1988, Month.JANUARY,14);
        Period period = Period.between(birthDay, localDateTime);
        System.out.println("Мой возраст  = " + period.getYears() + " лет " + period.getMonths() + " месяцев " +
                            period.getDays() + " дней");


    }
    private static byte findMax(byte a, byte b) {
        return (byte) Integer.max(a, b);
    }

    private static int findNumber(int[] arr, int n) {
        int min = 0;
        int max = arr.length -1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] > n) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
