package object;

public class SimpleName {
    public static void main(String[] args) {
        SimpleName simple = new SimpleName();
        Class c = simple.getClass();

        String name = c.getName();
        System.out.println("Class name = " + name);

        String simpleName = c.getSimpleName();
        System.out.println("Class simpleName = " + simpleName);
    }
}
