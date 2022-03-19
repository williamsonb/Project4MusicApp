package com.google;

abstract public class Musician {
    String name;
    String country;
    String style;
    String timePeriod;

    public Musician(String name, String country, String style, String timePeriod){
        this.name = name;
        this.country = country;
        this.style = style;
        this.timePeriod = timePeriod;
    }
   public void show(){
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("Style: " + this.style);
        System.out.println("Time Period: " + this.timePeriod);
    }


}
