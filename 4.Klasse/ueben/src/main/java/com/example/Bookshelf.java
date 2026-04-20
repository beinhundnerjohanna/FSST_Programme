package com.example;

public class Bookshelf {
    Book[] b;
    int numberOfBooks;

    // Konstruktor
    Bookshelf(int size) {
        b = new Book[size];
    }

    // Default-Konstruktor
    Bookshelf() {
        this(10);
    }

    // Fügt ein Buch hinzu
    public boolean addBook(Book book) {
        if (numberOfBooks >= b.length)
            return false;
        else {
            b[numberOfBooks] = book;
            numberOfBooks++;
            return true;
        }
    }

    // entfernt ein Buch

    public void removeBook(String title) {

        for (int i = 0; i < b.length; i++) {
            if (b[i].title.equals(title)){
                for(int j = i;j-1<b.length;j++){
                    b[j]=b[j+1];
                }
            }
        }

        
    }

    // Zeigt alle Bücher an
    public void showAllBooks() {

        for (Book book : b) {
           // if (book != null)
                System.out.println(book);
        }
    }

    // Sucht ein Buch anhand seines Titels
    public Book searchBook(String title) {

        for (Book book : b) {
            if (book.title.equals(title))
                return book;
        }

        return null;
    }

    // Gibt die Anzahl der Bücher im Regal zurück
    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    // Gibt die Gesamtanzahl der Seiten aller Bücher aus

    public int getTotalNumberOfPages() {
        int totalNumber = 0;
        for (Book book : b) {
            totalNumber += book.pages;
        }
        return totalNumber;
    }
}
