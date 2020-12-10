package com.example.museums;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        setContentView(R.layout.museums);
    }

    public void goToMet(View view) {
        Intent intent = new Intent(this, MuseumInfoActivity.class);
        intent.putExtra(museumInfoActivityParameterName, "met");
        startActivity(intent);
    }
    public void goToGug(View view) {
        Intent intent1 = new Intent(this, MuseumInfoActivity.class);
        intent1.putExtra(museumInfoActivityParameterName, "guggenheim");
        startActivity(intent1);
    }
    public void goToNatural(View view) {
        Intent intent2 = new Intent(this, MuseumInfoActivity.class);
        intent2.putExtra(museumInfoActivityParameterName, "natural");
        startActivity(intent2);
    }
    public void goToModern(View view) {
        Intent intent3 = new Intent(this, MuseumInfoActivity.class);
        intent3.putExtra(museumInfoActivityParameterName, "modern");
        startActivity(intent3);
    }

}
