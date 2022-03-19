package com.google;

import java.util.LinkedList;
import java.util.List;

public class MyPlaylist {

    public static void main(String[] args) {
        Musician arethaFranklin = new Vocalist("Aretha Franklin", "USA",
                "R&B Soul", "1960s - 2000s",
                "Billie Holiday");
        Song think = new Song("Think", arethaFranklin,
                "Jams", "https://youtu.be/HqYnevHibaI");

        Musician jillScott = new Vocalist("Jill Scott", "USA",
                "R&B Soul", "2000s - present",
                "Erykah Badu");
        Song soInLove = new Song("So In Love", jillScott,
                "Jams", "https://youtu.be/V1OC_XmeIck");

        Musician milesDavis = new TrumpetPlayer("Miles Davis", "USA",
                "Jazz", "1940s - 1990s",
                "B Flat");
        Song soWhat = new Song("So What", milesDavis,
                "Jams", "https://youtu.be/zqNTltOGh5c");

        Musician louisArmstrong = new TrumpetPlayer("Louis Armstrong", "USA",
                "Jazz", "1910s - 1970s",
                "B Flat");
        Song hotterThanThat = new Song("Hotter Than That", louisArmstrong,
                "Jams", "https://youtu.be/tAlrpx40UnE");

        Musician carlosSantana = new Guitarist("Carlos Santana", "USA",
                "Latin Rock", "1960s - present",
                6);
        Song smooth = new Song("Smooth", carlosSantana,
                "Jams", "https://youtu.be/6Whgn_iE5uc");

        Musician prince = new Guitarist("Prince", "USA",
                "Funk Rock", "1960s - present",
                6);
        Song purpleRain = new Song("Purple Rain", prince,
                "Jams", "https://youtu.be/TvnYmWpD_T8");


        List<Song> jams = new LinkedList<>();
        jams.add(think);
        jams.add(soInLove);
        jams.add(soWhat);
        jams.add(hotterThanThat);
        jams.add(smooth);
        jams.add(purpleRain);

        for (Song i : jams) {

            i.show();
            System.out.println();

        }

    }
}
