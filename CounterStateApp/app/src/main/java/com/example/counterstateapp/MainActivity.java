package com.example.counterstateapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private TextView textCounter;
    private Button buttonIncrease, buttonDecrease, buttonClear;

    private ScoreViewModel scoreViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter = findViewById(R.id.textCounter);
        buttonIncrease = findViewById(R.id.buttonIncrease);
        buttonDecrease = findViewById(R.id.buttonDecrease);
        buttonClear = findViewById(R.id.buttonClear);

        scoreViewModel = new ViewModelProvider(this).get(ScoreViewModel.class);

        scoreViewModel.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer newScore) {
                textCounter.setText(String.valueOf(newScore));
            }
        });

        buttonIncrease.setOnClickListener(v -> scoreViewModel.increaseScore());
        buttonDecrease.setOnClickListener(v -> scoreViewModel.decreaseScore());
        buttonClear.setOnClickListener(v -> scoreViewModel.resetScore());
    }
}