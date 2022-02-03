package com.careerdevs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String question, int min, int max) {

        try {


            System.out.println(question);
            System.out.println("Number (" + min + " - " + max + "): ");
            int userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
            System.out.println("Number outside of the valid range, try again");
            return readInt(question, min, max);

        } catch (InputMismatchException exception) {
            System.out.println("Invalid Data Type");
            scanner.nextLine();
            return readInt(question, min, max);


        } catch (Exception exception) {
            System.out.println(exception.getClass());
            scanner.nextLine();
            return readInt(question, min, max);
        }
    }
}
