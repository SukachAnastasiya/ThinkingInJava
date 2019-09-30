package reusingClasses.number16;

// Создайте класс с именем Amphibian. Объявите производный от него класс с именем Frog.
// Разместите в базовом классе несколько методов. В методе main() создайте объект Frog,
// переобразуйте его в Amphibian и продемонстрируйте, что все методы работают.

class Amphibian {
    private String name;
    public void eat(Amphibian frog, String name) {
        this.name=name;
        System.out.println(name + " is eating");
    }

    public void sleep(Amphibian frog, String name) {
        this.name=name;
        System.out.println(name + " is sleeping");
    }
}

public class Frog extends Amphibian {

    public void eat(Frog frog, String name) {
        super.eat(frog, name);
    }

    public void jump(String name) {
        System.out.println(name + " is jumping");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = frog;
        frog.sleep(frog, "Bob");
        amphibian.eat(frog,"Bob");
        amphibian.eat(frog, "Bill");
        frog.jump("Tod");
    }
}
