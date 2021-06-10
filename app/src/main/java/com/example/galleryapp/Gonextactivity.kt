package com.example.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Gonextactivity : AppCompatActivity() {
    lateinit var imageView3: ImageView
    lateinit var tvpark: TextView
    lateinit var btnnext: Button
    lateinit var btnPrevious: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gonextactivity)
        park()
        click()
    }
    fun park(){
        imageView3 = findViewById(R.id.imageView3)
        tvpark = findViewById(R.id.tvpark)
        btnnext = findViewById(R.id.btnnext)
        btnPrevious = findViewById(R.id.btnprevious)

    }
    fun click(){
        btnPrevious.setOnClickListener {
            val gon = Intent(baseContext, Nextactivity::class.java)
            startActivity(gon)
        }
        btnnext.setOnClickListener {

            val go = Intent(baseContext, anotheractivity::class.java)
            startActivity(go)
        }
    }

}