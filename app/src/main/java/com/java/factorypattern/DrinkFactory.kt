package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class DrinkFactory : AbstractFactory() {
    override fun getBread(bread: String?): Bread? {
        return null
    }

    override fun getFilling(filling: String?): Fillings? {
        return null
    }

    override fun getDrink(drink: String?): Drink? {
        if(drink === "PEP"){
            return PEP();
        }else if (drink === "COC"){
            return COC()
        }
        return null
    }
}