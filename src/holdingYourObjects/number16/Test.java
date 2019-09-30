package holdingYourObjects.number16;
import java.util.*;

public class Test{
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>(Arrays.asList("a", "e", "y", "u", "i", "o"));
        Set<String> vowel = new TreeSet<String>();
        vowel.addAll(collection);
        String str = "She sells sea shells on the sea shore";
        List<String> words=Arrays.asList(str.split(" "));
        System.out.println(words.toString());
        Iterator<String> ch = vowel.iterator();
        int amount = 0;
        int count = 0;
        ArrayList<Integer> Amount = new ArrayList<>();
        for(String s: words) {
            while (ch.hasNext()) {
                boolean contain = words.contains(ch.next());
                if (contain == true) {
                    count++;
                }
            }
            Amount.add(count);
            count=0;
        }
        System.out.println("Всего гласных: "+Amount.size());
        System.out.println(Amount.toString());
    }
}
