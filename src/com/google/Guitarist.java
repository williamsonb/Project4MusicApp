package com.google;

public class Guitarist extends Musician{
    int numStrings;

    public Guitarist(String name, String country, String style, String timePeriod, int numStrings) {
        super(name, country, style, timePeriod); //calls the constructor on the super class
        this.numStrings = numStrings;
    }


    @Override
    public void show(){
       super.show();
        System.out.println("Num Strings " + this.numStrings);
    }
}
