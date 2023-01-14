package com.example.android.bowerstonetourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GraveAdapter extends ArrayAdapter<Grave> {


    private int mGravesResourceID;

    public GraveAdapter(Activity context, ArrayList<Grave> graves, int gravesResourceID) {
        super(context, 0, graves);
        mGravesResourceID = gravesResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_graveyard, parent, false);
        }
        Grave currentGrave = getItem(position);

        TextView graveNameTextView = listItemView.findViewById(R.id.graveyard_name);
        graveNameTextView.setText(currentGrave.getGraveyardName());
        TextView graveDescriptionTextView = listItemView.findViewById(R.id.graveyard_description);
        graveDescriptionTextView.setText(currentGrave.getGraveyardDescription());

        return listItemView;

    }





}
