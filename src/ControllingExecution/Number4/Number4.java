package ControllingExecution.Number4;

import java.util.Scanner;

//Напишите программу, использующую два вложенных цикла for
// и оператор остатка для поиска и вывода простых чисел

public class Number4 {
    public static void main(String[] args) {
        int number;
        Scanner n = new Scanner(System.in);
        System.out.print("Input final number: ");
        number = n.nextInt();
        System.out.println(" The prime numbers: ");
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                if (i != number) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }
}
