package Polymorphism.Number17;

class Starship{
    public void act(){}
}

class AlertStatusRed extends Starship{
    public void act(){
        System.out.println("Alert status is red");
    }
}

class AlertStatusGreen extends Starship{
    public void act(){
        System.out.println("Alert status is green");
    }
}

class AlertStatusUnable extends Starship{
    public void act(){
        System.out.println("Alert status is unable");
    }
}

class AlertStatus{
    private Starship starship=new AlertStatusGreen();
    public void change(){
        starship=new AlertStatusRed();
    }
    public void change(int r){
        starship=new AlertStatusUnable();
    }
    public void Run(){
        starship.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        AlertStatus alert=new AlertStatus();
        alert.change();
        alert.Run();
        alert.change(4);
        alert.Run();
    }
}
