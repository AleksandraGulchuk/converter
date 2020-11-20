package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {

    public void convertCelsiusToFahrenheit() throws IOException {
        System.out.println("Введите, пожалуйста, температуру в градусах Цельсия...");
        String celsius = readInputString();
        System.out.println(celsius + " C = " + calculateCelsiusToFahrenheit(celsius) + " F");
    }

    public void convertNumberToSumOfDigits() throws IOException {
        System.out.println("Введите, пожалуйста, целое число...");
        String inputNumber = readInputString();
        System.out.println("Сумма цифр введенного числа " + inputNumber + " равна " + calculateSumOfDigits(inputNumber));
    }

    private String readInputString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private double calculateCelsiusToFahrenheit(String celsius) {
        return Double.parseDouble(celsius) * 1.8 + 32;
    }

    private int calculateSumOfDigits(String s) {
        int[] digitsArray = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += digitsArray[i];
        }
        return sum;
    }

}
