package com.ruwa.yummybites

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity14 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity11::class.java)
            startActivity(intent)
        }

        val btnDelete: ImageButton = findViewById(R.id.btn_delete)
        btnDelete.setOnClickListener {
            val intent = Intent(this,MainActivity13::class.java)
            startActivity(intent)
        }
    }
}