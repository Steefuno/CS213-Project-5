package com.example.museums;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.museums); //temp to test MuseumInfoActivity - enable this and remove below later

        Intent intent = new Intent(this, MuseumInfoActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, "INSERT_MUSEUM_NAME_HERE");
        startActivity(intent);
    }
}