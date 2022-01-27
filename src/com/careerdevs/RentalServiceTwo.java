package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalServiceTwo {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Cruze");
        Car car3 = new Car("Toyota", "Corolla");

        ArrayList<Car> availableCars = new ArrayList<>();
        ArrayList<Car> rentedCars = new ArrayList<>();

        availableCars.add(car1);
        availableCars.add(car3);
        availableCars.add(car2);


        System.out.println("Available Cars");

        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println("(" + (i + 1) + ")" + availableCars.get(i).getName());
        }

        System.out.println("Enter a number to select the car you'd like to rent\n Selection:");
        int number = scan.nextInt();
        if (number)

    }
}

