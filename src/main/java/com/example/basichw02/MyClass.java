package com.example.basichw02;


import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入你的生日並以空白鍵區隔");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        System.out.println("你的生日是 "+year+"年"+month+"月"+day+"日");

    }
}