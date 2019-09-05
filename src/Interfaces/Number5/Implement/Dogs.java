package Interfaces.Number5.Implement;
import Interfaces.Number5.Interface.Animal;

class Dog implements Animal {
    public String toString() {
        return "Someone";
    }
    public void eat() {
        System.out.println(this + " is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void drink() {
        System.out.println("Dog is drinking");
    }
}

class Labrador extends Dog {
    public String toString() {
        return "Labrador";
    }
}

public class Dogs {

    public static void All(Animal i) {
        i.eat();
        i.sleep();
        i.drink();
    }

    public static void main(String[] args) {
        Animal animal[] = {
                new Labrador(),
                new Dog()
        };
        for (Animal i : animal) {
            All(i);
        }
    }

}
