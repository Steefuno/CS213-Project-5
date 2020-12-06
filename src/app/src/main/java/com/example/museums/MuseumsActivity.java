package com.example.museums;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
/**
 * This class represents the launch page of the Museums app
 * @author Steven Nguyen, Julian Romero
 */
public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.museums); //temp disabled to test MuseumInfoActivity - enable this and remove below later

        Intent intent = new Intent(this, MuseumInfoActivity.class);
        intent.putExtra("museumName", "INSERT_MUSEUM_NAME_HERE");
        startActivity(intent);
    }
}