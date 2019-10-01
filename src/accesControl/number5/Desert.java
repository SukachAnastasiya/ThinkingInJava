package accesControl.number5;

//Создайте класс с полями и методами, обладающими разными
// уровнями доступа: public, private, protected, доступом в пределах пакета
//Создайте объект этого класса и посмотрите, какие сообщения выдаст компилятор
//при попытке обращения к разным членам класса.

public class Desert extends IceCream{
    public static void main(String[] args) {
        IceCream Kapriz=new IceCream();
        Kapriz.taste1="chocolate";
        // Kapriz.taste2="vanilla";
        Kapriz.taste3="pistachio";

        Kapriz.IceCream1();
        // Kapriz.IceCream2();
        Kapriz.IceCream3();
        Kapriz.bite();
    }
}
