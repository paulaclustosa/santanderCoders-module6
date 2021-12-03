package com.letscode.converter;

public class Main {

    public static void main(String[] args) {
        float temperatureInCelsius = 18f;

        final float temperatureInFahrenheit = (temperatureInCelsius * 1.8f) + 32f;
        final float temperatureInKelvin = temperatureInCelsius + 273.15f;
        final float temperatueInReaumur = temperatureInCelsius * 0.8f;
        final float temperatureInRankine = (temperatureInCelsius * 1.8f) + 491.67f;

        System.out.printf("The temperature of %.2f °C is equal to: \n%.2f °F; \n%.2f K; \n%.2f °Ré or \n%.2f °R",
                temperatureInCelsius,
                temperatureInFahrenheit,
                temperatureInKelvin,
                temperatueInReaumur,
                temperatureInRankine);
    }
}
