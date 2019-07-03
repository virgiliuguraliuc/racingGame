package org.fasttrackit;

public class Game {
    private Vehicle competitor1;
    private Vehicle Competitor2;

    private Track[] tracks = new Track[3];


    public void start() {
        //aici ne punem toata logica jocului
        initialiseTracks();
        displayTracks();


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
