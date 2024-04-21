package com.ruwa.yummybites

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnRecipe1: ImageButton = findViewById(R.id.btn_recipe1)
        btnRecipe1.setOnClickListener {
            val intent = Intent(this,MainActivity9::class.java)
            startActivity(intent)
        }

        val btnVeg: ImageButton = findViewById(R.id.img_veg)
        btnVeg.setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }

        val btnNonVeg: ImageButton = findViewById(R.id.img_nonVeg)
        btnNonVeg.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
        val btnDesserts: ImageButton = findViewById(R.id.img_dessert)
        btnDesserts.setOnClickListener {
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }

        val btnDrinks: ImageButton = findViewById(R.id.img_drinks)
        btnDrinks.setOnClickListener {
            val intent = Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }

        val btnProfile: ImageButton = findViewById(R.id.btn_profile)
        btnProfile.setOnClickListener {
            val intent = Intent(this,MainActivity11::class.java)
            startActivity(intent)
        }

    }
}