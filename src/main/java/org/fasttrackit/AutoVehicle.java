package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    //vom face un constructor care va oblica ca toate autovehiculele sa aiba motor


        // has-a relationship
    Engine engine;

    //vom face un constructor care va oblica ca toate autovehiculele sa aiba motor
    public AutoVehicle(Engine engine){
        this.engine = engine;
    }
//constructor overloading ca sa faca automat un new engine folosind construtoru de mai sus
    public AutoVehicle() {
        this(new Engine());

    }
}
