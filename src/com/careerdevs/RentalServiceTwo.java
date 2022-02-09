package com.careerdevs;

import com.careerdevs.UI;

import java.util.ArrayList;
import java.util.List;

public class RentalServiceTwo {

    private static ArrayList<Car> carStorage;


    public static void main(String[] args) {

        initializeCarStorage();

        System.out.println("Welcome to Java Car Rentals!");
        mainMenu();
        }






    private static void mainMenu () {
        System.out.println("Would you like to...");
        System.out.println("1) Rental ");
        System.out.println("2) Return ");
        System.out.println("3) Exit ");

        int x = 0;
        for (int i = 0; i < carStorage.size(); i++) {
            if(!carStorage.get(i).isRented()){
                x++;
            }
        }

        int userSelection = UI.readInt("Enter a number:  ", 1, 3);

        if(userSelection == 1 && x == 0) {
            System.out.println("There are no cars available");
            mainMenu();

        } else if (userSelection == 2 && carStorage.size() - x == 0) {
            System.out.println("You haven't rented any cars. Please try again ");
            mainMenu();

        } else if ( userSelection == 1) {
            rentalMenu();

        } else if (userSelection == 2) {
            option2();

        } else if (userSelection == 3) {
            System.out.println("Thank you for using Java Car Rentals! Have nice day!");

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

        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println(i+1 +") " + availableCars.get(i).getName());
        }

        // read user input
        int userSelection = UI.readInt("Enter a number to select the car you'd like to rent", 1, availableCars.size());
            if (userSelection == 0) {
            mainMenu();
        } else {

                System.out.println("Thank you, you are now renting the " + availableCars.get(userSelection - 1).getName());

                availableCars.get(userSelection - 1).setRented(true);


                System.out.println("Bringing you back to the main menu… ");

                mainMenu();
            }




    }

    private static void option2 () {

        System.out.println("\nRented Cars\n");


        ArrayList<Car> availableCars = new ArrayList<>();
        for (int i = 0; i < carStorage.size(); i++) {
            if (carStorage.get(i).isRented()) {
                availableCars.add(carStorage.get(i));
            }
        }
        //display available cars
//        System.out.println(availableCars);
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println(i+1 +") " + availableCars.get(i).getName());
        }

        // read user input
        int userSelection = UI.readInt("Enter a number to select the car you'd like to return", 1, availableCars.size());

        System.out.println("Thank you, you have returned the " + availableCars.get(userSelection-1).getName());

        availableCars.get(userSelection-1).setRented(false);

        System.out.println("Bringing you back to the main menu… ");

        mainMenu();

        //adding a counter that checks everytime it prints out


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




