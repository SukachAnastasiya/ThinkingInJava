package Interfaces.Number5;

import Interfaces.Number5.Interface.Animal;

class Dog implements Animal {

    static void eat(){
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
    }
}

class Labrador extends Dog{

}

public class Dogs{

}
