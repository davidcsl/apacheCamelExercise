package com.in28minutes.microservices.camlmicroservicea.routes.a;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the S Calculator");

        System.out.println("Please input first number: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input second number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("The summation of the selected numbers are: " + (num1 + num2));

    }

}
