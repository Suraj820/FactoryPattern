package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class Brioche : Bread {
    override fun name(): String {
        return "Brioche"
    }

    override fun calories(): String {
        return "85 kcal"
    }
}