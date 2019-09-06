package Interfaces.Number14;

interface Breakfast {
    void scrambledEggs();

    void coffee();
}

interface Lunch {
    void borscht();

    void compote();
}

interface Dinner {
    void fish();

    void vegetables();
}

interface Menu extends Breakfast, Lunch, Dinner {
    void price();
}

class ChooseFood {
    void choice(Breakfast b, Lunch l, Dinner d) {
        b.coffee();
        l.borscht();
        d.fish();
    }
}

public class OrderFood extends ChooseFood {
    void price(Breakfast b, Lunch l, Dinner d){

    };

    public static void main(String[] args) {

    }
}
