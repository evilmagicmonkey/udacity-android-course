package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NoveltyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novelty);


        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Barbie Girl", "Aqua"));
        words.add(new Word("Dick in a Box", "The Lonely Island"));
        words.add(new Word("Too Fast", "Jon Lajoie"));
        words.add(new Word("Chocolate Salty Balls", "Chef"));
        words.add(new Word("White & Nerdy", "Weird Al"));
        words.add(new Word("Who Needs the Kwik-E-Mart?", "Apu ft The Simpsons"));
        words.add(new Word("Get Schwifty", "Rick and Morty"));
        words.add(new Word("Lemonade", "Titus Andromedon"));
        words.add(new Word("Ring Ring", "Miss Folletti"));
        words.add(new Word("Surfin' Bird", "The Trashmen"));



        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
