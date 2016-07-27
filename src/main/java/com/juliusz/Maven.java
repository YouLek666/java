
package com.juliusz;

import spark.Spark;

public class Maven {

public static void main(String[] args) {

System.out.println("Hello Maven!");


 Spark.get("/", (req, res) -> "Hello World");
    }
}