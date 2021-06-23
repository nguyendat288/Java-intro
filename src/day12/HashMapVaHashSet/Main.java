package day12.HashMapVaHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student("Anh",20,"Phu Tho");
        Student st2=new Student("Viet",28,"Dong Anh");
        Student st3=new Student("Dung",23,"Ha Dong");

        Map<Integer,Student> map=new HashMap<>();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);
        map.put(4,st1);
        for(Map.Entry<Integer,Student> s:map.entrySet()){
            System.out.println(s.toString());
        }
        //===================
        System.out.println("======================================");
        Set<Student> set=new HashSet<>();
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st1);
        for (Student x:set){
            System.out.println(x.toString());
        }
    }
}
