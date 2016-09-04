package com.example.clara.testgit;

import android.os.Handler;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class GameActivity extends AppCompatActivity {
    private String zodiac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        zodiac="Aries";
        final TextView txtSim = (TextView) findViewById(R.id.simbol);


        final Handler h = new Handler();
        final int delay = 3000; //milliseconds

        final Handler h1 = new Handler();
        final int delay1 = 500; //milliseconds

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

        final Button botonrandom = (Button) findViewById(R.id.btnrandom);
        final Button botonrandom1 = (Button) findViewById(R.id.btnrandom1);
        final Button botonrandom2 = (Button) findViewById(R.id.btnrandom2);
        final Button botonrandom3 = (Button) findViewById(R.id.btnrandom3);
        //ObjectAnimator animX = ObjectAnimator.ofFloat(botonrandom, "xTranslate", 0f, 50f);
        //ObjectAnimator animY = ObjectAnimator.ofFloat(botonrandom, "TranslateY", 0f, 50f);

        //AnimatorSet animSet = new AnimatorSet();
        //animSet.playSequentially(animX, animY);
        //animSet.setDuration(500);

        //animSet.start();

        h1.postDelayed(new Runnable(){
            public void run(){
                //do something
                Random r = new Random();
                botonrandom.animate().xBy(r.nextInt(300)-150).yBy(r.nextInt(300)-150);
                Random r1 = new Random();
                botonrandom1.animate().xBy(r.nextInt(300)-150).yBy(r.nextInt(300)-150);
                Random r2 = new Random();
                botonrandom2.animate().xBy(r.nextInt(300)-150).yBy(r.nextInt(300)-150);
                Random r3 = new Random();
                botonrandom3.animate().xBy(r.nextInt(300)-150).yBy(r.nextInt(300)-150);
                if(botonrandom.getX()<0)
                {
                    botonrandom.setX(0);
                }
                else if(botonrandom.getX()>500)
                {
                    botonrandom.setX(500);
                }

                if(botonrandom.getY()<100)
                {
                    botonrandom.setY(100);
                }
                else if(botonrandom.getY()>900)
                {
                    botonrandom.setY(900);
                }
                h.postDelayed(this, delay1);
            }
        }, delay1);


        botonrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}
