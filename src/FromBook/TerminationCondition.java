package FromBook;

class Book {
    boolean checkOut = false;

    Book(boolean checkOut) {
        checkOut = checkOut;
    }

    void setCheckIn() {
        checkOut = false;
    }

    public void finalize() {
        if (checkOut)
            System.out.println("Ошибка: checkOut");
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.setCheckIn();
        new Book(true);
        System.gc();
    }
}


