package holdingYourObjects.number19;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer>hashSet= new HashSet<>();
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(1);
        hashSet.add(0);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(9);
        System.out.println("HashSet: "+hashSet);
        Set<Integer>treeSet=new TreeSet<>();
        treeSet.addAll(hashSet);
        Set<Integer>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.addAll(treeSet);
        System.out.println("LinkedHashSet: "+linkedHashSet);
    }
}
