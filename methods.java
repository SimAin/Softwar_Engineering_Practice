

public class methods {

    public static void main(String[] args) {
        runCelsiusToFahrenheit(0, 100);
        runFahrenheitToCelsius(32,212);
    }

    static double convertCelsiusToFahrenheit (double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static void runCelsiusToFahrenheit (int min, int max ) {
        double smallest = 0;
        double largest = 100;

        for (double i = smallest; i <= largest; ++i) {
            System.out.print(i + " in fahrenheit = ");
            System.out.format("%.2f", convertCelsiusToFahrenheit (i));
            System.out.println();
        }
    }

    static double convertFahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit -32) / 9 * 5;
    }

    static void runFahrenheitToCelsius (int min, int max ) {
        double smallest = 32;
        double largest = 212;

        for (double i = smallest; i <= largest; ++i) {
            System.out.print(i + " in celsius = ");
            System.out.format("%.2f", convertFahrenheitToCelsius(i));
            System.out.println();
        }
    }   
}

