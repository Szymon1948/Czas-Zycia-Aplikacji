package com.learn.czaszyciaaplikacji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer licznik = 0;
    public TextView licznikTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        licznikTextView = findViewById(R.id.licznikTextView)
    }
    public void zwieksz(View view){
        licznik++;
        licznikTextView.setText(licznik.toString());
    }

}