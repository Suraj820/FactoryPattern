package com.java.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val breadFactory = BreadFactory()
        val bread = breadFactory.getBread("BAG")
        Log.e("Suraj==>>", "Your Bread: ${bread?.name()}")
    }
}