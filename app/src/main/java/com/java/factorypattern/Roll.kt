package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class Roll : Bread {
    override fun name(): String {
        return "Roll"
    }

    override fun calories(): String {
        return "75kcal"
    }
}