package com.letscode.converter;

public class Main {

    public static void main(String[] args) {
        float temperatureInCelsius = 18f;

        final float TEMPERATURE_IN_FAHRENHEIT = (temperatureInCelsius * 1.8f) + 32f;
        final float TEMPERATURE_IN_KELVIN = temperatureInCelsius + 273.15f;
        final float TEMPERATURE_IN_REAUMUR = temperatureInCelsius * 0.8f;
        final float TEMPERATURE_IN_RANKINE = (temperatureInCelsius * 1.8f) + 491.67f;

        System.out.printf("The temperature of %.2f °C is equal to: \n%.2f °F; \n%.2f K; \n%.2f °Ré or \n%.2f °R",
                temperatureInCelsius,
                TEMPERATURE_IN_FAHRENHEIT,
                TEMPERATURE_IN_KELVIN,
                TEMPERATURE_IN_REAUMUR,
                TEMPERATURE_IN_RANKINE);
    }
}
