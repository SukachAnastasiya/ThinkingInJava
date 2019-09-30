package object;
import java.lang.*;

class A{}

class B extends A{}

public class Test {

    public static void getName(Object a ){
        Class c=a.getClass();
        String name = c.getName();
        System.out.println("Name = "+name);
    }

    public static void getSimpleName(Object a ){
        Class c=a.getClass();
        String name = c.getSimpleName();
        System.out.println("Simple Name = "+name);
    }

    public static void getHashCode(Object a){
        int c= a.hashCode();
        System.out.println("hashCode = "+c);
    }

    public static void toString(Object a){
        String toStr=a.toString();
        System.out.println("a.toString() = "+toStr);
    }

    public static void main(String[] args) {
        A a = new A();
//        B b =new B();
//        a=b;

        getName(a);
        getSimpleName(a);
        getHashCode(a);
        getHashCode(a);
        toString(a);
    }

}
