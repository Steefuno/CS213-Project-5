package com.example.museums;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.museums.MuseumInfoActivity;

/**
 * This class represents the launch page of the Museums app
 * @author Steven Nguyen, Julian Romero
 */
public class MuseumsActivity extends AppCompatActivity {
    private static final String museumInfoActivityParameterName = "museumName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState.equals("Metropolitan Museum of Art")){
            Intent intent = new Intent(this, MuseumInfoActivity.class);
            intent.putExtra(museumInfoActivityParameterName, "Metropolitan Museum of Art");
            startActivity(intent);
        }
        else if(savedInstanceState.equals("Guggenheim Museum")){
            Intent intent1 = new Intent(this, MuseumInfoActivity.class);
            intent1.putExtra(museumInfoActivityParameterName, "Guggenheim Museum");
            startActivity(intent1);
        }
        else if(savedInstanceState.equals("American Museum of Natural History")){
            Intent intent2 = new Intent(this, MuseumInfoActivity.class);
            intent2.putExtra(museumInfoActivityParameterName, "American Museum of Natural History");
            startActivity(intent2);
        }
        else{
            Intent intent3 = new Intent(this, MuseumInfoActivity.class);
            intent3.putExtra(museumInfoActivityParameterName, "Museum of Modern Art");
            startActivity(intent3);
        }
    }
}
