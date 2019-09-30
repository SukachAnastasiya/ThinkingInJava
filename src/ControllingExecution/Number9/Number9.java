package controllingExecution.number9;

import java.util.Scanner;

//Напишите метод, который получает целочисленный аргумент
// и выводит указанное кол-во чисел Фибоначчи

public class Number9 {
    static int[] Fibonacci(int amount) {
        int[] fibonacci = new int[amount];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        int i = 2;
        while (i < amount) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            i++;
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        System.out.print("Input amount of Fibonacci: ");
        Scanner n = new Scanner(System.in);
        int count = n.nextInt();
        System.out.print(Fibonacci(count));
    }
}

