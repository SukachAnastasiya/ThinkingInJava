package innerClasses.number3;

public class Outer {
    private String label;
    Outer(String s){
        label = s;
    }
    class Inner{
        public String toString(){
            return label;
        }
    }

    public Inner newInner(){
        return new Inner();
    }

    public void start(){
        Inner i = newInner();
        System.out.println(i);
    }

    public static void main(String[] args) {
        Outer out = new Outer("pop");
        out.start();
    }
}
