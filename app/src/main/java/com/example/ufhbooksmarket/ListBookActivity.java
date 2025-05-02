package com.example.ufhbooksmarket;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.app.Activity;
public class ListBookActivity extends Activity {
    private EditText titleInput, sellerInput, copiesInput, priceInput, bankInput;
    private Button submitButton;
    private TextView statusMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_book);



        submitButton.setOnClickListener(view -> {
            try {
                String title = titleInput.getText().toString();
                String seller = sellerInput.getText().toString();
                int copies = Integer.parseInt(copiesInput.getText().toString());
                double price = Double.parseDouble(priceInput.getText().toString());
                String bank = bankInput.getText().toString();

                Book newBook = new Book(title, seller, copies, price, bank);
                boolean added = Book_Database.getInstance().addBook(newBook);

                if (added) {
                    statusMessage.setText("Book listed successfully!");
                    clearInputs();
                } else {
                    statusMessage.setText("Duplicate listing not allowed.");
                }
            } catch (Exception e) {
                statusMessage.setText("Error: Invalid input.");
            }
        });
    }

    private void clearInputs() {
        titleInput.setText("");
        sellerInput.setText("");
        copiesInput.setText("");
        priceInput.setText("");
        bankInput.setText("");
    }
}