package com.example.ufhbooksmarket;
import java.util.ArrayList;

public class Book_Database {
    private static Book_Database instance;
    private ArrayList<Book> books;

    private Book_Database() {
        books = new ArrayList<>();
    }

    public static Book_Database getInstance() {
        if (instance == null) {
            instance = new Book_Database();
        }
        return instance;
    }

    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle()) && b.getSeller().equalsIgnoreCase(book.getSeller())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public ArrayList<Book> search(String keyword) {
    ArrayList<Book> results = new ArrayList<>();
    for (Book b : books) {
        if (b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                b.getSeller().toLowerCase().contains(keyword.toLowerCase())) {
            results.add(b);
        }
    }
    return results;
}

}
