package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class Baguette : Bread{
    override fun name(): String {
        return "Baguette"
    }

    override fun calories(): String {
        return "65 kcal"
    }
}