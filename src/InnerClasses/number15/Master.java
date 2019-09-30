package innerClasses.number15;

class Dog{
    private String name;
    Dog(String name){
        this.name=name;
    }
    public Dog returnDog(){
        return new Dog("Watson"){
        };
    }
}
public class Master {
    public Dog whereAreYou(){
        return new Dog("Bob").returnDog();
    }

    public static void main(String[] args) {
        Master master=new Master();
        Dog dog=master.whereAreYou();
    }
}
