package com.careerdevs;

import com.careerdevs.UI;

import java.util.ArrayList;
import java.util.List;

public class RentalServiceTwo {

    private static ArrayList<Car> carStorage;

    public static void main(String[] args) {
//        int testInt = UI.readInt("Enter a num",1, 10);
//        System.out.println(testInt);
        initializeCarStorage();
//        carStorage.get(0).isRented(); //FOR TESTING
        rentalMenu();
        while(true){

            rentalMenu();
        }




    }


    private static void rentalMenu () {
        System.out.println("\nAvailable Cars\n");


        ArrayList<Car> availableCars = new ArrayList<>();
        for (int i = 0; i < carStorage.size(); i++) {
            if (!carStorage.get(i).isRented()) {
                availableCars.add(carStorage.get(i));
            }
        }
        //display available cars
        System.out.println(availableCars);
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println(i+1 +") " + availableCars.get(i).getName());
        }

        // read user input
        int userSelection = UI.readInt("Enter a number to select the car you'd like to rent", 1, availableCars.size());

        System.out.println(availableCars.get(userSelection-1).getName());

        availableCars.get(userSelection-1).setRented(true);


    }

    private static void initializeCarStorage () {
        carStorage = new ArrayList<>();

        Car car1 = new Car("Honda", "Accord",  false);
        Car car2 = new Car("Chevy", "Cruze",  false);
        Car car3 = new Car("Toyota", "Corolla",false);
        Car car4 = new Car("Volkswagen", "Bus",false);
        Car car5 = new Car("Chevy", "Camaro",false);



        carStorage.addAll(List.of(car1, car2,car3, car4, car5));

    }

}




