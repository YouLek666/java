package it.morfoza;

import spark.Spark;

/**
 * Created by widzew on 2016-07-25.
 */
public class kalkulator {

    public static void main(String[] args) {

        String port = System.getenv ("PORT");
        if (port != null) {
            int portInt = Integer.parseInt (port);
            Spark.port(portInt);
        }
        int portInt = Integer.parseInt (port);
        Spark.port(portInt);

        Spark.get("/kalkulator", (request, response) -> {
            return "<html><b>Hello</b>wazzzz up?</html>";
        });

        Spark.get("/contact", ((request, response) -> {return "<html>" +
                "<form action=\"kalkulator\">" +
                "<input name=\"number1\">" +
                "<input name=\"number2\">" +
                "<input type=\"submit\">" +
            "</form>" + "</html>";
        }));
    }}