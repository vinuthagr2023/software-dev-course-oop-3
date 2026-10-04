package org.example;

public class LibraryItem {
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem(String tittle,String author,int year){
        this.title = tittle;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }


    public String toString(){
        return "Item: "+ getTitle() + " by " + getAuthor() +" (" + getYear() + ")";
    }


}
