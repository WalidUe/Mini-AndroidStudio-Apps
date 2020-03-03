package com.example.android.quakereport;

public class Earthquake {

    //Magnitude of the earthquake
    private double mMagnitude;

    //Location of the earthquake
    private String mLocation;

    //Time of the earthquake
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     *
     * @param mMagnitude is the magnitude(size) of the earthquake
     * @param mLocation is the city location of the earthquake
     * @param mTimeInMilliseconds is the time the earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds, String url)
    {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl=url;
    }

    //return the magnitude of the earthquake
    public double getMagnitude()
    {
        return mMagnitude;
    }

    //return the location of the earthquake
    public String getLocation()
    {
        return mLocation;
    }

    //return the time of the earthquake
    public long getTimeInMilliseconds()
    {
        return mTimeInMilliseconds;
    }

    //Returns the website URL to find more information about the earthquake.
     public String getUrl() { return mUrl; }

}
