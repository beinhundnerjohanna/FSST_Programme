package com.example;

public class Book {
    String title;
    String author;
    int pages;

    // Konstruktor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Default-Konstruktor
    public Book() {
        this("empty", "nobody", 0);
    }

    public String toString() {
        return "Titel: " + title + " Autor: " + author + " Seitenzahl: " + pages;
    }

    // überprüft ob mehr Seiten hat
    public boolean hasMorePagesThan(Book b) {
        return (this.pages > b.pages);
    }

}
