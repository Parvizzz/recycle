package com.example.m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         val but2 = findViewById<Button>(R.id.but2)
         val Str = String
        val ed = findViewById<EditText>(R.id.ed4)

        ed.setText( intent.getStringExtra("key1"))



    }
}