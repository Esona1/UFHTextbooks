package com.example.ufhbooksmarket;
import java.util.ArrayList;

public class Book_Database {
    private static Book_Database instance;
    private ArrayList<Book> books;

    private Book_Database() {
        books = new ArrayList<>();
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
