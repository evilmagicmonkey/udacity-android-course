package com.example.android.bowerstonetourguide;

public class Place {

    private String mPlaceName;
    private String mPlaceAddress;
    private  String mPlaceDescription;

    public Place (String placeName, String placeAddress, String placeDescription) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceDescription = placeDescription;
    }


    public String getPlaceName(){
        return mPlaceName;
    }

    public String getPlaceAddress(){return mPlaceAddress;}

    public String getPlaceDescription(){
        return mPlaceDescription;
    }


}
