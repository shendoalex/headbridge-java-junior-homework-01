package ru.shendo.homework01.easy.exercise03;

import java.util.Scanner;

/*
Определение времени суток:
Пользователь вводит текущее время (часы), программа должна определить, утро, день, вечер или ночь.
Входные данные 14
Результат День
 */

public class Task {
    public static void main(String[] args) {
        determinePeriodOfTheDay();
    }

    public static void determinePeriodOfTheDay() {
        final String MORNING = "Утро";
        final String DAY = "День";
        final String EVENING = "Вечер";
        final String NIGHT = "Ночь";
        final String INPUT_DIALOG = "Введите текущее время (час): ";
        int hour;

        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_DIALOG);
        hour = scanner.nextInt();
        scanner.close();

        if ((hour >= 0 && hour <= 5) || hour == 24) {
            System.out.println(NIGHT);
        } else if (hour >= 6 && hour <= 11) {
            System.out.println(MORNING);
        } else if (hour >= 12 && hour <= 18) {
            System.out.println(DAY);
        } else {
            System.out.println(EVENING);
        }
    }
}
