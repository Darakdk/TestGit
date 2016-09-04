package com.example.clara.testgit;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private String zodiac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final Button botonrandom = (Button) findViewById(R.id.btnrandom);

        //ObjectAnimator animX = ObjectAnimator.ofFloat(botonrandom, "xTranslate", 0f, 50f);
        //ObjectAnimator animY = ObjectAnimator.ofFloat(botonrandom, "TranslateY", 0f, 50f);

        //AnimatorSet animSet = new AnimatorSet();
        //animSet.playSequentially(animX, animY);
        //animSet.setDuration(500);

        //animSet.start();


        botonrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                botonrandom.animate().xBy(r.nextInt(10)+1).yBy(r.nextInt(10)+1);
            }
        });

        zodiac="Aries";
        final TextView txtSim = (TextView) findViewById(R.id.simbol);


        final Handler h = new Handler();
        final int delay = 3000; //milliseconds

        h.postDelayed(new Runnable(){
            public void run(){
                //do something
                Random rand = new Random();
                int n = rand.nextInt(4);

                switch (n)
                {
                    case 1: zodiac="Aries";break;
                    case 2: zodiac="Tauro";break;
                    case 3: zodiac="Piscis";break;
                    default: zodiac="Cancer"; break;
                }

                txtSim.setText(zodiac);
                h.postDelayed(this, delay);
            }
        }, delay);
    }


}
