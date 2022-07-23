package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class BreadFactory : AbstractFactory(){

    override fun getBread(bread: String?): Bread? {
        if (bread == "BRI"){
            return Brioche()
        }else if (bread == "ROL"){
            return Roll()
        }else if (bread == "BAG"){
            return Baguette()
        }
        return null
    }

    override fun getFilling(filling: String?): Fillings? {
        TODO("Not yet implemented")
    }

    override fun getDrink(drink: String?): Drink? {
        TODO("Not yet implemented")
    }
}