package initializationCleanup.number15;

//Создайте класс, производный от String,
// инициализируемый в в секции инициализации экземпляров

class Toy{
    Toy(String s){
        System.out.println("Toy("+s+")");
    }
}
public class Toys {
    Toy toy1,
            toy2;
    {
        toy1=new Toy("RussinDoll");
        toy2=new Toy("Rubik'sCube");
    }

    public static void main(String[] args) {
        new Toys();
    }
}

