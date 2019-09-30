package holdingYourObjects.number24;

import java.util.*;
import java.util.Map.Entry;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        linkedHashMap.put(4, 4);
        linkedHashMap.put(13, 45);
        linkedHashMap.put(35, 87);
        linkedHashMap.put(12, 90);
        linkedHashMap.put(5, 89);
        linkedHashMap.put(56, 26);
        linkedHashMap.put(100, 38);
        linkedHashMap.put(73, 62);
        linkedHashMap.put(2, 54);
//        Map<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//
//        });
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(linkedHashMap);
        System.out.println(treeMap);
    }
}

