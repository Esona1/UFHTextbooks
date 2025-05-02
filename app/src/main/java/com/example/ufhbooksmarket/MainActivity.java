package com.example.ufhbooksmarket;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.ArrayList;
import android.app.Activity;


public class MainActivity extends Activity {

    private ListView listView;
    private EditText searchInput;
    private Button searchButton, addButton;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> displayBooks;

    @Override
protected void onCreate(Bundle savedInstanceState){
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);

    listView = findViewById(R.id.bookListView);
    searchInput = findViewById(R.id.searchEditText);
    searchButton = findViewById(R.id.searchButton);
    addButton = findViewById(R.id.addBookButton);


        loadBookList(Book_Database.getInstance().getBooks());

        searchButton.setOnClickListener(view -> {
            String keyword = searchInput.getText().toString();
            ArrayList<Book> result = Book_Database.getInstance().search(keyword);
            loadBookList(result);
        });

        addButton.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), ListBookActivity.class);
            startActivity(intent);
        });
    }
    private void loadBookList(ArrayList<Book> books) {
        displayBooks = new ArrayList<>();
        for (Book b : books) {
            displayBooks.add(b.getTitle() + " - " + b.getSeller() + " - R" + b.getPrice());
        }
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, displayBooks);
        listView.setAdapter(adapter);
    }
}
