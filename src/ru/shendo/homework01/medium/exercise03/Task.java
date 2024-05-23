package ru.shendo.homework01.medium.exercise03;

import java.util.Scanner;

/*
Расчет факториала:
Пользователь вводит число, программа должна вычислить его факториал.
Входные данные 5
Результат 120
 */
public class Task {
    public static void main(String[] args) {
        calculateFactorial();
    }

    public static void calculateFactorial() {
        final String INPUT_DIALOG = "Введите число: ";
        final String FACTORIAL_WARNING = "Факториал от числа меньше 1 - не вычисляется.";
        int numberForCalculation;
        int count = 1;
        int result = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_DIALOG);
        numberForCalculation = scanner.nextInt();
        scanner.close();

        if (numberForCalculation < 1) {
            System.out.println(FACTORIAL_WARNING);
        } else {
            while (count <= numberForCalculation) {
                result *= count;
                count++;
            }
            System.out.println(result);
        }
    }
}
