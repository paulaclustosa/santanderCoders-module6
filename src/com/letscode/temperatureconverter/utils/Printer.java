package com.letscode.temperatureconverter.utils;

import com.letscode.temperatureconverter.service.Conversion;

public class Printer {

    public static void printEnterTemperatureMessage() {
        System.out.print("Please enter the temperature in Celsius: ");
    }

    public static void printConvertedTemperatureMessage(float temperatureInCelsius) {
        System.out.printf("The temperature of %.2f °C is equal to: \n%.2f °F; \n%.2f K; \n%.2f °Ré or \n%.2f °R.",
                temperatureInCelsius,
                Conversion.convertToFahrenheit(temperatureInCelsius),
                Conversion.convertToKelvin(temperatureInCelsius),
                Conversion.convertToReaumur(temperatureInCelsius),
                Conversion.convertToRankine(temperatureInCelsius)
        );
    }
}
