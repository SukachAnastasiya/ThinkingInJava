package FromBook;

class Mug{
    Mug(int marker){
        System.out.println("Mug("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1=new Mug(1);
        mug2=new Mug(2);
        System.out.println("mug1 & mug2 has been initialized");
    }
    Mugs(){
        System.out.println("Mugs()");
    }
    Mugs(int i){
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("In method main()");
        new Mugs();
        System.out.println("new Mugs() Ok");
        new Mugs(1);
        System.out.println("new Mugs(1) OK");
    }
}


