package com.example.addyqu.sevenshake_android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.graphics.Typeface



class MainActivity : AppCompatActivity() {

    lateinit var tvHello : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello = findViewById(R.id.tv_hello)
        val font = Typeface.createFromAsset(assets, "fonts/Mitr-Light.ttf")
        tvHello.typeface = font

    }
}
