package polymorphism.number6;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play()" + n);
    }

    String what() {
        return "wind";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Instrument {
    void play(Note n) {
        System.out.println("Brass.play()" + n);
    }

    String what() {
        return "Brass";
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Instrument {
    void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }

    String what() {
        return "Woodwind";
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }
}

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
        {
            String s;
            s= i.what();
            System.out.println(s);
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument instrument=new Instrument();
        System.out.println(instrument);
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
