package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

//        Map<String, Integer> students = new HashMap<>();  // more read about
//        students.put("ion popescu ", 20);
//        students.put("adela danilescu", 21);
//        System.out.println(students);
//
//        System.out.println(students.get("ion popescu "));

      Game game = new Game();
      game.start();

//        //string pool --read about
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println( a == b);
//        System.out.println( a == c);            // compar doar identitatea obiectelor / compara referintele aceluaiasi obiect
//        System.out.println(a.equals(c)); // asa verific daca obiectele desii diferite au proprietati identice
//
//        System.out.println("---------------");
//
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.setName("dacia");
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.setName(("dacia"));
//
//        System.out.println(vehicle1 == vehicle2);
//        System.out.println(vehicle1.equals(vehicle2)); //am override de equals in clasa vehicle
//



//      //variabila de stocare a referintei obiectului Car
//        //model de la securitate cu geamuri negre si faruri stinse :P
//
//        //am dat motorul inainte de declararea masinii pentru ca noile obiecte car sa primesca motoare
//
//        Engine engine = new Engine();
//        engine.capacity = 100;
//        engine.manufacturer = "Motor Moscova";
//
//       //Car car = new Car(new engine())  - dar asa capacity si manufacturer = 0 si null ca default
//
//        Car car = new Car(engine);
//        car.setName("Dacia");
//        car.setColor("black");
//        car.doorCount = 4;
//        car.setMileage(10);
//        car.setFuelLevel(50);
//        car.setRunning(true);
//
//
//
//
//        Car car2 = new Car(new Engine());
//        car2.setName("Lada");
//        car2.setColor("white");
//        car2.doorCount = 4;
//        car2.setMileage(12);
//        car2.setFuelLevel(60);
//        car2.setRunning(false);
//
//
//        Car car3 = car;
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println("Changing values...");
//
//        car.setName("Dacia Logan");
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println(car.getMaxSpeed());
//        System.out.println(car.engine);
//        System.out.println(car2.getName());
//        System.out.println("Gloriuous car engine produced by:" +" "+ car2.engine.manufacturer);
//       // System.out.println(engine1.manufacturer);
//      //  System.out.println(car2.name +" "+ car2.engine.manufacturer);
//        //helooo
//
//    double distance = car.accelerate(60, 0.5);
//        distance = car.accelerate(60, 0.5);
//        System.out.println(" Distance in App.main " + distance);
//
//        //demo for class variables
////        car.totalCount = 1;
////        System.out.println("total count from car " + car.totalCount);
////        car2.totalCount =2;
////        System.out.println("total count from car after setting car2 " + car.totalCount);
////        System.out.println("total count from car2 " + car2.totalCount);
////        System.out.println("Total count from Vehicle class: " + Vehicle.totalCount);
//////variabile statice gen totalCount ar trebui schimbate doar de pe clasa ca mai sus la Vehicle.totalCount ^^
//
//
//
//        System.out.println( " **total car numbers: " + Vehicle.getTotalCount());
//
//        //acceleram cu method overloading (method overloading se poate folosi ca backwards compatibility)
//        car2.accelerate(20);
//        car2.accelerate(800);
//        new AutoVehicle();
//
//
//
//        new Car();
//
//
//        System.out.println(" Today ....26.06");
//        System.out.println(car);
//
//        BatMobile batMobile = new BatMobile();
//            batMobile.setName(" BatMan ");
////acceleram cu metoda de acelerare suprascrisa (override)
//        batMobile.accelerate(60,1);
//        batMobile.accelerate(60);
//        car.accelerate(60,1);
//
//
//
//
//
//
//        //Polymorfism : atata timp cat este relatia de is-a
//        //method implementation invoked from objects;s class, not from the class of the variable
////        System.out.println(" polimorfism vehicle = new bat mobile");
////       Vehicle mobile = new BatMobile();
////        mobile.accelerate(30.1);
////      //  variable type what mathods we can invoke for the stored object
////        Vehicle testCar = new Car();
////
////      //  testCar.getDoorCount() ;  ---nu merge pentru ca Vechicle nu are metoda  ----READ ON IT REEE!
////        // fortam sa ne mearga: TYPECASTING
////        ( (Car) testCar).getDoorCount() ;
////
////        //^^asta am facut practic mai sus
////        //Car castedCar = (Car) testCar;
////        // castedCar.getDoorCount();






    }



}
