package ru.shendo.homework.easy.exercise02;

/*
Проверка на четность:
Напишите программу, которая определяет, является ли введенное число четным или нечетным.
Входные данные 12
Результат Число четное.
 */

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        checkNumberForEvenness();
    }

    public static void checkNumberForEvenness() {
        final String NUMBER_IS_EVEN = "Число четное.";
        final String NUMBER_IS_ODD = "Число нечетное.";
        final String INPUT_DIALOG = "Введите число: ";

        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_DIALOG);
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(number % 2 == 0 ? NUMBER_IS_EVEN : NUMBER_IS_ODD);
    }
}
