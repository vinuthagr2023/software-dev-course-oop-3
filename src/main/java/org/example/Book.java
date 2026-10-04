package org.example;

public class Book extends LibraryItem{

    protected int pageCount;

    public Book(String tittle, String author, int year, int pageCount){
        super(tittle, author, year);
        this.pageCount =pageCount ;
    }

    public int getPageCount(){
        return pageCount;
    }

    public String toString(){
        return "Book: " + getTitle() + " by " + getAuthor() + " (" + year +") - " + pageCount + " pages";
    }

    public void readBook(){
        System.out.println("Reading " + getTitle() +" by " + getAuthor() + "..." + "\n" +"Done!");
    }

}
