package org.example;

public class Movie extends LibraryItem{
    protected int durationInMinutes;

    public Movie(String tittle, String author, int year, int durationInMinutes){
        super(tittle, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes(){
        return durationInMinutes;
    }

    public String toString(){
        return "Movie: " + getTitle() + " by " + getAuthor() + " (" + year + ") - " + getDurationInMinutes() +" minutes" ;
    }
}
