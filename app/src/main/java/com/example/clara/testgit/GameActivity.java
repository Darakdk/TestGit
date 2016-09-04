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
    private int points=0;
    private int symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        zodiac="Aries";
        symbol=1;
        final TextView txtSim = (TextView) findViewById(R.id.simbol);


        final Handler h = new Handler();
        final int delay = 3000; //milliseconds

        final Handler h1 = new Handler();
        final int delay1 = 500; //milliseconds

        final TextView txtPoint=(TextView) findViewById(R.id.txtpuntos);
        txtPoint.setText(String.valueOf(points));

        h.postDelayed(new Runnable(){
            public void run(){
                //do something
                Random rand = new Random();
                int n = rand.nextInt(4);

                switch (n)
                {
                    case 1: zodiac="Aries"; symbol=1;break;
                    case 2: zodiac="Tauro"; symbol=2;break;
                    case 3: zodiac="Piscis"; symbol=3;break;
                    default: zodiac="Cancer"; symbol=4; break;
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
                if(botonrandom.getX()<100)
                {
                    botonrandom.animate().x(100);
                }
                else if(botonrandom.getX()>700)
                {
                    botonrandom.animate().x(700);
                }

                if(botonrandom.getY()<100)
                {
                    botonrandom.animate().y(100);
                }
                else if(botonrandom.getY()>800)
                {
                    botonrandom.animate().y(800);
                }

                if(botonrandom1.getX()<100)
                {
                    botonrandom1.animate().x(100);
                }
                else if(botonrandom1.getX()>400)
                {
                    botonrandom1.animate().x(400);
                }

                if(botonrandom1.getY()<100)
                {
                    botonrandom1.animate().y(100);
                }
                else if(botonrandom1.getY()>800)
                {
                    botonrandom1.animate().y(800);
                }

                if(botonrandom2.getX()<100)
                {
                    botonrandom2.animate().x(100);
                }
                else if(botonrandom2.getX()>400)
                {
                    botonrandom2.animate().x(400);
                }

                if(botonrandom2.getY()<100)
                {
                    botonrandom2.animate().y(100);
                }
                else if(botonrandom2.getY()>800)
                {
                    botonrandom2.animate().y(800);
                }

                if(botonrandom3.getX()<100)
                {
                    botonrandom3.animate().x(100);
                }
                else if(botonrandom3.getX()>400)
                {
                    botonrandom3.animate().x(400);
                }

                if(botonrandom3.getY()<100)
                {
                    botonrandom3.animate().y(100);
                }
                else if(botonrandom3.getY()>800)
                {
                    botonrandom3.animate().y(800);
                }
                h.postDelayed(this, delay1);
            }
        }, delay1);


        botonrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==1)
                {
                    points+=3;
                }
                else
                {
                    points-=1;
                }
                txtPoint.setText(String.valueOf(points));
            }
        });

        botonrandom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==2)
                {
                    points+=3;
                }
                else
                {
                    points-=1;
                }
                txtPoint.setText(String.valueOf(points));
            }
        });

        botonrandom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==3)
                {
                    points+=3;
                }
                else
                {
                    points-=1;
                }
                txtPoint.setText(String.valueOf(points));
            }
        });

        botonrandom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==4)
                {
                    points+=3;
                }
                else
                {
                    points-=1;
                }
                txtPoint.setText(String.valueOf(points));
            }
        });
    }


}
