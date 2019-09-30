package interfaces.number13;

interface Food {
    void eat();
}

interface eat extends Food{
    void eat();
}

interface drink extends Food{
void drink();
}

interface haveLunch extends eat, drink{
    void eat();
    void drink();
}

class IWantFood implements Food{
    public void eat(){
        System.out.println("FOOD");
    }
    public void drink(){
        System.out.println("COLA");
    }

    public static void main(String[] args) {
        IWantFood I=new IWantFood();
        I.drink();
        I.eat();
    }
}
