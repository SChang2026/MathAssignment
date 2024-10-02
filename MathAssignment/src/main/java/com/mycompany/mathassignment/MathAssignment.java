/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathassignment;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author SChang2026
 */
public class MathAssignment {
    
public static double MathAssignment(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
    }
 private static final double SPEED_OF_LIGHT = 299792458.0;
public static void main(String[] args) {
       Random random = new Random();  

//1
        int number = random.nextInt(91);

        // Calculate the sine, cosine, and tangent
        double sine = Math.sin(Math.toRadians(number));
        double cosine = Math.cos(Math.toRadians(number));
        double tangent = Math.tan(Math.toRadians(number));

        // Display the results rounded to 3 decimal places
        System.out.printf("Number: %d Sine: %.3f Cosine: %.3f Tangent: %.3f%n", 
                          number, sine, cosine, tangent);
//2

        // Generate a random radius between 1.0 and 20.0
        double radius = 1.0 + (random.nextDouble() * 19.0);

        // Calculate the volume of the sphere using the formula: V = (4/3) * π * r^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Display the result
        System.out.printf("Random Radius: %.2f%n", radius);
        System.out.printf("Area of the Cirle: %.2f%n", radius*radius*Math.PI);
        System.out.printf("Volume of the sphere: %.2f%n", volume);
//3

        // Generate a random real number between 1000.0 and 100,000,000.0
        double randomNumber = 1000.0 + (random.nextDouble() * (100000000.0 - 1000.0));

        // Calculate the square root, natural logarithm, and logarithm base 10
        double squareRoot = Math.sqrt(randomNumber);
        double naturalLog = Math.log(randomNumber);
        double log10 = Math.log10(randomNumber);

        // Display the results rounded to 5 decimal places
        System.out.printf("Random Number: %.5f%n", randomNumber);
        System.out.printf("Square Root: %.5f%n", squareRoot);
        System.out.printf("Natural Logarithm: %.5f%n", naturalLog);
        System.out.printf("Logarithm (base 10): %.5f%n", log10); 

//4

        // Generate a random real number between 1000.0 and 100,000,000.0
        double energy = 1000.0 + (random.nextDouble() * (100000000.0 - 1000.0));

        // Calculate mass in kilograms
        double massKg = energy / (SPEED_OF_LIGHT * SPEED_OF_LIGHT);

        // Convert mass to grams
        double massGrams = massKg * 1000.0;

        // User-defined number of decimal places
        int decimalPlaces = 10;

        // Display the results
        System.out.printf("Random Energy (Joules): %.5f%n", energy);
        System.out.printf("Mass Required (grams): %.5f%n", MathAssignment(massGrams, decimalPlaces));
    


//5

  Scanner scanner = new Scanner(System.in);

        // Get a real number from the user
        System.out.print("Enter a real number: ");
        double realNumber = scanner.nextDouble();

        // Get an integer from the user
        System.out.print("Enter an integer exponent: ");
        int exponent = scanner.nextInt();

        // Get the number of decimal places for rounding
        System.out.print("Enter the number of decimal places to round to: ");

        // Calculate the power
        double result = Math.pow(realNumber, exponent);

        // Round the result to the specified decimal places
        double scale = Math.pow(10, decimalPlaces);
        result = Math.round(result * scale) / scale;

        // Output the result
        System.out.printf("Result: %.2f\n", result);

        scanner.close();
    }
}
