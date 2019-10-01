package initializationCleanup.number19;

//Напишите метод, получающий список аргументов переменной длины с
//массивом String. Убедитесь в том, что этому методу может
// передоваться как список объектов String, разделенных запятыми, так и Strint[]

public class Number19 {
    static void f(String... args){
        System.out.println();
        for(String c : args)
            System.out.print(c+" ");

    }

    public static void main(String[] args) {
        f("first", "second");
        String[] massive={"one", "two", "three"};
        f(massive);
    }
}
