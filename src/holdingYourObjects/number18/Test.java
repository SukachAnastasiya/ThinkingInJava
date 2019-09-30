package holdingYourObjects.number18;

import java.util.*;
import java.util.Map.Entry;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> hashMap=new HashMap<>();
        hashMap.put(5,"the");
        hashMap.put(7,"shore");
        hashMap.put(1, "sells");
        hashMap.put(0, "She");
        hashMap.put(4, "on");
        hashMap.put(2, "sea");
        hashMap.put(3, "shells");
        hashMap.put(6, "sea");
        System.out.println("HashMap: "+hashMap.toString());
        Map<Integer,String > treeMap=new TreeMap<>();
        treeMap.putAll(hashMap);
        System.out.println("TreeMap: "+treeMap);
        Map<Integer,String> linkedHashMap =new LinkedHashMap<>();
        linkedHashMap.putAll(treeMap);
        System.out.println("LinkedHashMap: "+linkedHashMap);
        System.out.print("Adding order: ");
        Iterator<Entry<Integer, String>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = (Map.Entry<Integer, String>) it.next();
            System.out.print(pair.getKey() + " = " + pair.getValue()+", ");
        }
    }
}
