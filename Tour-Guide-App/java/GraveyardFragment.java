package com.example.android.bowerstonetourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GraveyardFragment extends Fragment {


    public GraveyardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_graveyard, container, false);

        final ArrayList<Grave> graves = new ArrayList<>();

        graves.add(new Grave(
                getString(R.string.grave_name_1),
                getString(R.string.grave_description_1)));
        graves.add(new Grave(
                getString(R.string.grave_name_2),
                getString(R.string.grave_description_2)));
        graves.add(new Grave(
                getString(R.string.grave_name_3),
                getString(R.string.grave_description_3)));
        graves.add(new Grave(
                getString(R.string.grave_name_4),
                getString(R.string.grave_description_4)));
        graves.add(new Grave(
                getString(R.string.grave_name_5),
                getString(R.string.grave_description_5)));
        graves.add(new Grave(
                getString(R.string.grave_name_6),
                getString(R.string.grave_description_6)));
        graves.add(new Grave(
                getString(R.string.grave_name_7),
                getString(R.string.grave_description_7)));
        graves.add(new Grave(
                getString(R.string.grave_name_8),
                getString(R.string.grave_description_8)));
        graves.add(new Grave(
                getString(R.string.grave_name_9),
                getString(R.string.grave_description_9)));
        graves.add(new Grave(
                getString(R.string.grave_name_10),
                getString(R.string.grave_description_10)));
        graves.add(new Grave(
                getString(R.string.grave_name_11),
                getString(R.string.grave_description_11)));
        graves.add(new Grave(
                getString(R.string.grave_name_12),
                getString(R.string.grave_description_12)));
        graves.add(new Grave(
                getString(R.string.grave_name_13),
                getString(R.string.grave_description_13)));
        graves.add(new Grave(
                getString(R.string.grave_name_14),
                getString(R.string.grave_description_14)));
        graves.add(new Grave(
                getString(R.string.grave_name_15),
                getString(R.string.grave_description_15)));
        graves.add(new Grave(
                getString(R.string.grave_name_16),
                getString(R.string.grave_description_16)));
        graves.add(new Grave(
                getString(R.string.grave_name_17),
                getString(R.string.grave_description_17)));
        graves.add(new Grave(
                getString(R.string.grave_name_18),
                getString(R.string.grave_description_18)));
        graves.add(new Grave(
                getString(R.string.grave_name_19),
                getString(R.string.grave_description_19)));
        graves.add(new Grave(
                getString(R.string.grave_name_20),
                getString(R.string.grave_description_20)));
        graves.add(new Grave(
                getString(R.string.grave_name_21),
                getString(R.string.grave_description_21)));
        graves.add(new Grave(
                getString(R.string.grave_name_22),
                getString(R.string.grave_description_22)));
        graves.add(new Grave(
                getString(R.string.grave_name_23),
                getString(R.string.grave_description_23)));
        graves.add(new Grave(
                getString(R.string.grave_name_24),
                getString(R.string.grave_description_24)));
        graves.add(new Grave(
                getString(R.string.grave_name_25),
                getString(R.string.grave_description_25)));
        graves.add(new Grave(
                getString(R.string.grave_name_26),
                getString(R.string.grave_description_26)));
        graves.add(new Grave(
                getString(R.string.grave_name_27),
                getString(R.string.grave_description_27)));
        graves.add(new Grave(
                getString(R.string.grave_name_28),
                getString(R.string.grave_description_28)));
        graves.add(new Grave(
                getString(R.string.grave_name_29),
                getString(R.string.grave_description_29)));
        graves.add(new Grave(
                getString(R.string.grave_name_30),
                getString(R.string.grave_description_30)));
        graves.add(new Grave(
                getString(R.string.grave_name_31),
                getString(R.string.grave_description_31)));
        graves.add(new Grave(
                getString(R.string.grave_name_32),
                getString(R.string.grave_description_32)));
        graves.add(new Grave(
                getString(R.string.grave_name_33),
                getString(R.string.grave_description_33)));
        graves.add(new Grave(
                getString(R.string.grave_name_34),
                getString(R.string.grave_description_34)));
        graves.add(new Grave(
                getString(R.string.grave_name_35),
                getString(R.string.grave_description_35)));
        graves.add(new Grave(
                getString(R.string.grave_name_36),
                getString(R.string.grave_description_36)));
        graves.add(new Grave(
                getString(R.string.grave_name_37),
                getString(R.string.grave_description_37)));
        graves.add(new Grave(
                getString(R.string.grave_name_38),
                getString(R.string.grave_description_38)));
        graves.add(new Grave(
                getString(R.string.grave_name_39),
                getString(R.string.grave_description_39)));
        graves.add(new Grave(
                getString(R.string.grave_name_40),
                getString(R.string.grave_description_40)));
        graves.add(new Grave(
                getString(R.string.grave_name_41),
                getString(R.string.grave_description_41)));
        graves.add(new Grave(
                getString(R.string.grave_name_42),
                getString(R.string.grave_description_42)));
        graves.add(new Grave(
                getString(R.string.grave_name_43),
                getString(R.string.grave_description_43)));
        graves.add(new Grave(
                getString(R.string.grave_name_44),
                getString(R.string.grave_description_44)));
        graves.add(new Grave(
                getString(R.string.grave_name_45),
                getString(R.string.grave_description_45)));
        graves.add(new Grave(
                getString(R.string.grave_name_46),
                getString(R.string.grave_description_46)));
        graves.add(new Grave(
                getString(R.string.grave_name_47),
                getString(R.string.grave_description_47)));
        graves.add(new Grave(
                getString(R.string.grave_name_48),
                getString(R.string.grave_description_48)));
        graves.add(new Grave(
                getString(R.string.grave_name_49),
                getString(R.string.grave_description_49)));



        GraveAdapter adapter = new GraveAdapter(getActivity(), graves, R.layout.list_item_graveyard);

        ListView listView = rootView.findViewById(R.id.list_graveyard);

        listView.setAdapter(adapter);

        return rootView;


    }

}
