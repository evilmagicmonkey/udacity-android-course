package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rock = findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        TextView pop = findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }
        });

        TextView classical = findViewById(R.id.classical);
        classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                startActivity(classicalIntent);
            }
        });

        TextView novelty = findViewById(R.id.novelty);
        novelty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent noveltyIntent = new Intent(MainActivity.this, NoveltyActivity.class);
                startActivity(noveltyIntent);
            }
        });



    }
}
