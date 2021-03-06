package it.morfoza;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by widzew on 2016-07-25.
 */
public class KalkulatorSpark {

    public static void runOnSpark(String[] args) {

        Spark.staticFileLocation("/webfiles");

        String port = System.getenv ("PORT");
        if (port != null) {
            int portInt = Integer.parseInt (port);
            Spark.port(portInt);
        }


        Spark.get("/kalkulator", (request, response) -> {
            String number1 = request.queryParams("number1");
            String number2 = request.queryParams("number2");
            String operation = request.queryParams("operation");


            int number1a = Integer.parseInt(number1);
            int number2a = Integer.parseInt(number2);

            int result;

            if(operation.equals("+")) {
                result = Kalk.Kalkgod(number1a, number2a);
            } else {

                result = Kalk.Kalkgod1(number1a, number2a);
            }

            Map<String, Object> model = new HashMap();
            model.put("result", result);
            model.put("number1", number1);
            model.put("number2", number2);

            return new ModelAndView(model, "result.ftl");
        }, new FreeMarkerEngine());

        Spark.get("/wynik", (request, response) -> {
            String number1 = request.queryParams("name");
            String number2 = request.queryParams("subname");

            Map<String, Object> model = new HashMap();
            model.put("name", number1);
            model.put("subname", number2);

            return new ModelAndView(model, "name.ftl");
        }, new FreeMarkerEngine());




    }}