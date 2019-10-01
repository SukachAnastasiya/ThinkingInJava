package reusingClasses.number5;


//Создайте два класса А и В, имеющие конструкторы по умолчанию,
// которые выводят сообщение о вызове. Создайте новый класс С, производный от А;
// создайте в С поле типа В. Не создавайте конструктор С.
// Создайте объект класса С и проследите за происходящим

class A {
    A() {
        System.out.println("A constructor");
    }
}

class B {
    B() {
        System.out.println("B constructor");
    }
}

public class C extends A {
    public static void main(String[] args) {
        B b;
        C c;
    }
}

