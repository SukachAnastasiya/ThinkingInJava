package holdingYourObjects.number24;

import java.util.*;
import java.util.Map.Entry;

public class Test2 {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("She", "She");
        linkedHashMap.put("sells","sells");
        linkedHashMap.put("sea","sea");
        linkedHashMap.put("shells","shells");
        linkedHashMap.put("on","on");
        linkedHashMap.put("the","the");
        linkedHashMap.put("shore","shore");
        Collection<String>collection =new LinkedList<>();
        Map<String,String>treeMap=new TreeMap<>();
        treeMap.putAll(linkedHashMap);
        System.out.println(linkedHashMap);
    }
}
