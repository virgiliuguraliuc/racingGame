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

        //am dat motorul inainte de declararea masinii pentru ca noile obiecte car sa primesca motoare

        Engine engine = new Engine();
        engine.capacity = 100;
        engine.manufacturer = "Motor Moscova";

       //Car car = new Car(new engine())  - dar asa capacity si manufacturer = 0 si null ca default

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("black");
        car.doorCount = 4;
        car.setMileage(10);
        car.setFuelLevel(50);
        car.setRunning(true);




        Car car2 = new Car(new Engine());
        car2.setName("Lada");
        car2.setColor("white");
        car2.doorCount = 4;
        car2.setMileage(12);
        car2.setFuelLevel(60);
        car2.setRunning(false);


        Car car3 = car;

        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println("Changing values...");

        car.setName("Dacia Locan");

        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println(car.getMaxSpeed());
        System.out.println(car.engine);
        System.out.println(car2.getName());
        System.out.println("Gloriuous car engine produced by:" +" "+ car2.engine.manufacturer);
       // System.out.println(engine1.manufacturer);
      //  System.out.println(car2.name +" "+ car2.engine.manufacturer);
        //helooo

    double distance = car.accelerate(60, 0.5);
        distance = car.accelerate(60, 0.5);
        System.out.println(" Distance in App.main " + distance);

        //demo for class variables
//        car.totalCount = 1;
//        System.out.println("total count from car " + car.totalCount);
//        car2.totalCount =2;
//        System.out.println("total count from car after setting car2 " + car.totalCount);
//        System.out.println("total count from car2 " + car2.totalCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalCount);
////variabile statice gen totalCount ar trebui schimbate doar de pe clasa ca mai sus la Vehicle.totalCount ^^



        System.out.println( " **total car numbers: " + Vehicle.getTotalCount());

        //acceleram cu method overloading (method overloading se poate folosi ca backwards compatibility)
        car2.accelerate(20);

        new AutoVehicle();

        //new Car();

        }




}
