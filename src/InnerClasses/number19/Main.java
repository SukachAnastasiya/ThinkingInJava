package innerClasses.number19;

class Outer {
    static class Inner1 {
        private void g() {}
        static class Inner2 {
            private void h() {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
      //Outer.Inner1 inner1 = outer.new Inner1();
    }
}
