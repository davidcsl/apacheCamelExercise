package com.in28minutes.microservices.camlmicroservicea.routes.a;

import java.util.Scanner;

/**
 * This is ok
 */

public class Challenge2 {

    /**
     * The main method
     * @param args - an array of String values
     */
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        
        //1st Number
        System.out.println("Please input the 1st number: ");
        try {
            number1 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please insert a valid number!");
            return;
        }
        
        //Second Number
        System.out.println("Please input the 2nd number: ");
        try {
            number2 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please insert a valid number!");
            return;
        }
        
        //Select Operation and execution for final result
        System.out.println("Please select the type of operation ");
        try {
            String operationCode = sc.nextLine();
            switch (operationCode){
                case"+":
                    result=number1+number2;
                    break;
                case"-":
                    result=number1-number2;
                    break;
                case"*":
                    result=number1*number2;
                    break;
                case"/":
                    result=number1/number2;
                    break;
                default:
                    throw new Exception("Please insert a valid operation type");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        
        System.out.println("The final result is: " + result);
        
        
        
    }
}
