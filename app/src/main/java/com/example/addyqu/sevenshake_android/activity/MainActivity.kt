package com.example.addyqu.sevenshake_android.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.addyqu.sevenshake_android.R
import com.example.addyqu.sevenshake_android.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
    }

    fun initFragment() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance() )
                .commit()
    }
}
