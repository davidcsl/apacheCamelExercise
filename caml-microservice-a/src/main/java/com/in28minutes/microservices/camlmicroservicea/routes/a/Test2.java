package com.in28minutes.microservices.camlmicroservicea.routes.a;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test2 {

    public Integer num1 = 1;
    public Integer num2 = 2;

    public static void main(String[] args) {

        String[] stringArr = {"1","2","3","4","5","6","7","8","9","10"};
        String[] stringArr2 = {"1","2","3","4","5","6","7","8","9","10"};

        Test2 instance1 = new Test2();
        Test2 instance2 = instance1;

        instance1.num1 = 2;
        System.out.println("instance2 num1 value is: "+instance2.num1);

        int numnum1 = 1;
        int numnum2 = numnum1;

        numnum1 = 3;
        System.out.println("The numnum2 is: " + numnum2);


        int counter = 0;
        while (counter < stringArr.length){
            System.out.println(stringArr[counter]);
            counter++;
        }

        testMethod(stringArr[0],stringArr[1],stringArr[2],stringArr[4],stringArr[6]);

    }

    public static String testMethod(String...values){
        int result = 0;
        for(String value : values){
            int ab = Integer.parseInt(value);
            result+= ab;
        }
        System.out.println("Your result is: " + result);
        return "done";
    }
}
