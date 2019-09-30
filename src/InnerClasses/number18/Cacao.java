package innerClasses.number18;

public class Cacao {
    static class Milk{
        private String cacao(){return "Cacao with Milk";}
    }
    public static void main(String[] args) {
       Milk milk=new Milk();
        System.out.println(milk.cacao());
    }
}
