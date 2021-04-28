package com.company;

public class Task3 {
    public void task() {
    int a = 1607;
        if (a > 999) {
        System.out.println("Число не 3-х значное");} // Число 3-х значное?
            else if (a > 99 && a < 1000) {
        System.out.println("Число 3-х значное"); // Число 3-х значное?
    }
        if (a % 10 == 7) {
        System.out.println("Последняя цифра равна 7"); } // Последняя цифра равна 7?
            else {
        System.out.println("Последняя цифра не равна 7"); // Последняя цифра равна 7?
    }
        if (a % 2 == 0) {
        System.out.println("Число четное");} // Число четное?
            else if (a % 2 != 0) {
        System.out.println("Число нечетное"); // Число четное?
    }

}}
