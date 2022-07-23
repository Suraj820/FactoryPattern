package com.java.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breadFactory = FactoryGenerator.getFactory("BRE")
        val bread = breadFactory?.getBread("BAG")

        val fillingFactory = FactoryGenerator.getFactory("FIL")
        val fillings = fillingFactory?.getFilling("TOM")

        val drinkFactory = FactoryGenerator.getFactory("DIR")
        val drinks = drinkFactory?.getDrink("PEP")

        Log.e("Suraj==>>", "Your bread:  ${bread?.name()}")
        Log.e("Suraj==>>", "Your fillings:  ${fillings?.name()}")
        Log.e("Suraj==>>", "Your drink:  ${drinks?.name()}")
    }
}