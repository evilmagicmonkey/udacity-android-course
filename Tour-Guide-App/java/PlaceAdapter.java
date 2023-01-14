package com.example.android.bowerstonetourguide;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mPlacesResourceID;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int placesResourceID) {
        super(context, 0, places);
        mPlacesResourceID = placesResourceID; }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_place, parent, false);
        }
        Place currentPlace = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getPlaceName());

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getPlaceAddress());

        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentPlace.getPlaceDescription());


        return listItemView;

    }









}
