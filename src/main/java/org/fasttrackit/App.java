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
        car.mileage = 10;
        car.fuelLevel = 50;
        car.running = true;


        Engine engine1 = new Engine();
                engine1.capacity = 100;
                engine1.manufacturer = "Motor Moscova";



        Car car2 = new Car();
        car2.name = "Lada";
        car2.color = "white";
        car2.doorCount = 4;
        car2.mileage = 12;
        car2.fuelLevel = 60;
        car2.running = false;
        car2.engine = engine1;

        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Dacia Logan";

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxSpeed);
        System.out.println(car.engine);
        System.out.println(car2.name);
        System.out.println("Gloriuous car engine produced by:" +" "+ car2.engine.manufacturer);
       // System.out.println(engine1.manufacturer);
      //  System.out.println(car2.name +" "+ car2.engine.manufacturer);
        //helooo

    double distance = car.accelerate(60, 0.5);
        distance = car.accelerate(60, 0.5);
        System.out.println(" Distance in App.main " + distance);

    }




}
