package innerClasses.number7;

public class Outer {
    private String truth;

    private void tellTruth(String truth) {
        this.truth=truth;
        System.out.println("И тут он сказал:\"" + truth+"\".");
    }

    public void call(){
        Inner inner=new Inner();
        inner.tell();
    }
    class Inner {
        void tell(){
            truth="Я твой отец, сын мой";
            tellTruth(truth);
        }
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.call();
    }
}
