package com.example.android.bowerstonetourguide;

public class Landmark {


    private String mLandmarkName;

    private String mLandmarkDescription;

    private int mImageResourceID;

    public Landmark (String landmarkName, String landmarkDescription, int imageResourceID) {
        mLandmarkName = landmarkName;
        mLandmarkDescription = landmarkDescription;
        mImageResourceID = imageResourceID;
    }

    public String getLandmarkName() {
        return mLandmarkName;
    }

    public String getLandmarkDescription() {
        return mLandmarkDescription;
    }

    public int getImageResourceID() {return mImageResourceID;}





}
