package Polymorphism.Number16;

class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph перед вызовом draw()");
        draw();
        System.out.println("Glyph после вызова draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius=1;
    RoundGlyph(int r){
        radius=r;
        System.out.println("RoundGlyph(), radius = "+radius);
    }
    void draw(){
        System.out.println("Glyph.draw(), radius = "+radius);
    }
}

class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}

public class RectangularGlyph extends PolyConstructors{
    public static void main(String[] args) {
        new PolyConstructors();
    }
}
