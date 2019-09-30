package polymorphism.number18;


import java.util.Random;

class Cycle {
    public void ride(Human i) {
        System.out.println(i + " ride a cycle");
    }
}

class Unicycle extends Cycle {
    public void ride(Human i) {
        System.out.println(i + " ride a Unicycle");
    }
    public void balance(){
        System.out.println("Unicycle in balance");
    }
}

class Bicycle extends Cycle {
    public void ride(Human i) {
        System.out.println(i + " ride a Bicycle");
    }
    public void balance(){
        System.out.println("Bicycle in balance");
    }
}

class Tricycle extends Cycle {
    public void ride(Human i) {
        System.out.println(i + " ride a Tricycle");
    }
}

public class Riding {
    public static Human set() {
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            default:
            case 1:
                return Human.MARGO;
            case 2:
                return Human.OLYA;
            case 3:
                return Human.SASHA;
        }
    }

    public static void ride(Cycle i) {
        Human human;
        human = set();
        i.ride(human);
    }

    public static void rideAll(Cycle[] e) {
        Human human;
        for (Cycle i : e) {
            human = set();
            i.ride(human);
        }
    }

    public static void balanceAll(Cycle[] e){
        for (Cycle i : e) {
        //    i.balanceAll();
        }
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Unicycle unicycle = new Unicycle();
        bicycle.balance();
        unicycle.balance();
        Cycle[] newCycle = {
                new Cycle(),
                new Bicycle(),
                new Tricycle(),
                new Unicycle()
        };
    }
}
