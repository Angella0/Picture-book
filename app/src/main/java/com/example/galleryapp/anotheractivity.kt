package com.example.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class anotheractivity : AppCompatActivity() {
    lateinit var imageview2: ImageView
    lateinit var tvLiam: TextView
    lateinit var btn2previous: Button
    lateinit var btn2next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anotheractivity)
        babyLiam()
        clickNext()
    }

    fun babyLiam(){

        imageview2 = findViewById(R.id.imageView2)
        tvLiam = findViewById(R.id.tvLiam)
        btn2previous = findViewById(R.id.btn2previous)
        btn2next = findViewById(R.id.btn2next)
    }
    fun clickNext(){
        btn2previous.setOnClickListener {
            val intent = Intent(baseContext, anotheractivity::class.java)
            startActivity(intent)
        }
        btn2next.setOnClickListener {
            val intent = Intent(baseContext, lastactivity::class.java)
            startActivity(intent)
        }
    }
}