package ru.yuliayu.calculator._main;

import ru.yuliayu.calculator.service.ReadNumberService;
import ru.yuliayu.calculator.service.ResultWriterService;
import ru.yuliayu.calculator.until.Calculate;


public class _Main {
    public static void main(String[] args) {
        int n = ReadNumberService.readMenu();
        double a, b, c;

        while (n != 0) {
            switch (n) {
                case 1:
                    a = ReadNumberService.readNum();
                    b = ReadNumberService.readNum();
                    c = Calculate.add(a, b);
                    ResultWriterService.writeRes(a, b, c, "сумма");
                    n = ReadNumberService.readMenu();
                    break;

                case 2:
                    a = ReadNumberService.readNum();
                    b = ReadNumberService.readNum();
                    c = Calculate.sub(a, b);
                    ResultWriterService.writeRes(a, b, c, "разница");
                    n = ReadNumberService.readMenu();
                    break;

                case 3:
                    a = ReadNumberService.readNum();
                    b = ReadNumberService.readNum();
                    c = Calculate.mul(a, b);
                    ResultWriterService.writeRes(a, b, c, "произведение");
                    n = ReadNumberService.readMenu();
                    break;

                case 0:
                    n = 0;
                    break;

            }

        }

    }
}
