package com.careerdevs.classdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    private static Scanner scanner = new Scanner(System.in);
    public static int readInt (String question, int min, int max) {

//        try{
//
//        } catch(InputMismatchException exception) {
//
//
//        }

        System.out.println(question);
        System.out.println("Number (" + min + " - " + max+"): ");
        int userInput = scanner.nextInt();

    }
}
