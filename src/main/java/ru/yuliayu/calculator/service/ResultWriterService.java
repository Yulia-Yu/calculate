package ru.yuliayu.calculator.service;

public class ResultWriterService {
    public static void writeRes(double num1, double num2, double res, String procedure) {
        System.out.println(num1 + " " + procedure + " " + num2 + " = " + res); // придумать красивый вывод
    }
}
