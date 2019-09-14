package com.company;

public class LanguageAdapter implements Language {
    /*
     * This class using adapter design pattern to adapting from xml to json*/
   private Josn josn; //josn object

    public LanguageAdapter(Josn josn) {
        this.josn = josn;
    }

    @Override
    public String getElement() {
        return josn.element();
    }
}
