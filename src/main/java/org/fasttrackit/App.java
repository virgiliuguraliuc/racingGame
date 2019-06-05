package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //variabila de stocare a referintei obiectului Car
        //model de la securitate cu geamuri negre si faruri stinse :P

        Car car = new Car();
        car.name = "Dacia";
        car.color = "black";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.running = true;

        Engine engine = new Engine();
                engine.capacity = 100;
                engine.manufacturer = "Pitesti";

        Car car2 = new Car();
        car2.name = "Lada";
        car2.color = "white";
        car2.doorCount = 4;
        car2.mileage = 12;
        car2.running = false;

        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Dacia Logan";

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxSpeed);
        System.out.println(car.engine);
        System.out.println(engine.manufacturer);

    }




}
