package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);


        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Jessica", "The Allman Brothers"));
        words.add(new Word("39", "Tenacious D"));
        words.add(new Word("Holy Diver", "Dio"));
        words.add(new Word("2 Minutes to Midnight", "Iron Maiden"));
        words.add(new Word("Everlong", "Foo Fighters"));
        words.add(new Word("Almost", "Bowling For Soup"));
        words.add(new Word("Knives and Pens", "Black Veil Brides"));
        words.add(new Word("Our Sweet Blasphemy", "Black Veil Brides"));
        words.add(new Word("Walk This Way", "Aerosmith ft Run DMC"));
        words.add(new Word("Hard Rock Hallelujah", "Lordi"));
        words.add(new Word("Rock & Roll All Night", "KISS"));
        words.add(new Word("Woman", "Wolfmother"));


        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


    }

}
