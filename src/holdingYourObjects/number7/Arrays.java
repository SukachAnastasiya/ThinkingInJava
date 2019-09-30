package holdingYourObjects.number7;
import java.util.*;
import holdingYourObjects.number7.Clothes;

public class Arrays {
     public static Clothes set(){
        Random random=new Random();
        switch (random.nextInt(10)) {
            default:
            case 1:
                return Clothes.COAT;
            case 2:
                return Clothes.GLOVES;
            case 3:
                return Clothes.HOODIE;
            case 4:
                return Clothes.HUT;
            case 5:
                return Clothes.SHOES;
            case 6:
                return Clothes.SOCKS;
            case 7:
                return Clothes.TROUSERS;
            case 8:
                return Clothes.DRESS;
            case 9:
                return Clothes.SWEETER;
            case 10:
                return Clothes.UNDERWEAR;
        }
    }
    public static void main(String[] args) {
        Clothes[] clo={
                set(),
                set(),
                set(),
                set(),
                set(),
                set(),
                set(),
                set(),
                set(),
                set(),
                set(),
                set(),
        };
        List<Clothes> clothes=new ArrayList<>();
        clothes= java.util.Arrays.asList(clo);
        System.out.println("Clothes: "+ clothes.toString());
        List<Clothes> sub=clothes.subList(2,5);
        System.out.println("sub: "+sub.toString());
        clothes.removeAll(sub);
        System.out.println("Clothes: "+clothes.toString());
    }
}
