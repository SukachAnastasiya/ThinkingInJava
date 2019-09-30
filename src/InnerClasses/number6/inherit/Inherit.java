package innerClasses.number6.inherit;
import innerClasses.number6.base.Outer;

public class Inherit extends Outer {
    public Inner getInner(){
        Outer outer=new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.setName();
        return inner;
    }
    public static void main(String[] args) {
        Inherit inherit=new Inherit();
        String name=inherit.getInner().setName();
        System.out.println(name);

    }
}
