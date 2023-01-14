package com.example.android.bowerstonetourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);


        final ArrayList<Landmark> landmarks = new ArrayList<>();

        landmarks.add(new Landmark("Bower Lake",
                "Rumoured to be the location of the old Heroes Guild, Bower Lake is a popular destination for travellers and locals. Located in the middle of Mirfield, Bower Lake is only a short walk away from the Gypsy Camp and is hard to miss on your way to Bowerstone",
                R.drawable.bower_lake));
        landmarks.add(new Landmark("Bower Bridge",
                "Separating the town entrance and popular marketplace, Bower Bridge has become the go to place for social gatherings and traders looking to sell to travellers. There are rumours that Bower Bridge is somehow related to the legendary Gargoyle Trove",
                R.drawable.bridge));
        landmarks.add(new Landmark("Castle Fairfax",
                "Built on top of the former Bowerstone Manor, Castle Fairfax is easily the most spectacular of all Bowerstone landmarks. Civilians are free to roam the stunning gardens surrounding the castle, where you are likely to find locals selling the highest standard products. Although owned by the Fairfax family for generations, a transgender Elton John lookalike has recently been seen sitting upon the throne",
                R.drawable.castle_fairfax));
        landmarks.add(new Landmark("Clock Tower",
                "At the heart of Bowerstone markets sits the clock tower. It is the popular meeting point for shoppers, dates, and even the occasional orgy. The town crier can often be seen staring at the clock face waiting to declare the time to the Square",
                R.drawable.clock_tower));
        landmarks.add(new Landmark("Bowerstone Market",
                "This is the place you go to if you need anything. Well not anything, if you need to purchase something that is likely to be found in a bustling market town then this is the place to be. If not, buy something anyway and support our economy",
                R.drawable.market));
        landmarks.add(new Landmark("Mystical Murgo",
                "No one knows where he came from, but the common assumption is that no mortal man could offer such wonderful products at such reasonable prices. Each purchase comes with the guarantee that it will change your life forever.  No refunds",
                R.drawable.murgo));
        landmarks.add(new Landmark("Pig Knight",
                "Nothing is known about the origin of this statue, so I will have to make it up. The statue shows Sir Randy riding his trusty stead ‘Oinky’ into battle during the Great Bacon War. Show your respect to the statue by getting down on your knees and squealing like a pig. Locals may try to avoid you at this point, but it is just part of the tradition",
                R.drawable.pig_knight));
        landmarks.add(new Landmark("Knothole Island",
                "If Bowerstone is not the place for you, we recommend taking your business elsewhere. Look for Gordon along the docks and ask him nicely to be taken to Knothole Island in his submarine.",
                R.drawable.submarine));





        LandmarkAdapter adapter =
                new LandmarkAdapter(this, landmarks, R.layout.list_item_landmarks);

        ListView listView = findViewById(R.id.landmark_list_view);

        listView.setAdapter(adapter);
    }
}
