package com.example.generatingrandomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView resultsTextView;
    Button rollButton;
    SeekBar seekBar;
    Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultsTextView = findViewById(R.id.resultsTextView);
        rollButton = findViewById(R.id.rollButton);
        seekBar = findViewById(R.id.seekBar);
        random = new Random(100);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seekBar.getProgress() == 0){
                    Toast.makeText(MainActivity.this, "Drag the selector to some number", Toast.LENGTH_SHORT).show();
                }else {
                    Integer rand = random.nextInt(seekBar.getProgress()+1);
                    resultsTextView.setText(rand.toString());
                }

            }
        });
    }
}
