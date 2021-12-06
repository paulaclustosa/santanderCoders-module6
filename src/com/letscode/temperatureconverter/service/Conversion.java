package com.letscode.temperatureconverter.service;

public class Conversion {
    public static float convertToFahrenheit(float temperatureInCelsius) {
        final float CONVERSION_FACTOR_FAHRENHEIT = 1.8f;
        final float INCREMENT_FAHRENHEIT = 32f;
        return (temperatureInCelsius * CONVERSION_FACTOR_FAHRENHEIT) + INCREMENT_FAHRENHEIT;
    }

    public static float convertToKelvin(float temperatureInCelsius) {
        final float INCREMENT_KELVIN = 273.15f;
        return temperatureInCelsius + INCREMENT_KELVIN;
    }

    public static float convertToReaumur(float temperatureInCelsius) {
        final float CONVERSION_FACTOR_REAUMUR = 0.8f;
        return temperatureInCelsius * CONVERSION_FACTOR_REAUMUR;
    }

    public static float convertToRankine(float temperatureInCelsius) {
        final float CONVERSION_FACTOR_RANKINE = 1.8f;
        final float INCREMENT_RANKINE = 491.67f;
        return (temperatureInCelsius * CONVERSION_FACTOR_RANKINE) + INCREMENT_RANKINE;
    }
}
