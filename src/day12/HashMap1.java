package day12;

import java.util.HashMap;
import java.util.Map;

public class HashMap1{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap x= new HashMap();
        Map<String,Integer> map1=new HashMap<String,Integer>();
    map.put("Hà Nội ",1);
    map.put("Hải Phòng",3);
    map.put("Sài Gòn ",2);
    map.put("Việt Trì",19);
    map.put("Hải Dương",89);
    map.get("Việt Trì");
    map.remove("Hải Dương");
        System.out.println(map);
    }
}