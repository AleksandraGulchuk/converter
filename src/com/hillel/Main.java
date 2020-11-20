package com.hillel;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Converter converter = new Converter();
        converter.convertCelsiusToFahrenheit();
        converter.convertNumberToSumOfDigits();

    }
}
