package com.company.design;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        char operator;
        double answer = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number a: ");
        num1 = scanner.nextInt();
        System.out.println("Please enter number b: ");
        num2 = scanner.nextInt();

        System.out.println("Please enter an operator: ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;

            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        System.out.println(num1 + " " + operator + num2 + "=" + answer);
    }
}
