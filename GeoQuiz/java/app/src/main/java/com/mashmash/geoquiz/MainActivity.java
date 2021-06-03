package com.mashmash.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button trueButton;
    private Button falseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.trueButton = findViewById(R.id.true_button);
        this.falseButton = findViewById(R.id.false_button);

        trueButton.setOnClickListener(v ->
                Toast.makeText(
                        v.getContext(),
                        "HEllo From Here!",
                        Toast.LENGTH_LONG).show());

        falseButton.setOnClickListener(v ->
                Toast.makeText(
                        v.getContext(),
                        "Hskjdhf!",
                        Toast.LENGTH_LONG).show());
    }

}