package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class COC : Drink {
    override fun name(): String {
        return "Coca cola"
    }

    override fun calories(): String {
        return " 67 Kcal"
    }
}