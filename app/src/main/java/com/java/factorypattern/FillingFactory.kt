package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class FillingFactory : AbstractFactory() {
    override fun getBread(bread: String?): Bread? {
       return null
    }

    override fun getFilling(filling: String?): Fillings? {
        if (filling == null) {
            return null
        }
        if (filling === "CHE") {
            return Cheese()
        } else if (filling === "TOM") {
            return Tomato()
        }
        return null
    }

    override fun getDrink(drink: String?): Drink? {
        return null
    }
}