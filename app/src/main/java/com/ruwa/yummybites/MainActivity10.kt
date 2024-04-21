package com.ruwa.yummybites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val btnAdd: Button = findViewById(R.id.btn_add)
        btnAdd.setOnClickListener {
            val intent = Intent(this,MainActivity13::class.java)
            startActivity(intent)
        }

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener {
            val intent = Intent(this,MainActivity12::class.java)
            startActivity(intent)
        }
    }
}