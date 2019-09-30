package innerClasses.number71;

interface Try {
    String attempt();
}

public class Test {
    public Try ones(String a) {
        class firstAttempt implements Try {
            private String ITry;

            @Override
            public String attempt() {
                ITry = a;
                return ITry;
            }
        }
        return new firstAttempt();
    }

    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.ones("Hello").attempt());
    }
}

