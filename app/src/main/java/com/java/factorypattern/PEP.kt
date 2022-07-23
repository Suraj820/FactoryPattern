package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class PEP : Drink {
    override fun name(): String {
       return "Pepsi"
    }

    override fun calories(): String {
        return " 75 Kcal"
    }
}