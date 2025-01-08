package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
        double quotient = (double) firstNumber / secondNumber;
        System.out.println(quotient);
        int sum =  firstNumber + secondNumber;
        System.out.println(sum);
        int comp =  firstNumber * secondNumber;
        System.out.println(comp);
        int diff =  firstNumber - secondNumber;
        System.out.println(diff);
    }
}