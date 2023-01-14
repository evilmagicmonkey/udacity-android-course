package com.example.android.bowerstonetourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MarketFragment())
                .commit();
    }
}