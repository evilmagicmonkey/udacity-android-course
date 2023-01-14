package com.example.android.bowerstonetourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LandmarkAdapter extends ArrayAdapter<Landmark> {

    private int mLandmarkResourceID;

    public LandmarkAdapter(Activity context, ArrayList<Landmark> places, int landmarkResourceID) {
        super(context, 0, places);
        mLandmarkResourceID = landmarkResourceID; }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_landmarks, parent, false);
        }
        Landmark currentLandmark = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.landmark_name);
        nameTextView.setText(currentLandmark.getLandmarkName());

        TextView descriptionTextView = listItemView.findViewById(R.id.landmark_description);
        descriptionTextView.setText(currentLandmark.getLandmarkDescription());


        ImageView imageView = listItemView.findViewById(R.id.landmark_image);
        imageView.setImageResource(currentLandmark.getImageResourceID());

        return listItemView;


    }
}
