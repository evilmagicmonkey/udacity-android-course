package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classical);


        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Back to Life", "Giovanni Allevi"));
        words.add(new Word("Kiss the Rain", "Yiruma"));
        words.add(new Word("Messiah", "Handel"));
        words.add(new Word("The Magical Flute", "Mozart"));
        words.add(new Word("Eine Kleine Natchmusik", "Mozart"));
        words.add(new Word("Für Elise", "Beethoven"));
        words.add(new Word("Air on the G String", "Bach"));
        words.add(new Word("Ride of the Valkyries", "David Parry"));
        words.add(new Word("Merry Christmas Mr. Lawrence", "Ryuichi Sakamoto"));



        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
