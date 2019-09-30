package exceptions.number1;

class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}

public class Number1 {
    public static void f() throws MyException{
        throw new MyException("exception");
    }
    public static void main(String[] args) {
        try {
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }
}
