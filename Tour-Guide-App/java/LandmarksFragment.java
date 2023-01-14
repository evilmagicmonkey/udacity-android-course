package com.example.android.bowerstonetourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_landmarks, container, false);

        final ArrayList<Landmark> landmarks = new ArrayList<>();

        landmarks.add(new Landmark(
                getString(R.string.landmark_name_1),
                getString(R.string.landmark_description_1),
                R.drawable.bower_lake));
        landmarks.add(new Landmark(
                getString(R.string.landmark_name_2),
                getString(R.string.landmark_description_2),
                R.drawable.bridge));
        landmarks.add(new Landmark(
                getString(R.string.landmark_name_3),
                getString(R.string.landmark_description_3),
                R.drawable.castle_fairfax));
        landmarks.add(new Landmark(
                getString(R.string.landmark_name_4),
                getString(R.string.landmark_description_4),
                R.drawable.clock_tower));
        landmarks.add(new Landmark(
                getString(R.string.landmark_name_5),
                getString(R.string.landmark_description_5),
                R.drawable.market));
        landmarks.add(new Landmark(
                getString(R.string.landmark_name_6),
                getString(R.string.landmark_description_6),
                R.drawable.murgo));
        landmarks.add(new Landmark(
                getString(R.string.landmark_name_7),
                getString(R.string.landmark_description_7),
                R.drawable.pig_knight));
        landmarks.add(new Landmark(
                getString(R.string.landmark_name_8),
                getString(R.string.landmark_description_8),
                R.drawable.submarine));






        LandmarkAdapter adapter = new LandmarkAdapter(getActivity(), landmarks, R.layout.list_item_landmarks);

        ListView listView = rootView.findViewById(R.id.landmark_list_view);

        listView.setAdapter(adapter);
        return rootView;
    }

}
