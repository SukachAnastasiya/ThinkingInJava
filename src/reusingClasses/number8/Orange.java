package reusingClasses.number8;


// Создайте базовый класс с единственным конструктором,
// не являющимся конструктором по умолчанию, и производный класс
// с конструктором как по умолчанию, так и с аргументами.
// В конструкторе производного класса вызовите конструктор базового класса

class Juice {
    Juice(String s){
        System.out.println(s+" Juice");
    }

}

public class Orange extends Juice {
    Orange(){
        super("Orange");
    }

    Orange(String s) {
        super("Tomato");
    }

    public static void main(String[] args) {
        Orange maybe=new Orange();
    }
}

