package com.example.museums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MuseumInfoActivity extends AppCompatActivity {
    private Intent thisIntent;
    private TextView museum_name_textView;
    private ImageView museum_icon_imageView;
    private EditText nTickets_students;
    private EditText nTickets_adults;
    private EditText nTickets_seniors;
    private TextView price_textView_students;
    private TextView price_textView_adults;
    private TextView price_textView_seniors;
    private Button calculate_button;

    // Setup activity on created from MuseumsActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museum_info);

        // Setup the instance variables
        referenceAllViews();

        // Get the inputted museum name and load the data for the select museum
        String museumName = thisIntent.getStringExtra(thisIntent.EXTRA_TEXT);
        loadMuseumData(museumName);

        // Display the toast
        displayTicketsLimit();
    }

    // Reference all necessary views by id
    private void referenceAllViews() {
        thisIntent = getIntent();
        museum_name_textView = findViewById(R.id.museum_name_textView);
        museum_icon_imageView = findViewById(R.id.museum_icon_imageView);
        nTickets_students = findViewById(R.id.nTickets_students);
        nTickets_adults = findViewById(R.id.nTickets_adults);
        nTickets_seniors = findViewById(R.id.nTickets_seniors);
        calculate_button = findViewById(R.id.calculate_button);
        price_textView_students = findViewById(R.id.price_textView_students);
        price_textView_adults = findViewById(R.id.price_textView_adults);
        price_textView_seniors = findViewById(R.id.price_textView_seniors);
    }

    // Display the toast for limit on tickets
    private void displayTicketsLimit() {
        Context context = getApplicationContext();
        CharSequence text = "@string/museum_info_toast_text";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    // Given the museum name, load the name, icon, and prices
    private void loadMuseumData(String museumName) {
        museum_name_textView.setText(museumName);
        //TODO display museum icon
    }
}