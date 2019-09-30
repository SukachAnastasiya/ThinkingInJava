package exceptions.number3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array =new int[5];
         for(int i=0;i<array.length;i++)
             array[i]=i+1;
         try {
             array[array.length + 1] = array.length + 2;
         }catch (ArrayIndexOutOfBoundsException r){
             System.out.println("перехвачено");
        }
    }
}
