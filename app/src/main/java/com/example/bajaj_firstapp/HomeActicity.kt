package com.example.bajaj_firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class HomeActicity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun handleClick(view: android.view.View) {
        Toast.makeText(this,"sending", Toast.LENGTH_SHORT).show()
    }
}