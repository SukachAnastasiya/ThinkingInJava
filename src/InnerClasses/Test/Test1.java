package InnerClasses.Test;

public class Test1 {
    class Inner{
        private String label;
        Inner(String s){
            label = s;
        }
        public String toString(){
            return label;
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        Test1.Inner testi = test.new Inner("pop");
        System.out.println(testi);
    }
}
