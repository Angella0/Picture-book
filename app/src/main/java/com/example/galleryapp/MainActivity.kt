package com.example.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var imageview1: ImageView
    lateinit var tvDescription: TextView
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view()
        description()

    }
        fun view() {
            imageview1 = findViewById(R.id.imageview1)
            tvDescription = findViewById(R.id.tvDescription)
            btnNext = findViewById(R.id.btnNext)
        }
    fun description(){
        btnNext.setOnClickListener {
            val intent = Intent(baseContext, Nextactivity::class.java)
            startActivity(intent)

        }

    }

}