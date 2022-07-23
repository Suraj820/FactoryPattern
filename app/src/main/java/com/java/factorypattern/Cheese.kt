package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class Cheese : Fillings {
    override fun name(): String {
        return "Cheese"
    }

    override fun calories(): String {
        return "95 Kcal"
    }

}