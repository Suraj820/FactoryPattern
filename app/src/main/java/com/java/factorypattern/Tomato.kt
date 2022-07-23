package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class Tomato : Fillings {
    override fun name(): String {
        return "Tomato"
    }

    override fun calories(): String {
        return "30 Kcal"
    }
}