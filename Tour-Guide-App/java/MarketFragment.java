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
public class MarketFragment extends Fragment {


    public MarketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_market, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(
                getString(R.string.market_name_1),
                getString(R.string.market_address_1),
                getString(R.string.market_description_1)));
        places.add(new Place(
                getString(R.string.market_name_2),
                getString(R.string.market_address_2),
                getString(R.string.market_description_2)));
        places.add(new Place(
                getString(R.string.market_name_3),
                getString(R.string.market_address_3),
                getString(R.string.market_description_3)));
        places.add(new Place(
                getString(R.string.market_name_4),
                getString(R.string.market_address_4),
                getString(R.string.market_description_4)));
        places.add(new Place(
                getString(R.string.market_name_5),
                getString(R.string.market_address_5),
                getString(R.string.market_description_5)));
        places.add(new Place(
                getString(R.string.market_name_6),
                getString(R.string.market_address_6),
                getString(R.string.market_description_6)));
        places.add(new Place(
                getString(R.string.market_name_7),
                getString(R.string.market_address_7),
                getString(R.string.market_description_7)));
        places.add(new Place(
                getString(R.string.market_name_8),
                getString(R.string.market_address_8),
                getString(R.string.market_description_8)));
        places.add(new Place(
                getString(R.string.market_name_9),
                getString(R.string.market_address_9),
                getString(R.string.market_description_9)));
        places.add(new Place(
                getString(R.string.market_name_10),
                getString(R.string.market_address_10),
                getString(R.string.market_description_10)));
        places.add(new Place(
                getString(R.string.market_name_11),
                getString(R.string.market_address_11),
                getString(R.string.market_description_11)));
        places.add(new Place(
                getString(R.string.market_name_12),
                getString(R.string.market_address_12),
                getString(R.string.market_description_12)));
        places.add(new Place(
                getString(R.string.market_name_13),
                getString(R.string.market_address_13),
                getString(R.string.market_description_13)));
        places.add(new Place(
                getString(R.string.market_name_14),
                getString(R.string.market_address_14),
                getString(R.string.market_description_14)));
        places.add(new Place(
                getString(R.string.market_name_15),
                getString(R.string.market_address_15),
                getString(R.string.market_description_15)));
        places.add(new Place(
                getString(R.string.market_name_16),
                getString(R.string.market_address_16),
                getString(R.string.market_description_16)));
        places.add(new Place(
                getString(R.string.market_name_17),
                getString(R.string.market_address_17),
                getString(R.string.market_description_17)));
        places.add(new Place(
                getString(R.string.market_name_18),
                getString(R.string.market_address_18),
                getString(R.string.market_description_18)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.layout.list_item_place);

        ListView listView = rootView.findViewById(R.id.market_list);

        listView.setAdapter(adapter);



        return rootView;
    }

}
