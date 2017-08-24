package com.example.wahyutrisvianto.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // variable declaration for looping
    int i = 0;

    // global variable
    TextView soalAtas;
    TextView soalBawah;
    TextView skorAtas;
    TextView skorBawah;
    String[][] bankSoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ini deklarasi button dan textview yang dipake di UI
        Button yesAtas = (Button) findViewById(R.id.button_yes_atas);
        Button noAtas = (Button) findViewById(R.id.button_no_atas);
        Button yesBawah = (Button) findViewById(R.id.button_yes_bawah);
        Button noBawah = (Button) findViewById(R.id.button_no_bawah);
        soalAtas = (TextView) findViewById(R.id.soal_atas);
        soalBawah = (TextView) findViewById(R.id.soal_bawah);
        skorAtas = (TextView) findViewById(R.id.score_atas);
        skorBawah = (TextView) findViewById(R.id.score_bawah);

        // Bank Soal
        bankSoal = new String[][] {
                {"1 + 1 = 2", "Yes"},
                {"2 + 1 = 2", "No"},
                {"3 + 1 = 2", "No"},
                {"4 + 1 = 5", "Yes"},
                {"5 + 1 = 6", "Yes"},
                {"6 + 1 = 2", "No"},
                {"7 + 1 = 8", "Yes"},
                {"8 + 1 = 9", "Yes"},
                {"9 + 1 = 3", "No"},
                {"10 + 1 = 2", "No"}
        };

        soalAtas.setText(bankSoal[i][0]);
        soalBawah.setText(bankSoal[i][0]);

        // Mulai backend
        yesAtas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                // Nampilin di warning hitam
                //Toast.makeText(getApplicationContext(), bankSoal[0][0], Toast.LENGTH_SHORT).show();
                updateSoal("Yes");
                //Log.v("jawaban", "Yes");
            }
        });

        yesBawah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                updateSoal("Yes");
            }
        });

        noAtas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                updateSoal("No");
            }
        });

        noBawah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                updateSoal("No");
            }
        });
    }

    public void updateSoal(String jawab) {
        soalAtas.setText(bankSoal[i][0]);
        soalBawah.setText(bankSoal[i][0]);

        // Checking question with answer provided
        if (jawab == bankSoal[i][1])
        {
            Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
        }
        i++;
    }
}
