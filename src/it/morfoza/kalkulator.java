package it.morfoza;

import spark.Spark;

/**
 * Created by widzew on 2016-07-25.
 */
public class kalkulator {

    public static void main(String[] args) {

        Spark.get("/kalkulator", (request, response) -> {
            return "<html><b>Hello</b></html>";
        });

        Spark.get("/contact", ((request, response) -> {return "<html>" +
                "<form action=\"kalkulator\">" +
                "<input name=\"number1\">" +
                "<input name=\"number2\">" +
                "<input type=\"submit\">" +
            "</form>" + "</html>";
        }));
    }}