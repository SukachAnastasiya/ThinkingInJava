package ControllingExecution.Number2;

import java.util.Arrays;
import java.util.Random;

//Напишите программу, которая генерирует 25 случайных значений типа int.
//Для каждого значения команда if-else сообщает, в кааком отношении оно находится
//c другим случайно сгенерированным числом

public class Number2 {

    public static void main(String[] args) {
        int a = 25;
        int b = 100;
        int[] array = new int[a];
        Random rand = new Random(47);
        for (int i = 0; i < a; i++) {
            array[i] = rand.nextInt(100);
        }
        for (int i = 0; i < a - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(array[i] + " > " + array[i + 1]);
            } else if (array[i] < array[i + 1]) {
                System.out.println(array[i] + " < " + array[i + 1]);
            } else {
                System.out.println(array[i] + " = " + array[i + 1]);
            }
        }
    }
}
