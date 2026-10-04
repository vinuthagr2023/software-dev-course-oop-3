package org.example;

public class Album extends LibraryItem{

    protected int trackCount;

    public Album(String tittle,String author, int year, int trackCount){
        super(tittle,author,year);
        this.trackCount =trackCount;
    }

    public int getTrackCount(){
        return trackCount;
    }

    public String toString(){
        return "Album: " + getTitle() +" by " + getAuthor() + " (" + getYear() + ") - " + getTrackCount()+ " tracks";
    }

}
