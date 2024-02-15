package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //list widget
    EditText txtangka1;
    EditText txtangka2;
    Spinner spOperator;
    TextView tvHasil;
    Button btnHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //konek ke layout
        txtangka1 = findViewById(R.id.angka1);
        txtangka2 = findViewById(R.id.angka2);
        btnHitung = findViewById(R.id.btnJumlah);
        spOperator = findViewById(R.id.spinner1);
        btnHitung = findViewById(R.id.btnJumlah);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action kalkulator angka1 dan 2

                String text = spOperator.getSelectedItem().toString();
                switch (text) {

                }
            }
        });

    }
}