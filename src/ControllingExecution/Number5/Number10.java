package ControllingExecution.Number5;

//Напишите программу с двумя константами: обе константы состоят из чередующихся 0 и 1,
//но у одной нулю равен младший бит, а у другой старший

public class Number10 {
    static int First = 0xae4;     //101011100100
    static int Second = 0x76df;  //0111011011011111

    public static void main(String[] args) {
        System.out.println("First int  = " + Integer.toBinaryString(First));
        System.out.println("Second int = " + Integer.toBinaryString(Second));
        System.out.println("~First = " + Integer.toBinaryString(~First));
        System.out.println("~Second = " + Integer.toBinaryString(~Second));
        System.out.println("First & Second = " + Integer.toBinaryString(First & Second));
        System.out.println("First | Second = " + Integer.toBinaryString(First | Second));
        System.out.println("First ^ Second = " + Integer.toBinaryString(First ^ Second));
    }
}
