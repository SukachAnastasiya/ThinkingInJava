package InitializationCleanup.Number17;

//Создайте класс с конструктором, получающийм аргумент String.
//Выведите значение аргумента во время конструирования.
//Создайте массив ссылок на этот класс, но не создавайте
//объекты, которыми заполняется массив.
//Запустите программу и посмотрите, будут ли
// выводиться сообщения при вызове конструкторов

public class Number17 {
    Number17(String s){
        System.out.println("s = "+s);
    }

    public static void main(String[] args) {
        Number17[] Cat = new Number17[4];
    }
}
