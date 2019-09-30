package innerClasses.number5;

public class Outer {
    public class Inner {}
    }

class CallInner {
    Outer outer=new Outer();
    Outer.Inner ni = outer.new Inner();
}