package com.example;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rolling", 365);
        Book b2 = new Book("Bibel","Gott",1002);
        Book b3 = new Book();
        Bookshelf shelf = new Bookshelf(5);

       //System.out.println(b1.hasMorePagesThan(b2));
    
        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);
        shelf.removeBook("Harry Potter");
        shelf.showAllBooks();
    }

}