package interfaces.number10;

interface Instrument {
    void adjust();
}

interface Playable extends Instrument{
    void play(Note n);
}

abstract class AllInstruments implements Playable  {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Wind extends AllInstruments {
    public String toString() {
        return "Wind";
    }
}

class Percussion extends AllInstruments {
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends AllInstruments {
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music {
    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}


