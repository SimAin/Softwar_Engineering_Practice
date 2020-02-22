package converting;

import java.util.Scanner;

public class tempConverter {

    public static void main(String[] args) throws Exception {
        celsiusToFahrenheit(0, 100);
        runFahrenheitToCelsius(32,212);

        Scanner input = new Scanner(System.in);
        System.out.println("Input a fahrenheit temp for conversion");
        int num = input.nextInt();
        System.out.println("Celsius - " + fahrenheitToCelsius(num));

        System.out.println("Input a loewst temp for conversion");
        int low = input.nextInt();
        System.out.println("Input a highest temp for conversion");
        int high = input.nextInt();
        System.out.println("Input a skip temp for conversion");
        int skip = input.nextInt();
        fahrenheitToCelsius(low,high,skip);
        input.close();
    }

    public static double celsiusToFahrenheit (double celsius) throws Exception {
        try{
            return (celsius * 9 / 5) + 32;
        } catch (NullPointerException ex) {
            throw new Exception("Input cannot be null, input a double or int");
        } 
    }

    public static void celsiusToFahrenheit (int min, int max ) throws Exception {
        double smallest = 0;
        double largest = 100;

        for (double i = smallest; i <= largest; ++i) {
            System.out.print(i + " in fahrenheit = ");
            System.out.format("%.2f", celsiusToFahrenheit (i));
            System.out.println();
        }
    }

    public static void celsiusToFahrenheit (int min, int max, int skip ) throws Exception {
        Exception e = new Exception();
        if ((min > max) || (skip > (max-min))) {
            throw e;
        }
        
        for (double i = min; i <= max; i += skip) {
            System.out.print(i + " in fahrenheit = ");
            System.out.format("%.2f", celsiusToFahrenheit (i));
            System.out.println();
        }
    }

    public static double convertFahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit -32) / 9 * 5;
    }

    public static void runFahrenheitToCelsius (int min, int max ) {
        double smallest = 32;
        double largest = 212;

        for (double i = smallest; i <= largest; ++i) {
            System.out.print(i + " in celsius = ");
            System.out.format("%.2f", convertFahrenheitToCelsius(i));
            System.out.println();
        }
    }   

    public static double fahrenheitToCelsius (int fahrenheit) {
        return (fahrenheit -32) / 9 * 5;
    }

    public static void fahrenheitToCelsius (int low, int high, int skip) throws Exception {
        Exception e = new Exception();
        if ((low > high) || (skip > (high-low))) {
            throw e;
        }

        for (int w = low; w <= high; w += skip) {
            System.out.print(w + " in celsius = ");
            System.out.format("%.2f", convertFahrenheitToCelsius(w));
            System.out.println();
        }
    }
}

