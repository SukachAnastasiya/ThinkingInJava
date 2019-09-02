import java.util.Scanner;
import java.util.ArrayList;

public class Flag {
    static int number = 0xa4;

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

    public void check(int i){

    }

    public void set(int i){
    }

    public void reset(int i){
    }

    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        int bin=binary(number);
        System.out.println("Switch\n 1. Set\n2.Check\n3.Reset\n4.Sdvig");
        int i=k.nextInt();
        switch (i){
//            case 1:set(bin);
//            case 2:check(bin);
//            case 3:reset(bin);
        }
    }
}
