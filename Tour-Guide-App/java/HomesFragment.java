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
public class HomesFragment extends Fragment {


    public HomesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_homes, container, false);


        final ArrayList<Place> places = new ArrayList<>();



        places.add(new Place(
                getString(R.string.homes_name_1),
                getString(R.string.homes_address_1),
                getString(R.string.homes_description_1)));
        places.add(new Place(
                getString(R.string.homes_name_2),
                getString(R.string.homes_address_2),
                getString(R.string.homes_description_2)));
        places.add(new Place(
                getString(R.string.homes_name_3),
                getString(R.string.homes_address_3),
                getString(R.string.homes_description_3)));
        places.add(new Place(
                getString(R.string.homes_name_4),
                getString(R.string.homes_address_4),
                getString(R.string.homes_description_4)));
        places.add(new Place(
                getString(R.string.homes_name_5),
                getString(R.string.homes_address_5),
                getString(R.string.homes_description_5)));
        places.add(new Place(
                getString(R.string.homes_name_6),
                getString(R.string.homes_address_6),
                getString(R.string.homes_description_6)));
        places.add(new Place(
                getString(R.string.homes_name_7),
                getString(R.string.homes_address_7),
                getString(R.string.homes_description_7)));
        places.add(new Place(
                getString(R.string.homes_name_8),
                getString(R.string.homes_address_8),
                getString(R.string.homes_description_8)));
        places.add(new Place(
                getString(R.string.homes_name_9),
                getString(R.string.homes_address_9),
                getString(R.string.homes_description_9)));
        places.add(new Place(
                getString(R.string.homes_name_10),
                getString(R.string.homes_address_10),
                getString(R.string.homes_description_10)));
        places.add(new Place(
                getString(R.string.homes_name_11),
                getString(R.string.homes_address_11),
                getString(R.string.homes_description_11)));
        places.add(new Place(
                getString(R.string.homes_name_12),
                getString(R.string.homes_address_12),
                getString(R.string.homes_description_12)));
        places.add(new Place(
                getString(R.string.homes_name_13),
                getString(R.string.homes_address_13),
                getString(R.string.homes_description_13)));
        places.add(new Place(
                getString(R.string.homes_name_14),
                getString(R.string.homes_address_14),
                getString(R.string.homes_description_14)));
        places.add(new Place(
                getString(R.string.homes_name_15),
                getString(R.string.homes_address_15),
                getString(R.string.homes_description_15)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.layout.list_item_place);

        ListView listView = rootView.findViewById(R.id.homes_list);

        listView.setAdapter(adapter);

        return rootView;



    }

}
