package com.company;

public class Task2 {
    public void task() {
        int num1 = 1;
        int num2 = 4;
        int num3 = 4;
        int num4 = 8;
        if (num1 != num2 && num1 != num3 && num1 != num4 && num2 != num3 && num2 != num4 && num3 != num4 ){
            System.out.println("Все цифры числа различны");
        } else {
            System.out.println ("Не все цифры числа различны");
        }

}}
