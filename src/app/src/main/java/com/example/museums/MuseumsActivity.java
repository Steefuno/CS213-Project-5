package com.example.museumapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
/**
 * This class represents the launch page of the Museums app
 * @author Steven Nguyen, Julian Romero
 */
public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState.equals("Metropolitan Museum of Art")){
            Intent intent = new Intent(this, MuseumInfoActivity.class);
            intent.putExtra("Metropolitan Museum of Art", "Metropolitan Museum of Art");
            startActivity(intent);
        }
        else if(savedInstanceState.equals("Guggenheim Museum")){
            Intent intent1 = new Intent(this, MuseumInfoActivity.class);
            intent1.putExtra("Guggenheim Museum", "Guggenheim Museum");
            startActivity(intent1);
        }
        else if(savedInstanceState.equals("American Museum of Natural History")){
            Intent intent2 = new Intent(this, MuseumInfoActivity.class);
            intent2.putExtra("American Museum of Natural History", "American Museum of Natural History");
            startActivity(intent2);
        }
        else{
            Intent intent3 = new Intent(this, MuseumInfoActivity.class);
            intent3.putExtra("Museum of Modern Art", "Museum of Modern Art");
            startActivity(intent3);
        }
    }
}
