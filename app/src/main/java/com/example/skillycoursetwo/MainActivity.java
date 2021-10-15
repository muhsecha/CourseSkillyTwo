package com.example.skillycoursetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText tienama,tieumur,tiegender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tienama = findViewById(R.id.tienama);
        tieumur = findViewById(R.id.tieumur);
        tiegender = findViewById(R.id.tiegender);
    }
}