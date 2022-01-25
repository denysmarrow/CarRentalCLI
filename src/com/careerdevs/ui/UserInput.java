package com.careerdevs.ui;

import java.util.Scanner;

public class UserInput {
    private static Scanner scan = new Scanner(System.in);

    public static String readString (String question) {
        System.out.print(question+"\nInput: ");
        return scan.nextLine();
    }

    public static int readInt (String question) {
        System.out.println(question+"\nNumber");
        return scan.nextInt();
    }
}
