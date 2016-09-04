package com.example.clara.testgit;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

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
    }
}
