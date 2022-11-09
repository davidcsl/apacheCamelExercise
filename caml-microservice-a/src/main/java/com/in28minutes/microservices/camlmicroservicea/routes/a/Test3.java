package com.in28minutes.microservices.camlmicroservicea.routes.a;

import java.util.*;

public class Test3 {

    public static void main(String[] args) {
        int [] a = new int[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        int[] b = new int[18];
        System.arraycopy(a, 2, b, 0,3);

        for (int valueA: a){
            System.out.println("Array A Value: " + valueA);
        }

        for (int value: b) {
            System.out.println("Array b is: " + value);
        }

        List<String> c = new ArrayList<>();

        c.add("David");
        c.add("Sean");
        c.add("Berry");
        c.add("Lich");

        System.out.println(c);

        c.remove(3);

        System.out.println(c);

        String d = c.get(2);
        System.out.println(d);
        System.out.println(c.indexOf("Sean"));

        Map<String, String> firstMap = new HashMap<>();

        firstMap.put("Neutral", "Roshan");
        firstMap.put("Sentinel", "Sniper");
        firstMap.put("Scourge", "SkeletonKing");

        System.out.println(firstMap);

        System.out.println(firstMap.get("Sentinel"));

        firstMap.remove("Neutral");

        System.out.println("The latest firstMap is: " + firstMap);

        Test3 test3 = new Test3();
        c.stream().map(f->Integer.toString(f.length())).map(Double::parseDouble).forEach(false?System.out::println: System.out::println);

        Set<String> sets = firstMap.keySet();

        for( String set : sets){
            System.out.println("The set is: " + set + " and the value is: " + firstMap.get(set));
        }
    }

    public boolean check(double value){
        return (value>4)?true:false;
    }
}
