package initializationCleanup.number22;

//Создайте перечисление с названиями шести типов бумажных денег.
//Напишите команду switch для перечисления.
//Для каждого случая выведите расширенное описание конкретной валюты

public class Money {
    Currency Country;

    public Money(Currency Country) {
        this.Country = Country;
    }

    public void describe() {
        System.out.println("In " + Country + " people use ");
        switch (Country) {
            case EURO:
                System.out.println("Euro/n1 Euro = 1,12 Dollars");
                break;
            case RUBLE:
                System.out.println("Ruble/n1 Ruble = 0,49 Dollars");
                break;
            case YEN:
                System.out.println("Yen/n 1 Yen = 0,0095 Dollars");
                break;
            case KRONE:
                System.out.println("Krone/n 1 Krone = 0,15 Dollars");
                break;
            case POUND:
                System.out.println("Pound/n 1 Pond of Sterling = 1,21 Dollars");
                break;
            case DOLLAR:
                System.out.println("Dollar");
        }
    }

    public static void main(String[] args) {
        Money Belarus = new Money(Currency.RUBLE),
                USA = new Money(Currency.DOLLAR),
                Denmark = new Money(Currency.KRONE),
                Japan=new Money(Currency.YEN),
                England=new Money(Currency.POUND),
                Germany=new Money(Currency.EURO);
        Belarus.describe();
        USA.describe();
        Denmark.describe();
        Japan.describe();
        England.describe();
        Germany.describe();
    }
}

