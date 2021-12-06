package com.letscode.temperatureconverter;

import com.letscode.temperatureconverter.utils.Printer;
import com.letscode.temperatureconverter.utils.Reader;

public class Main {

    public static void main(String[] args) {
        Printer.printConvertedTemperatureMessage(Reader.temperatureScan());
    }
}
