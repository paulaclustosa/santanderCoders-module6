package com.letscode.temperatureconverter.utils;

import com.letscode.temperatureconverter.service.Conversion;

public class Printer {

    public static void printEnterTemperatureMessage() {
        final String ENTER_TEMPERATURE_MESSAGE = "Please enter the temperature in Celsius: ";
        System.out.print(ENTER_TEMPERATURE_MESSAGE);
    }

    public static void printConvertedTemperatureMessage(float temperatureInCelsius) {
        final String CONVERTED_TEMPERATURE_MESSAGE = "The temperature of %.2f °C is equal to: " +
                "\n%.2f °F; \n%.2f K; \n%.2f °Ré or \n%.2f °R.";
        System.out.printf(CONVERTED_TEMPERATURE_MESSAGE,
                temperatureInCelsius,
                Conversion.convertToFahrenheit(temperatureInCelsius),
                Conversion.convertToKelvin(temperatureInCelsius),
                Conversion.convertToReaumur(temperatureInCelsius),
                Conversion.convertToRankine(temperatureInCelsius)
        );
    }
}
