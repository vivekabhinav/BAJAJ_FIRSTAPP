package com.example.bajaj_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        Toast.makeText(this, "loggin in", Toast.LENGTH_SHORT).show();
        Intent mIntent;
        mIntent  = new Intent(MainActivity.this,HomeActicity.class);
        startActivity(mIntent);
    }
}