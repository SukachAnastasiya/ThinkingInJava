
public class Flags {
    private static final int MASK_BIT_1 = 0x01;

    public static int set(int flag, int bit) {
        int mask = 1 << bit;
        return flag | mask;
    }

    public static void check(int position, int target) {
        if (((target >>> position) & MASK_BIT_1) == 1) {
            System.out.println("There is 0");
        } else
            System.out.println("There is 1");
    }

    public static int leftShift(int flag, int bit) {
        return (flag >> bit);
    }

    public static int rightShift(int flag, int bit) {
        return (flag << bit);
    }

    public static int reset(int flag, int bit) {
        int mask = 1 << bit;
        return (flag ^ mask);
    }

    public static void main(String[] args) {
        int flag = 0;
        flag = set(flag, 0);
        flag = set(flag, 8);
        flag = set(flag, 3);
        flag = set(flag, 6);
        System.out.println("flag = " + Integer.toBinaryString(flag));
        check(1, flag);
        flag = reset(flag, 3);
        System.out.println("flag = " + Integer.toBinaryString(flag));
    }
}

