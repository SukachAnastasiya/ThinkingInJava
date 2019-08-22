package ControllingExecution.Number5;

import java.util.ArrayList;
import java.util.Scanner;

public class Number5 {
    static int First = 0xae4;
    static int Second = 0x76df;

    static Integer binary(int number) {
        ArrayList<Character> bin = new ArrayList<>();
        while (number >= 1) {
            bin.add((char) (number % 2 == 0 ? 0 : 1));
            number = number / 2;
        }
        StringBuilder builder = new StringBuilder(bin.size());
        for(int ch: bin){
            builder.append(ch);
        }
        String s = builder.toString();
        int result = Integer.parseInt(s);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int first = binary(First);
        int second = binary(Second);
        System.out.println("First = " + binary(first));
        System.out.println("Second = " + binary(second));
        //System.out.println("~First = " + binary(~first));
        //System.out.println("~Second = " + binary(~second));
        //System.out.println("First & Second = " + binary(first & second));
        //System.out.println("First | Second = " + binary(first | second));
        //System.out.println("First ^ Second = " + binary(first ^ second));
    }
}

