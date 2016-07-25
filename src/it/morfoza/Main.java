package it.morfoza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello");
        System.out.println("Adding, docking or multiply?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();


        int y = input.nextInt();
        int x = input.nextInt();

        int result = 0;


        if (name.equals("Adding")) {
            result = x + y;
        }
        if (name.equals("docking")) {
            result = y - x;
        }
        if (name.equals("multiply")) {
            result = x * y;
        }

        System.out.println("your result is: " + result);
    }
}
