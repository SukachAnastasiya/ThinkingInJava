package holdingYourObjects.number16;

import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>(Arrays.asList("a", "e", "y", "u", "i", "o"));
        Set<String> vowel = new TreeSet<String>();
        vowel.addAll(collection);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line:");
        String words=scanner.nextLine();
        List<String>word=Arrays.asList(words.split(" "));
        Iterator<String> ch = vowel.iterator();
        int amount = 0;
        int count = 0;
        ArrayList<Integer> Amount = new ArrayList<>();
        while (ch.hasNext()) {
            boolean contain = word.contains(ch.next());
            if (ch.next() == " ") {
                Amount.add(count);
                count = 0;
            }
            if (contain == true) {
                amount++;
                count++;
            }
        }
        System.out.println(amount);
    }
}

