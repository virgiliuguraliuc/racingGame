package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class Game {

    DecimalFormat df2 = new DecimalFormat("#.##");
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    //citeste despre Map se cere la interview-uri tehnice!!!

    public void start() {
        //aici ne punem toata logica jocului
        initialiseTracks();
        displayTracks();
        int competitorCount = getCompetitorCountFromUser(); //adaugam  cati competitori vrem
        for (int i = 0; i < competitorCount; i++) {
            addCompetitor();
        }

        displayCompetitors();


    }

    private String getVehicleNameFromUser() {
        System.out.println(" Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    private int getCompetitorCountFromUser() {
        System.out.println(" Please enter Competitor count: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
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


}
