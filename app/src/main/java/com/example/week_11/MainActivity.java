package com.example.week_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SimpleClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity_Simple.class);
        startActivity(intent);
    }

    public void AddDeleteClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity_AddDelete.class);
        startActivity(intent);
    }

    public void CustomClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity_Custom.class);
        startActivity(intent);
    }
}