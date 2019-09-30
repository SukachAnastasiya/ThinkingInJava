package fromBook;

public class Sun {
    int i = 0;
    int v = 5;

    Sun Shine() {
        i++;
        return this;
    }

    void Sunset() {
        System.out.println("The sun is going down in " + i + " minuts" + v);
    }

    public static void main(String[] args) {
        Sun light = new Sun();
        light.Shine();
    }
}

