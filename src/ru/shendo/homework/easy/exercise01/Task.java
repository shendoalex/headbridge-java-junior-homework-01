package ru.shendo.homework.easy.exercise01;

import java.util.Scanner;

/*
Сравнение чисел:
Напишите программу, которая сравнивает два числа и определяет, равны ли они или одно больше другого.
Входные данные 5 8
Результат Первое число больше второго.
*/

public class Task {
    public static void main(String[] args) {
        compareTwoNumbers();
    }

    public static void compareTwoNumbers() {
        final String FIRST_NUMBER_IS_BIGGER = "Первое число больше второго.";
        final String SECOND_NUMBER_IS_BIGGER = "Второе число больше первого.";
        final String NUMBERS_ARE_EQUAL = "Числа равны.";
        final String INPUT_DIALOG = "Введите число номер";
        int numberA;
        int numberB;

        Scanner scanner = new Scanner(System.in);
        System.out.printf(INPUT_DIALOG + " %d : ", 1);
        numberA = scanner.nextInt();
        System.out.printf(INPUT_DIALOG + " %d : ", 2);
        numberB = scanner.nextInt();
        scanner.close();

        if (numberA > numberB) {
            System.out.println(FIRST_NUMBER_IS_BIGGER);
        } else if (numberB > numberA) {
            System.out.println(SECOND_NUMBER_IS_BIGGER);
        } else {
            System.out.println(NUMBERS_ARE_EQUAL);
        }
    }

}