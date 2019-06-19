package org.fasttrackit;

import java.time.LocalDate;

// inheritance or "is -a" relationship
public class Car extends AutoVehicle{

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    public Car() {
       // this(new Engine()); asa sau
        //any constractor will try and call the "no-parameter" constrctor of the parent class
    }

    // "has-a" relationship



}
