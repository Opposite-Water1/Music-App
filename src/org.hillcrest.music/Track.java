package org.hillcrest.music;

import java.util.Scanner;

public class Track {
    private String title;
    private String artist;
    private double duration;

    public Track(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public Track(Scanner in) {
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public double getDuration(){
        return duration;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                " | Artist: " + artist +
                " | Duration: " + duration;
    }
}
