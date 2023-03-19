package com.example.m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText =findViewById<EditText>(R.id.ed1)
        val ditText =findViewById<EditText>(R.id.ed2)
        val but = findViewById<Button>(R.id.but1)

        but.setOnClickListener{
            intent = Intent(this,MainActivity2::class.java)
             intent.putExtra("key1","Parbiz")

            startActivity(intent)
        }
val rv:RecyclerView

    }
}