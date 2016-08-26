package com.example.clara.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hola mor estoy trabajando desde mi PC

        //Pero que mono es mor

        Button btn = (Button) findViewById(R.id.btn);
        final TextView texto = (TextView) findViewById(R.id.txtView);
        final EditText edit = (EditText) findViewById(R.id.txtEdit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setText(edit.getText());
            }
        });

    }


}
