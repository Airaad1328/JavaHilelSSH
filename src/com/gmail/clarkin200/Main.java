package com.gmail.clarkin200;

import java.util.Scanner;

public class Main {
    private static final double CONV_M = 0.621371;

    public static void main(String[] args) {

        System.out.println("Distance Converter App.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        double mile = sc.nextDouble();
        System.out.println("Enter your number");
        double km = sc.nextDouble();

        double resultMile = convKmToMile(km);
        double resultKm = convMileToKm(mile);

        System.out.println("Result is " + resultMile + " Mile and " + resultKm + " km23");
    }

    private static double convKmToMile(double km) {
        return km * CONV_M;
    }

    private static double convMileToKm(double mile) {
        return mile / CONV_M;
    }
}
