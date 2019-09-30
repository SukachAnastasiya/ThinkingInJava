package polymorphism.number9;

class Rodent{
    void bite(){
        System.out.println("bite");
    }
    void lick(){
        System.out.println("lick ");
    }
    void eat(){
        System.out.println("eat");
    }
}

class Hamster extends Rodent {
    void bite(){
        System.out.println("Hamster bites");
    }
    void lick(){
        System.out.println("Hamster licks ");
    }
    void eat(){
        System.out.println("Hamster eats");
    }
}

class Mouse extends Rodent{
    void bite(){
        System.out.println("Mouse bites");
    }
    void lick(){
        System.out.println("Mouse licks ");
    }
    void eat(){
        System.out.println("Mouse eats");
    }
}

class Rabbit extends Rodent{
    void bite(){
        System.out.println("Rabbit bites");
    }
    void lick(){
        System.out.println("Rabbit licks ");
    }
    void eat(){
        System.out.println("Rabbit eats");
    }
}

public class Animal {
    public static void main(String[] args) {
        Rodent [] rodents={
                new Hamster(),
                new Mouse(),
                new Rabbit()
        };
        for(Rodent i: rodents){
            i.bite();
            i.eat();
            i.lick();
        }
        Rodent hamster=new Hamster();
        hamster.bite();
    }
}
