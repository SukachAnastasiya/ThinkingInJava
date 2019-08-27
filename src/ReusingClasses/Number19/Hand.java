package ReusingClasses.Number19;
class Arm{
    private String i;
    Arm(String ii ){i=ii;}
    public String toString(){
        return i;
    }
}
public class Hand {
    Arm arm;
    private final int thumb=1;
    private final int forefinger;
    public Hand(){
        System.out.println("first : ");
        forefinger=2;
        arm=new Arm("right");
        System.out.println(forefinger+"  "+arm);
        System.out.println();
    }
    public Hand(int x){
        System.out.println("second : ");
        forefinger=x;
        arm=new Arm("left");
        System.out.println(forefinger+"   "+arm);
    }

    public static void main(String[] args) {
        new Hand();
        new Hand(4);
    }
}
