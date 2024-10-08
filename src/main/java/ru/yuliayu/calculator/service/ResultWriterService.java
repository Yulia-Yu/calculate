package ru.yuliayu.calculator.service;

public class ResultWriterService {
    public static void writeRes(double a, double b, double c, String procedure) {
        System.out.println(a + " " + procedure + " " + b + " = " + c); // придумать красивый вывод
    }
}
