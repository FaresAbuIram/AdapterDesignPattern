package com.company;

import org.json.JSONObject;
import org.json.XML;


public class Josn {
    /*
     * This class receive a xml contains and return a json contain  */
    public String element() {
        Xml xml = new Xml();//Xml object
        String jsonPrettyPrintString = ""; // contain of josn that is what i need
        String TEST_XML_STRING = xml.getElement();// contain of xml
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);//converting from xml to json
            jsonPrettyPrintString = xmlJSONObj.toString();

        } catch (Exception e) {
            System.out.println("e");
        }
        return (jsonPrettyPrintString);
    }
}
