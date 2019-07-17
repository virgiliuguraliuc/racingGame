package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class Game {

    DecimalFormat df2 = new DecimalFormat("#.##");
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    //citeste despre Map se cere la interview-uri tehnice!!!

    public void start() throws Exception {
        //aici ne punem toata logica jocului
        initialiseTracks();
        displayTracks();
        getTrackSelectedByUser();

       Track selectedTrack = new Track();

        int competitorCount = getCompetitorCountFromUser(); //adaugam  cati competitori vrem
        for (int i = 0; i < competitorCount; i++) {
            addCompetitor();
        }

        displayCompetitors();
        int competitorsWithoutFuel = 0;

        boolean winnerNotKnown = true;

        while (winnerNotKnown && competitorsWithoutFuel < competitors.size()) {
            for (Vehicle competitor : competitors) {
                competitor.accelerate(getSpeedFromUser());

                if (competitor.getTraveledDistance() >= selectedTrack.getLenght()) {
                    System.out.println(" Congrats! the winner is " + competitor.getName());
                    winnerNotKnown = false;
                    break;
                }

                if (competitor.getFuelLevel() <=0){ }
                    competitorsWithoutFuel++;
            }
        }


    }

    private Track getTrackSelectedByUser () {
        System.out.println("Please enter track number:");
        try {

            Scanner scanner = new Scanner(System.in);
            int trackNumber = scanner.nextInt();

            Track track = tracks[trackNumber - 1];
            System.out.println("selected track: " + track.getName());
            return track;
        }catch ( InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("you entered an invalid track number please try again");


            return getTrackSelectedByUser(); //recursion a method invoking itself
        }

    }


    private String getVehicleNameFromUser() {
        System.out.println(" Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();


    }
//citeste despre checked exceptiot si unchecked exception in java
    //citeste si depre cum exceptiile de runtime nu pot if mai mari decat pe clasa de parinte,
    private int getCompetitorCountFromUser() throws Exception {
        System.out.println(" Please enter Competitor count: ");
        Scanner scanner = new Scanner(System.in);
        try { //citeste despre try catch finaly
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("You entered an invalid value."); //am anuntat eroarea cu alt+enter si am adaugat la semnatura ca sa ii anunt pe ceilalti ca e posibil si tot mergem cu ea afara din joc
        } finally { //finally block is always executed.
            System.out.println("Read input from user");
        }

    }




    private void addCompetitor() {  //metoda de facut masini si adaugat in lista
        Vehicle vehicle = new Vehicle();
        vehicle.setName(getVehicleNameFromUser());
        vehicle.setFuelLevel(60);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(4.5, 20)); // ii cer un numar random intre parametrii astia
        vehicle.setMaxSpeed(200); // ^^ ca sa nu ne afiseze toate zecimalele  research this || https://stackoverflow.com/questions/10959424/show-only-two-digit-after-decimal

        competitors.add(vehicle);

    }


    //crtl+q deschide toolul java doc. care e un fel de man page
    private void displayCompetitors() {
        System.out.println("Todays competitors are:");
        for (int i = 0; i < competitors.size(); i++) {
            if (competitors.get(i) != null) {

                System.out.println(competitors.get(i).getName() + " - mileage: " + df2.format(competitors.get(i).getMileage())); //am formatat sa imi arate doar 2 zecimale
            }

        }

    }




    private void initialiseTracks() {
        Track city = new Track();
        city.setName("Cluj Track");
        city.setLenght(100);

        tracks[0] = city; //intre paranteze patrate specificam pozitia in array

        Track forest = new Track();
        forest.setName("Faget");
        forest.setLenght(20);

        tracks[1] = forest;
    }

    private void displayTracks() {
        System.out.println(" Available Tracks: ");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName());
            }

        }


    }


    private double getSpeedFromUser() {
        System.out.println( "please enter speed");
        Scanner scanner = new Scanner(System.in);
        try {
            return  scanner.nextDouble();
        }catch (InputMismatchException e) {
            System.out.println(" You have entered a invalid value");
        }return getSpeedFromUser();
    }

}
