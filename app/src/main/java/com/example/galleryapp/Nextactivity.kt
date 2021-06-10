package com.example.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Nextactivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var textView: TextView
    lateinit var btnNxt: Button
    lateinit var btn2Nxt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nextactivity)

        elephant()
        click()
    }

    fun elephant(){
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        btnNxt = findViewById(R.id.btnNext)
        btn2Nxt = findViewById(R.id.btn2Nxt)
    }
    fun click(){
        btn2Nxt.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
        btnNxt.setOnClickListener {
            val intent = Intent(baseContext, Gonextactivity::class.java)
            startActivity(intent)
        }
    }
}