package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    //vom face un constructor care va oblica ca toate autovehiculele sa aiba motor


        // has-a relationship
    Engine engine;

    //vom face un constructor care va oblica ca toate autovehiculele sa aiba motor
    public AutoVehicle(Engine engine){
        this.engine = engine;
    }




}
