package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("You Drive Me Crazy", "Britney Spears"));
        words.add(new Word("Rocket Man", "Elton John"));
        words.add(new Word("Simply the Best", "Tina Turner"));
        words.add(new Word("September", "Earth, Wind & Fire"));
        words.add(new Word("Backstreet's Back", "Backstreet Boys"));
        words.add(new Word("Without Me", "Eminem"));
        words.add(new Word("I've Got a feeling", "The Black Eyed Peas"));
        words.add(new Word("Heaven", "DJ Sammy"));
        words.add(new Word("Every Time We Touch", "Cascada"));
        words.add(new Word("Superstitious", "Stevie Wonder"));
        words.add(new Word("5,6,7,8", "Steps"));
        words.add(new Word("POP", "NSYNC"));


        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);




    }
}
