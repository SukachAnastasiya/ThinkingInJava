package ControllingExecution.Number6;

//Измените метод test() так, чтобы он получал два дополнительных аргумента begin & end,
// а значение testval проверялось на принадлежность диапазону [degin; end]

public class Number6 {
    static String result = "";

    static int test(int testval, int target, int begin, int end) {
        if (testval > target) {
            if (testval >= begin && testval <= end)
                result = "in range";
            else
                result = "out of range";
            return +1;
        }
        if (testval < target) {
            if (testval >= begin && testval <= end)
                result = "in rage";
            else
                result = "out of range";
            return -1;
        } else {
            if (testval >= begin && testval <= end)
                result = "in range";
            else
                result = "out of range";
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(2, 2, 0, 5) + " " + result);
        System.out.println(test(5, 10, 0, 11) + " " + result);
        System.out.println(test(6, 4, 7, 9) + " " + result);
    }
}

