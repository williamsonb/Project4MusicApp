package com.google;

public class TrumpetPlayer extends Musician{
    String trumpetType;

    public TrumpetPlayer(String name, String country, String style, String timePeriod, String trumpetType) {
        super(name, country, style, timePeriod);
        this.trumpetType = trumpetType;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Trumpet Type: " + this.trumpetType);
    }
}
