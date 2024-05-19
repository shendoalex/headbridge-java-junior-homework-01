package ru.shendo.homework.easy.exercise01;

/*
Сравнение чисел:
Напишите программу, которая сравнивает два числа и определяет, равны ли они или одно больше другого.
Входные данные 5 8
Результат Первое число больше второго.
*/

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        compareTwoNumbers();
    }

    public static void compareTwoNumbers() {
        final String FIRST_NUMBER_IS_BIGGER = "Первое число больше второго.";
        final String SECOND_NUMBER_IS_BIGGER = "Второе число больше первого.";
        final String NUMBERS_ARE_EQUAL = "Числа равны.";
        final String INPUT_NUMBER = "Введите число номер";
        int numberA;
        int numberB;

        Scanner scanner = new Scanner(System.in);
        System.out.printf(INPUT_NUMBER + " %d : ", 1);
        numberA = scanner.nextInt();
        System.out.printf(INPUT_NUMBER + " %d : ", 2);
        numberB = scanner.nextInt();

        if (numberA > numberB) {
            System.out.println(FIRST_NUMBER_IS_BIGGER);
        } else if (numberB > numberA) {
            System.out.println(SECOND_NUMBER_IS_BIGGER);
        } else {
            System.out.println(NUMBERS_ARE_EQUAL);
        }
    }

}