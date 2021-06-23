package day12.tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String ,Integer> map= new HashMap<>();
        map.put("Smith", 30);
        map.put("Anderson", 31);
        map.put("Lewis", 29);
        map.put("Cook", 29);
        System.out.println("Display map : ");
        System.out.println(map +" ");

        Map<String,Integer> treemap=new TreeMap<>(map);
//        treemap.put("Smith", 30);
//        treemap.put("Anderson", 31);
//       treemap.put("Lewis", 29);
//        treemap.put("Cook", 29);
        System.out.println("Display ");
        System.out.println(treemap+" ");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }

}
