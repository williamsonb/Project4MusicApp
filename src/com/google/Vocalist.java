package com.google;

public class Vocalist extends Musician{
    String influencedBy;

    public Vocalist(String name, String country, String style, String timePeriod, String influencedBy) {
        super(name, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Influenced by: " + this.influencedBy);
    }
}
`