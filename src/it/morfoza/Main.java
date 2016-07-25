package it.morfoza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello");
        System.out.println("Adding or docking?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        input.nextInt();

        int y = input.nextInt();
        int x = input.nextInt();
        int result = x + y;

        int result1 = x - y;


        if (name.equals("Adding")) {System.out.println("your result is:" + result);}
        if (name.equals("docking")) {System.out.println("your result is:" + result1);}
    }
}
