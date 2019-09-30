package reusingClasses.number18;

class Value{
    int i;
    public Value(int i){
        this.i=i;
    }
}

public class Test {
    private String val;
    public Test(String val){this.val=val;}
    public final Value v1=new Value(9);                  // объект можно изменить
    public static final Value VALUE_TWO=new Value(11);  //объект нельзя изменить
    public String toString(){
        return val+" : "+v1+"     "+VALUE_TWO;
    }

    public static void main(String[] args) {
        Test test=new Test("testOne");
        test.v1.i++;
//        test.v1=new Value(12);

    }
}
