package innerClasses.number81;

interface Neat {
    String behavior();

    String appearance();
}

public class Human {
    private int value = 0;

    public Neat normal(String a, String b) {
        if (value == 0) {
            class NeatHuman implements Neat {
                private String normalBehavior;
                private String normalAppearance;

                private NeatHuman() {
                    normalBehavior = a;
                    normalAppearance = b;
                }

                public String behavior() {
                    return normalBehavior;
                }

                public String appearance() {
                    return normalAppearance;
                }
            }
            return new NeatHuman();
        } else
            return null;
    }

    public static void main(String[] args) {
        Human Mike = new Human();
        System.out.print("Mike is " + Mike.normal("affable", "groomed").appearance());
        System.out.println(" and very " + Mike.normal("affable", "groomed").behavior() + " person");

    }
}
