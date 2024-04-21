package com.ruwa.yummybites

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity11 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        val btnViewRecipe: Button = findViewById(R.id.btn_viewRecipe)
        btnViewRecipe.setOnClickListener {
            val intent = Intent(this,MainActivity12::class.java)
            startActivity(intent)
        }

        val btnHome: ImageButton = findViewById(R.id.btn_home)
        btnHome.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        val btnFavourites: Button = findViewById(R.id.btn_favourites)
        btnFavourites.setOnClickListener {
            val intent = Intent(this,MainActivity14::class.java)
            startActivity(intent)
        }
    }
}