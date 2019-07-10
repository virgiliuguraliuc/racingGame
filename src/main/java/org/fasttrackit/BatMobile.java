package org.fasttrackit;

public class BatMobile extends Vehicle {
//citeste despre co-variant return type
    @Override
    public double accelerate(double speed, double durationInHours) {
// ^^ semnatura metodei , accesul poate fi public sau mai mare daca a fost declarat public la inceput
        System.out.println(getName() + " is accelering with " + speed + " km/h for " + durationInHours + "h." );

        //calculam distanta parcursa
        double distance = speed * durationInHours * 2;
        System.out.println(" Traveled " + distance + " km. Batman ");



       setTraveledDistance(getTraveledDistance()+distance);
        // ce printeaza in consola numim logs
        System.out.println( " Total travel distance: " + getTraveledDistance() + " km ");




        return distance;
    }


}
