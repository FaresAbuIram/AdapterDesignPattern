package com.company;

/**
 * This program converts from XML to JOSN
 * Auther : Farisabu3ram
 **/
public class Main {

    public static void main(String[] args) {

        Josn josn = new Josn();//create an object from Json class

        LanguageAdapter languageAdapter = new LanguageAdapter(josn);//create an object from LanguageAdapter class and take a josn as a patameters
        System.out.println(josn.element());

    }
}
