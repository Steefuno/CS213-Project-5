package com.example.museums;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

import java.io.File;
import java.nio.file.FileSystem;

/**
 * This class represents Museum object that stores the selected museum info for the second page
 * @author Steven Nguyen, Julian Romero
 */
@SuppressWarnings("SpellCheckingInspection")
public class Museum {
    /*
    Instance Variables
     */

    private final int id;

    /*
    Static Variables
     */

    // Sorted array of museum names
    private static final String[] Names = new String[] {
        "INSERT_MUSEUM_NAME_HERE",
        "B",
        "C",
        "D"
    };

    // Sorted array of museum homepage strings
    private final static String[] HomepageStrings = new String[] {
        "https://www.google.com",
        "https://www.geeksforgeeks.org/",
        "https://developer.android.com",
        "https://stackoverflow.com"
    };

    // Sorted array of museum icons
    private final static int[] Icons = new int[] {
        R.drawable.catlamp,
        R.drawable.catlamp,
        R.drawable.catlamp,
        R.drawable.catlamp
    };

    // Sorted array of museum's prices
    private final static double[][] Prices = new double[][] {
        {
            1.5,
            2,
            1
        },
        {
            1.5,
            2,
            1
        },
        {
            1.5,
            2,
            1
        },
        {
            1.5,
            2,
            1
        }
    };

    /*
     Constructors
     */

    // Constructs a Museum given the name
    protected Museum(String museumName) {
        this.id = getID(museumName);

        return;
    }

    /*
    Methods
     */

    // Gets the name of this museum
    protected String getName() { return Names[this.id]; }

    // Gets the homepageUri
    protected Uri getHomepageUri() {
        String string = HomepageStrings[this.id];
        Uri uri = Uri.parse(string);
        return uri;
    }

    // Gets the Drawable of this museum's icon
    protected int getIcon() { return Icons[this.id]; }

    // Gets the student price for this museum
    protected double getPriceStudent() {
        return Prices[this.id][0];
    }

    // Gets the adult price for this museum
    protected double getPriceAdult() {
        return Prices[this.id][1];
    }

    // Gets the senior price for this museum
    protected double getPriceSenior() {
        return Prices[this.id][2];
    }

    /*
    Helper Functions
     */

    // Gets the museum ID from this museum's name
    private int getID(String museumName) {
        for (int i = 0; i < Names.length; i++) {
            if (Names[i].equals(museumName))
                return i;
        }

        return -1;
    }
}
