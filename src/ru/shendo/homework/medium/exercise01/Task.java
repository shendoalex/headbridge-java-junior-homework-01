package ru.shendo.homework.medium.exercise01;

import java.util.Scanner;

/*
Калькулятор:
Напишите программу-калькулятор, которая выполняет арифметические операции
(сложение, вычитание, умножение, деление) над двумя числами в зависимости от выбора пользователя.
Входные данные 10 5 +
Результат 15
 */

public class Task {
    public static void main(String[] args) {
        performArithmeticOperationOnTwoNumbers();
    }

    public static void performArithmeticOperationOnTwoNumbers() {
        final String INPUT_DIALOG =
                "Введите два числа и знак арифметической операции (через пробел): ";
        final String DIVIDE_BY_ZERO_NOT_ALLOWED = "Деление на ноль невозможно.";
        final String WRONG_OPERATOR = "Неправильный арифметический оператор : ";
        String inputExpression;
        int firstNumber;
        int secondNumber;
        char operation;

        Scanner scanner = new Scanner(System.in);
        System.out.print(INPUT_DIALOG);
        inputExpression = scanner.nextLine();
        scanner.close();

        String[] inputExpressionSplitted = inputExpression.split(" ");
        firstNumber = Integer.parseInt(inputExpressionSplitted[0]);
        secondNumber = Integer.parseInt(inputExpressionSplitted[1]);
        operation = inputExpressionSplitted[2].charAt(0);

        if (operation == '/' && secondNumber == 0) {
            System.out.println(DIVIDE_BY_ZERO_NOT_ALLOWED);
            return;
        }

            switch (operation) {
                case '+' -> System.out.println(firstNumber + secondNumber);
                case '-' -> System.out.println(firstNumber - secondNumber);
                case '*' -> System.out.println(firstNumber * secondNumber);
                case '/' -> System.out.println(firstNumber / secondNumber);
                default -> System.out.println(WRONG_OPERATOR + operation);
            }
        }
    }

