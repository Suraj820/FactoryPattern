package com.java.factorypattern


//
// Created by Suraj on 23/07/22.
class BreadFactory {
   fun getBread(breadType : String) : Bread?{
       if (breadType == "BRI"){
           return Brioche()
       }else if (breadType == "ROL"){
           return Roll()
       }else if (breadType == "BAG"){
           return Baguette()
       }
       return null
   }
}