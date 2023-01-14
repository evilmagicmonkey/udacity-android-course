package com.example.android.disneyvillainsquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitScore(View view) {

        RadioButton questionOne = findViewById(R.id.one_right);
        if (questionOne.isChecked()) {
            score++;
        }
        RadioButton questionTwo = findViewById(R.id.two_right);
        if (questionTwo.isChecked()) {
            score++;
        }
        RadioButton questionThree = findViewById(R.id.three_right);
        if (questionThree.isChecked()) {
            score++;
        }
        RadioButton questionFour = findViewById(R.id.four_right);
        if (questionFour.isChecked()) {
            score++;
        }
        RadioButton questionFive = findViewById(R.id.five_right);
        if (questionFive.isChecked()) {
            score++;
        }
        RadioButton questionSix = findViewById(R.id.six_right);
        if (questionSix.isChecked()) {
            score++;
        }
        RadioButton questionSeven = findViewById(R.id.seven_right);
        if (questionSeven.isChecked()) {
            score++;
        }

        EditText questionNine = findViewById(R.id.nineAnswer);
        String questionNineAnswer = questionNine.getText().toString();

        questionNine.setInputType(0);


        if (questionNineAnswer.equalsIgnoreCase("scar")) {
            score++;
        }


        CheckBox painCheckBox = findViewById(R.id.pain);
        CheckBox panicCheckBox = findViewById(R.id.panic);
        CheckBox flotsamCheckBox = findViewById(R.id.flotsam);
        CheckBox jetsamCheckBox = findViewById(R.id.jetsam);
        CheckBox iagoCheckbox = findViewById(R.id.iago);
        CheckBox lefouCheckBox = findViewById(R.id.lefou);

        if (painCheckBox.isChecked() && panicCheckBox.isChecked() && !flotsamCheckBox.isChecked() && !jetsamCheckBox.isChecked() && !iagoCheckbox.isChecked() && !lefouCheckBox.isChecked()) {
            score++;
        }


        Toast.makeText(this, "You scored " + score + "/9", Toast.LENGTH_LONG).show();


    }

    public void reset(View view) {
        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }


}



