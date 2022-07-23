package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
public abstract class AbstractFactory {
    abstract fun getBread(bread: String?): Bread?
    abstract fun getFilling(filling: String?): Fillings?
    abstract fun getDrink(drink: String?): Drink?

}