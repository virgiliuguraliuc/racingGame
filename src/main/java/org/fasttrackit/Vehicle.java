package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

   //variabila de clasa
   private static int totalCount;
//   static int count = 0;
//    Vehicle () {
//     totalCount++;
//     count = count +1;

    //asa se numara cand se creeaza cate o clasa noua
    public Vehicle() {
        totalCount++;
    }



    //variabile de instanta

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;
    private LocalDate createdDate;


//metode//

//ctrl+alt+o optimise imports
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
//overloading metoda accelerate prin faptul ca putem sa punem un singur parametru
    public double accelerate (double speed){
       return accelerate(speed, 1);
    }
    //Methot signiture must be the same except:
    // 1.co-variant return type
    // 2.overriding method can allow larger acces than the overidden method
    // 3.
    //co-variant return type (e in examen) returned object must inherit what the ovveriden methot was returning
    @Override
   public  Vehicle clone() throws CloneNotSupportedException {
        return new Vehicle();
    }

    //getteri

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;


    }
    public static int getTotalCount() {
        return totalCount;
    }

//setteri

    public void setName(String name) {
        this.name = name.trim();
        //.trim() la nume taie spatiile de la inceput si la sfarsit
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }






   private static void setTotalCount(int totalCount) {
        Vehicle.totalCount = totalCount;
    }

    //suprascriem functionalitatea metodei toString din clasa Object

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", running=" + running +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                ", createdDate=" + createdDate +
                '}';
    }
}


