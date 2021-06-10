package com.example.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class lastactivity : AppCompatActivity() {
    lateinit var imageview5: ImageView
    lateinit var tvmom: TextView
    lateinit var btn4previous: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lastactivity)
        gradPicture()
        clickGrad()
    }

    fun gradPicture(){
    imageview5 = findViewById(R.id.imageview5)
    tvmom = findViewById(R.id.tvmom)
    btn4previous = findViewById(R.id.btn4previous)
    }

    fun clickGrad(){
        btn4previous.setOnClickListener {
            val intent = Intent(baseContext, anotheractivity::class.java)
            startActivity(intent)
        }
    }
}