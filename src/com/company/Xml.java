package com.company;

public class Xml implements Language {
    /*
     * this class return a Xml contains to convert it to josn */
    @Override
    public String getElement() {

        return "<note>" +
                "    <to>John</to>" +
                "    <from>Smith</from>" +
                "    <heading>Reminder</heading>" +
                "    <body>Don't forget me this weekend!</body>" +
                "</note>";
    }
}
