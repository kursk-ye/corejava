package collections.concrete;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.kursk.Util.print;
import static com.kursk.Util.println;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();

        linkedHashMap.put("Apple", new Double(91.98));
        linkedHashMap.put("Sony", new Double(16.76));
        linkedHashMap.put("Dell", new Double(30.47));
        linkedHashMap.put("HP", new Double(33.91));
        linkedHashMap.put("IBM", new Double(181.71));

        println("Contents of LinkedHashMap:" +linkedHashMap);

        println("\nValues of map after iterating over it : ");
        for(String key : linkedHashMap.keySet())    println(key + ":\t" + linkedHashMap.get(key));

    }
}
