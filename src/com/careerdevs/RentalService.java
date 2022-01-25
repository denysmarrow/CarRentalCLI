package com.careerdevs;

import java.util.Scanner;

public class RentalService {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Car Rental CLI");

        //traditional / standard array
        Car[] carStorage = new Car[3];

        //create obj instances
        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Cruze");
        Car car3 = new Car("Toyota", "Corolla");

        //print car1 make
       // System.out.println(car1.getMake());

        //store obj instances in list/arr
        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        //Problem: how do we list just Rented/Available cars?

        car2.setRented(true);

        //solution (std arr) : iterate through the array, only display cars where isRented is false
        System.out.println("Available Cars:");

        int listNumber = 1;
        for (int i = 0; i < carStorage.length; i++) {

            if( !carStorage[i].isRented()) {
                System.out.println("(" + listNumber + ") " + carStorage[i].getName() );
                listNumber++;
            }
        }

        //output goal


    }
}
