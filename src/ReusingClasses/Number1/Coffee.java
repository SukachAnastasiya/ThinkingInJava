package reusingClasses.number1;

//Создайте простой класс. Во втором классе определите ссылку на объект первого класса.
// Используйте отложенную инициализацию для создания экземпляров этого класса

class Milk {
    private String s;

    Milk() {
        s = "Add milk";
    }

    public String toString() {
        return s;
    }
}

public class Coffee {
    private String s = "Coffee with milk, please";
    Milk WhiteCoffee;

    public String toString() {
        if (s == "Coffee with milk, please") {
            WhiteCoffee = new Milk();
        }
        return s + "\n" + "..." + WhiteCoffee + "...\n" + "Here you are";
    }

    public static void main(String[] args) {
        Coffee want = new Coffee();
        System.out.println(want);
    }
}

