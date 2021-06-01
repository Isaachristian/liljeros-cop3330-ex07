package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        final double meterConversion = 0.09290304;
        int length, width, area;
        double areaMeters;

        System.out.print("What is the length of the room in feet? ");
        length = scanner.nextInt();
        System.out.print("What is the width of the room in feet? ");
        width = scanner.nextInt();

        area = length * width;
        areaMeters = area * meterConversion;

        System.out.println("You entered dimensions of " + length + " and " + width + " feet.");
        System.out.println("The area is");
        System.out.println(area + " square feet");
        System.out.println(areaMeters + " square meters");
    }
}
