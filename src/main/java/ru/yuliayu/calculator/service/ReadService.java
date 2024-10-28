package ru.yuliayu.calculator.service;

import java.util.Scanner;

public class ReadService {
    public static double readNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        return in.nextDouble();
    }

    public static int readMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: \n" + "1 - сумма, \n" + "2 - разница, " +
                "\n" + "3 - произведение, \n" + "0 - выход, \n");
        return in.nextInt();
    }
}
