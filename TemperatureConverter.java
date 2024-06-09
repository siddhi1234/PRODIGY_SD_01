import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature value
        System.out.print("Enter the temperature value: ");
        double temperatureValue = scanner.nextDouble();

        // Prompt user for original unit of measurement
        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, Kelvin): ");
        String originalUnit = scanner.next().toLowerCase();

        // Perform conversion based on the original unit of measurement
        switch (originalUnit) {
            case "celsius":
                convertCelsius(temperatureValue);
                break;
            case "fahrenheit":
                convertFahrenheit(temperatureValue);
                break;
            case "kelvin":
                convertKelvin(temperatureValue);
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit and Kelvin
    public static void convertCelsius(double celsius) {
        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        System.out.println(celsius + " degrees Celsius is equal to " + kelvin + " Kelvin.");
    }

    // Method to convert Fahrenheit to Celsius and Kelvin
    public static void convertFahrenheit(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        double kelvin = celsiusToKelvin(celsius);
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + kelvin + " Kelvin.");
    }

    // Method to convert Kelvin to Celsius and Fahrenheit
    public static void convertKelvin(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(kelvin + " Kelvin is equal to " + celsius + " degrees Celsius.");
        System.out.println(kelvin + " Kelvin is equal to " + fahrenheit + " degrees Fahrenheit.");
    }

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}