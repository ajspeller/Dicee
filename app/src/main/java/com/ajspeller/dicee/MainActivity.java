package com.ajspeller.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollBtn);

        final ImageView leftDie = (ImageView) findViewById(R.id.leftDie);
        final ImageView rightDie = (ImageView) findViewById(R.id.rightDie);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "onClick: The button has been pressed");

                Random randomNumberGenerator = new Random();

                leftDie.setImageResource(diceArray[randomNumberGenerator.nextInt(6)]);
                rightDie.setImageResource(diceArray[randomNumberGenerator.nextInt(6)]);
            }
        });


    }
}
