package com.google;

public class Song {
    String title;
    Musician musician;
    String playlist;
    String yURL;

    public Song(String title, Musician musician, String playlist, String yURL) {
        this.title = title;
        this.musician = musician;
        this.playlist = playlist;
        this.yURL = yURL;
    }

    public void show() {
        System.out.println("Title: " + title);
        musician.show();
        System.out.println("Playlist: " + playlist);
        System.out.println("Youtube URL: " + yURL);
    }
}
