package com.example.android.bowerstonetourguide;

public class Grave {

    private String mGraveyardName;

    private  String mGraveyardDescription;

    public Grave (String graveyardName, String graveyardDescription) {
        mGraveyardName = graveyardName;
        mGraveyardDescription = graveyardDescription;
    }


    public String getGraveyardName(){
        return mGraveyardName;
    }

    public String getGraveyardDescription(){
        return mGraveyardDescription;
    }


}
