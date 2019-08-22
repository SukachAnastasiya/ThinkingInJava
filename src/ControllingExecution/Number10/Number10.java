package ControllingExecution.Number10;

import java.util.*;

//Вампирами называются числа, состоящие из четного кол-ва
// цифр и полученные перемножением пары чисел,
//каждое из которых содержит половину цифр результата.
//Цифры берутся из исходного число в произвольном порядке,
//завершающие нули не допустимы.

public class Number10 {
    static int Number10(int[] remainder, int number) {
        boolean[] used = new boolean[4];
        for (int i = 0; i < remainder.length; i++) {
            Arrays.fill(used, false);
            int a;
            if (i != 0) {
                used[i] = true;
                for (int j = 0; j < remainder.length; j++) {
                    int b_1,
                            b_2,
                            c = 0,
                            d = 0;
                    if (j != i) {
                        used[j] = true;
                        a = remainder[i] * 10 + remainder[j];
                        int FirstValue = 0;

                        for (int k = 0; k < used.length; k++) {
                            if (!used[k]) {

                                if (FirstValue != 0) {
                                    d = remainder[k];
                                } else {
                                    c = remainder[k];
                                    FirstValue++;
                                }
                            }
                        }

                        if (c != 0 && d != 0) {
                            b_1 = c * 10 + d;
                            b_2 = d * 10 + c;
                            if (a * b_1 == number)
                                return number;
                            if (a * b_2 == number)
                                return number;
                        } else if (c != 0 && d == 0) {
                            b_1 = c * 10 + d;
                            if (a * b_1 == number)
                                return number;
                        } else if (c == 0 && d != 0) {
                            b_1 = d * 10 + c;
                            if (a * b_1 == number)
                                return number;
                        }
                        used[j] = false;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int number;
        ArrayList<Integer> vampire = new ArrayList<>();
        for (number = 1000; number < 10000; number++) {
            int[] remainder = new int[4];
            int n = 0;
            int temp = number;
            while (temp >= 1) {
                remainder[n] = temp % 10;
                temp = temp / 10;
                n++;
                int maybe = Number10(remainder, number);
                if (maybe != 0)
                    vampire.add(number);
            }

        }
        for (int i : vampire) {
            System.out.println(i);
        }
    }
}

