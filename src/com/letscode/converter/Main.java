package com.letscode.converter;

public class Main {

    public static void main(String[] args) {
        float userInputTemperatureInCelsius = 18f;

        final float convertTemperatureCelsiusToFahrenheit = (userInputTemperatureInCelsius * 1.8f) + 32f;
        final float convertTemperatureCelsiusToKelvin = userInputTemperatureInCelsius + 273.15f;
        final float convertTemperatureCelsiusToReaumur = userInputTemperatureInCelsius * 0.8f;
        final float convertTemperatureCelsiusToRankine = (userInputTemperatureInCelsius * 1.8f) + 491.67f;

        System.out.printf("The temperature of %.2f °C is equal to: \n%.2f °F; \n%.2f K; \n%.2f °Ré or \n%.2f °R",
                userInputTemperatureInCelsius,
                convertTemperatureCelsiusToFahrenheit,
                convertTemperatureCelsiusToKelvin,
                convertTemperatureCelsiusToReaumur,
                convertTemperatureCelsiusToRankine);
    }
}
