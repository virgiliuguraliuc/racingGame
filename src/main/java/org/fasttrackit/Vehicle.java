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


//metode///

//ctrl+alt+o optimise imports
    // daca public void nu trebuie sa dai return, pur si simplu face o chestie si nu returneaza ceva




    public double accelerate (double speed, double durationInHours) {
      if( fuelLevel <= 0 ){
          System.out.println(" You don't have enough fuel to accelerate. " + "Fuel level " + fuelLevel);
          return 0;
      }
      if ( speed > maxSpeed) {
          System.out.println( " Requested speeed is to high. Max speed is: " + maxSpeed);
      }


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (Double.compare(vehicle.mileage, mileage) != 0) return false;
        if (Double.compare(vehicle.maxSpeed, maxSpeed) != 0) return false;
        if (running != vehicle.running) return false;
        if (Double.compare(vehicle.fuelLevel, fuelLevel) != 0) return false;
        if (Double.compare(vehicle.traveledDistance, traveledDistance) != 0) return false;
        if (name != null ? !name.equals(vehicle.name) : vehicle.name != null) return false;
        if (color != null ? !color.equals(vehicle.color) : vehicle.color != null) return false;
        return createdDate != null ? createdDate.equals(vehicle.createdDate) : vehicle.createdDate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(mileage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(maxSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (running ? 1 : 0);
        temp = Double.doubleToLongBits(fuelLevel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(traveledDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}


