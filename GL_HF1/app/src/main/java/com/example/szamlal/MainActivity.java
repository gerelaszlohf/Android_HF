package com.example.szamlal;

import androidx.appcompat.app.AppCompatActivity;

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
        final EditText Szam1=findViewById(R.id.Szam1);
        final EditText Szam2=findViewById(R.id.Szam2);
        Button Osszead=findViewById(R.id.Osszead);
        Button Kivon=findViewById(R.id.Kivon);
        Button Szoroz=findViewById(R.id.Szoroz);
        Button Oszt=findViewById(R.id.Oszt);
        final TextView Eredmeny=findViewById(R.id.Eredmeny);


        Osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double osszead=Double.parseDouble(Szam1.getText().toString())+Double.parseDouble(Szam2.getText().toString());
                Eredmeny.setText(Double.toString((osszead)));
            }
        });

        Kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double kivon=Double.parseDouble(Szam1.getText().toString()) -Double.parseDouble(Szam2.getText().toString());
               Eredmeny.setText(Double.toString((kivon)));
            }
        });

        Szoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double szoroz=Double.parseDouble(Szam1.getText().toString()) *Double.parseDouble(Szam2.getText().toString());
                Eredmeny.setText(Double.toString((szoroz)));
            }
        });

        Oszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oszt=Double.parseDouble(Szam1.getText().toString()) /Double.parseDouble(Szam2.getText().toString());
                Eredmeny.setText(Double.toString((oszt)));
            }
        });


    }
}