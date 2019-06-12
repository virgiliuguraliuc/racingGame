package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {
    String name;
    double mileage;
    String color;
    double maxSpeed;
    boolean running;
    double fuelLevel;
    double traveledDistance;
    LocalDate createdDate;


    // daca public void nu trebuie sa dai return, pur si simplu face o chestie si nu returneaza ceva

    public double accelerate (double speed, double durationInHours) {
        // concatenare a mesajelor
        System.out.println(name + " is accelering with " + speed + " km/h for " + durationInHours + "h." );

        //calculam distanta parcursa
        double distance = speed * durationInHours;
        System.out.println(" Traveled " + distance + " km ");

        //calculam travel distance pana acum
//        traveledDistance = traveledDistance + distance;
        //same result as the above distance

        traveledDistance +=distance;
        // ce printeaza in consola numim logs
        System.out.println( " Total travel distance: " + traveledDistance + " km ");


        //calculam combustibil consumat
        double spentFuel =  distance / 100 * mileage;
//        fuelLevel = fuelLevel - spentFuel;
        //same as above

        fuelLevel -= spentFuel;
        System.out.println(" Spent fuel: " + spentFuel + " l.");
        System.out.println( " Remaining fuel: " + fuelLevel + " l.");


        //        //modulo
        //        System.out.println( 4 % 3);


        return distance;
    }

}
