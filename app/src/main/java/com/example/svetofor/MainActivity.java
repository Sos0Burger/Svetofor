package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChangeToGreen(View view){
        View screen = findViewById(R.id.relative_layout);
        screen.setBackgroundColor(Color.GREEN);
    }
    public void ChangeToRed(View view){
        View screen = findViewById(R.id.relative_layout);
        screen.setBackgroundColor(Color.RED);
    }
    public void ChangeToYellow(View view){
        View screen = findViewById(R.id.relative_layout);
        screen.setBackgroundColor(Color.YELLOW);
    }
}