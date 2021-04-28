package com.company;

//НЕ РАБОТАЕТ!!!!
public class Task7 {
    public void task() {
        int prog = 2;
        if (prog % 10 == 1 && prog % 100 != 11 && prog % 100 != 12 && prog % 100 != 13 && prog % 100 != 14) {
          System.out.println(prog + " программист");
        } else if (prog % 10 == 2 && prog % 10 == 3 && prog % 10 == 4 ){
            System.out.println(prog + " программиста");
        } else if (prog % 10 == 5 && prog % 10 == 6 && prog % 10 == 7 && prog % 10 == 8 && prog % 10 == 9 && prog % 10 == 0 && prog % 100 == 11 && prog % 100 == 12 && prog % 100 == 13 && prog % 100 == 14 ){
            System.out.println(prog + " программистов");
        }
}}

