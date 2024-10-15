package ru.yuliayu.calculator._main;

import ru.yuliayu.calculator.service.ReadService;
import ru.yuliayu.calculator.service.ResultWriterService;
import ru.yuliayu.calculator.until.Calculate;


public class _Main {
    public static void main(String[] args) {
        int choiceMenu = ReadService.readMenu();
        double num_1, num_2, res;
        while (choiceMenu != 0) {
            switch (choiceMenu) {
                case 1:
                    num_1 = ReadService.readNum();
                    num_2 = ReadService.readNum();
                    res = Calculate.add(num_1, num_2);
                    ResultWriterService.writeRes(num_1, num_2, res, "сумма");
                    choiceMenu = ReadService.readMenu();
                    break;
                case 2:
                    num_1 = ReadService.readNum();
                    num_2 = ReadService.readNum();
                    res = Calculate.sub(num_1, num_2);
                    ResultWriterService.writeRes(num_1, num_2, res, "разница");
                    choiceMenu = ReadService.readMenu();
                    break;
                case 3:
                    num_1 = ReadService.readNum();
                    num_2 = ReadService.readNum();
                    res = Calculate.mul(num_1, num_2);
                    ResultWriterService.writeRes(num_1, num_2, res, "произведение");
                    choiceMenu = ReadService.readMenu();
                    break;
                case 0:
                    choiceMenu = 0;
                    break;
            }
        }
    }
}
