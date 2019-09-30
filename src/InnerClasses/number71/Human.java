package innerClasses.number71;

interface Neat {
    String behavior();
    String appearance();
}

public class Human {
    public Neat normal(String a, String b){
        class NeatHuman implements Neat{
            private String normalBehavior;
            private String normalAppearance;
            private NeatHuman(){
                normalBehavior=a;
                normalAppearance=b;
            }
            public String behavior(){return normalBehavior;}
            public String appearance(){return normalAppearance;}
        }
        return new NeatHuman();
    }

    public static void main(String[] args) {
        Human Mike=new Human();
        System.out.print("Mike is "+Mike.normal("affable", "groomed").appearance());
        System.out.println(" and very "+Mike.normal("affable", "groomed").behavior()+" person");

    }
}
