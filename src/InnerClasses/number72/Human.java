package innerClasses.number72;

interface Neat {
    String behavior();
    String appearance();
}

public class Human {
    public Neat normal(String a, String b){
        return new Neat() {
            private String normalBehavior =a;
            private String normalAppearance=b;

            @Override
            public String behavior() {
                return normalBehavior;
            }

            @Override
            public String appearance() {
                return normalAppearance;
            }
        };
    }

    public static void main(String[] args) {
        Human Mike=new Human();
        System.out.print("Mike is "+Mike.normal("affable", "groomed").appearance());
        System.out.println(" and very "+Mike.normal("affable", "groomed").behavior()+" person");

    }
}
