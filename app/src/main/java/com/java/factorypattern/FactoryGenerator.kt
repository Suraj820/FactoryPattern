package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class FactoryGenerator {
    
    companion object{
        fun getFactory(factory: String): AbstractFactory? {
            if (factory === "BRE") {
                return BreadFactory()
            } else if (factory === "FIL") {
                return FillingFactory()
            } else if (factory === "DIR"){
                return DrinkFactory()
            }
            return  null
        }
    }
}