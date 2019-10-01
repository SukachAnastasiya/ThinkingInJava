package reusingClasses.number2;


//Объявите новый класс производный от Detergent.
// Переопределите метод scrub() и добавьте новый метод с имененм sterilize()

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        Cleanser.main(args);
    }
}

public class HydrogenPeroxide extends Detergent {
    public void scrub() {
        append(" HydrogenPeroxide.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        HydrogenPeroxide x = new HydrogenPeroxide();
        x.dilute();
        x.apply();
        x.scrub();
        x.sterilize();
        System.out.println(x);
        Cleanser.main(args);
    }
}

