package Polymorphism.Number10;

class Coffee {
    public void hot() {
        System.out.println("Sorry, this coffee isn't hot");
        ice();
    }

    public void ice() {
        System.out.println("It's Coffee with milk");
    }
}

public class WhiteCoffee extends Coffee {
    public void ice() {
        System.out.println("here you are");
    }

    public static void main(String[] args) {
        Coffee coffee = new WhiteCoffee();
        coffee.hot();
    }
}
