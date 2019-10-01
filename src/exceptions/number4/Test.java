package exceptions.number4;

class MyException extends Exception{
    private String info;
    public MyException(String str){
        info=str;
    }
    public void write(){
        System.out.println(info);
    }
}

public class Test {
    public static void f() throws MyException{
        throw new MyException("Hello Exception");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch(MyException e){
            e.printStackTrace(System.out);
        }
    }
}
