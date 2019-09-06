package InnerClasses.Number1;

public class Outer {
    class Inner{
        private String label;
        Inner (String s){
            label = s;
        }
        String readName(){return label;}
    }
    public Inner newInner(String label){
        return new Inner(label);
    }
    public void start(String label){
        Inner i = newInner(label);
        System.out.println(i.readName());
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        out.start("pop");
    }
}
