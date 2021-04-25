package com.company;
public class Task1 {

    public void task() {
        //TASK_1---------------------------------------------------------------------------------------------------------------------
        // Binary->Decimal
        // 000=0
        // (0*2^2)+(0*2^1)+(0*2^0)=0+0+0=0
        // 1010=10
        // (1*2^3)+(0*2^2)+(1*2^1)+(0*2^0)=8+0+2+0=10
        // 1=1
        // 1*2^0=1
        // 1000=8
        // (1*2^3)+(0*2^2)+(0*2^1)+(0*2^0)=8+0+0+0=8
        // 110011=51
        // (1*2^5)+(1*2^4)+(0*2^3)+(0*2^2)+(1*2^1)+(1*2^0)=32+16+0+0+2+1=51
        // 1111111=127
        // (1*2^6)+(1*2^5)+(1*2^4)+(1*2^3)+(1*2^2)+(1*2^1)+(1*2^0)=64+32+16+8+4+2+1=127
        // 11111111=255
        // (1*2^7)+(1*2^6)+(1*2^5)+(1*2^4)+(1*2^3)+(1*2^2)+(1*2^1)+(1*2^0)=128+64+32+16+8+4+2+1=255
        System.out.println(Integer.parseInt("000", 2));
        System.out.println(Integer.parseInt("1010", 2));
        System.out.println(Integer.parseInt("1", 2));
        System.out.println(Integer.parseInt("1000", 2));
        System.out.println(Integer.parseInt("110011", 2));
        System.out.println(Integer.parseInt("1111111", 2));
        System.out.println(Integer.parseInt("11111111", 2));

        // Decimal->Binary
        // 44=101100
        // 44%2=0, 22%2=0, 11%2=1, 5%2=1, 2%2=0, 1%2=1, remainder=0
        // 777=1100001001
        // 777%2=1, 388%2=0, 194%2=0, 97%2=1, 48%2=0, 24%2=0, 12%2=0, 6%2=0, 3%2=1, 1%2=1, remainder=0
        // 2342=100100100110
        // 2342%2=0, 1171%2=1, 585%2=1, 292%2=0, 146%2=0, 73%2=1, 36%2=0, 18%2=0, 9%2=1, 4%2=0, 2%2=0, 1%2=1, remainder=0
        // 655=1010001111
        // 655%2=1, 327%2=1, 163%2=1, 81%2=1, 40%2=0, 20%2=0, 10%2=0, 5%2=1, 2%2=0, 1%2=1, remainder=0
        // 52=110100
        // 52%2=0, 26%2=0, 13%2=1, 6%2=0, 3%2=1, 1%2=1, remainder=0
        // 5=101
        // 5%2=1, 2%2=0, 1%2=1, remainder=0
        // 22222=101011011001110
        // 22222%2=0, 11111%2=1, 5555%2=1, 2777%2=1, 1388%2=0, 694%2=0, 347%2=1, 173%2=1, 86%2=0, 43%2=1, 21%2=1, 10%2=0, 5%2=1, 2%2=0, 1%2=1, remainder=0
        System.out.println(Integer.toBinaryString((short) 44));
        System.out.println(Integer.toBinaryString((short) 777));
        System.out.println(Integer.toBinaryString((short) 2342));
        System.out.println(Integer.toBinaryString((short) 655));
        System.out.println(Integer.toBinaryString((byte) 52));
        System.out.println(Integer.toBinaryString((byte) 5));
        System.out.println(Integer.toBinaryString((int) 22222));
    }}