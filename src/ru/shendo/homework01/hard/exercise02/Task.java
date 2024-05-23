package ru.shendo.homework01.hard.exercise02;

import java.util.Scanner;

/*
Проверка на простое число:
Напишите программу, которая определяет, является ли заданное число простым.
Входные данные 17
Результат Число является простым.
 */

public class Task {
    public static void main(String[] args) {
        checkIfNumberIsPrime();
    }

    public static void checkIfNumberIsPrime() {
        final String INPUT_DIALOG = "Введите число: ";
        final String NUMBER_IS_PRIME = "Число является простым.";
        final String NUMBER_NOT_PRIME = "Число не является простым.";
        int numberToCheck;
        String checkResult;

        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_DIALOG);
        numberToCheck = scanner.nextInt();
        scanner.close();

        checkResult = NUMBER_IS_PRIME;
        if (numberToCheck <= 1) {
            checkResult = NUMBER_NOT_PRIME;
        } else {
            int middleNumber = numberToCheck / 2;
            for (int i = 2; i <= middleNumber; i++) {
                if (numberToCheck % i == 0) {
                    checkResult = NUMBER_NOT_PRIME;
                    break;
                }
            }
        }
        System.out.println(checkResult);
    }

}
