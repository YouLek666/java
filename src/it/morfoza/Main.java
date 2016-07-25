package it.morfoza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int result = 2 + 2;

        System.out.println("Hello");
        System.out.println("What`s your name?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();


        System.out.println(name + " your result is :" + result);
    }
}
