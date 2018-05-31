package com.example.android.quakereport;

import java.util.Date;

/**
 * {@link Earthquake} represents an Earthquake event.
 * It contains a magnutud, location and date of the earthquake.
 */
public class Earthquake {

    /** Default translation for the word */
    private String mMagnitude;

    /** Miwok translation for the word */
    private String mLocation;

    // Drawable resource ID
    private String mDate;

    /**
     * Create a new EarthquakeItem object.
     *
     * @param magnitude is the magnitud of thr earthquake
     *
     * @param location is the location of the earthquake
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Get the magnitude of the earthquake.
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the image resource ID
     */
    public String getDate() {
        return mDate;
    }

    @Override
    public String toString() {
        return "EarthquakeItem{" +
                "mMagnitude=" + mMagnitude +
                ", mLocation='" + mLocation + '\'' +
                ", mDate=" + mDate +
                '}';
    }
}
