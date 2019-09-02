package Interfaces.Number3;

abstract class base{
    abstract void print();
    base(){
        print();
    }
}

public class Derived extends base{
    private int i=5;
    void print(){
        System.out.println("i = "+i);
    }

    public static void main(String[] args) {
        Derived derived=new Derived();
        derived.print();
    }
}
