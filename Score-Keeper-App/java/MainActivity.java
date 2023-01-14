package com.example.android.snookerassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForPlayerOne = 0;
    int scoreForPlayerTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Calculates the score for Player One.
     */
    public void oneA(View view) {
        scoreForPlayerOne = scoreForPlayerOne + 1;
        displayOne(scoreForPlayerOne);
    }

    public void twoA(View view) {
        scoreForPlayerOne = scoreForPlayerOne + 2;
        displayOne(scoreForPlayerOne);
    }

    public void threeA(View view) {
        scoreForPlayerOne = scoreForPlayerOne + 3;
        displayOne(scoreForPlayerOne);
    }

    public void fourA(View view) {
        scoreForPlayerOne = scoreForPlayerOne + 4;
        displayOne(scoreForPlayerOne);
    }

    public void fiveA(View view) {
        scoreForPlayerOne = scoreForPlayerOne + 5;
        displayOne(scoreForPlayerOne);
    }

    public void sixA(View view) {
        scoreForPlayerOne = scoreForPlayerOne + 6;
        displayOne(scoreForPlayerOne);
    }

    public void sevenA(View view) {
        scoreForPlayerOne = scoreForPlayerOne + 7;
        displayOne(scoreForPlayerOne);
    }

    /**
     * Calculates the score for Player Two.
     */

    public void oneB(View view) {
        scoreForPlayerTwo = scoreForPlayerTwo + 1;
        displayTwo(scoreForPlayerTwo);
    }

    public void twoB(View view) {
        scoreForPlayerTwo = scoreForPlayerTwo + 2;
        displayTwo(scoreForPlayerTwo);
    }

    public void threeB(View view) {
        scoreForPlayerTwo = scoreForPlayerTwo + 3;
        displayTwo(scoreForPlayerTwo);
    }

    public void fourB(View view) {
        scoreForPlayerTwo = scoreForPlayerTwo + 4;
        displayTwo(scoreForPlayerTwo);
    }

    public void fiveB(View view) {
        scoreForPlayerTwo = scoreForPlayerTwo + 5;
        displayTwo(scoreForPlayerTwo);
    }

    public void sixB(View view) {
        scoreForPlayerTwo = scoreForPlayerTwo + 6;
        displayTwo(scoreForPlayerTwo);
    }

    public void sevenB(View view) {
        scoreForPlayerTwo = scoreForPlayerTwo + 7;
        displayTwo(scoreForPlayerTwo);
    }

    /**
     * Resets the scores.
     */
    public void reset(View view) {
        scoreForPlayerOne = 0;
        scoreForPlayerTwo = 0;
        displayOne(scoreForPlayerOne);
        displayTwo(scoreForPlayerTwo);
    }

    /**
     * Displays the given score for Player One and Player Two.
     */

    public void displayOne(int scoreForPlayerOne) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(scoreForPlayerOne));
    }

    public void displayTwo(int scoreForPlayerTwo) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(scoreForPlayerTwo));
    }
}

