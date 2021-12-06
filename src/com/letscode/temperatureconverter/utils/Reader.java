package com.letscode.temperatureconverter.utils;

import java.util.Scanner;

public class Reader {

    public static float temperatureScan() {
        Scanner temperatureScan = new Scanner(System.in);
        Printer.printEnterTemperatureMessage();
        return temperatureScan.nextFloat();
    }
}
