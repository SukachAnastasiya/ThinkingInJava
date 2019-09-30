package exceptions.number2;

class MyException extends Exception{
    public MyException(){};
}

public class Test {
    public static void f() throws MyException{
        throw new MyException();
    }
    public static void main(String[] args) {
        Test test=null;
        try {
            test.f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }

    }
}
