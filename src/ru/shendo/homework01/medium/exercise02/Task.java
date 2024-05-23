package ru.shendo.homework01.medium.exercise02;

import java.util.Scanner;

/*
Определение високосного года:
Напишите программу, которая определяет, является ли заданный год високосным.
Входные данные 2024
Результат Год високосный.
 */

public class Task {
    public static void main(String[] args) {
        checkYearForLeap();

    }

    public static void checkYearForLeap() {
        final String INPUT_DIALOG = "Введите год: ";
        final String YEAR_IS_LEAP = "Год високосный.";
        final String YEAR_IS_NOT_LEAP = "Год не високосный.";
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_DIALOG);
        year = scanner.nextInt();
        scanner.close();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(YEAR_IS_LEAP);
        } else {
            System.out.println(YEAR_IS_NOT_LEAP);
        }
    }
}
