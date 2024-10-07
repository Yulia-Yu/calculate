package ru.yuliayu.calculator.service;

import java.util.Scanner;

public class ReadNumberService {
    public static double readNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a = in.nextDouble();
        return a;
    }

    public static int readMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: \n"  + "1 - сумма, \n" + "2 - разница, " +
                "\n" + "3 - произведение, \n" + "0 - выход, \n");
        int a = in.nextInt();
        return a;
    }
}
