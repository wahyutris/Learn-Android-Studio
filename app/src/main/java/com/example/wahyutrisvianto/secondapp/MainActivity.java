package com.example.wahyutrisvianto.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ini deklarasi button yang dipake di UI
        Button yesAtas = (Button) findViewById(R.id.button_yes_atas);
        Button noAtas = (Button) findViewById(R.id.button_no_atas);
        Button yesBawah = (Button) findViewById(R.id.button_yes_bawah);
        Button noBawah = (Button) findViewById(R.id.button_no_bawah);

        // Mulai backend
        yesAtas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "yes atas", Toast.LENGTH_SHORT).show();
            }
        });

        yesBawah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "yes bawah", Toast.LENGTH_SHORT).show();
            }
        });

        noAtas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "no atas", Toast.LENGTH_SHORT).show();
            }
        });

        noBawah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "no bawah", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
