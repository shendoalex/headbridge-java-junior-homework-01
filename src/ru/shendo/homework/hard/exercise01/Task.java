package ru.shendo.homework.hard.exercise01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
Перевод числа в римскую систему:
Напишите программу, которая преобразует введенное число в римскую систему счисления.
Входные данные 47
Результат Римское представление: XLVII
 */

public class Task {
    public static void main(String[] args) {
        arabToRomanConverter();
    }

    public static void arabToRomanConverter() {
        final String INPUT_DIALOG = "Введите число: ";
        final String CONVERSION_IMPOSSIBLE =
                "Неправильное число. В римской системе возможны числа от 1 до 3999.";
        int numberToConvert;

        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_DIALOG);
        numberToConvert = scanner.nextInt();
        scanner.close();

        if (numberToConvert < 1 || numberToConvert > 3999) {
            System.out.println(CONVERSION_IMPOSSIBLE);
        } else {
            StringBuilder romanString = new StringBuilder();
            Map<Integer, String> map = new LinkedHashMap<>();
            map.put(1000, "M");
            map.put(900, "CM");
            map.put(500, "D");
            map.put(400, "CD");
            map.put(100, "C");
            map.put(90, "XC");
            map.put(50, "L");
            map.put(40, "XL");
            map.put(10, "X");
            map.put(9, "IX");
            map.put(5, "V");
            map.put(4, "IV");
            map.put(1, "I");

            for (int i = 0; i < map.size(); i++) {
                int yearNumber = (Integer) map.keySet().toArray()[i];
                while (numberToConvert >= yearNumber) {
                    romanString.append(map.get(yearNumber));
                    numberToConvert -= yearNumber;
                }
            }
            System.out.println(romanString);
        }
    }
}
