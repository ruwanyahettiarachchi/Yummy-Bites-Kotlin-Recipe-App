package com.ruwa.yummybites

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity12 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        val btnAddNewRecipe: Button = findViewById(R.id.btn_addNewRecipe)
        btnAddNewRecipe.setOnClickListener {
            val intent = Intent(this,MainActivity10::class.java)
            startActivity(intent)
        }

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity11::class.java)
            startActivity(intent)
        }
    }
}